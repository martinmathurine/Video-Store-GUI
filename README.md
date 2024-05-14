# Video-Store-GUI

<h2>Abstract</h2> 
The report illustrates how Java technology can be used to write an object-orientated application. The simple application is a video store used for keeping records of videos that were loaned out and borrowed by the store’s customers. The design requirements state that the program must be able to allow customers to list the available videos and borrow them respectively providing that it is available otherwise a prompt will appear to instruct the customer on the video’s expected return date. The program records whether a video title is available to be borrowed and loaned out and if it is on loan, the expected date it is due to be returned will be displayed. Each customer can borrow up to 2 video titles for a maximum period of 3 consecutive days. This report evaluates the application for its use case according to the design requirements set out in the design specification.

*Keywords: Network Software Engineering, Java, Object-Oriented Programming (OOP), Operating Software (OS) Video Store Application.*
 
<h2>Introduction</h2> 
In regards to this project, Java has been implemented to record and display relevant data for a video store that the end-user has entered. [1]  
 
The objective of this assignment is to build a simple application to record a customer’s loaned out video titles however if the video title is not available then the application will inform the end-user when the specific video title will be returned. The aim is to build an application using Java to store and record customer names and video titles for the respective customer so that they are able to loan the title out eventually if it is not available. As a result, the application created was able to successfully perform as intended in regards to the design specification. Although the source code was cited from an external source, I have refactored the source code in order to illustrate my level of comprehension. 

<h2>Design</h2> 
<h3>Class Diagram:</h3>h3>
A class diagram shows the relationship between classes, objects of a class and the operations (methods) used in the classes. By declaring a class, it becomes indefinable by name, attributes and methods. The usefulness of a class diagram is to provide a framework for how objects and attributes are most likely to interact with each other. A class diagram is a set of objects with common attributes whereas a method is an operation on an object that is a part of the declaration of a class. [2] 
 
In regards to the class diagram illustrated below in Figure 1., this diagram shows the classes within the application accompanied by their corresponding attributes and operations and their relationship between classes within the application. 

<h3>[Figure 1.]</h3> 
<img src="https://github.com/martinmathurine/Video-Store-GUI/assets/42855193/5fa68e41-12b3-4711-b43b-079154a727f1" width="500">

<h3>System Design & Architecture:</h3>
The source code for the application uses a menu-based operating system. This adds to the simplicity which is the key to a simple user interface (UI) and user experience (UX) whilst using the desktop GUI application. A menu-based operating system is an interface structure to show the end-user how each command functions. The screen prompts the end-user a menu with options to select that leads to another menu as the end-user progresses through the application following prompts that the end-user will select from taking them through the application. 
 
If I were to create this application the block diagram in Figure 2 would illustrate a clean way to streamline this simple application to meet the user case set out in the design specification. In Figure 2., the block diagram visually represents the design and implementation of the source code for the application. The application is initialised at the starting point and as long as the conditions are met in order for a customer to proceed and successfully request to borrow and loan out a video title then the application will work as intended. The end-user is presented with a main menu, then the name of the customer must be entered and only if their name exists in the stored system then they can proceed to loan out a title depending on its availability and if so, prompted with an expected return date if already loaned out. A customer can only loan out a maximum of 2 video titles for a period of no more than 3 days. To end the application the customer must enter the command in the main menu which is “Q”. Also, the main lists all titles in the system if the end-user enters “L” at the main menu. If the enduser enters “B” then they are prompted to enter their name corresponding to what is stored in the application’s records before being prompted to loan out a title as long as the conditions are met as shown in the block diagram in Figure 2 below.  

<h3>[Figure 2.]</h3>
<img src="https://github.com/martinmathurine/Video-Store-GUI/assets/42855193/a24d6ca7-8c95-4442-bd87-1f3013088846" width="500">

<h2>Class Summary 1</h2>
Below Summarises the classes, packages and usage for the classes in this application. 

 - Class: Customer, Video | Usage: Used for date/time formatting subclasses | Package: java.text.DateFormat.
 - Class: Customer, Video | Usage: Used for formatting and parsing dates | Package: java.text.SimpleDateFormat.
 - Class: Customer | Usage: A method to converting between an instance in time and such as dd/mm/YYYY | Package: java.util.Calendar.
 - Class: Customer, Video | Usage: Represents an instance in time | Package: java.util.Date.
 - Class: VideoTest | Usage: An object to input alphanumeric characters from another source | Package: java.util.Scanner.
 - Class: VideoStore | Usage: Access an element in the ArrayList using the get method | Package: java.util.ArrayList.

<h2>Class Summary 2</h2>   
The class summaries below describe the fields, constructors and methods for each class in the desktop application. 

<b>Customer</b>
 - The Customer class has instance fields for the customer’s name and for the number of video titles to be borrowed and loaned out. A method `borrowvideo(Video v)` checks video availability and borrowing limit, sets due date and on loan fields in Video. Provides get method for customer’s name.
 
<b>Video</b>
 - The Video class has instance fields for the video title, loan status, and return date. Provides get and set methods for some fields and a `toString()` method.        

<b>VideoStore</b> 
 - Contains ArrayLists for customers and videos respectively. Initializes Customer and Video objects, provides `listallvideos()` method, and `borrow(String,String)` method. Checks and identifies corresponding objects. 

<b>VideoTest</b>
The main method creates a new VideoStore and enters an infinite loop with a GUI menu. Options include listing all videos, borrowing, and quitting. Borrow option prompts for customer's name and video title.             

