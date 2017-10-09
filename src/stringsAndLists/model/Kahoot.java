package stringsAndLists.model;

public class Kahoot
{
	private int questionCount;
	private int level;
	private String creator;
	private boolean isJumble;
	private String topic;
	
	public Kahoot()
	{
		this.questionCount = 0;	//.this refers to the current structure
		this.level = 1;
		this.creator = "Nobody";
		this.isJumble = false;
		this.topic = "some topic";
	}
	
	public Kahoot(String creator, int questionCount, String topic)	//sets the values of the current class to the ones given to it
	{
		this(); 	//will do the method above first
		this.questionCount = questionCount;
		this.creator = creator;
		this.topic = topic;
	}
	
	public String toString()
	{
		String description = "This Kahoot was made by " + creator + " and has " + questionCount + " questions";
		
		return description;
	}
	
	public String getCreator()
	{
		return creator;
	}
	
	public int getQuestionCount()
	{
		return questionCount;
	}
	
	public String getTopic()
	{
		return topic;
	}
}
