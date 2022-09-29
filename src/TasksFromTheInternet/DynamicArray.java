package TasksFromTheInternet;

//1. Создать динамический массив
//  Создать динамический массив, содержащий объекты класса HeavyBox.
//  Распечатать его содержимое используя for each.
//  Изменить вес первого ящика на 1.
//  Удалить последний ящик.
//  Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
//  Удалить все ящики.

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DynamicArray{

    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(2, 2, 2, 2));
        list.add(new HeavyBox(1, 1, 1, 1));
        list.add(new HeavyBox(3, 3, 3, 3));

//Распечатать его содержимое используя for each.
        list.forEach(System.out::println);
        System.out.println("\n");


//Изменить вес первого ящика на 1.
        changeBoxWeight(list.get(0));
        list.forEach(System.out::println);
        System.out.println("\n");
// Удалить последний ящик.
//        list.remove(list.size() - 1);
//        list.forEach(System.out::println);

// Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
        //NEED HELP


//  Удалить все ящики.
//        list.clear();
//        System.out.println("\n delete");
//        System.out.println(list);


// создаем новый `TreeSet` из `HeavyBox`
        TreeSet<HeavyBox> treeSet = new TreeSet<>();
        System.out.println(treeSet);

    }

    private static void convertToArray(List<HeavyBox> list) {


    }
    private static void  changeBoxWeight (HeavyBox box){
        box.setWeight(box.getWeight() + 1);
    }
}
