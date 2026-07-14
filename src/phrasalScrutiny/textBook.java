package phrasalScrutiny;

public class textBook extends book {
    private String subject;
    public textBook() {
    }
    public textBook(String bookId, String title, String author, double price, boolean isBorrowed, String subject) {

        super(bookId, title, author, price, isBorrowed);
        this.subject = subject;

    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }

    @Override
    public void displayInfo() {

        System.out.println("==========教材信息==========");
        System.out.print("ID：" + getBookId()+"\t");
        System.out.print("书名：" + getTitle()+"\t");
        System.out.print("作者：" + getAuthor()+"\t");
        System.out.print("价格：" + getPrice()+"\t");
        System.out.print("是否被借出：" + (isBorrowed() ? "是" : "否")+"\t");
        System.out.print("学科：" + subject+"\t");
        System.out.print("图书总数："+getTotalBooks()+"\n");
    }






}
