public class Main {
    public static void main(String[] args) {
        Book[] book = new Book[10];
        book[0] = new FictionBook(1, "Viễn con bố tưởng", 80, "Triệu Quân Sự", "Viễn tưởng 1");
        book[1] = new FictionBook(2, "Ảo con ông tưởng", 120, "Đoàn Dự", "Viễn tưởng 1");
        book[2] = new FictionBook(3, "Triệu 3 chấm", 190, "Dự Đoàn", "Viễn tưởng 4");
        book[3] = new FictionBook(4, "Đoàn oigioioi", 130, "Triệu Quốc Nguyễn", "Viễn tưởng 1");
        book[4] = new FictionBook(5, "Viễn tưởng", 40, "Nguyễn Quốc Triệu", "Viễn tưởng 5");
        book[5] = new ProgrammingBook(6, "Khoa học không vui", 500, "Chịnh Văn Nam", "Java", "CakePHP");
        book[6] = new ProgrammingBook(7, "Khoa học vui", 500, "Chịnh Văn Đoàn", "JS", "Spring Framework");
        book[7] = new ProgrammingBook(8, "Khoa học chưa chắc đã vui", 500, "Chịnh Văn Triệu", "Java", "Laravel Framework");
        book[8] = new ProgrammingBook(9, "Khoa học chưa chắc đã không vui vui", 500, "Chịnh Văn Lực", "python", "Spring Framework");
        book[9] = new ProgrammingBook(10, "Khoa học vui lắm", 500, "Chịnh Văn Hoàng", "C++", "Node.js");
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }
        System.out.println("Tong tien 10 cuon sach: " + getSum(book));

        for (int i = 0; i < book.length; i++) {
            if(book[i] instanceof FictionBook){
                if(book[i].getPrice() < 100)
                System.out.println(" sach vien tuong co gia nho hon 100: " +book[i].getName());
            }
        }
        double total= 0;
        for (int i = 0; i < book.length; i++) {
            if(book[i] instanceof FictionBook){
                if(((FictionBook) book[i]).getCategory() == "Viễn tưởng 1"){
                    total ++;
                }
            }

        }
        System.out.println("So sach co cagetory vien tuong 1: " + total);
        int a = 0;
        for (int i = 0; i < book.length; i++) {
            if (book[i] instanceof ProgrammingBook)
            if (((ProgrammingBook) book[i]).getLanguage() == "Java"){
                a++;
            }
        }
        System.out.println("So sach co language la java: " + a);
    }
    public static double getSum(Book[] book) {
            double total = 0;
        for (Book i: book) {
            total += i.getPrice();
        }
        return total;
    }
}
