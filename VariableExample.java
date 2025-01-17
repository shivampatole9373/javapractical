public class VariableExample {

    int instanceVariable = 10;
    static int staticVariable = 20;

    public void display() {
        int localVariable = 30;
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Local Variable: " + localVariable);
    }

    public static void main(String[] args) {
        VariableExample example = new VariableExample();
        example.display();
        System.out.println("Accessing Static Variable from main(): " + VariableExample.staticVariable);
    }
}
