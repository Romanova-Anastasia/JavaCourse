package TasksFromTheInternet;

//1. Создать динамический массив
//  Создать динамический массив, содержащий объекты класса HeavyBox.
//  Распечатать его содержимое используя for each.
//  Изменить вес первого ящика на 1.
//  Удалить последний ящик.
//  Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
//  Удалить все ящики.

import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

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
//        changeBoxWeight(list.get(0));
//        list.forEach(System.out::println);
//        System.out.println("\n");

// Удалить последний ящик.
//        list.remove(list.size() - 1);
//        list.forEach(System.out::println);
//        System.out.println("\n");

// Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
        //NEED HELP

//  Удалить все ящики.
//        list.clear();
//        System.out.println("\n delete");
//        System.out.println(list);


// создаем новый `TreeSet` из `HeavyBox`
        TreeSet<HeavyBox> treeSet = new TreeSet<>(HeavyBox::compareTo);
        HeavyBox firstHouse = new HeavyBox(3, 7, 1, 3);
        HeavyBox secondHouse = new HeavyBox(2, 5, 2, 2);
        HeavyBox thirdHouse = new HeavyBox(7, 4, 2, 5);

        treeSet.add(firstHouse);
        treeSet.add(secondHouse);
        treeSet.add(thirdHouse);

        for (HeavyBox h: treeSet) {
            System.out.println(h);
        }
//        System.out.println(treeSet);
    }



    // Общий метод для создания нового `TreeSet` из `HashSet`


//    private static void  changeBoxWeight (HeavyBox box){
//        box.setWeight(box.getWeight() + 1);
//    }
}
