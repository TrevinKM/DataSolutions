package solutions;


import java.util.*;


public class SolutionClasses {
    //Implement the function longestSequence(sequence)which takes a string of letters and finds
    //the longest sequence where the same letter occurs continuously.
    //The function must return an object literal {c: n} where c is the lowercase character and n is the
    //length of this sub-sequence.
    //If there are multiple characters with a continuous sequence of the same length, return the
    //information for the letter which occurs first alphabetically.

    NavigableMap<Character, Integer> lettersFound = new TreeMap<Character, Integer>();
    public String longestSequence(String sequence){

        int count;
        String result = " ";
        Character currentChar;
        Character lastChar = ' ';
        int accumulator = 0;
        sequence = sequence.toLowerCase();

        for (int i = 0; i < sequence.length(); i++){ // dghhhmhmx

            currentChar = sequence.charAt(i);
            if (!Character.isAlphabetic(currentChar)){
                continue;
            }
            if(lettersFound.containsKey(currentChar)){
                if (currentChar == lastChar){
                    accumulator += 1;
                    if (accumulator >= lettersFound.get(currentChar)){
                        lettersFound.put(currentChar, accumulator);
                    }
                }
                else {
                    accumulator = 1;
                }
            }
            else {
               accumulator = 1;
               lettersFound.put(currentChar, 1);
            }

            lastChar = currentChar;
        }
        System.out.println(lettersFound);
        int maxValue = Collections.max(lettersFound.values());
        for (Map.Entry<Character,Integer> entry : lettersFound.descendingMap().entrySet()){
            if (entry.getValue() == maxValue){
                result = String.format("{%s : %s}", entry.getKey(), entry.getValue());
            }
        }
        return result;
    }

    public  double balance(int openingSum, float interestRate, float taxFreeLimit, float taxRate, int numMonths){

        float interest = 0;
        float totalSavings = openingSum;
        float monthlyTax;

        interestRate = interestRate/100;
        taxRate = taxRate/100;

        for (int i = 0; i<numMonths; i++){
            interest = totalSavings*interestRate;
            if (totalSavings > taxFreeLimit){
                monthlyTax = (totalSavings-taxFreeLimit)*taxRate;
                totalSavings -= monthlyTax;
            }
            totalSavings += interest;
        }
        return Math.round(totalSavings*100.0)/100.0;
    }


    public String reverseString(String string) {
        if (string.isEmpty()) {
            return "";
        }
        if (string.length() == 1) {
            return string;
        } else {
            return string.substring(string.length() - 1) + reverseString(string.substring(0, string.length() - 1));
        }
    }

}
