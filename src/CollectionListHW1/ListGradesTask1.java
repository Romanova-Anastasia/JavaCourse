package CollectionListHW1;

import java.util.*;
import java.util.stream.Collectors;

//ЗАДАЧА: Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Удалить неудовлетворенные оценки из списка
public class ListGradesTask1 {
    public static void main(String[] args) {


        List<Integer> gradOne = new Random().ints(15,1, 10).boxed().collect(Collectors.toList());
        System.out.println(gradOne);

        for (int i = 0; i <= gradOne.size(); i++)
            if (i <= 3) {
                gradOne.removeAll(Collections.singleton(i)) ;}

        System.out.println(gradOne);
    }
}
