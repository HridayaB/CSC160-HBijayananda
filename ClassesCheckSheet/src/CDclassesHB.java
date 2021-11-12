import java.util.Scanner;

/*
 * Hridaya Bijayananda
 */
public class CDclassesHB
{
	static Scanner input;
	public static void main( String[ ] args )
	{
		CourseHB myCourse;
		myCourse = new CourseHB ( );
		String result;
		input = new Scanner(System.in);
		getDataMenbersValues ( myCourse );
		printDataMembersValues ( myCourse);
		result = myCourse.toString ( );
		System.out.println(result);
		CourseHB myCourse2;
		myCourse2 = new CourseHB ( String courseNumber, int numStudents, int maxStudents, int room, int credits );
		
		System.out.println(myCourse2);
	} // end of main
	
	/*
	 * Description: Getting the data members values from CourseHB
	 * Parameter: CourseHB myCourse
	 * return type void
	 */
	public static void getDataMenbersValues (CourseHB myCourse )
	{
		String courseNumber;
		int numStudents;
		int maxStudents;
		int room;
		int credits;
		System.out.println("Enter the course number.");
		courseNumber = input.nextLine();
		myCourse.setCourseNumber(courseNumber);
		System.out.println("Enter the number of Students.");
		numStudents = input.nextInt ();
		myCourse.setNumStudents ( numStudents );
		System.out.println("Enter the maximum number of students.");
		maxStudents = input.nextInt ();
		myCourse.setMaxStudents ( maxStudents );
		System.out.println("Enter the room.");
		room = input.nextInt ();
		myCourse.setRoom ( room );
		System.out.println("Enter the credits.");
		credits = input.nextInt ( );
		myCourse.setCredits ( credits );
	} // end of getDataMenbersValues
	
	/*
	 * Description: Printing the data members values from CourseHB
	 * Parameter: CourseHB myCourse
	 * return type void
	 */
	public static void printDataMembersValues (CourseHB myCourse)
	{
		String courseNumber;
		int numStudents;
		int maxStudents;
		int room;
		int credits;
		courseNumber = myCourse.getCourseNumber ( );
		System.out.println("The course number is " + courseNumber);
		numStudents = myCourse.getNumStudents ( );
		System.out.println("The number of students is " + numStudents);
		maxStudents = myCourse.getMaxStudents ( );
		System.out.println("The maximum amount of students is " + maxStudents);
		room = myCourse.getRoom ( );
		System.out.println("The room is " + room);
		credits = myCourse.getCredits ( );
		System.out.println("The credits is " + credits);
	} // end of printDataMembersValues
	
	
} // end of CDclassesHB

