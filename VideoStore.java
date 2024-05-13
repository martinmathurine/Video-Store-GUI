//Martin

import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Customer> customers = new ArrayList();
    private ArrayList<Video> videos = new ArrayList();
//contains two array lists of all stored customers and available video titles
    
    public VideoStore() {
        String[] customerNames = new String[]{"Lucas", "Bishop", "Warren", "Worthington", "Scott", "Summers", "Ororo", "Munroe", "Benjamin", "Reilly"};
        String[] videoTitles = new String[]{"X-Men", "X2: X-Men United", "X-Men: The Last Stand", "X-Men Origins: Wolverine ", "X-Men: First Class", "The Wolverine", "X-Men: Days of Future Past", "Deadpool", "X-Men: Apocalypse", "Logan"};

        for(int i = 0; i < 10; ++i) { 
            this.customers.add(new Customer(customerNames[i], 0));
            this.videos.add(new Video(videoTitles[i]));
        }

    }
//this loop states that for i is smaller than 10 and anything above 10 in this block it will eventually stop when it meets i < 10
    
    
    public void listallVideos() { //print out list for all available video titles
        System.out.println("Films");
        System.out.println("**********"); //visual separator

        for(int i = 0; i < this.videos.size(); ++i) {
            System.out.println(((Video)this.videos.get(i)).toString() + "\n");//method to return the videos string
        }

    }

    public void borrow(String customerName, String videoTitle) { //declare method to return the names of customers and video titles
        Customer customer = null;

        for(int i = 0; i < this.customers.size(); ++i) {
            if (((Customer)this.customers.get(i)).getName().equalsIgnoreCase(customerName)) {
                customer = (Customer)this.customers.get(i);
                break;
            }
        }

        if (customer == null) {//if the customer name does not exist then the following printout will be presented
            System.out.println(customerName + " does not exist in this filesystem.");
        } else {
            Video video = null;

            for(int i = 0; i < this.videos.size(); ++i) {
                if (((Video)this.videos.get(i)).getTitle().equalsIgnoreCase(videoTitle)) {
                    video = (Video)this.videos.get(i);
                    break;
                }
            }

            if (video == null) {//if the film does not exist then the following system printout will be displayed
                System.out.println("The film, " + videoTitle + " does not exist.");
            } else {
                customer.borrowVideo(video);
            }
        }
    }
}
