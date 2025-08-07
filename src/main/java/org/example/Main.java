package org.example;

public class Main{

    public static void main(String[] args) {

        //Exercise 1 length()
        //result prediction:  14
        //actual result: 14
        //explanation: length() returns the number of characters within string literal
        String greeting = "Hello, Cadets!";
        int length = greeting.length();
        System.out.println("The length of the string is: " + length);

        //Exercise 2 charAt()
        //result prediction: " l" at index 6
        //actual result: l
        //explanation: retrieves character at index 5, note that indexing starts at 0. Also note that
        //white spaces are considered characters in java so if provided index is 4 it will return " "
        String message = "Keep learning!";
        char character = message.charAt(5);
        System.out.println("The character at index 5 is: " + character);

        //Exercise 3 substring()
        //result prediction: is
        //actual result: is
        String statement = "Java is powerful.";
        String part = statement.substring(5, 7);
        System.out.println("The extracted substring is: " + part);
        //explanation: returns substring starting from index 5 to index (7-1=6) which is "is"
        //if there is ending index, it will return substring from 5 to end of index
        //if index is invalid such as -1, it will return exception StringIndexOutOfBoundsException

        //Exercise 4
        //result prediction: THIS IS A TEST, this is a test
        //actual result: THIS IS A TEST, this is a test
        String mixedCase = "This Is A Test";
        String upper = mixedCase.toUpperCase();
        String lower = mixedCase.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        //explanation: creates a new string where all characters are upper case/lower case

        //Exercise 5
        //result prediction: 18, 38, -1
        //actual result: 16, 37, -1
        String sentence = "The quick brown fox jumps over the lazy dog.";
        int indexOfFox = sentence.indexOf("fox");
        int indexOfZ = sentence.indexOf('z');
        int indexOfCat = sentence.indexOf("cat");
        System.out.println("Index of 'fox': " + indexOfFox);
        System.out.println("Index of 'z': " + indexOfZ);
        System.out.println("Index of 'cat': " + indexOfCat);
        //explanation: finds the first occurance of the char or string (returns index of starting char
        //if no char is found, it will return -1
        //be careful with indexing and remember that it starts at 0

        //Exercise 6
        //result prediction: false, true, true
        //actual result: false, true, true
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";

        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        System.out.println("\"Java\".equals(\"java\"): " + isEqual1);
        System.out.println("\"Java\".equals(\"Java\"): " + isEqual2);
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + isEqualIgnoreCase);
        //explanation: for .equals(), it compares strings and is case-sensitive while.equalsIgnore case is not

        //Exercise 7
        //result prediction: replaced will return "I like dogs. Dogs are cute."
        //actual result: "I like dogs. Cats are cute."
        String original = "I like cats. Cats are cute.";
        String replaced = original.replace("cats", "dogs");
        System.out.println("Original: " + original);
        System.out.println("Replaced: " + replaced);
        //explanation: this will replace all occurances of target string (cat) to replacement string (dogs)
        //Be careful as this is case-sensitive so in this case, it does not replace Cat

        //Exercise 8
        //result prediction: 20, 'Lots of spaces', 14
        //actual result: 20, 'Lots of spaces', 14
        String padded = "   Lots of spaces   ";
        String trimmed = padded.trim();
        System.out.println("Padded string length: " + padded.length());
        System.out.println("Trimmed string: '" + trimmed + "'");
        System.out.println("Trimmed string length: " + trimmed.length());
        //explanation: Removes spaces before and after main string literal which means it does not remove
        //the white spaces in between the characters

    }
}