import java.util.ArrayList;

public class CallBookApp
{
    public static void main(String[] args)
    {
        CallBook callBook = new CallBook();
        if (callBook.requestPhones()!=null) System.out.println(callBook.getPhones());
        else System.out.println("Неверное ФИО или ошика ввода...");
    }
}
