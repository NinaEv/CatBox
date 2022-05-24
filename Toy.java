package jadv.task_3_1;

public class Toy implements Runnable {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (Main.turnOn) {
                Main.turnOn = false;
                System.out.println("Игрушка выключила тумблер");
            }
        }
    }
}
