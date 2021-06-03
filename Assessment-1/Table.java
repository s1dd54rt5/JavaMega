class Table {
    public static void main(String args[]){
        int i;
        for(i=1;i<=15;i++){
            System.out.println("Table of "+i+": ");
            for(int j=1;j<=10;j++){
                System.out.println(i+"x"+j+" = "+i*j);
            }
            System.out.println("\n");
        }
    }
}
