public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        System.out.println(a+ " "+ b);
    }
}
