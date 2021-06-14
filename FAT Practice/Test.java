class Super{
    void onSuper(){
        System.out.println("Super func called!");
    }
}

class Test extends Super {
    @Override
    void onSuper() {
        super.onSuper();
    }

    int Area(int length,int width){
       return length*width; 
    }

    double Area(double radius){
        return 3.1415 * radius * radius;
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.onSuper();
        System.out.println(t1.Area(5));
        System.out.println(t1.Area(3, 4));
    }
}