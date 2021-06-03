class SwapTwo {
    public static void main(String args[]){
        int a = 5, b=3;
        System.out.println("First number: "+a);
        System.out.println("First number: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping...");
        System.out.println("First number: "+a);        
        System.out.println("First number: "+b);        
    }
}
