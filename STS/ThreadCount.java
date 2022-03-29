package JavaMega.STS;
class ThreadCount {

    int count = 0;
    
    class MiddleCounter implements Runnable{
        @Override
        public void run() {
            while(count<13){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            while(count<24){
                count++;
                System.out.println("From 2: "+count);
            }
            notify();
        } 
    }

    class ThirdCounter implements Runnable{
        @Override
        public void run() {
            while(count<13){
                count++;
                System.out.println("From 1: "+count);
            }
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while(count<35){
                count++;
                System.out.println("From 1: "+count);
            }
        } 
    }

    void startThread(){
        ThirdCounter t = new ThirdCounter();
        MiddleCounter m = new MiddleCounter();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(m);
        t1.start();
        t2.start();
    }
    public static void main(String[] args) {
        ThreadCount tc = new ThreadCount();
        tc.startThread();
    }
}