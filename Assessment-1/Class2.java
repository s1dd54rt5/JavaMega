abstract class Class1{
    abstract void Special(int n);
}

class Class2 extends Class1{
    void Special(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j*j==i){
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String args[]){
        Class2 cl = new Class2();
        cl.Special(25);
    }
}