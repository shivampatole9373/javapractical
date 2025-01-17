public class TypeCastingExample {

    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int intVal = 100;
        double doubleVal = intVal;

        System.out.println("Implicit Type Casting:");
        System.out.println("Integer Value: " + intVal);
        System.out.println("Double Value: " + doubleVal);

        // Explicit Type Casting (Narrowing)
        double doubleNum = 99.99;
        int intNum = (int) doubleNum;

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double Value: " + doubleNum);
        System.out.println("Integer Value: " + intNum);
    }
}
