public class SomeService {
    @Timed
    public void doSomeJob() throws InterruptedException {
        System.out.println("Doing some job");
        Thread.sleep(3500);
    }
}