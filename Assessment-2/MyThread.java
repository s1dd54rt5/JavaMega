class Fibonacci extends Thread {
    public void run() {
        int n1=0,n2=1,n3,i;    
        System.out.print(n1+" "+n2);
    
        for(i=2;i<28;++i)
        {    
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
        }    
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(i=30;i<50;++i)
        {    
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
        }  
    }
}

class Sum extends Thread {
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i = 1;i<=15;i++){
            System.out.print(i+" ");
        }
    }
}

class MyThread{
    public static void main(String[] args) {
        Fibonacci t1 = new Fibonacci();
        t1.setPriority(9);
        Sum t2 = new Sum();
        t2.setPriority(5);
        t1.start();
        t2.start();
    }
}
