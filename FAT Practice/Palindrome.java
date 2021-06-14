class FirstHalf implements Runnable {
    int biggest = 0;
    static int isPalindrome(int n)
    {
        int rev = 0;
        for (int i = n; i > 0; i /= 10)
            rev = rev * 10 + i % 10;

        return(n == rev) ? 1 : 0;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5000; i++)
            if (isPalindrome(i)==1){
                if(biggest<i){
                    biggest = i;
                }
            }    
                
    }
}

class SecondHalf implements Runnable {
    int biggest = 0;
    static int isPalindrome(int n)
    {
        int rev = 0;
        for (int i = n; i > 0; i /= 10)
            rev = rev * 10 + i % 10;

        return(n == rev) ? 1 : 0;
    }
    @Override
    public void run() {
        for (int i = 5001; i <= 10000; i++)
            if (isPalindrome(i)==1){
                if(biggest<i){
                    biggest = i;
                }
            }    
                
    }
}

class Palindrome {
    public static void main(String[] args) {
        FirstHalf f = new FirstHalf();
        SecondHalf s = new SecondHalf();
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
            if(f.biggest>s.biggest){
                System.out.println(f.biggest);
            } else {
                System.out.println(s.biggest);
            }
        } catch (Exception e){}
    }
}