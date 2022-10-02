package Assignment;

public class Swap {
    public static void main(String[] args) {
        int a=60;
        int b=100;
        System.out.println("original num:"+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap:"+a+" "+b);

    }
}
