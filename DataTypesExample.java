public class DataTypesExample {

    byte a = 10;
    short b = 100;
    int c = 1000;
    long d = 10000L;
    float e = 3.14f;
    double f = 3.14159;
    char g = 'A';
    boolean h = true;

    String i = "Hello, World!";
    int[] j = {1, 2, 3};
    
    public static void main(String[] args) {
        DataTypesExample obj = new DataTypesExample();
        
        System.out.println("Primitive Data Types:");
        System.out.println("Byte: " + obj.a);
        System.out.println("Short: " + obj.b);
        System.out.println("Int: " + obj.c);
        System.out.println("Long: " + obj.d);
        System.out.println("Float: " + obj.e);
        System.out.println("Double: " + obj.f);
        System.out.println("Char: " + obj.g);
        System.out.println("Boolean: " + obj.h);
        
        System.out.println("\nNon-Primitive Data Types:");
        System.out.println("String: " + obj.i);
        System.out.print("Array: ");
        for (int num : obj.j) {
            System.out.print(num + " ");
        }
    }
}
