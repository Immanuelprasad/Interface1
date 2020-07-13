interface Abc
{
    void show();
}
public class Interface1
{
    public static void main(String[] args)
    {
        Abc obj = () -> System.out.println("Lamda expression");
        obj.show();
    }
}
