package TasksFromTheInternet.Sets;

import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

public class OperationsOnSets {
    public static void main(String[] args) {
        List<Integer> firstList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> secondList = Arrays.asList(2, 3, 6, 7, 8, 9);

//объединяем два множества
        Collection<Integer> resultUnion = CollectionUtils.union(firstList, secondList);
        System.out.println(resultUnion + "\n"); //[1, 2, 3, 4, 5, 6, 7, 8, 9]

//пересечения двух множеств
        List<String> firstListStr = Arrays.asList("A", "B", "C", "D", "E", "F");
        List<String> secondListStr = Arrays.asList("B", "D", "F", "G", "H", "K");

        Collection<String> resultIntersection = CollectionUtils.intersection(firstListStr, secondListStr);
        System.out.println(resultIntersection + "\n"); //[B, D, F]

//дизъюнкция
        List<String> firstListNumber = Arrays.asList("1", "2", "3", "4", "5", "6");
        List<String> secondListNumber = Arrays.asList("2", "3", "6", "7", "8", "9");

        Collection<String> resultDisjunction = CollectionUtils.disjunction(firstListNumber, secondListNumber);
        System.out.println(resultDisjunction + "\n"); //[1, 4, 5, 7, 8, 9]

//разница
        List<String> firstListNumb = Arrays.asList("1", "2", "3", "4", "5", "6");
        List<String> secondListNumb = Arrays.asList("2", "3", "6", "7", "8", "9");

        Collection<String> resultSubtract = CollectionUtils.subtract(firstListNumb, secondListNumb);
        System.out.println(resultSubtract + "\n"); // [1, 4, 5]

//Метод unmodifiableCollection(). Запрет на изменение коллекции.
        Collection<String> firstCollection = new ArrayList<>();
        firstCollection.add("hello");
        firstCollection.add("from");
        firstCollection.add("Java");
        Collection<String> secondCollection = Collections.unmodifiableCollection(firstCollection);

//secondCollection.add("have a error");
        System.out.println(secondCollection); //[hello, from, Java]
    }
}

