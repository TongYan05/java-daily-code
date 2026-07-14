package phrasalScrutiny;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

//         * 6. 测试类
//                *    - 创建至少5本不同类型的图书
//                *    - 创建至少2个学生和1个教师
//                *    - 演示借书、还书操作（正常和异常情况）
// *    - 演示搜索功能
//                *    - 统计并显示相关数据


//String bookId, String title, String author, double price, boolean isBorrowed


// 创建100本不同的图书对象

// 40本小说
        novel n1 = new novel("N001", "红楼梦", "曹雪芹", 45.0, false, "古典小说");
        novel n2 = new novel("N002", "西游记", "吴承恩", 38.5, false, "神话小说");
        novel n3 = new novel("N003", "水浒传", "施耐庵", 42.0, false, "英雄传奇");
        novel n4 = new novel("N004", "三国演义", "罗贯中", 48.0, false, "历史演义");
        novel n5 = new novel("N005", "傲慢与偏见", "简·奥斯汀", 35.0, false, "爱情小说");
        novel n6 = new novel("N006", "简爱", "夏洛蒂·勃朗特", 32.0, false, "爱情小说");
        novel n7 = new novel("N007", "呼啸山庄", "艾米莉·勃朗特", 33.5, false, "爱情小说");
        novel n8 = new novel("N008", "百年孤独", "加西亚·马尔克斯", 49.0, false, "魔幻现实主义");
        novel n9 = new novel("N009", "霍乱时期的爱情", "加西亚·马尔克斯", 46.0, false, "爱情小说");
        novel n10 = new novel("N010", "挪威的森林", "村上春树", 39.0, false, "现代主义");
        novel n11 = new novel("N011", "小王子", "圣埃克苏佩里", 25.0, false, "童话");
        novel n12 = new novel("N012", "老人与海", "海明威", 28.0, false, "中篇小说");
        novel n13 = new novel("N013", "巴黎圣母院", "雨果", 44.0, false, "浪漫主义");
        novel n14 = new novel("N014", "基督山伯爵", "大仲马", 52.0, false, "冒险小说");
        novel n15 = new novel("N015", "战争与和平", "托尔斯泰", 58.0, false, "历史小说");
        novel n16 = new novel("N016", "安娜·卡列尼娜", "托尔斯泰", 55.0, false, "现实主义");
        novel n17 = new novel("N017", "复活", "托尔斯泰", 47.0, false, "现实主义");
        novel n18 = new novel("N018", "童年", "高尔基", 30.0, false, "自传体小说");
        novel n19 = new novel("N019", "在人间", "高尔基", 31.0, false, "自传体小说");
        novel n20 = new novel("N020", "我的大学", "高尔基", 32.0, false, "自传体小说");
        novel n21 = new novel("N021", "钢铁是怎样炼成的", "奥斯特洛夫斯基", 36.0, false, "革命文学");
        novel n22 = new novel("N022", "飘", "玛格丽特·米切尔", 50.0, false, "爱情小说");
        novel n23 = new novel("N023", "了不起的盖茨比", "菲茨杰拉德", 34.0, false, "现代主义");
        novel n24 = new novel("N024", "麦田里的守望者", "塞林格", 33.0, false, "现代主义");
        novel n25 = new novel("N025", "1984", "乔治·奥威尔", 37.0, false, "反乌托邦");
        novel n26 = new novel("N026", "动物农场", "乔治·奥威尔", 29.0, false, "政治寓言");
        novel n27 = new novel("N027", "美丽新世界", "赫胥黎", 38.0, false, "反乌托邦");
        novel n28 = new novel("N028", "华氏451度", "雷·布拉德伯里", 35.5, false, "反乌托邦");
        novel n29 = new novel("N029", "时间机器", "威尔斯", 31.5, false, "科幻");
        novel n30 = new novel("N030", "海底两万里", "凡尔纳", 40.0, false, "科幻");
        novel n31 = new novel("N031", "地心游记", "凡尔纳", 38.0, false, "科幻");
        novel n32 = new novel("N032", "环游地球八十天", "凡尔纳", 36.5, false, "科幻");
        novel n33 = new novel("N033", "神秘岛", "凡尔纳", 41.0, false, "科幻");
        novel n34 = new novel("N034", "格兰特船长的儿女", "凡尔纳", 39.5, false, "科幻");
        novel n35 = new novel("N035", "金银岛", "史蒂文森", 33.0, false, "冒险小说");
        novel n36 = new novel("N036", "鲁滨逊漂流记", "笛福", 34.5, false, "冒险小说");
        novel n37 = new novel("N037", "格列佛游记", "斯威夫特", 32.5, false, "讽刺小说");
        novel n38 = new novel("N038", "爱丽丝梦游仙境", "刘易斯·卡罗尔", 28.5, false, "童话");
        novel n39 = new novel("N039", "绿野仙踪", "鲍姆", 30.5, false, "童话");
        novel n40 = new novel("N040", "夏洛的网", "怀特", 27.5, false, "儿童文学");

