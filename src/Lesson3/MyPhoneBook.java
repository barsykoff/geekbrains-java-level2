package Lesson3;

import java.util.HashMap;
import java.util.HashSet;

public class MyPhoneBook {

    // 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
    // В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер
    // телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
    // тогда при запросе такой фамилии должны выводиться все телефоны.

    private HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public void add(String surname, String phone) {

        HashSet<String> phones = phoneBook.getOrDefault(surname, new HashSet<>());

        phones.add(phone);
        phoneBook.put(surname, phones);
    }

    public void get(String surname) {
        System.out.println(phoneBook.getOrDefault(surname, null) != null ? phoneBook.get(surname) : "Запись с такой фамилией не найдена");
    }


}

class MyPhoneBookMain {

    public static void main(String[] args) {

        MyPhoneBook myPhoneBook = new MyPhoneBook();

        myPhoneBook.add("Иванов", "1234567890");
        myPhoneBook.add("Иванов", "1234567891");
        myPhoneBook.add("Петров", "1234567892");

        myPhoneBook.get("Сидоров");
    }
}
