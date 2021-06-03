class Div1 {
    public static void main(String args[]){
        int i,sum=0;
        for(i=10;i<=50;i++){
            if(i%3==0){
                sum = sum + i;
            }
        }
        System.out.println("The sum is: "+sum);
    }
}