// 30本杂志
        magazine m1 = new magazine("M001", "读者", "读者编辑部", 12.0, false, "2024-01");
        magazine m2 = new magazine("M002", "青年文摘", "青年文摘编辑部", 10.0, false, "2024-02");
        magazine m3 = new magazine("M003", "故事会", "故事会编辑部", 8.5, false, "2024-03");
        magazine m4 = new magazine("M004", "知音", "知音编辑部", 11.0, false, "2024-04");
        magazine m5 = new magazine("M005", "家庭", "家庭编辑部", 9.5, false, "2024-05");
        magazine m6 = new magazine("M006", "科幻世界", "科幻世界编辑部", 15.0, false, "2024-06");
        magazine m7 = new magazine("M007", "收获", "收获编辑部", 18.0, false, "2024-07");
        magazine m8 = new magazine("M008", "人民文学", "人民文学编辑部", 20.0, false, "2024-08");
        magazine m9 = new magazine("M009", "当代", "当代编辑部", 17.5, false, "2024-09");
        magazine m10 = new magazine("M010", "十月", "十月编辑部", 19.0, false, "2024-10");
        magazine m11 = new magazine("M011", "花城", "花城编辑部", 16.5, false, "2024-11");
        magazine m12 = new magazine("M012", "钟山", "钟山编辑部", 18.5, false, "2024-12");
        magazine m13 = new magazine("M013", "清明", "清明编辑部", 14.0, false, "2025-01");
        magazine m14 = new magazine("M014", "大家", "大家编辑部", 21.0, false, "2025-02");
        magazine m15 = new magazine("M015", "作家", "作家编辑部", 19.5, false, "2025-03");
        magazine m16 = new magazine("M016", "小说月报", "小说月报编辑部", 17.0, false, "2025-04");
        magazine m17 = new magazine("M017", "散文", "散文编辑部", 13.5, false, "2025-05");
        magazine m18 = new magazine("M018", "诗刊", "诗刊编辑部", 12.5, false, "2025-06");
        magazine m19 = new magazine("M019", "儿童文学", "儿童文学编辑部", 11.5, false, "2025-07");
        magazine m20 = new magazine("M020", "少年文艺", "少年文艺编辑部", 10.5, false, "2025-08");
        magazine m21 = new magazine("M021", "国家地理", "国家地理编辑部", 25.0, false, "2025-09");
        magazine m22 = new magazine("M022", "科学美国人", "科学美国人编辑部", 28.0, false, "2025-10");
        magazine m23 = new magazine("M023", "自然杂志", "自然杂志编辑部", 30.0, false, "2025-11");
        magazine m24 = new magazine("M024", "时代周刊", "时代周刊编辑部", 22.0, false, "2025-12");
        magazine m25 = new magazine("M025", "新闻周刊", "新闻周刊编辑部", 21.5, false, "2026-01");
        magazine m26 = new magazine("M026", "经济学人", "经济学人编辑部", 26.0, false, "2026-02");
        magazine m27 = new magazine("M027", "哈佛商业评论", "哈佛商业评论编辑部", 32.0, false, "2026-03");
        magazine m28 = new magazine("M028", "麦肯锡季刊", "麦肯锡季刊编辑部", 35.0, false, "2026-04");
        magazine m29 = new magazine("M029", "麻省理工科技评论", "麻省理工科技评论编辑部", 33.0, false, "2026-05");
        magazine m30 = new magazine("M030", "新科学家", "新科学家编辑部", 27.0, false, "2026-06");

