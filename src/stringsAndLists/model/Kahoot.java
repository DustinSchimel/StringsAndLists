package stringsAndLists.model;

public class Kahoot
{
	private int questionCount;
	private int level;
	private String creator;
	private boolean isJumble;
	
	public Kahoot()
	{
		this.questionCount = 0;
		this.level = 1;
		this.creator = "Nobody";
		this.isJumble = false;
	}
	
	public Kahoot(String creator, int questionCount)	//sets the values of the current class to the ones given to it
	{
		this.questionCount = questionCount;
		this.creator = creator;
	}
	
	public String toString()
	{
		String description = "This Kahoot was made by " + creator + " and has " + questionCount + " questions";
		
		return description;
	}
}
