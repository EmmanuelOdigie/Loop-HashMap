package JavaLoopHashMap; // project made in eclipse
import java.util.HashMap; // imported HashMap

public class LoopHashMap {// public class 'LoopHashMap' created

	public static void main(String[] args) { // reads, run, executes code
	
//object created from imported HashMap class, HashMap set as <String,String>
// object name 'myNewList'
	HashMap<String,String> myNewList = new HashMap<String,String>();
	
// object calls onto the .put() method and put the strings into the object
	myNewList.put("Summer's", "Eve");
	myNewList.put("Morning", "Day");
	myNewList.put("Time", "Flies");
	myNewList.put("Sad", "Times");
	
// for each loop set, object calls onto keySet() and takes the string array and converts into unique
// keys and pass down to string i
// display the text, in System.out.println the object calls onto the .get() method and gets 
// the value from the keySet() method
	for(String i : myNewList.keySet()) {
		System.out.println("Key: " + i + " " + " Value: " + myNewList.get(i));
	}

	}

}

// result:
//Key: Summer's  Value: Eve
//Key: Morning  Value: Day
//Key: Sad  Value: Times
//Key: Time  Value: Flies