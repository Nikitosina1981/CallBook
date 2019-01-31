import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class CallBookTesting
{
    CallBook callBook = new CallBook();
    @Test
    public void whenPersonIsNull()
    {
        callBook.setPerson(null);
        ArrayList<String> phones = callBook.getPhones();
        Assert.assertEquals(0,phones.size());
    }

    @Test
    public void whenPersonIsInvalid()
    {
        callBook.setPerson("Krokodil");
        ArrayList<String> phones = callBook.getPhones();
        Assert.assertEquals(0, phones.size());
    }

    @Test
    public void whenPersonIsIvanov()
    {
        callBook.setPerson("Иванов И.И.");
        Assert.assertEquals(2, callBook.getPhones().size());
    }

    @Test
    public void whenPersonIsLodochkin()
    {
        callBook.setPerson("Лодочкин И.И.");
        ArrayList<String> phones = callBook.getPhones();
        Assert.assertEquals(3, phones.size());
    }


}
