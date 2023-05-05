package default1;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysExercise {
    public static void main(String args[]){
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅新", 90);
        books[2] = new Book("青年文摘20年", 5);
        books[3] = new Book("java从入门到放弃~", 300);
        System.out.println(Arrays.toString(books));
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int) (o1.price - o2.price);
            }
        });
        System.out.println("从小到大"+Arrays.toString(books));
        Arrays.sort(books,new Comparator<Book>(){
            @Override
            public int compare(Book o1,Book o2){
                //按价格排序
                return (int)(o1.name.length()-o2.name.length());

            }
        });
        System.out.println("按名字长度"+Arrays.toString(books));
        Arrays.sort(books, new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return (int) (o2.price - o1.price);
            }
        });
        System.out.println("从大到小"+Arrays.toString(books));
    }

}
class Book{
     String name;
     double price;
    public Book(String name,double price){
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString(){
        return name+" "+price;
    }
}
