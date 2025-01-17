package program;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Joe");
        names.stream().filter(x->x.startsWith("J")).forEach(System.out::println);
    }
}
