class Div2 {
    public static void main(String args[]){
        int i,sum=0;
        for(i=200;i<=800;i++){
            if(i%2!=0&&i%5==0){
                sum = sum + i;
            }
        }
        System.out.println("The sum is: "+sum);
    }
}
