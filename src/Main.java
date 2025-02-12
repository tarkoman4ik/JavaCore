import java.util.*;
import java.util.concurrent.Exchanger;

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

    //Collections testing
    public static void TestC(){
        Queue<String> queue = new LinkedList<>();
        //Causes error if empty
        //queue.remove();
        queue.poll();

        Comparator<String> stringLenghtCompare = new Comparator<String>() {
            @Override
            public int compare(String s1,String s2){
                return s1.length()-s2.length();
            }
        };

        Queue<String> queue2 = new PriorityQueue<>(stringLenghtCompare);
        queue2.add("Lisa");
        queue2.add("Robert");
        queue2.add("John");
        queue2.add("Chris");
        queue2.add("Angelina");
        queue2.add("Joe");

        while (!queue2.isEmpty()) {
            System.out.println(queue2.remove());
        }
        System.out.println();
        Map<Character,Integer> map = new HashMap<>();
        map.put('X',1);
        map.put('Y',75);
        map.put('Z',52);
        for (var x:map.entrySet()){
            System.out.println(x.getKey()+":"+x.getValue());
        }
    }

    //Exchanger testing
    public static void TestD(){
        Exchanger<String> exchanger = new Exchanger<>();
        new UseString(exchanger);
        new MakeString(exchanger);
    }

    public static void main(String[] args) {
        TestD();
    }
}