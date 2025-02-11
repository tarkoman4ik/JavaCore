public class Trader extends Human{

    public Trader(int timeToSleep, String favouriteFood) {
        super(timeToSleep, favouriteFood);
    }

    public void eat(){
        super.eat();
        printFood();
    }

    public void sleep(){
        super.sleep();
        printTime();
    }

    @Override
    void sayHello(){
        System.out.println("Hello, from Trader");
    }

    @Override
    void sayGoodbye(){
        System.out.println("Goodbye, from Trader");
    }

    @Override
    void printFood() {
        System.out.println("Trader's favourite food is "+favouriteFood);
    }

    @Override
    void printTime() {
        System.out.println("Trader's average time to sleep is "+timeToSleep+" hours");
    }

    void sellFood(){
        System.out.println("Trader sell food");
    }
}
