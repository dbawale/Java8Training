public class RunnableLambda {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for(int i=0;i<3;i++){
                System.out.println("Hello world from thread " + Thread.currentThread().getName());
            }
        });
        t.start();
        t.join();
    }
}
