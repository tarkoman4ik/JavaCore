
public class Main {

    //Anonymous class testing
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

    //Abstract class + Inheritance + Interface testing
    public static void TestB(){
        Teacher teacher1 = new Teacher(8,"watermelon");
        Trader trader1 = new Trader(7,"cheeseburger");
        teacher1.sayHello();
        teacher1.teachStudent();
        teacher1.eat();
        teacher1.sayGoodbye();
        teacher1.sleep();
        System.out.println();
        trader1.sayHello();
        trader1.sellFood();
        trader1.eat();
        trader1.sayGoodbye();
        trader1.sleep();
    }

    public static void main(String[] args) {
        TestB();
    }
}