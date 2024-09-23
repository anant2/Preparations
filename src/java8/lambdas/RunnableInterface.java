package java8.lambdas;

public class RunnableInterface {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello before Java 8");
            }
        };

        new Thread(runnable).start();

        new Thread(() -> System.out.println("Hello After java 8")).start();
    }

}
