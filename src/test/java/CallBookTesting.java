import org.junit.Assert;
import org.junit.Test;

public class CallBookTesting
{

    @Test
    public void whenPersonIsInvalid()
    {
        CallBook callBook = new CallBook();
        callBook.setPerson("Krokodil");
        Assert.assertEquals(0, callBook.getSize());
    }

    @Test
    public void whenPersonIsIvanov()
    {
        CallBook callBook = new CallBook();
        callBook.setPerson("Иванов И.И.");
        Assert.assertEquals(2, callBook.getSize());
    }

    @Test
    public void whenPersonIsLodochkin()
    {
        CallBook callBook = new CallBook();
        callBook.setPerson("Лодочкин И.И.");
        Assert.assertEquals(3, callBook.getSize());
    }

    @Test
    public void whenPersonIsEmpty()
    {
        CallBook callBook = new CallBook();
        callBook.setPerson("");
        Assert.assertEquals(0, callBook.getSize());
    }

}
