package mainPackage;
import bookPackage.Book;

public class Main {
    public enum Authors {
        Marcel_Proust,
        James_Joyce,
        Miguel_de_Servantes,
        Van_Darkholme,
        Herman_Melville
    }
    public enum Names {
        In_Search_of_Lost_Time,
        Ulysses,
        Don_Quixote,
        One_Hundred_Years_of_Solitude,
        Moby_Dick
    }
    public enum Publishers {
        House_of_Yae,
        Venti
    }
    public static void main(String[] args) {
        Book[] books = new Book [10];
        for (int i = 0; i < books.length; i++){
            books[i] = new Book();
            books[i].setName (Names.values()[(int) (Math.random() * 5)]);
            books[i].setAuthor (Authors.values()[(int) (Math.random() * 5)]);
            books[i].setPublisher (Publishers.values()[(int) (Math.random() * 2)]);
            books[i].setYear((int) ((Math.random() * 42) + 1980));
            books[i].setPages ((int) (Math.random() * 500 + 20));
        }

        Authors authorToSearch = Authors.values()[(int) (Math.random() * 5)]; System.out.println("Search by Author["+ authorToSearch + "]");
        for (Book book : books) book.FindByAuthor(authorToSearch);
        System.out.println();

        Publishers publisherToSearch = Publishers.values()[(int) (Math.random() * 2)]; System.out.println("Search by Publisher ["+ publisherToSearch + "]");
        for (Book book : books) book.FindByPublisher(publisherToSearch);
        System.out.println();

        int yearToFindAbove = (int) ((Math.random() * 42) + 1980);
        System.out.println("Search by Year["+ yearToFindAbove + "]");
        for (Book book : books) book.FindByYear(yearToFindAbove);
        System.out.println();
    }
}
