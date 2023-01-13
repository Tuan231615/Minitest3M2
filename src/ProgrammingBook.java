public class ProgrammingBook  extends Book{
    private String language;
    private String framework;
    public ProgrammingBook(){}
    public ProgrammingBook(double id,String name, double price, String author, String language, String framework){
        super(id, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                '}' + "Which is a subclass of " + super.toString();
    }
}
