package conclusion;

public class magazine extends book{

    private String issueNnumber;
    private String publishMonth;



    public magazine()
    {
        super();
    }
    public magazine(String name,String ISBN,String author,double price,boolean isBorrowed,String issueNnumber,String publishMonth)
    {
        super(name,ISBN,author,price,isBorrowed);
        this.issueNnumber=issueNnumber;
        this.publishMonth=publishMonth;
    }

    public String getIssueNnumber() {
        return issueNnumber;
    }

    public void setIssueNnumber(String issueNnumber) {
        this.issueNnumber = issueNnumber;
    }

    public String getPublishMonth() {
        return publishMonth;
    }

    public void setPublishMonth(String publishMonth) {
        this.publishMonth = publishMonth;
    }

    @Override
    public void showInfo() {
        System.out.println("=====杂志信息=====");
        System.out.println("期号：" + getIssueNnumber());
        System.out.println("出版月份：" + getPublishMonth());
        System.out.println("书名："+getName());
        System.out.println("ISBN："+getISBN());
        System.out.println("作者："+getAuthor());
        System.out.println("价格："+getPrice());
        System.out.println("借阅状态："+(isBorrowed()?"是":"否"));

    }
}
