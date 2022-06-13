public class RecursiveFactorial {
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(4));
    }

    static int recursiveFactorial(int number) {
        if (number >= 1) return number * recursiveFactorial(number - 1);
        else return 1;
    }
}
