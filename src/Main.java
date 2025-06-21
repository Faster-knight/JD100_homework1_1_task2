import java.io.IOException;
import java.io.OutputStreamWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int income = 300;
        int spending = 200;
        int temp = income - spending;
        System.out.println("Итого (руб):\n%s".formatted(temp));
    }
}