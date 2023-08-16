package hello.com;
interface X{
    void Greet();
    void Greet2();
    void Greet3();

}
interface Y extends X{
    void Greet4();
    void Greet5();
    void Greet6();
}
class XYZ implements Y{
    @Override
    public void Greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void Greet2() {
        System.out.println("Have a nice day");
    }

    @Override
    public void Greet3() {
        System.out.println("Welcome");
    }

    @Override
    public void Greet4() {
        System.out.println("Good Afternoon");
    }

    @Override
    public void Greet5() {
        System.out.println("Allah Bless you");
    }

    @Override
    public void Greet6() {
        System.out.println("Allah Will Forgive You");
    }
}
public class Practice_of_Inhertance_in_interface {
    public static void main(String[] args) {
        XYZ obj = new XYZ();
        obj.Greet();
        obj.Greet2();
        obj.Greet3();
        obj.Greet4();
        obj.Greet5();
        obj.Greet6();

    }

}
