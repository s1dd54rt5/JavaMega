import java.util.Scanner;

class Plural {
    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sh.nextLine();
        sh.close();
        System.out.println(word.toLowerCase()+" "+getPlural(word).toLowerCase());
    }

    static String getPlural(String word) {
        int length = word.length();
        if(word.charAt(length-1)=='y'){
            String newWord = word.substring(0, length-1);
            newWord = newWord+"ies";
            return newWord;
        } else if (word.charAt(length-1)=='s') {
            word = word+"es";
            return word;
        } else {
            word = word+"es";
            return word;
        }
    }
}