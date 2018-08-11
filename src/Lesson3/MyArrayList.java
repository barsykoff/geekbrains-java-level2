package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MyArrayList {
    // 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список
    // уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.

    public static void main(String[] args) {

        ArrayList<String> furnitureAll = new ArrayList<>();

        furnitureAll.add("Стул");
        furnitureAll.add("Табуретка");
        furnitureAll.add("Диван");
        furnitureAll.add("Кровать");
        furnitureAll.add("Стол");
        furnitureAll.add("Стул");
        furnitureAll.add("Подставка");
        furnitureAll.add("Шкаф");
        furnitureAll.add("Комод");
        furnitureAll.add("Шкаф");
        furnitureAll.add("Тахта");
        furnitureAll.add("Торшер");
        furnitureAll.add("Гардероб");
        furnitureAll.add("Трюмо");
        furnitureAll.add("Тумба");
        furnitureAll.add("Тумба");

        Map<String, Integer> furnitureUnique = new HashMap<>();

        for (String f: furnitureAll) {
            int count = Collections.frequency(furnitureAll, f);
            furnitureUnique.put(f, count);
        }

        System.out.println(furnitureUnique.toString());
    }
}
