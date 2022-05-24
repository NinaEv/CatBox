package jadv.task_3_1;

public class User implements Runnable {

    private static final int COUNT = 5;
    public static final int USER_PAUSE = 3000;

    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            if (!Main.turnOn) {
                Main.turnOn = true;
                System.out.println("Пользователь включил тумблер.");
                try {
                    Thread.sleep(USER_PAUSE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
