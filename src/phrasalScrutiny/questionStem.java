package phrasalScrutiny;

//（1）布尔类型私有化属性，set方法：public void setBorrowed(boolean borrowed){this.borrowed=borrowed}
//（2）布尔类型属性，get方法：public boolean isBorrowed(){return isborrowed;}
//（3）静态属性也要写getter,setter方法，只不过多加了一个static在void前面
//（4）isBorrowed() ? "已借出" : "可借阅"








public class questionStem {
    /*
 * 综合练习题：图书馆管理系统（数组版）
 *
 * 项目背景：
 * 设计一个图书馆管理系统，能够管理不同类型的图书和用户，并实现借阅、归还、统计等功能。
 *
 * 需求说明：
 *
 * 1. 图书类设计
 *    - 创建抽象类 Book
 *    - 属性：bookId（图书编号）、title（书名）、author（作者）
 * 、price（价格）、isBorrowed（是否被借出）
 *    - 静态属性：totalBooks（图书总数）
 *    - 抽象方法：displayInfo()（显示图书信息）
 *
 * 2. 具体图书类型（继承 Book）
 *    - Textbook（教材）：新增 subject（学科）
 *    - Novel（小说）：新增 genre（类型）
 *    - Magazine（杂志）：新增 issueNumber（期号）
 *    - 要求：实现 displayInfo()、
 * 构造方法调用 super 并更新图书总数、重写 toString()
 *
 * 3. 用户接口设计
 *    - 接口 Borrowable
 *    - 方法：borrowBook(Book book)、
 * returnBook(Book book)、viewBorrowedBooks()
 *
 * 4. 用户类设计
 *    - 抽象类 User 实现 Borrowable 接口
 *    - 属性：userId、name、borrowedBooks（图书数组）、
 * borrowedCount（已借数量）、
 * maxBorrowLimit（最大借阅数量）
 *    - Student（学生）：最大借阅5本，新增 studentId、major
 *    - Teacher（教师）：最大借阅10本，新增 teacherId、department
 *    - 借书检查：图书是否已被借出、是否超过最大借阅数量
 *
 * 5. 图书馆管理类
 *    - 类 Library
 *    - 属性：books（图书数组，最多100本）、
 * bookCount、users（用户数组，最多50人）
 * 、userCount
 *    - 方法：addBook、removeBook、registerUser、searchBook、
 * displayAllBooks、getBorrowedCount、getAvailableBooksByType
 *
 * 6. 测试类
 *    - 创建至少5本不同类型的图书
 *    - 创建至少2个学生和1个教师
 *    - 演示借书、还书操作（正常和异常情况）
 *    - 演示搜索功能
 *    - 统计并显示相关数据
 *
 * 考察要点：
 * 封装、继承、多态、接口、抽象类、static 关键字、数组、逻辑判断
 */











}









