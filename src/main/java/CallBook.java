
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CallBook
{
    private HashMap<String, ArrayList<String>> base = new HashMap<String, ArrayList<String>>();
    private String person;
    private ArrayList<String> phones;

    public ArrayList<String> getPhones()
    {
        return phones;
    }

    public void setPerson(String person)
    {
        this.person = person;
    }

    CallBook()
    {
        base.put("Иванов И.И.", new ArrayList<String>(Arrays.asList("+8 800 2000 500", "+8 800 200 600")));
        base.put("Петров П.П.", new ArrayList<String>(Arrays.asList("+8 800 5000 500", "+8 800 660 670")));
        base.put("Сидоров И.И.", new ArrayList<String>(Arrays.asList("+8 888 2800 500")));
        base.put("Лодочкин И.И.", new ArrayList<String>(Arrays.asList("+8 854 2031 500", "+8 811 200 600",
                "+8 888 8888 888")));
        phones = new ArrayList<String>();
    }
    public ArrayList<String> requestPhones()
    {
        if (person==null)
        {
            System.out.println("Введите ФИО для информации о телефонных номерах:");
            try
            {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                person = bufferedReader.readLine();
            }
            catch (IOException e)
            {
                System.out.println("Ошибка ввода! Всё пропало.");
                System.exit(0);
            }
        }
        phones.addAll(base.get(person));
        return phones;
    }
}
