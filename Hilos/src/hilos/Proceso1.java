package hilos;

public class Proceso1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Proceso1");
        }
    }
}
