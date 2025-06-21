import java.io.IOException;
import java.io.OutputStreamWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int income = 300;
        int spending = 200;
        int temp = income - spending;
        if (income + spending < 0) throw new RuntimeException(
                "INT type hve length -2^32+1 <= value <= 2^32-1"
        );
        try {
            OutputStreamWriter stream = new OutputStreamWriter(System.out);
            stream.write("Итого (руб):\n%s".formatted(temp));
            stream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}