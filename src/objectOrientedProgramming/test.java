package objectOrientedProgramming;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class test {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("Foundation of Programming");
        book1.setISBN("IM-0558");
        book1.setPrice(65.2);
        book1.setAuthor("Dondat Lesid");
        book1.setIsBorrowed(true);
        Book book2 = new Book("Human-Computer Interaction1", "Terade Merks1", "IM-1646", 46.4, false);
        Book book3 = new Book("Human-Computer Interaction2", "Terade Merks2", "IM-4576", 425.25, true);
        Book book4 = new Book("Human-Computer Interaction3", "Terade Merks3", "IM-8272", 64.12, false);
        Book book5 = new Book("Human-Computer Interaction4", "Terade Merks4", "IM-8667", 76.21, true);
        Book book6 = new Book("Human-Computer Interaction5", "Terade Merks5", "IM-1255", 95.61, true);
        Book book7 = new Book("Human-Computer Interaction6", "Terade Merks6", "IM-2367", 23.54, true);
        Book book8 = new Book("Human-Computer Interaction7", "Terade Merks7", "IM-8464", 94.56, false);
        Book book9 = new Book("Human-Computer Interaction8", "Terade Merks8", "IM-3533", 78.64, true);
        Book book10 = new Book("Human-Computer Interaction9", "Terade Merks9", "IM-8674", 73.29, false);

        Book[] arr = new Book[10];
        arr[0] = book1;
        arr[1] = book2;
        arr[2] = book3;
        arr[3] = book4;
        arr[4] = book5;
        arr[5] = book6;
        arr[6] = book7;
        arr[7] = book8;
        arr[8] = book9;
        arr[9] = book10;

        for (int i = 0; i < arr.length; i++) System.out.println(arr[i].toString());

        Library library1 = new Library("ANU LIBRARY");
        for(int i=0;i< arr.length;i++){
            library1.addBook(arr[i]);
        }

        System.out.println(library1.returnBook("IM-8667"));

        System.out.println(library1.deleteBook("IM-8272")
        );
        System.out.println(library1.toString()+"\n"+library1.getBookNumber());

    }
}
