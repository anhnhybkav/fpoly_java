package java2.lab4.pack2;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClockThreadApplication implements Runnable {
    private Thread clockThread = null;

    public ClockThreadApplication() {
        clockThread = new Thread(this, "Clock");
        clockThread.start();
    }

    public void run() {
        Thread myThread = Thread.currentThread();
        while (clockThread == myThread) {
            System.out.println(getTime());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }

    public static void main(String[] args) {
        ClockThreadApplication clock = new ClockThreadApplication();   
    }

    private String getTime() {
        Calendar cal = Calendar.getInstance();

        Date date = cal.getTime();

        DateFormat dateFormatter = DateFormat.getTimeInstance();

        return new String(dateFormatter.format(date));
    }
}
