package conclusion;

import java.util.ArrayList;

public  interface Borrowable {



    public abstract void borrowBook(ArrayList<book> arr, String title);
    public abstract void returnBook(ArrayList<book> arr, String title);




}
