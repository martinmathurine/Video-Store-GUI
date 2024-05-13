//Martin

import java.util.Scanner;

public class VideoTest {
    public VideoTest() {
    }

    public static void main(String[] args) { //the main method
        VideoStore vs = new VideoStore();
        Scanner sc = new Scanner(System.in);
        String menuResponse = "";

        do {
            System.out.println("Menu: L=List, B=Borrow, Q=Exit Application");
            menuResponse = sc.nextLine();
            if (menuResponse.equals("L")) {
                vs.listallVideos();
            } else if (menuResponse.equals("B")) {
                System.out.println("Enter your name");
                String nameResponse = sc.nextLine();
                System.out.println("Enter the film title to be loaned out today.");
                String videoResponse = sc.nextLine();
                vs.borrow(nameResponse, videoResponse);
            }
        } while(!menuResponse.equalsIgnoreCase("Q"));

    }
}
