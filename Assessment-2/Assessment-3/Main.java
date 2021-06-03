interface Newspaper {
    void news();
}

class Magazine implements Newspaper{
    String title;
    int ISBN;
    String editor;
    public void news(){
        System.out.println("Magazine Title: "+this.title+"\n");
        System.out.println("Magazine ISBN: "+this.ISBN+"\n");
        System.out.println("Magazine Editor: "+this.editor+"\n");
    }
}

class Brochure implements Newspaper{
    String title;
    int year;
    int page_number;
    public void news(){
        System.out.println("Brochure Title: "+this.title+"\n");
        System.out.println("Brochure Year: "+this.year+"\n");
        System.out.println("Brochure Pagenumber: "+this.page_number+"\n");
    }
}

public class Main {
    public static void main(String[] args) {
        Brochure b = new Brochure();
        Magazine m = new Magazine();
        b.title = "VIT Bro";
        b.year=2021;
        b.page_number=34;
        m.title = "VIT Maga";
        m.ISBN = 2121;
        m.editor = "Siddharth";
        b.news();
        m.news();
    }
}