// 30本教材
        textBook t1 = new textBook("T001", "高等数学", "同济大学数学系", 45.0, false, "数学");
        textBook t2 = new textBook("T002", "线性代数", "清华大学数学系", 38.0, false, "数学");
        textBook t3 = new textBook("T003", "概率论与数理统计", "浙江大学数学系", 42.0, false, "数学");
        textBook t4 = new textBook("T004", "离散数学", "北京大学数学系", 40.0, false, "数学");
        textBook t5 = new textBook("T005", "数据结构", "严蔚敏", 48.0, false, "计算机科学");
        textBook t6 = new textBook("T006", "算法设计与分析", "王晓东", 46.0, false, "计算机科学");
        textBook t7 = new textBook("T007", "操作系统", "汤小丹", 44.0, false, "计算机科学");
        textBook t8 = new textBook("T008", "计算机网络", "谢希仁", 47.0, false, "计算机科学");
        textBook t9 = new textBook("T009", "数据库系统", "王珊", 49.0, false, "计算机科学");
        textBook t10 = new textBook("T010", "编译原理", "陈火旺", 50.0, false, "计算机科学");
        textBook t11 = new textBook("T011", "软件工程", "齐治昌", 43.0, false, "软件工程");
        textBook t12 = new textBook("T012", "人工智能", "蔡自兴", 52.0, false, "计算机科学");
        textBook t13 = new textBook("T013", "机器学习", "周志华", 55.0, false, "计算机科学");
        textBook t14 = new textBook("T014", "深度学习", "尹宝才", 58.0, false, "计算机科学");
        textBook t15 = new textBook("T015", "计算机视觉", "冈萨雷斯", 60.0, false, "计算机科学");
        textBook t16 = new textBook("T016", "自然语言处理", "宗成庆", 53.0, false, "计算机科学");
        textBook t17 = new textBook("T017", "Java程序设计", "耿祥义", 46.0, false, "编程语言");
        textBook t18 = new textBook("T018", "Python编程", "廖雪峰", 44.0, false, "编程语言");
        textBook t19 = new textBook("T019", "C++程序设计", "谭浩强", 42.0, false, "编程语言");
        textBook t20 = new textBook("T020", "Web开发技术", "张孝祥", 48.0, false, "软件开发");
        textBook t21 = new textBook("T021", "移动应用开发", "李兴华", 50.0, false, "移动开发");
        textBook t22 = new textBook("T022", "云计算", "刘鹏", 54.0, false, "云计算");
        textBook t23 = new textBook("T023", "大数据技术", "林子雨", 52.0, false, "大数据");
        textBook t24 = new textBook("T024", "区块链技术", "杨保华", 56.0, false, "区块链");
        textBook t25 = new textBook("T025", "网络安全", "冯登国", 51.0, false, "网络安全");
        textBook t26 = new textBook("T026", "数字图像处理", "章毓晋", 49.0, false, "图像处理");
        textBook t27 = new textBook("T027", "计算机图形学", "孙家广", 47.0, false, "图形学");
        textBook t28 = new textBook("T028", "人机交互", "董士杰", 45.0, false, "交互设计");
        textBook t29 = new textBook("T029", "嵌入式系统", "马忠立", 53.0, false, "嵌入式");
        textBook t30 = new textBook("T030", "物联网技术", "刘强东", 55.0, false, "物联网");


        //100本书放进一个数组
        book[] books = {
                n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21, n22, n23, n24, n25, n26, n27, n28, n29, n30,n31, n32, n33, n34, n35, n36, n37, n38, n39, n40,
                t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30,
                m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20, m21, m22, m23, m24, m25, m26, m27, m28, m29, m30};

        //显示图书总数
        System.out.println("\n"+"图书总数："+book.getTotalBooks());

        //遍历所有图书
        for (int i = 0; i < books.length; i++) {
            books[i].displayInfo();
        }

        System.out.println("=====================================================================================================");
        System.out.println("=====================================================================================================");
        System.out.println("=====================================================================================================");
        System.out.println("=====================================================================================================");
        System.out.println("=====================================================================================================");
        System.out.println("=====================================================================================================");
        System.out.println("=====================================================================================================");


        library lib = new library();

        //移除3本
        for(int i = 0; i < 2; i++)lib.removeBook(books);

        //显示图书总数
        System.out.println("\n"+"移除后的图书总数："+book.getTotalBooks());
