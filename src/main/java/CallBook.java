
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CallBook
{
    private List<Person> base; //хранилище

    private static CallBook instance; // единственный экземпяр телефонной книги

    public static CallBook getInstance() // создаём и получаем книгу
    {
        if (instance==null) instance = new CallBook();
        return instance;
    }

   private CallBook() // конструктор с базовыми значениями книги
    {
        base = new ArrayList<>();
        base.add(new Person("Иванов И.И.", "+8 800 2000 500", "+8 800 200 600"));
        base.add(new Person("Петров П.П.", "+8 800 5000 500", "+8 800 660 670"));
        base.add(new Person("Сидоров И.И.", "+8 800 2000 543"));
        base.add(new Person("Лодочкин И.И.", "+8 854 2031 500", "+8 811 200 600",
                "+8 888 8888 888"));
        base.add(new Person("Пустов В.В."));
    }
    public String[] requestPhones(String name) //запрос телефонов по готовому ФИО
    {

        for(Person person: base)
        {
            if (person.getName().equals(name)) return person.getPhones();
        }
        System.out.println("Нет такого в базе.");
        return requestPhones();
    }
    public String[] requestPhones() // запрос телефонов через консольный ввод ФИО
    {
        String name = "";
        System.out.println("Введите ФИО для информации о телефонных номерах:");
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            name = bufferedReader.readLine();
        }
        catch (IOException e)
        {
            System.out.println("Ошибка ввода! Всё пропало.");
            System.exit(0);
        }
        return requestPhones(name);
    }
    public static void displayResults(String... phones) // вывод телефонов в консоль
    {
        if (phones.length>0) Stream.of(phones).forEach(System.out::println);
        else System.out.println("У него нет известных телефонов...");
    }
}
