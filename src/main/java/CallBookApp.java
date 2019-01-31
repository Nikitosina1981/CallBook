import java.util.ArrayList;

public class CallBookApp
{
    public static void main(String[] args)
    {
        CallBook callBook = new CallBook();
        final int counter=1;
        if (callBook.requestPhones().size()>0) callBook.getPhones().forEach(System.out::println);
        else System.out.println("Неверное ФИО или ошика ввода...");
    }
}
