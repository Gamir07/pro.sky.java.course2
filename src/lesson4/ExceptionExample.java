package lesson4;

import java.util.regex.Pattern;

public class ExceptionExample {
    public static void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (!(Pattern.matches("\\w{0,20}", login))) {
            throw new WrongLoginException("Попробуйте другой логин");
        }
        if (!(Pattern.matches("\\w{0,20}", password)) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Попробуйте другой пароль");
        }

    }

    public static void main(String[] args) {
        try {
            signUp("gamir_19.", "javadeveloper","javadeveloper");
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }

    }
}
