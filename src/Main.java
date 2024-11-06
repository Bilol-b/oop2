//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Current time: " + time);
        time.nextSecond();
        System.out.println("After next second: " + time);
        time.previousSecond();
        System.out.println("After previous second: " + time);
    }
}