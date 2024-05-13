//Martin

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Customer {
    private String name; //user enters name
    private int borrowedVideos;

    public Customer() {
        this("", 0);
    }
//Constructor to enter customer name with videos loaned out 
    public Customer(String name, int borrowedVideos) { //distinguishes how many videos have been borrowed by the customer
        this.setName(name);
        this.setBorrowedVideos(borrowedVideos);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() { //method to get customer name
        return this.name;
    }

    public void setBorrowedVideos(int borrowedVideos) {
        this.borrowedVideos = borrowedVideos;
    }

    public int getBorrowedVideos() {
        return this.borrowedVideos;
    }

//changes whether the customer has reached limit of loans and title availability. 
    public void borrowVideo(Video v) { //if else loop displaying the customer's borrowed loan limit of video titles and return date
        if (v.getLoaned()) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            System.out.println("The film title" + v.getTitle() + " will be available for loan on " + dateFormat.format(v.getDueDate()) + ".");
        } else if (this.getBorrowedVideos() >= 2) {
            System.out.println(this.getName() + ", your loan limit has been exceeded.");
        } else {
            Calendar c = Calendar.getInstance();
            c.setTime(new Date());
            c.add(5, 3);
            v.setLoaned(true);
            v.setDueDate(c.getTime());
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            System.out.println("The expected return date =" + dateFormat.format(v.getDueDate()) + ".");
            this.setBorrowedVideos(this.getBorrowedVideos() + 1);
            System.out.println(this.getName() + " has borrowed the video titled, " + v.getTitle() + ".");
        }
    }
}