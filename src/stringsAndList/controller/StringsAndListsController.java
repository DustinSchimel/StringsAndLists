package stringsAndList.controller;

import java.util.List;
import java.util.ArrayList;
import stringsAndLists.model.Kahoot;
import stringsAndLists.view.StringsAndListsDisplay;

public class StringsAndListsController
{
	private List<Kahoot> myKahoots;
	private StringsAndListsDisplay popup;
	
	public StringsAndListsController()
	{
		myKahoots = new ArrayList<Kahoot>();
		popup = new StringsAndListsDisplay();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();				//Creates a Kahoot with default values
		myKahoots.add(myFirstKahoot);
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		String currentCreator = "";
		for (int index = 0; index < myKahoots.size(); index++)
		{
			currentCreator = myKahoots.get(index).getCreator();
			
			Kahoot currentKahoot = myKahoots.get(index);
			String creator = currentKahoot.getCreator();
			
			popup.displayText(myKahoots.get(index).toString());
			
			if (currentCreator.equals("Nobody"))
			{
				for (int loop = 0; loop < 5; loop += 1)
				{
					popup.displayText("wow nobody does a lot");
				}
			}
			
			for (int currentLetterIndex = 0; currentLetterIndex < currentCreator.length(); currentLetterIndex += 1)
			{
				popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex + 1));
			}
		}
	}
	
	private void fillTheList()
	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50, "The fifty United States");	//Creates a new class with the inserted values
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2, "The Double data type");
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE, "Everything");
		Kahoot animalColor = new Kahoot("Branton", 10, "All the colors of the animals");
		Kahoot presidents = new Kahoot("Obama", 44, "The 44th president of the US");
		
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(bigQuiz);
		myKahoots.add(animalColor);
		myKahoots.add(presidents);
	}
}
