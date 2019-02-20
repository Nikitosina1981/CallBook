import org.junit.Assert;
import org.junit.Test;

public class CallBookTesting
{
/*
    @Test
    public void whenPersonIsInvalid()
    {
        CallBook callBook = CallBook.getInstance();
        callBook.requestPhones("Krokodil");
        Assert.assertEquals(0, callBook.getSize());
    }

*/
    @Test
    public void whenPersonIsIvanov()
    {
        CallBook callBook = CallBook.getInstance();
        String[] res = callBook.requestPhones("Иванов И.И.");
        Assert.assertEquals(2, res.length);
    }

    @Test
    public void whenPersonIsLodochkin()
    {
        CallBook callBook = CallBook.getInstance();
        String[] res = callBook.requestPhones("Лодочкин И.И.");
        Assert.assertEquals(3, res.length);
    }

}
