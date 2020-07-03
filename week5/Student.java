public class Student implements SortableThing
{
	private String name;
	private int mark;

	public Student(String n, int m)
	{
		name = n;
		mark = m;
	}

	public String getName()
	{
		return name;
	}

	public int getMark()
	{
		return mark;
	}

	public String toString()
	{
		return name + " (" + mark + ")";
	}

	public boolean lessThan(SortableThing other)
	{
		Student otherStudent = (Student) other;
		return this.mark < otherStudent.mark;
	}
}