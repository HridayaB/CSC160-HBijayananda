

public class CourseHB
{
	private String courseNumber;
	private int numStudents;
	private int maxStudents;
	private int room;
	private int credits;
	
	/*
	 * Description: Manual default constructor for CourseHB
	 * Parameter: none
	 * return type CourseHB
	 */
	public CourseHB ()
	{
		courseNumber = " ";
		numStudents = 0;
		maxStudents = 0;
		room = 0;
		credits = 0;
	} // end of Course

	/*
	 * Description: Generated default constructor for CourseHB
	 * Parameter: none
	 * return type CourseHB
	 */
	public CourseHB( String courseNumber, int numStudents, int maxStudents, int room, int credits )
	{
		super ( );
		this.courseNumber = courseNumber;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.room = room;
		this.credits = credits;
	}

	public String getCourseNumber( )
	{
		return courseNumber;
	}

	public void setCourseNumber( String courseNumber )
	{
		this.courseNumber = courseNumber;
	}

	public int getNumStudents( )
	{
		return numStudents;
	}

	public void setNumStudents( int numStudents )
	{
		this.numStudents = numStudents;
	}

	public int getMaxStudents( )
	{
		return maxStudents;
	}

	public void setMaxStudents( int maxStudents )
	{
		this.maxStudents = maxStudents;
	}

	public int getRoom( )
	{
		return room;
	}

	public void setRoom( int room )
	{
		this.room = room;
	}

	public int getCredits( )
	{
		return credits;
	}

	public void setCredits( int credits )
	{
		this.credits = credits;
	}

	/*
	 * Description: Printing the data members values from CourseHB
	 * Parameter: none
	 * return type String
	 */
	public String toString( )
	{
		return "CourseHB" + "\n" + "[" + "\n" + "courseNumber=" + courseNumber + "\n" + "numStudents=" + numStudents + "\n" + "maxStudents=" + maxStudents
				+ "\n" + "room=" + room + "\n" + "credits=" + credits + "\n" + "]";
	}
} // end of Course
