abstract class Human implements HumanNeeds {
    protected int timeToSleep;
    protected String favouriteFood;
    abstract void printFood();
    abstract void printTime();

    public Human(int timeToSleep, String favouriteFood) {
        this.timeToSleep = timeToSleep;
        this.favouriteFood = favouriteFood;
    }

    void sayHello(){
        System.out.println("Hello, from Human");
    }

    void sayGoodbye(){
        System.out.println("Goodbye, from Human");
    }

    public void eat(){
        System.out.println("|||||Human eat|||||");
    }

    public void sleep(){
        System.out.println("|||||Human sleep|||||");
    }

}
