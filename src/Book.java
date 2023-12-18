public class Book extends PrintedProduct {

    private String aouthorName;

    public Book(String name, int pageQuantity, String content, String aouthorName) {
        super(name, pageQuantity, content);
        this.aouthorName = aouthorName;
    }

    public String getAouthorName() {
        return aouthorName;
    }

    public void setAouthorName(String aouthorName) {
        this.aouthorName = aouthorName;
    }
}
