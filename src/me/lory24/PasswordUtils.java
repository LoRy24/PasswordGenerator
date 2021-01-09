package me.lory24;

public abstract class PasswordUtils {
    private final String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private final String[] uppercaseLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private final int[] numbers =  {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private final String[] specialSymbols = {"$", "&", "£"};

    public String[] getLetters() {
        return letters;
    }

    public String[] getUppercaseLetters() {
        return uppercaseLetters;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public String[] getSpecialSymbols() {
        return specialSymbols;
    }
}
