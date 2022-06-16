package util;

public class InputTest {
    public static void main(String[] args) {
        Input in = new Input();
        in.getString();
        boolean agreed = false;
        while (!agreed) {
            agreed = in.yesNo();
        }
        int min = 5;
        int max = 10;
        System.out.printf("Enter a number between %d and %d\n", min, max);
        in.getInt(min, max);

        double min2 = 4;
        double max2 = 11;
        System.out.printf("Enter a number between %.1f and %.1f\n", min2, max2);
        in.getDouble(min2, max2);
    }
}
