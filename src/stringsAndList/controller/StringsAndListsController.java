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
		for (int index = 0; index < myKahoots.size(); index++)
		{
			popup.displayText(myKahoots.get(index).toString());
		}
	}
	
	private void fillTheList()
	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50);	//Creates a new class with the inserted values
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2);
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE);
		Kahoot animalColor = new Kahoot("Branton", 10);
		Kahoot presidents = new Kahoot("Obama", 44);
		
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(bigQuiz);
		myKahoots.add(animalColor);
		myKahoots.add(presidents);
	}
}
