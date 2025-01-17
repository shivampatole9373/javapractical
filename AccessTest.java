public class AccessTest {

    int globalVariable = 50;

    public void methodOne() {
        int localVariable = 20;
        System.out.println("Accessing Local Variable in methodOne: " + localVariable);
        System.out.println("Accessing Global Variable in methodOne: " + globalVariable);
    }

    public void methodTwo() {
        System.out.println("Accessing Global Variable in methodTwo: " + globalVariable);
    }

    public static void main(String[] args) {
        AccessTest accessTest = new AccessTest();
        accessTest.methodOne();
        accessTest.methodTwo();
    }
}
