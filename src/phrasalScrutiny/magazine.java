package phrasalScrutiny;

public class magazine extends book{
    private String issueNumber;
    public magazine() {
        super();
    }
    public magazine(String bookId, String title, String author, double price, boolean isBorrowed, String issueNumber) {
        super(bookId, title, author, price, isBorrowed);
        this.issueNumber = issueNumber;

    }
    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }
    public String getIssueNumber() {
        return issueNumber;
    }
    @Override
    public void displayInfo() {

        System.out.println("==========杂志信息==========");
        System.out.print("ID：" + getBookId()+"\t");
        System.out.print("书名：" + getTitle()+"\t");
        System.out.print("作者：" + getAuthor()+"\t");
        System.out.print("价格：" + getPrice()+"\t");
        System.out.print("是否被借出：" + (isBorrowed() ? "是" : "否")+"\t");
        System.out.print("出版编号：" + getIssueNumber()+"\t");
        System.out.print("图书总数："+getTotalBooks()+"\n");
    }
}
