
public class Person
{
    private String name;
    private String[] phones;

    public Person(String name, String... phones)
    {
        this.name = name;
        this.phones = phones;
    }

    public String getName()
    {
        return name;
    }

    public String[] getPhones()
    {
        return phones;
    }
}
