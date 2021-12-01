import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //задаем сообщение аборигена
        String str = "dsfsfd odsoad asd kksldskld osdsok as ksodkaoii iii AIII";
        Function<String, List<String>> stringToArray = s -> Arrays.stream(s.split(" "))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(stringToArray.apply(str));
    }

}
