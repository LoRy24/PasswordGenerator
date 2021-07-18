package me.lory24;

import java.util.Random;

public class Password {
    private final StringBuilder password = new StringBuilder();
    private final PasswordStrength passwordStrength;
    private final int size;
    private final char[] specialChars = {'$', '%', '£'};

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
                    Object[] charValue = {(char) (random.nextInt(26) + 97), random.nextInt(9)};
                    password.append(charValue[index]);
                }
            }

            case HIGH -> {
                for (int n = 0; n <= size; n++) {
                    int index = random.nextInt(4);
                    char lowChar = (char) (random.nextInt(26) + 97), upperChar = (char) (random.nextInt(26) + 65);
                    Object[] charValue = {lowChar, random.nextInt(9), upperChar, specialChars[
                            random.nextInt(specialChars.length)]};
                    password.append(charValue[index]);
                }
            }

            case MEDIUM -> {
                for (int n = 0; n <= size; n++) {
                    int index = random.nextInt(3);
                    char lowChar = (char) (random.nextInt(26) + 97), upperChar = (char)
                            (random.nextInt(26) + 65);
                    Object[] charValue = {lowChar, random.nextInt(9), upperChar};
                    password.append(charValue[index]);
                }
            }
        }
        return password.toString();
    }
}
