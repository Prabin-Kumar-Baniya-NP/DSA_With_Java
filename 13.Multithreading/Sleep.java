
class ThreadSleep extends Thread{
    public void run(){
        try{
            System.out.println("I am going to sleep for 5 seconds");
            Thread.sleep(5000);
            System.out.println("I slept for 5 seconds");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }  
    }  
}


public class Sleep {
    public static void main(String[] args) {
        ThreadSleep obj = new ThreadSleep();
        obj.start();
    }
}
