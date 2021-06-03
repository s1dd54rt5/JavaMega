class Roti{  
    int roti=10;  
    synchronized void withdraw(int roti){
        System.out.println("going to take roti...");  
        if(this.roti<roti){  
            System.out.println("Less roti; waiting for roti...");  
            try{
                wait();
            }catch(Exception e){}              
        }  
        this.roti-=roti;  
        System.out.println("roti eaten...");  
    }  
      
    synchronized void deposit(int roti){   
        System.out.println("preparing roti and adding...");  
        this.roti+=roti;                        
        System.out.println("roti added in the vessel... ");                             
        notify();  
    }  
}  
      
public class RotiQues{  
    public static void main(String args[]){  
        final Roti c=new Roti();                 
        new Thread(){  
            public void run(){c.withdraw(12);
        }   
        }.start();  
        new Thread(){  
            public void run(){c.deposit(10);}  
        }.start();  
    }
} 