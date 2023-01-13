public class FictionBook extends Book{
    private String category;
    public FictionBook(){}
    public FictionBook(double id,String name, double price, String author, String category){
        super(id, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "category='" + category + '\'' +
                '}' + "which is a subclass of " + super.toString();
    }
}