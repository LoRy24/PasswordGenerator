package me.lory24;

import java.util.Random;

public class Password extends PasswordUtils {
    private final StringBuilder password = new StringBuilder();
    private final PasswordStrength passwordStrength;
    private final int size;

    public Password(PasswordStrength passwordStrength, int size) {
        this.passwordStrength = passwordStrength;
        this.size = size;
    }

    public String generate() {
        final Random random = new Random();
        switch (passwordStrength) {
            case LOW -> {
                for (int n = 0; n <= size; n++) {
                    int index = random.nextInt(2);
                    Object[] charValue = {getLetters()[random.nextInt(getLetters().length)],
                            getNumbers()[random.nextInt(getNumbers().length)]};
                    password.append(charValue[index]);
                }
            }

            case MEDIUM -> {
                for (int n = 0; n <= size; n++) {
                    int index = random.nextInt(3);
                    Object[] charValue = {getLetters()[random.nextInt(getLetters().length)],
                            getNumbers()[random.nextInt(getNumbers().length)],
                            getUppercaseLetters()[random.nextInt(getUppercaseLetters().length)]};
                    password.append(charValue[index]);
                }
            }

            case HIGH -> {
                for (int n = 0; n <= size; n++) {
                    int index = random.nextInt(4);
                    Object[] charValue = {getLetters()[random.nextInt(getLetters().length)],
                            getNumbers()[random.nextInt(getNumbers().length)], getUppercaseLetters()[random.nextInt(getUppercaseLetters().length)],
                            getSpecialSymbols()[random.nextInt(getSpecialSymbols().length)]};
                    password.append(charValue[index]);
                }
            }
        }
        return password.toString();
    }
}