//
//        //遍历所有图书
//        for (int i = 0; i < books.length; i++) {
//            books[i].displayInfo();
//        }





        System.out.println("=====================================================================================================");
        System.out.println("=====================================================================================================");
        System.out.println("=====================================================================================================");
        System.out.println("=====================================================================================================");
        System.out.println("=====================================================================================================");
        System.out.println("=====================================================================================================");
        System.out.println("=====================================================================================================");








        // 创建至少2个学生和1个教师
        ArrayList<book> student1 = new ArrayList<>();
        student stu1 = new student("S2024001", "计算机科学", "U001", "张三", 0);
        ArrayList<book> student2 = new ArrayList<>();
        student stu2 = new student("S2024002", "软件工程", "U002", "李四", 0);
        ArrayList<book> teacher1 = new ArrayList<>();
        teacher tea1 = new teacher("T2024001", "计算机学院", "U003", "王教授", 0);



        // 学生1借5本书
        for(int i=0;i<5;i++)stu1.borrowBook(books,student1);

        // 学生1查看已借图书
        stu1.viewBorrowedBooks(stu1,student1);

        // 学生1还3本书
        for(int i=0;i<3;i++)stu1.returnBook(books,student1);

        // 学生1查看已借图书
        stu1.viewBorrowedBooks(stu1,student1);

        //程序运行结果
        //You can borrow 5 books.
        //Start borrowing books!
        //Enter the book name: 计算机视觉
        //Book borrowed successfully.
        //You can borrow 4 books.
        //Start borrowing books!
        //Enter the book name: Web开发技术
        //Book borrowed successfully.
        //You can borrow 3 books.
        //Start borrowing books!
        //Enter the book name: 大数据技术
        //Book borrowed successfully.
        //You can borrow 2 books.
        //Start borrowing books!
        //Enter the book name: 网络安全
        //Book borrowed successfully.
        //You can borrow 1 books.
        //Start borrowing books!
        //Enter the book name: 数字图像处理
        //Book borrowed successfully.
        //用户：张三的借阅书籍列表：
        //==========教材信息==========
        //ID：T015	书名：计算机视觉	作者：冈萨雷斯	价格：60.0	是否被借出：是	学科：计算机科学	图书总数：100
        //==========教材信息==========
        //ID：T020	书名：Web开发技术	作者：张孝祥	价格：48.0	是否被借出：是	学科：软件开发	图书总数：100
        //==========教材信息==========
        //ID：T023	书名：大数据技术	作者：林子雨	价格：52.0	是否被借出：是	学科：大数据	图书总数：100
        //==========教材信息==========
        //ID：T025	书名：网络安全	作者：冯登国	价格：51.0	是否被借出：是	学科：网络安全	图书总数：100
        //==========教材信息==========
        //ID：T026	书名：数字图像处理	作者：章毓晋	价格：49.0	是否被借出：是	学科：图像处理	图书总数：100
        //Enter the book name that you wish to return: 大数据技术
        //Book returned successfully
        //Enter the book name that you wish to return: 数字图像处理
        //Book returned successfully
        //Enter the book name that you wish to return: 计算机视觉
        //Book returned successfully
        //用户：张三的借阅书籍列表：
        //==========教材信息==========
        //ID：T020	书名：Web开发技术	作者：张孝祥	价格：48.0	是否被借出：是	学科：软件开发	图书总数：100
        //==========教材信息==========
        //ID：T025	书名：网络安全	作者：冯登国	价格：51.0	是否被借出：是	学科：网络安全	图书总数：100








    }
}
