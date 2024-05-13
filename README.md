# Video-Store-GUI

<img src="
" width="500">


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
 
If I were to create this application the block diagram in Figure 2 would illustrate a clean way to streamline this simple application to meet the user case set out in the design specification. In Figure 2., the block diagram visually represents the design and implementation of the source code for the application. The application is initialised at the starting point and as long as the conditions are met in order for a customer to proceed and successfully request to borrow and loan out a video title then the application will work as intended. The end-user is presented with a main menu, then the name of the customer is must be entered and only if their name exists in the stored system then they can proceed to loan out a title depending on its availability and if so, prompted with an expected return date if already loaned out. A customer can only loan out a maximum of 2 video titles for a period of no more than 3 days. To end the application the customer must enter the command in the main menu which is “Q”. Also, the main lists all titles in the system if the end-user enters “L” at the main menu. If the enduser enters “B” then they are prompted to enter their name corresponding to what is stored in the application’s records before being prompted to loan out a title as long as the conditions are met as shown in the block diagram in Figure 2 below.  

<h3>Summary Tables:</h3>
Table 1 summarises the classes and packages and usage for the classes in this application. 

<h3>[Figure 2.]</h3>
<img src="https://github.com/martinmathurine/Video-Store-GUI/assets/42855193/a24d6ca7-8c95-4442-bd87-1f3013088846" width="500">

<h3>[Table 1.]</h3>
| Class           | Usage                                                      | Package                    |
|-----------------|------------------------------------------------------------|----------------------------|
| Customer        | Date/time formatting subclasses                            | java.text.DateFormat       |
| Video           | Date/time formatting and parsing                           | java.text.SimpleDateFormat |
| Customer        | Converting between instances in time                       | java.util.Calendar         |
| Customer, Video | Represents an instance in time                             | java.util.Date             |
| VideoTest       | Input alphanumeric characters from another source          | java.util.Scanner          |
| VideoStore      | Access an element in the ArrayList using the get method    | java.util.ArrayList        |

 
<h3>Class Summary</h3>   
The class summaries below describe the fields, constructors and methods for each class in the desktop application. 

<h3>Customer</h3>
The Customer class has instance fields for the customer’s name and for the number of video titles to be borrowed and loaned out. A method `borrowvideo(Video v)` checks video availability and borrowing limit, sets due date and on loan fields in Video. Provides get method for customer’s name.
 
<h3>Video</h3>
The Video class has instance fields for the video title, loan status, and return date. Provides get and set methods for some fields and a `toString()` method.        

<h3>VideoStore</h3> 
Contains ArrayLists for customers and videos respectively. Initializes Customer and Video objects, provides `listallvideos()` method, and `borrow(String,String)` method. Checks and identifies corresponding objects. 

<h3>VideoTest</h3>
The main method creates a new VideoStore and enters an infinite loop with a GUI menu. Options include listing all videos, borrowing, and quitting. Borrow option prompts for customer's name and video title.                |








