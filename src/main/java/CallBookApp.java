
public class CallBookApp
{
    public static void main(String[] args)
    {
        CallBook callBook = CallBook.getInstance();  // получаем экземпляр телефонной книги
        CallBook.displayResults(callBook.requestPhones()); // запрашиваем ФИО и печатаем результат
    }
}
