package lecture5.task3;

//import java.text.DateFormat;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Date;

public class Reader {
    String fio;
    double libraryCardNumber;
    String faculty;
    Date dateOfBirth;
    double phoneNumber;

    public Reader(String fio,
                  double libraryCardNumber,
                  String faculty,
                  Date dateOfBirth,
                  double phoneNumber) {
        this.fio = fio;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public static void takeBook(String fio, int booksnumber) {
        System.out.println(fio + " взял(а) " + booksnumber + " книг(и)");
        //return fio + "взял(а)" + booksnumber + "книг(и)";
    }

    public static void takeBook(String fio, String[] booksNames) {
        System.out.println(fio + " взял(а) книг(и): " + Arrays.toString(booksNames));
    }

    public static void takeBook(String fio, Book[] books) {
        String[] bookNameList = new String[books.length];
        for (int i = 0; i < books.length; i++) {
            bookNameList[i] = books[i].bookName;

        }
//        String[] bookNames = (String[]) Arrays.stream(books)
//               .map(Book -> Book.bookName)
//               .toArray();

        System.out.println(fio + " взял(а): " + Arrays.toString(bookNameList));
    }

    public static void returnBook(String fio, int booksnumber) {
        System.out.println(fio + " вернул(а) " + booksnumber + " книг(и)");
        //return fio + "взял(а)" + booksnumber + "книг(и)";
    }

    public static void returnBook(String fio, String[] booksNames) {
        System.out.println(fio + " вернул(а) книг(и): " + Arrays.toString(booksNames));
    }

    public static void returnBook(String fio, Book[] books) {
        String[] bookNameList = new String[books.length];
        for (int i = 0; i < books.length; i++) {
            bookNameList[i] = books[i].bookName;
        }
        System.out.println(fio + " вернул(а): " + Arrays.toString(bookNameList));
    }
}
