
public class CourseHB
{
	private String courseNumber;
	private int numStudents;
	private int maxStudents;
	private int room;
	private int credits;
	
	/*
	 * 
	 */
	public CourseHB ()
	{
		courseNumber = " ";
		numStudents = 0;
		maxStudents = 0;
		room = 0;
		credits = 0;
	} // end of Course

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
	
} // end of Course
