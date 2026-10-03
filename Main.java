package user;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import book.BorrowingTransaction; //crossing package
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<StudentUser> student = new ArrayList<>();
        student.add(new StudentUser("Jason", "2A", "BSIT-NDM", "241-0000"));
        student.get(0).setPass("MySecret");
        
        student.add(new StudentUser("Ziena", "2A", "BSIS-BA", "241-0000"));
        student.get(1).setPass("Ily");
        
        student.add(new StudentUser("Gilbert", "1C", "BSMedTech", "241-0000"));
        student.get(2).setPass("IMY");
        
        student.add(new StudentUser("Mike", "2A", "BSIT", "241-1055"));
        student.get(3).setPass("12345678");
        
        System.out.println("Welcome Student!");
        
        System.out.println();
        
        
        int attempts = 5;
        
        while (attempts > 0) {
        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();
        
        System.out.print("Enter Password: ");
        String pass = sc.nextLine().trim();
            
        Boolean found = false;
        for (StudentUser s : student) {
            if (name.equals(s.getName()) && pass.equals(s.getPass())){
                found = true;
                break;
            }
        }
            if (found) {
                System.out.println();
                System.out.println("Login successfull");
                System.out.println();
                break;
            }
            
            else {
                System.out.println("Incorrect credentials!");
                System.out.println();
                attempts--;
            }
            if (attempts == 0) {
                
                
                System.out.println();
                System.out.println("Max attempts was used.");
                System.out.println("Please continue again later!");
                return;
            }
        }
        
        ArrayList<String> book = new ArrayList<>();
        book.add("Introduction to OOP");
        book.add("The basic of OOP");
        book.add("The Constructor of basic OOP");
        book.add("The Object Method for OOP");
        
        
        for (String b : book) {
            System.out.println("- " + b);
        }
        
        System.out.println();
        System.out.print("Please select the Book you want to borrow: ");
        String bookBorrow = sc.nextLine().trim();
        
        
        
        
        ArrayList<String> avlbook = new ArrayList<>();
        avlbook.add("Introduction to OOP");
        avlbook.add("The basic of OOP");
        
        
        int bookNotfound = 0;
        
        while (bookNotfound < 5) {
            if (!book.contains(bookBorrow)) {
                System.out.println("No book found!");
                System.out.print("Enter book from the list: ");
                String newBook = sc.nextLine().trim();
                
                if (book.contains(newBook)) {
                    System.out.println("Checking for availability");
                
                    if (avlbook.contains(newBook)) {
                    System.out.print("Please fill the following for your transaction details");
                    
                    }
                        else if (!avlbook.contains(newBook)) {
                            System.out.println("Book is currently not available");
                        bookNotfound++;
                        }
                }
                else {
                    System.out.println("Book is not availble.");
                }
                    
            }
            int repeat = 0;
            while (repeat > 1 );
            {
            
        System.out.println();
        System.out.println("Please fill up the following");
        System.out.println();
        
        System.out.print("Enter your Section: ");
        String section = sc.nextLine().trim();
        
        System.out.print("Enter your course: ");
        String course = sc.nextLine().trim();
            
            
        System.out.println("Enter ID#: ");
        String id = sc.nextLine().trim();    
            
        StudentUser s1 = new StudentUser("N/A", "N/A", "N/A", "N/A");
        BorrowingTransaction b1 = new BorrowingTransaction("N/A");
        
        String name;
        s1.setSection(section);
        s1.setCourse(course);
        s1.setID(id);
        
        System.out.println();
        System.out.println("Borrowing Transaction");
        name = s1.getName();
        System.out.println("Name: " + name);
        
        id = s1.getIDnumber();
        System.out.println("ID#: " + id);
        
        section = s1.getSection();
        course = s1.getCourse();
        System.out.println("Course and Section: " + " " + course + " " + section);
        
        b1.setBook(bookBorrow);
        
        bookBorrow = b1.getBook();
        System.out.println("Book name: " + bookBorrow);
        
        LocalDateTime now = LocalDateTime.now();                        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Date and time of transaction: " + now.format(fmt));
            }
}
    }
}
