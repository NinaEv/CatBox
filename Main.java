package jadv.task_3_1;

public class Main {

    public static volatile boolean turnOn;

    public static void main(String[] args) {
        User user = new User();
        Toy cat = new Toy();
        Thread threadUser = new Thread(user);
        Thread threadToy = new Thread(cat);
        threadUser.start();
        threadToy.start();
        try {
            threadUser.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadToy.interrupt();
    }
}
