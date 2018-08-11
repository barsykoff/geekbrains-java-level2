package Lesson3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyCheckPassword {

    // Необходимо из консоли считать пароль и проверить валидность,
    //результат будет true или false
    //
    //Требования:
    //1. Пароль должен быть не менее 8ми символов.
    //2. В пароле должно быть число
    //3. В пароле должна быть хотя бы 1 строчная буква
    //4. В пароле должна быть хотя бы 1 заглавная буква

    public boolean checkPassword(String password) {

        Pattern p = Pattern.compile("^[a-zA-Z0-9]{8,}$");
        Matcher m = p.matcher(password);

        return m.matches();
    }
}

class MyCheckPasswordMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MyCheckPassword myCheckPassword = new MyCheckPassword();

        System.out.println("Укажите пароль: ...");
        String password = scanner.next();

        if (myCheckPassword.checkPassword(password)) {
            System.out.println("Пароль корректный!");
        } else {
            System.out.println("Пароль некорректный!");
        }

    }
}
