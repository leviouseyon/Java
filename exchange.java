// 2nd program --> exchange the value of 2 objects

public class exchange {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int box;
        System.out.println("a is "+a+" and b is "+b);
        System.out.println("before exchanging");
        box=a;
        a = b;
        b= box;
        System.out.println("a is "+a+" and b is "+b);

    }
}