<h2>Class Summary 3</h2>
The class summary below describes the fields, constructors and methods for each of the classes in the program in further detail. 

 - Class: Customer | Attributes: Customer (String name, int borrowdVideos), void setName(String name), String getName(), Void setBorrowedVideos(int borrowedVideos), int getBorrowedVideos(), void borrowVideo(Video v) | Usage: Customer name, Changes the name, Return the name, Changes borrowed videos, Return borrowed videos, Method to be called
 - Class: Video | Attributes: Video(String title), void setTitle(String title), String getTitle(), void setLoaned(boolean loaned), boolean getLoaned(), void setDueDate(Date dueDate), Date getDueDate(), String toString() | Usage: Constructor. Customer’s loaned videos, Changes video title, Returns video title, Changes loaned titles due date, Boolean field, Removes due date, Returns the String representation of the object
 - Class: VideoStore | Attributes: VideoStore(), void listallVideos(), void borrow(String customerName, String videoTitle) | Usage: Videos and customers records, Changes list for all available video titles, Changes list of video titles on loan
 - Class: VideoTest | Attributes: void main(), listallVideos (), borrow (String) | Usage: Main method creates the VideoStore, Lists the videos available for loan, Gets the borrowed video.

<h2>Implementation</h2>
The source code was not entirely developed by myself; however, I have refactored parts of the code to illustrate my comprehension of the material. [3] I have written comments within the source code to show my understanding of what the application is doing line-by-line. The source code has been fully referenced. [4]  
 
<h3>Test Case Execution and Results</h3> 
The testing approach employed for this application was manual testing, chosen for its ability to provide a comprehensive level of quality assurance, especially suited for end-user-focused applications. By manually testing, I could scrutinize the source code and adapt it to meet the design specifications effectively. Each test aimed to validate the key features of the desktop GUI application, ensuring functionality aligns with the user case requirements.. [5] 
 
<b>Test Case 1</b> 
In Test Case 1, the application was confirmed to function as intended. Upon starting the program, a main menu prompts the user to input commands. Validating customer and film titles is crucial for loan transactions. The test revealed that loan requests from unrecognized customers, like Wolverine, and for unavailable film titles, like 'Spider-Man', were appropriately rejected. This verification process ensures only valid customers can successfully borrow titles listed in the application's system. Overall, Test Case 1 demonstrated successful validation (status = passed).

<img src="https://github.com/martinmathurine/Video-Store-GUI/assets/42855193/76027f7a-fa12-4eea-9419-708e225b815d" width="500">

<b>Test Case 2</b> 
The end-user must enter, “L” to see available titles then enter, “B” in order to enter a valid customer name and a valid video title to borrow and loan out. This also tests the customer not to exceed the maximum loaned out titles and to display a loan period of no more than 3 days from the date of the initial loan. Also, to end the application once the limit has been exceeded by exiting by selecting, “Q” from the main menu. The result is as expected and the test has proved successful (status = passed). 

<img src="https://github.com/martinmathurine/Video-Store-GUI/assets/42855193/c7f02790-7c93-436c-9178-7aede9167f60" width="500">

<b>Test Case 3</b>
The test involves printing the list of video titles and borrowing a title by selecting "L" and "B" respectively. It ensures that once a title is loaned, it cannot be borrowed again. In the test, Bishop attempts to borrow the film "Logan" multiple times, resulting in a prompt indicating that the title is already loaned. This verifies that customers cannot borrow the same video twice and shows available titles for loan. Additionally, it confirms that the maximum loan limit of 2 videos per customer is enforced. The test outcome is successful (status = passed).

<img src="https://github.com/martinmathurine/Video-Store-GUI/assets/42855193/34e57f74-3e86-4104-b529-0f322544393c" width="500">

<h3>Concluding Reflections</h3>
In conclusion, the application effectively fulfils the user case outlined in the design specification, facilitating the recording and display of available video titles borrowed and loaned by customers of the video store. While I collaborated on the application and referenced external sources, I've also taken ownership by refactoring portions of the code and providing comprehensive comments to demonstrate my understanding of the Java source code. Through rigorous testing against predefined test cases, I've verified that the application functions as intended, adhering to the requirements of specification as outlined in this lab. This process not only showcases my ability to work with existing codebases but also underscores my competency in software development practices and my commitment to delivering high-quality, reliable solutions. 

<h3>References</h3>
 - [1]	softwaretestinghelp.com, "What Is Java Used For: 12 Real World Java Applications", softwaretestinghelp.com, 2022. [Online]. Available: https://www.softwaretestinghelp.com/real-worldapplications-of-java/#1_Desktop_GUI_Applications. [Accessed: 15- Apr- 2022]. 
 - [2]	N. Schneidewind, Computer, network, software, and hardware engineering with applications. Hoboken, N.J.: Wiley, 2012, pp. 429-432. 
 - [3]	Code With Mosh, "The Ultimate Java Mastery Series: From Java zero to hero - Master the world's most popular coding language", codewithmosh.com, 2022. [Online]. Available: https://codewithmosh.com/p/the-ultimate-java-mastery-series. [Accessed: 15- Apr- 2022].
 - [4]	V. 	Fonseca, 	"video_store", 	GitHub, 	2022. 	[Online]. 	Available: https://gist.github.com/vfonseca85/7a406da3cbd5ed0041c15e75ac068887#file-video_store. [Accessed: 15- Apr- 2022].
 - [5]	W. McMullin, "What Are the Best Practices for Writing Quality Test Cases?", parasoft.com, 2022. [Online]. Available: https://www.parasoft.com/blog/how-to-write-test-cases-for-software-examplestutorial/. [Accessed: 15- Apr- 2022]. 
 
