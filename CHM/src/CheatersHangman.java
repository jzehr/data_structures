import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.*;
/*
    Cheating Hangman
 */

public class CheatersHangman {
    static Set<String> correctGuesses = new HashSet<String>();
    static Set<String> incorrectGuess = new HashSet<String>();
    static int wordLength = -1;
    static int numGuesses = -1;
    private static Object NullPointerException;
    private static Object Map;
    private static String StringUtils;

    public static Map<Integer, List> readDictionary(String filename){
        Map<Integer, List> mainDictionary = new HashMap<>();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                line = line.strip();
                int charCount = line.length();
                if(mainDictionary.containsKey(charCount)){
                    List list =  mainDictionary.get(charCount);
                    list.add(line);
                    mainDictionary.put(charCount, list);
                }else{
                    List list = new ArrayList();
                    list.add(line);
                    mainDictionary.put(charCount, list);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return mainDictionary;
    }
    // need to use this to create the word family map //
    public static Map<String, List<String>> generateWordFamilies(String guess, Integer wordLength, java.util.Map<Integer, List> mainDictionary, java.util.Map<String, List<String>> hash_map, Set<String> correctGuesses, Set<String> incorrectGuess) {
        // this will be what is returned //
        HashMap<String, List<String>> wordChoices = new HashMap<>();
        // this will be a list to make the map //
        ArrayList<String> checkWords;
        System.out.println("DEBUG HASHMAP: " + hash_map);
        if (correctGuesses.size() == 0) {
            checkWords = (ArrayList<String>) mainDictionary.get(wordLength);
        } else {
            System.out.println("DEBUG key: " + hash_map.keySet().toArray()[0]);
            System.out.println("DEBUG VALUE: " + hash_map.get(hash_map.keySet().toArray()[0]));
            checkWords = (ArrayList<String>) hash_map.get(hash_map.keySet().toArray()[0]);
        }
        System.out.println("DEBUG checkWords: " + checkWords);
        for(String word : checkWords){
            // contain the guess
            ArrayList<String> goodList = new ArrayList<String>();
            // only contain gaps
            ArrayList<String> badList = new ArrayList<String>();
            if(word.contains(guess)){
                char[] ch = word.toCharArray();
                for (char c : ch){
                    char chLower = Character.toLowerCase(c);
                    if(chLower == guess.charAt(0)){
                        goodList.add(guess);
                    } else {
                        goodList.add("_");
                    }
                }
                String listString = "";
                for (String s : goodList) {
                    listString += s;
                }
                ArrayList<String> goodListValue;
                if(wordChoices.containsKey(listString)){
                    wordChoices.get(listString).add(word);
                } else {
                    List<String> newList = new ArrayList<>();
                    goodList.add(word);
                    wordChoices.put(listString, newList);
                }
            } else {
                String c = "_";
                String dashString = c.repeat(wordLength);
                badList.add(dashString);

                ArrayList<String> goodListValue;

                if(wordChoices.containsKey(dashString)){
                    wordChoices.get(dashString).add(word);
                } else {
                    List<String> thisList = new ArrayList<>();
                    goodList.add(word);
                    wordChoices.put(dashString, thisList);
                }
            }
        }
        
        System.out.println(wordChoices);


        // for each value print out length of list
        //System.out.println(wordChoices);
        //HashMap<String, List<String>> wordCounts = new HashMap<>();
        //wordChoices.forEach((k,v) -> System.out.println(v.size() + " " + k));
        int max = 0;
        String key = "";
        for (Map.Entry<String, List<String>> entry : wordChoices.entrySet()) {
            if (entry.getValue().size() > max) {
                max = entry.getValue().size();
                key = entry.getKey();
            }
            System.out.println(entry.getValue().size() + " " + entry.getKey() + " = " + entry.getValue());
        }
        System.out.println("We will go with '" + key + "' ... Words remaining: " + max);
        // Make the Choice.
        // Which has the highest number of words.
        // thing to return
        //HashMap<String, List<String>> wordChoices = wordChoices
        //System.out.println(wordChoices.get(key));
        HashMap<String, List<String>> hash_map_ret = new HashMap<String, List<String>>();
        //java.util.Map<String, List<String>> hash_map_ret = null;
        System.out.println("DEBUG: " + key + " " + wordChoices.get(key));
        hash_map_ret.put(key, wordChoices.get(key));
        System.out.println("Returning: " + hash_map_ret);
        return hash_map_ret;
    }
    public static Integer playGame(Scanner input, Map<Integer, List> mainDict){
        //System.out.println("How many guesses do you want to make?");
        //numGuesses = input.nextInt();
        //System.out.println("How long of a word do you want to guess?");
        //wordLength = input.nextInt();
        //System.out.println(mainDict.get(wordLength));
        //start word length
        String start = "";
        //HashMap<String, List<String>> hash_map = new HashMap<String, List<String>>();
        Map<String, List<String>> hash_map = null;
        for (int i = 0; i < wordLength; i++) {
            start+= "_ ";
        }
        System.out.println(start);
        //rounds of Hangman
        for (int i = 0; i < numGuesses; i++) {
            System.out.println("What character would you like to guess? ");
            System.out.println("Guesses left: " + (numGuesses - i));
            String guess = input.next();
            // System.out.println(correctGuesses);
            // need to add the magic of checking words and families for guess
            // HashMap<String, List<String>> wordChoices = new HashMap<>();
            // newMap = generateWordFamilies(guess, wordLength, mainDict, correctGuesses, incorrectGuess);
            // LOGIC TO CHECK GUESS ISNT MADE ALREADY
            //hash_map = (HashMap<String, List<String>>) generateWordFamilies(guess, wordLength, mainDict, correctGuesses, incorrectGuess);
            System.out.println(hash_map);
            //if (i == 0) {
            //    hash_map = (HashMap<String, List<String>>) generateWordFamilies(guess, wordLength, mainDict, correctGuesses, incorrectGuess);
            //} else {
            //    generateWordFamilies(guess, wordLength, mainDict, correctGuesses, incorrectGuess);
            //}
            System.out.println("CORRECT GUESSES: " + correctGuesses);
            if (i == 0) {
                //correctGuesses.add(guess); // modify this... logic..
                hash_map = (HashMap<String, List<String>>) generateWordFamilies(guess, wordLength, mainDict, hash_map, correctGuesses, incorrectGuess);
                //get key for hashmap..
                // if its all "-" then this is an incorrect guess.
                // otherwise it is a correct guess.
                correctGuesses.add(guess); // modify this... logic..
                //if hashmap is "-"s then add guess to incorrect
            } else {
                // map.get(map.keySet().toArray()[0])
                // check to see if the guess is in the hashmap list.
                hash_map = generateWordFamilies(guess, wordLength, mainDict, hash_map, correctGuesses, incorrectGuess);
                correctGuesses.add(guess);
            }
            /*
            System.out.println("A");
            if (correctGuesses != NullPointerException) {
                if (correctGuesses.contains(guess) || incorrectGuess.contains(guess)) {
                    System.out.println("You've already chosen that letter.");
                }
            } else { // both are sets
                // add the function to test the words for the string in the word
                // then add to either correct or incorrect
                correctGuesses.add(guess);
            }
             */
        }
        return 1; // Game over.
    }
    /*
    public static List chooseNewWordList(Map<String, List<String>> families){
    }
    */
    public static void main(String[] args) {
        //System.out.println(mainDictionary);
        Scanner userInput = new Scanner(System.in);
        int continuePlaying = 1;
        // Init.
        System.out.println("Welcome to Hangman!");
        System.out.println("How many guesses do you want to make?");
        numGuesses = userInput.nextInt();
        System.out.println("How long of a word do you want to guess?");
        wordLength = userInput.nextInt();
        // Read dictionary
        Map<Integer, List> mainDictionary = readDictionary("dictionary.txt");
        while(continuePlaying == 1){ // can change to boolean logic
            continuePlaying = playGame(userInput, mainDictionary);
            // check to see if player wants to play again // Move this..
            System.out.println("Do you want to play again?");
            String response = userInput.nextLine();
            if (response.toLowerCase() == "no") { //
                continuePlaying = 0;
            } else{
                continuePlaying = 1;
            }
        }
        System.out.println("Thanks for playing!");
    }
}