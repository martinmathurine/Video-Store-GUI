//Martin

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Video {
    private String title;
    private boolean loaned;
    private Date dueDate;

//constructor of video class
    public Video() {
        this("");
    }

    public Video(String title) {
        this.setTitle(title);
        this.setLoaned(false);
        this.setDueDate((Date)null);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {//method to get title
        return this.title;
    }

    public void setLoaned(boolean loaned) {
        this.loaned = loaned;
    }

    public boolean getLoaned() {
        return this.loaned;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public String toString() { //method to state the title's availability and its due return date
        String string = "";
        string = string + "Title: " + this.getTitle() + "\n";
        string = string + "Availability: ";
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        if (this.getLoaned()) {
            string = string + "On loan, availablilty due: " + dateFormat.format(this.getDueDate());
        } else {
            string = string + "Available";
        }

        return string;
    }
}
