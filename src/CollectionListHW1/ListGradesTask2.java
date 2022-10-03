package CollectionListHW1;

import java.util.*;
import java.util.stream.Collectors;

//ЗАДАЧА2: Создать коллекцию, наполнить её случайными числами. Удалить повторяющиеся числа
public class ListGradesTask2 {

    public static void main(String[] args) {

        List<Integer> numberRandom = new Random().ints(15, 0, 10)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(numberRandom);
        List<Integer> numberRandomDistinct = new ArrayList<>(numberRandom)
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(numberRandomDistinct);
    }
}
