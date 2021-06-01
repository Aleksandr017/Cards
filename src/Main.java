import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main (String[] args) {
        Set<Card>set = new HashSet<>();

        //Черви
        set.add(new Card("6", "Черви"));
        set.add(new Card("7", "Черви"));
        set.add(new Card("8", "Черви"));
        set.add(new Card("9", "Черви"));
        set.add(new Card("10", "Черви"));
        set.add(new Card("Валет", "Черви"));
        set.add(new Card("Дама", "Черви"));
        set.add(new Card("Король", "Черви"));
        set.add(new Card("Туз", "Черви"));

        //Бубны
        set.add(new Card("6", "Бубны"));
        set.add(new Card("7", "Бубны"));
        set.add(new Card("8", "Бубны"));
        set.add(new Card("9", "Бубны"));
        set.add(new Card("10", "Бубны"));
        set.add(new Card("Валет", "Бубны"));
        set.add(new Card("Дама", "Бубны"));
        set.add(new Card("Король", "Бубны"));
        set.add(new Card("Туз", "Бубны"));

        //Пики
        set.add(new Card("6", "Пики"));
        set.add(new Card("7", "Пики"));
        set.add(new Card("8", "Пики"));
        set.add(new Card("9", "Пики"));
        set.add(new Card("10", "Пики"));
        set.add(new Card("Валет", "Пики"));
        set.add(new Card("Дама", "Пики"));
        set.add(new Card("Король", "Пики"));
        set.add(new Card("Туз", "Пики"));
        
        //Трефы
        set.add(new Card("6", "Трефы"));
        set.add(new Card("7", "Трефы"));
        set.add(new Card("8", "Трефы"));
        set.add(new Card("9", "Трефы"));
        set.add(new Card("10", "Трефы"));
        set.add(new Card("Валет", "Трефы"));
        set.add(new Card("Дама", "Трефы"));
        set.add(new Card("Король", "Трефы"));
        set.add(new Card("Туз", "Трефы"));
    }
}
