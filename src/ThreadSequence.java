
public class ThreadSequence implements Runnable {
	 public int PRINT_NUMBERS_UPTO=10;
	    static int  number=1;
	    int remainder;
	    static Object lock=new Object();
	 
	    ThreadSequence(int remainder)
	    {
	        this.remainder=remainder;
	    }
	 
	    @Override
	    public void run() {
	        while (number < PRINT_NUMBERS_UPTO-1) {
	            synchronized (lock) {
	                while (number % 3 != remainder) { // wait for numbers other than remainder
	                    try {
	                        lock.wait();
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	                System.out.println(Thread.currentThread().getName() + " " + number);
	                number++;
	                lock.notifyAll();
	            }
	        }
	    }
	    
	    public static void main(String args[]) {
	    	ThreadSequence runnable1=new ThreadSequence(1);
	    	ThreadSequence runnable2=new ThreadSequence(2);
	    	ThreadSequence runnable3=new ThreadSequence(0);
	 
	        Thread t1=new Thread(runnable1,"T1");
	        Thread t2=new Thread(runnable2,"T2");
	        Thread t3=new Thread(runnable3,"T3");
	 
	        t1.start();
	        t2.start();
	        t3.start(); 
	    }

	  
}
