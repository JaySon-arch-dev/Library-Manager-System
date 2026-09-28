package book;
public class BorrowingTransaction {
    private String book;
    
  public BorrowingTransaction(String book) {
        this.book = book;
      
    }
      
      
    private void setBook(String book) {
          this.book = book;
    }
      
    public String getBook() {
        return book;
    }
    public void display() {
        System.out.println("Borrowed book: " + book);
    }
}