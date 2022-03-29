package gen;

import java.util.*;

public class generate {
    
    // 1. getRandomLowerCaseLetter() method: This method is used to get one random
    // lower case character between ‘a’ and ‘z’.
    public char getRandomLowerCaseLetter(){
        char Diff = 'z' - 'a';
        return (char)('a' + Math.random() * Diff);
    }
    // 2. getRandomUpperCaseLetter() method: This method is used to get one random
    // upper case letter between ‘A’ and ‘Z’.
    public char getRandomUpperCaseLetter(){
        char Diff = 'Z' - 'A';
        return (char)('A' + Math.random() * Diff);
    }
    // 3. getRandomDigitCharacter() method: This method is used to get one random digit
    // number between ‘0’ and ‘9’.
    public char getRandomDigitCharacter(){
        Random random = new java.util.Random();   
        int randomInt = random.nextInt(10);
        return (char)(randomInt+'0');
    }
    // 4. getRandomCharacter() method: This method is used to get one random character.
    public char getRandomCharacter(){
        Random random = new Random();
        int randomChoice = random.nextInt(0,3);
        switch(randomChoice){
            case 0: return getRandomUpperCaseLetter(); 
            case 1: return getRandomDigitCharacter(); 
            case 2: return getRandomLowerCaseLetter(); 
        }
        return 'a';
    }
    public Boolean isprime(char temp){
        int number = temp - '0';
        for (int index=2; index<number; index++){
            if (number%index ==0){
                return false;
            }
        }
        return true;
    }
}
