import Fahrkarte.Mehrfahrkarte;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mehrfahrkarte Berlin = new Mehrfahrkarte(3.0, 4);


        System.out.println(Berlin.getPreis());
        System.out.println(Berlin.toString());
        System.out.println(Berlin.getClass());
        System.out.println(Berlin.nutzen());
        System.out.println(Berlin.toString());
    }
}