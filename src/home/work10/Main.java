package home.work10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];

        Fruit greenApple = new Fruit();
        greenApple.setType(Fruit.Type.APPLE);
        greenApple.setColor(Color.GREEN);
        greenApple.setWeight(186);
        greenApple.setPrice(25.90);

        fruits[0] = greenApple;

        Fruit redApple = new Fruit(Fruit.Type.APPLE, Color.RED, 146, 26.90);
        fruits[1] = redApple;

        Fruit banana = new Fruit(Fruit.Type.BANANA, Color.YELLOW, 186, 32.80);
        fruits[2] = banana;

        Fruit lemon = new Fruit(Fruit.Type.LEMON, Color.YELLOW, 246, 34.90);
        fruits[3] = lemon;



        System.out.println(Arrays.toString(fruits));

        System.out.println("Green apple price: " + greenApple.calculatePrice() + " грн.");
        System.out.println("Red apple price: " + redApple.calculatePrice() + " грн.");
        System.out.println("Banana price: " + banana.calculatePrice() + " грн.");
        System.out.println("Lemon price: " + lemon.calculatePrice() + " грн.");

        double sumReceipt = 0;
        for (Fruit fruit : fruits) {
            sumReceipt += fruit.calculatePrice();
        }
        System.out.println("Cумма чека: " + sumReceipt + " грн.");
    }
}

