package shapes;

import util.Input;

public class CirclesApp {
    public static void main(String[] args) {
        Input in = new Input();
        boolean cont = true;
        while (cont) {
            System.out.println("Let's create a circle. First, give me the radius...");
            double rad = in.getDouble();
            Circle circ = new Circle(rad);
            System.out.printf("Your new circle has a radius of %.2f, a circumference of %.1f, and an area of %.1f\n",
                    circ.getRadius(),
                    circ.getCircumference(),
                    circ.getArea());
            System.out.println("Would you like to make another circle? [y/N]");
            in.clearCache();
            cont = in.yesNo();
        }

    }
}
