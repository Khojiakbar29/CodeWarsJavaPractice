package org.example.sixthKyu;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker6K {
    public static boolean isPangram(String str) {
        // Убираем все символы, кроме буквенных
        str = str.replaceAll("[^a-zA-Z]", "");
        // Приводим к нижнему регистру
        str = str.toLowerCase();
        // Создаем Set для хранения уникальных букв
        Set<Character> letters = new HashSet<>();
        // Добавляем каждую букву в Set
        for (char c : str.toCharArray()) {
            letters.add(c);
        }
        // Если в Set'е есть все буквы, значит это панграмма
        return letters.size() == 26;
    }

}
