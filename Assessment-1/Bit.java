interface IA {
    void printA();
}

class Bit implements IA{
    public void printA(){
        System.out.println("A is imle");
    }
    public static void main(String args[]){
        IA ia = new Bit();
        ia.printA();
    }
}
