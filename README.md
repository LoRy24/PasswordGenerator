# Password Generator
This is a simple program that you can use to generate 3 passwords with 3 different difficulty levels:
* Easy - Lowercase Letters and Numbers
* Medium - Uppercase Letters, Lowercase Letters, and Numbers
* Hard - Uppercase letters, lowercase letters, numbers, and some special symbols

Remember! This software requires Java SE 15 or newer!

## Program Usage
It's very easy to use. After downloaded and started it with the `-java -jar PasswordGenerator.jar` command,  you have to 
insert the size of the password. For example if you insert `20`, the program generate 3 different passwords with 3 
different **difficulties**, but all of these passwords will be generated with `20` characters.

## API
That program is not a Maven program, but if you want to use some of his methods, you can do it! Here is an example of 
how to generate a password:

```java
import me.lory24.Password;
import me.lory24.PasswordStrength;

class Program {
    public static void main(String[] args) {
        // Change "LEVEL" to your desired level and "PasswordSizeInInteger" with the size
        // of the password (Into an integer value)
        Password password = new Password(PasswordStrength.LEVEL, PasswordSizeInInteger);
        
        // For example, you can print it. Remember, for transfer a password to a string value,
        // you have to use the generate() method.
        System.out.println(password.generate());
    }
}
```

## Code License
This project is under the MIT License: Read it before use the code.