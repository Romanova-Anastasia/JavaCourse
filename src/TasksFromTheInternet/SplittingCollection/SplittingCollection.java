package TasksFromTheInternet.SplittingCollection;

import TasksFromTheInternet.Box;
import TasksFromTheInternet.HeavyBox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//6. Разделение коллекции
//      Создать коллекцию, содержащую объекты HeavyBox.
//      Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
//      Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.

public class SplittingCollection {
    public static void main(String[] args) {
        List<HeavyBox> listObject = new ArrayList<>();
        listObject.add(new HeavyBox(1, 5, 7, 100));
        listObject.add(new HeavyBox(5, 7, 7, 300));
        listObject.add(new HeavyBox(2, 4, 1, 300));
        System.out.println(listObject + "\n");

        List<HeavyBox> newListObject = new ArrayList<>();
        Iterator<HeavyBox> iterator = listObject.iterator();
        for (int i = 0; i < listObject.size(); i++) {
            while (iterator.hasNext()) {
                HeavyBox element = iterator.next();
                if (element.getWeight() > 299) {
                    newListObject.add(element);
                    iterator.remove();
                }
            }
        }
        System.out.println(listObject);
        System.out.println(newListObject);
    }
}

