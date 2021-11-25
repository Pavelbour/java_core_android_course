package core.android.course.lesson.ten;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private String[] dataArray;

    public WordCounter(String[] data) {
        this.dataArray = data;
    }

    public void countWords() {
        HashMap<String, Integer> dataMap = new HashMap<>();

        for (String word: this.dataArray) {
            if (dataMap.containsKey(word)) {
                int count = dataMap.get(word);
                dataMap.replace(word, count+1);
            } else {
                dataMap.put(word, 1);
            }
        }

        System.out.println("Total words: " + dataMap.size());

        for (Map.Entry<String, Integer> map : dataMap.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue());
        }
    }
}
