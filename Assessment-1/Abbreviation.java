import java.util.Scanner;

class Abbreviation {
    
    public String Abbr(String sentence){
        int len = sentence.length();
        String abbr;
        abbr = Character.toString(sentence.charAt(0)).toUpperCase();
        for(int i=0;i<len;i++){
            if(sentence.charAt(i)==' '&&i!=len-1){
                abbr += Character.toString(sentence.charAt(i+1)).toUpperCase();
            }
        }
        return abbr;
    }

    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String sentence = sh.nextLine();
        sh.close();
        Abbreviation o = new Abbreviation();
        String abbr = o.Abbr(sentence);
        System.out.println("The abbreviaton becomes: "+abbr);
    }

}
