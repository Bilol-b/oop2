public class MyTime {
    private int hour;
    private int minute;
    private int second;


    public MyTime(){

    }
    public MyTime(int hour, int minute, int second) throws IllegalAccessException {
        setTime(hour,minute,second);
    }
    public void setTime(int hour,int minute,int second) throws IllegalAccessException {
        if(hour<0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59){
            throw new IllegalAccessException("Yaroqsiz soat,daqiqa yoki soniya");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) throws IllegalAccessException {
        if(hour < 0 || hour > 24){
            throw new IllegalAccessException("yaroqsiz soat!! ");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) throws IllegalAccessException {
        if(minute < 0 || minute > 59){
            throw new IllegalAccessException("yaroqsiz minut!! ");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) throws IllegalAccessException{
        if(second < 0 || second > 59){
            throw new IllegalAccessException("yaroqsiz second!! ");
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return "MyTime{" +
                "hour:minute:second  " + hour +
                 " " + minute +
                 " " + second +
                '}';
    }
    public MyTime nextSecond(){
        if(second == 59){
            second = 0;
            nextMinute();
        }else {
            second ++;
        }
        return this;
    }
    public  MyTime nextMinute(){
        if(minute == 59){
            minute = 0;
            nextHour();
        }else{
            minute ++;
        }
        return this;
    }
    public  MyTime nextHour(){
        if(hour == 0){
            hour = 23;
        }else{
            hour ++;
        }
        return this;
    }
    public MyTime previousSecond(){
        if(second == 59){
            second = 0;
            previousMinute();
        }else {
            second --;
        }
        return this;
    }
    public  MyTime previousMinute(){
        if(minute == 59){
            minute = 0;
            previousHour();
        }else{
            minute --;
        }
        return this;
    }
    public  MyTime previousHour(){
        if(hour == 0){
            hour = 23;
        }else{
            hour --;
        }
        return this;
    }


}
