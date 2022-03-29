package JavaMega.STS;
public class StudentQuiz {
    public static void main(String[] args) {
        String [][] studentData = {
            {"A","B","B","C","D","A","B","B","C"},
            {"A","B","B","C","D","A","B","B","C"},
            {"A","B","B","C","D","A","B","B","C"},
            {"A","B","B","C","D","A","B","B","C"},
            {"A","B","B","C","D","A","B","B","C"},
            {"A","B","B","C","D","A","B","B","C"},
            {"A","B","B","C","D","A","B","B","C"},
            {"A","B","B","C","D","A","B","B","C"},
            {"A","B","B","C","D","A","B","B","C"},
        };
        String [] solutions = {"A","B","B","C","D","A","B","B","C"};
        int[] studentMarks = new int[9];
        for(int i=0;i<9;i++){
            int marks = 0;
            for(int j=0;j<9;j++){
                if(solutions[i].equals(studentData[i][j])){
                    marks++;
                }
            }
            studentMarks[i] = marks;
        }
        for(int i=0;i<9;i++){
            System.out.println(studentMarks[i]+" ");
        }
    }
}
