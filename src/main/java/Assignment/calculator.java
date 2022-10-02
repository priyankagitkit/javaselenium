package Assignment;

public class calculator {
    public static void main(String[] args) {
        calculator cal = new calculator();
        cal.sum(10, 20);
        cal.sub(100,60);
        cal.multiply(20,40);
        cal.divide(3,2);
        cal.modulus(62,5);
    }
    public void multiply(int c,int d){
        int multiply=c*d;
        System.out.println("multiplied num is:"+multiply);
    }
    public void divide(double c,double d){
        double div=c/d;
        System.out.println("divided num is:"+div);
    }
    public void modulus(int c,int d){
        float mod=c%d;
        System.out.println("mod num is:"+mod);
    }

    public void sub(int x,int y){
        int sub=x-y;
        System.out.println("subtracted num is:"+sub);
    }

        public void sum(int a,int b){
            int sum=a+b;
            System.out.println("sum is:"+sum);
        }



}
