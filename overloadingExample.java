package javaexamaple;

class Cal {
    // Method 1: Two integers
    int add(int a, int b) {
        int result = a + b;
        int mul = a * b;
        System.out.println("sum: " + result);
        System.out.println("mul: " + mul);
        return result;
    }

    // Method 2: Three integers
    int add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("sum of 3 numbers: " + result);
        return result;
    }

    // Method 3: Two doubles
    double add(double a, double b) {
        double result = a + b;
        System.out.println("sum of doubles: " + result);
        return result;
    }
}

public class overloadingExample {
    public static void main(String[] args) {
        Cal c = new Cal();

        c.add(10, 20);         // Calls method 1
        c.add(5, 10, 15);      // Calls method 2
        c.add(5.5, 4.5);       // Calls method 3
    }
}
