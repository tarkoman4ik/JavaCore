import java.util.concurrent.Exchanger;

class UseString implements Runnable {
    Exchanger<String> exchanger;
    String str;

    UseString(Exchanger<String> с) {
        exchanger = с;
        str = "";
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            // обменять пустой буфер на заполненный
            try {
                str = exchanger.exchange("");
                System.out.println("Пoлyчeнo: " + str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}