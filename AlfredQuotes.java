import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {
	/*
    * Inputs: None
	* Return Type: String
	* Description: Returns a generic greeting that Alfred will say to anyone.
    */
	public String basicGreeting() {
		// You do not need to code here, this is an example method
		return "Hello, lovely to see you. How are you?";
	}
	
	/* 
    * Inputs: String name, String dayPeriod 
    *                      Assume "morning", "afternoon" or "evening".
	* Return Type: String
	* Description: Returns a greeting that includes the person's name
    *         as well as the day period. For example:
    *        "Good evening, Beth Kane. Lovely to see you."
    * Tip: Try using the String.format method for string interpolation in Java.
    */
	public String guestGreeting(String name, String dayPeriod) {
		String message = "";
		switch (dayPeriod) {
			case "morning":
				message = String.format("Good morning %s, how did you sleep?", name);
				break;
			case "afternoon":
				message = String.format("Good afternoon %s. How are you today?", name);
				break;
			case "evening":
				message = String.format("Good evening  %s. How was your day?", name);
				break;
			default: 
				message = "there was an error with my programming!";
				break;
		}
		return message;
	}

	/*
    * Inputs: None
	* Return Type: String
	* Description: Returns a polite announcement of the current date.
    */
	public String dateAnnouncement() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		Date date = new Date();
		return "Today is "+ formatter.format(date);
	}
	
	/*********************************************
    Final Challenge!
    Alfred is listening. Write a method that accepts any string of conversation. 
    If "Alexis" appears in the conversation return a snarky response, such as:
    "Right away, sir. She certainly isn't sophisticated enough for that." 
    
    If "Alfred" is in the conversation return an obliging response, for example: 
    "At your service. As you wish, naturally." 
    
    If neither name is found, return an appropriate response, for instance:
    "Right. And with that I shall retire." 
	**********************************************/
	/*
    * Inputs: String (A conversation)
	* Return Type: String (Something Alfred would say in response)
	* 
    * Tip: Use the indexOf String method
    */
	public String respondBeforeAlexis(String conversation) {
		String message = "";
		if (conversation.contains("Alexis")){
			message = "Right away, she certainly can't.";
		} else if (conversation.contains("Alfred")){
			message = "As you wish, I shall commence immediately";
		} else {
			message = "Very well, I shall retire.";
		}
		return message;
	}
	// NINJA BONUS
	// Write your own AlfredQuote method using any of the String methods you have learned!
}