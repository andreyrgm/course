package co.argm.app.model;

public class Report extends Sheet {
    private final Person author;
    private final String reviser;

    public Report(Person author, String reviser, String content) {
        super(content);
        this.author = author;
        this.reviser = reviser;
    }

    @Override
    public String toString() {
        return "Report written by: " + author + "\nReviewed by: " + reviser + "\n" + content;
    }
}