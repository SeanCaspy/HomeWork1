import java.util.*;

public class Pumpkin extends Thread {
    private String pumpID;
    private High h;
    private int height;
    private int size;
    private int place;


    public Pumpkin(String pumpID, High h, int height) {
        this.pumpID = pumpID;
        this.h = h;
        this.height = height;
    }

    public void run() {
        try {
            while (size <= height) {
                System.out.println(pumpID + ": " + (height - size) + " to max size");
                sleep(200);
                this.grow();

            }
            h.theBigPumpkin(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public String getPumpID() {
        return pumpID;
    }

    public int getPlace() { 
        return place;
    }

    public void grow() {
        Random rnd = new Random();
        int g = rnd.nextInt(11);
        size += g;
    }
}
