package core.android.course.lesson.ten;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, String> book;

    public PhoneBook() {
        this.book = new HashMap<>();
    }

    public void addPhone(String lastName, String phone) {
        this.book.put(phone, lastName);
    }

    public void getPhone(String lastName) {
        for (Map.Entry<String, String> phone: this.book.entrySet()) {
            if (phone.getValue().equals(lastName)) {
                System.out.printf("%s______________%s\n", phone.getValue(), phone.getKey());
            }
        }
    }
}
