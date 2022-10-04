package TasksFromTheInternet;

//1. Создать динамический массив
//  Создать динамический массив, содержащий объекты класса HeavyBox.
//  Распечатать его содержимое используя for each.
//  Изменить вес первого ящика на 1.
//  Удалить последний ящик.
//  Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
//  Удалить все ящики.

import java.lang.reflect.Type;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Scanner;

public class DynamicArray {

    public static void main(String[] args) {
//        List<HeavyBox> list = new ArrayList<>();
//        list.add(new HeavyBox(2, 2, 2, 2));
//        list.add(new HeavyBox(1, 1, 1, 1));
//        list.add(new HeavyBox(3, 3, 3, 3));
//
////Распечатать его содержимое используя for each.
//        list.forEach(System.out::println);
//        System.out.println("\n");


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
//        TreeSet<HeavyBox> treeSet = new TreeSet<>(HeavyBox::compareTo);
//        HeavyBox firstHouse = new HeavyBox(3, 7, 1, 3);
//        HeavyBox secondHouse = new HeavyBox(2, 5, 2, 2);
//        HeavyBox thirdHouse = new HeavyBox(7, 4, 2, 5);
//
//        treeSet.add(firstHouse);
//        treeSet.add(secondHouse);
//        treeSet.add(thirdHouse);
//
//        treeSet.forEach(System.out::println);


//Набор чисел
//      Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
//      Избавиться от повторяющихся элементов в строке.
//      Вывести результат на экран.


//        System.out.println("Enter you set of numbers. Input 0 to live ");
//        List<Number> listNumber = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        int number;
//
//        while ((number = scanner.nextInt()) != 0) {
//            listNumber.add(number);
//            System.out.println(listNumber);
//        }
//        scanner.close();
//        System.out.println(listNumber);
//
//        Set<Number> listSet = new LinkedHashSet<>(listNumber);
//        listNumber.clear();
//        listNumber.addAll(listSet);
//        System.out.println(listNumber);

//Создать HashMap
//Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
//Перебрать и распечатать пары значений - entrySet().
//Перебрать и распечатать набор из имен продуктов  - keySet().
//Перебрать и распечатать значения продуктов - values().
//Для каждого перебора создать свой метод.

        Map<String, Product> toyMap = new HashMap<>();

        fillMap(toyMap);
        System.out.println("Use keySet():");  //The keySet() метод возвращает установленное представление ключей, содержащихся в карте.
        printByKeySet(toyMap);
        System.out.println("Use values():"); //The values() Метод возвращает представление коллекции значений, содержащихся в карте.
        printByValues(toyMap);
        System.out.println("Use entrySet():"); //The keySet() Метод возвращает установленное представление сопоставлений, содержащихся в этой карте.
        printByEntrySet(toyMap);
    }

    public static void fillMap(Map<String, Product> toyMap) {
        toyMap.put("Monster track", new Product("Monster track"));
        toyMap.put("Teddy bear", new Product("Teddy bear"));
        toyMap.put("Machine gun", new Product("Machine gun"));
        toyMap.put("Candy", new Product("Candy"));
        toyMap.put("Angry bird", new Product("Angry bird"));
    }

    public static <K, V> void printByKeySet(Map<K, V> map) {
        for (K key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println();
    }

    public static <K, V> void printByValues(Map<K, V> map) {
        for (V value : map.values()) {
            System.out.println(value);
        }
        System.out.println();
    }

    public static <K, V> void printByEntrySet(Map<K, V> map) {
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        for (Map.Entry<K, V> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }
//    private static void  changeBoxWeight (HeavyBox box){
//        box.setWeight(box.getWeight() + 1);
//    }

}
