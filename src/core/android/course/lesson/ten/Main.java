package core.android.course.lesson.ten;

public class Main {
    public static void main(String[] args) {
        String[] wordArray = {"car", "plane", "train", "car", "tram", "car", "plane", "car"};
        WordCounter wCounter = new WordCounter(wordArray);
        wCounter.countWords();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone("Scarone", "399999999");
        phoneBook.addPhone("Marone", "391111111");
        phoneBook.addPhone("Scarone", "392222222");
        phoneBook.addPhone("Bocceli", "393333333");
        phoneBook.addPhone("Belucci", "394444444");
        phoneBook.addPhone("Ferreri", "395555555");
        phoneBook.addPhone("Scarone", "396666666");
        phoneBook.addPhone("Alesso", "397777777");
        phoneBook.addPhone("Tatangelo", "398888888");

        phoneBook.getPhone("Scarone");
        phoneBook.getPhone("Marone");
    }
}
