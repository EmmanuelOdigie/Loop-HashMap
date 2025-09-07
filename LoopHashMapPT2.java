package JavaLoopHashMap; // project made in eclipse
import java.util.TreeMap; // imported TreeMap for organisation
//import java.util.Collections;

public class LoopHashMapPT2 {// public class 'LoopHashMapPT2' created

	public static void main(String[] args) {// reads, runs & executes code
		
// object created from imported class 'TreeMap' named 'myNameAge' 
// TreeMap takes in two data types, it's set to take String and Integer, TreeMap<String,Integer>
		
		TreeMap<String,Integer> myNameAge = new TreeMap<String,Integer>();
		
// object created calls onto '.put()' method and put in the values into the object
		myNameAge.put("Emmanuel", 26);
		myNameAge.put("Esther", 22);
		myNameAge.put("Victor", 64);
		myNameAge.put("Rosemary", 59);

// for-each loop made, the object calls to the '.keySet()'  and puts all the data in the object
// and converts it to unique keys and pass the data to String variable 'info'
// used System.out.println to display the data in info, that stores the first part of the KeySet
// used object to call out to the '.get()' method and in the method info is placed in bracket
// this gets the second part of unique key in the TreeMap class and displays it.
		for(String info: myNameAge.keySet()) {
			System.out.println("Name: " + info + " Age: " + myNameAge.get(info));
		}
	}

}

//result:
//Name: Emmanuel Age: 26
//Name: Esther Age: 22
//Name: Rosemary Age: 59
//Name: Victor Age: 64
