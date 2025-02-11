import jdk.incubator.vector.VectorOperators;

public class Main {

    public static void TestA(){
        Programmer pg1 = new Programmer() {
            @Override
            public void printHW() {
                System.out.println("Hello World from Anonymous!");
            }
        };
        Programmer pg2 = new Programmer();
        pg1.printHW();
        pg2.printHW();
    }

    public static void main(String[] args) {
        TestA();
    }
}