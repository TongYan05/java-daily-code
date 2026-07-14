package conclusion;

public class textbook extends  book{
    private String subject;
    private String grade;


    public textbook(){}
    public textbook(String name,String ISBN,String author,double price,boolean isBorrowed,String subject,String grade){
        super(name,ISBN,author,price,isBorrowed);
        this.subject=subject;
        this.grade=grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public void showInfo(){
        System.out.println("=====教材信息=====");
        System.out.println("学科："+getSubject());
        System.out.println("适用年级："+getGrade());
        System.out.println("书名："+getName());
        System.out.println("ISBN："+getISBN());
        System.out.println("作者："+getAuthor());
        System.out.println("价格："+getPrice());
        System.out.println("是否被借出："+(isBorrowed()?"是":"否"));
    }

}
