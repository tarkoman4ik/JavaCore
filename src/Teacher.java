public class Teacher extends Human{

    @Override
    void printFood() {
        System.out.println("Teacher's favourite food is "+favouriteFood);
    }

    @Override
    void printTime() {
        System.out.println("Teacher's average time to sleep is "+timeToSleep+" hours");
    }

    public void eat(){
        super.eat();
        printFood();
    }

    public void sleep(){
        super.sleep();
        printTime();
    }

    public Teacher(int timeToSleep, String favouriteFood){
        super(timeToSleep,favouriteFood);
    }

    @Override
    void sayHello(){
        System.out.println("Hello, from Teacher");
    }

    @Override
    void sayGoodbye(){
        System.out.println("Goodbye, from Teacher");
    }

    protected void teachStudent(){
        System.out.println("Teacher is teaching student");
    }
}
