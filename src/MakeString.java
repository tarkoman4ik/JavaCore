import java.util.concurrent.Exchanger;

class MakeString implements Runnable {
    Exchanger<String> exchanger;
    String str;

    MakeString(Exchanger<String> с) {
        exchanger = с;
        str = "";
        new Thread(this).start();
    }

    public void run() {
        char ch = 'A';

        for (int i = 0; i < 3; i++) {
            // заполнить буфер
            for (int j = 0; j < 5; j++) {
                str += (char) ch++;
            }

            try {
                str = exchanger.exchange(str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}