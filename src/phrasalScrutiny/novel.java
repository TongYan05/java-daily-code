package phrasalScrutiny;

public class novel extends book{
    private String genre;
    public novel() {
    }
    public novel(String bookId, String title, String author, double price, boolean isBorrowed, String genre) {

        super(bookId, title, author, price, isBorrowed);
        this.genre = genre;

    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
    @Override
    public void displayInfo() {
        System.out.println("==========小说信息==========");
        System.out.print("ID：" + getBookId()+"\t");
        System.out.print("书名：" + getTitle()+"\t");
        System.out.print("作者：" + getAuthor()+"\t");
        System.out.print("价格：" + getPrice()+"\t");
        System.out.print("是否被借出：" + (isBorrowed() ? "是" : "否")+"\t");
        System.out.print("体裁：" + getGenre()+"\t");
        System.out.print("图书总数："+getTotalBooks()+"\n");
    }
}
