package conclusion;

public class novel extends book {
    private String type;
    private int pages;



    public novel() {
        super();
    }

    public novel(String name, String ISBN, String author, double price, boolean isBorrowed, String type, int pages) {
        super(name, ISBN, author, price, isBorrowed);
        this.type = type;
        this.pages = pages;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    @Override
    public void showInfo() {
        System.out.println("=====小说信息=====");
        System.out.println("类型："+getType());
        System.out.println("页数："+getPages());
        System.out.println("书名："+getName());
        System.out.println("ISBN："+getISBN());
        System.out.println("作者："+getAuthor());
        System.out.println("价格："+getPrice());
        System.out.println("借阅状态："+(isBorrowed()?"是":"否"));
    }


}
