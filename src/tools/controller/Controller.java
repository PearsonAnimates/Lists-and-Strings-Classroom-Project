package tools.controller;

import java.util.List;
import java.util.ArrayList;

import tools.model.Kahoot;
import tools.view.PopupDisplay;

public class Controller
{

	private List<Kahoot> myKahoots;
	private PopupDisplay popup;
	/*
	 * "ListsDisplay" must be changed to "PopupDisplay"
	 */
//	private List<Kahoot> mySecondKahoot;
	
	public Controller()
	{
		myKahoots = new ArrayList<Kahoot>();
		popup = new PopupDisplay();
//		mySecondKahoot = new ArrayList<Kahoot>();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
		fillTheList();
		showTheList();
		changeTheList();
	}
	
	public int findMaxLength(ArrayList<String> myList)
	{
		int min = Integer.MAX_VALUE;
		
		for(int index = 0; index < myList.size(); index++)
		{
			if(myList.get(index).length() < min)
			{
				min = myList.get(index).length();
			}
		}
		return min;
	}
	
	private void showTheList()
	{
		String currentCreator = "";
		for (int index = 0; index < myKahoots.size(); index += 1)
		{
			currentCreator = myKahoots.get(index).getCreator();
			Kahoot currentKahoot = myKahoots.get(index);
			String creator = currentKahoot.getCreator();
		}
	}
	

	private void fillTheList()
	{
		Kahoot fiftyStates = new Kahoot("Kashish", 7, "States");
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2, "Devils");
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE, "Everything");
		Kahoot animalColor = new Kahoot("Branton", 10, "All the colors of the rainb- I mean animals");
		Kahoot presidents = new Kahoot("Obama", 44, "presidents");
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(bigQuiz);
		myKahoots.add(animalColor);
		myKahoots.add(presidents);
	}
	
	private void changeTheList()
	{
		popup.displayText("The current list size is: " + myKahoots.size());
		Kahoot removed = myKahoots.remove(3);
		popup.displayText("I removed the Kahoot by " + removed.getCreator());
		popup.displayText("The list now has: " + myKahoots.size() + " items inside.");
		myKahoots.add(0, removed);
		
	} 

	public PopupDisplay getPopup()
	{
		return popup;
		/*
		 * "ListsDisplay" must be changed to "PopupDisplay"
		 */
	}
	
	public ArrayList<Kahoot> getMyKahoots()
	{
		return (ArrayList<Kahoot>) myKahoots;
	}

}
