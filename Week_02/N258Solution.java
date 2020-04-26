public class N258Solution {
    public static void main(String[] args) {
        int a = 66;
        System.out.println(addDigits(a));
    }
    public static int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
