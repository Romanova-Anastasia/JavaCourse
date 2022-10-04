package TasksFromTheInternet.Queue;

import TasksFromTheInternet.HeavyBox;

import java.util.ArrayDeque;

import java.util.Deque;
import java.util.List;

//5. Создать очередь
//      Создать очередь, содержащую объекты класса HeavyBox.
//      Используем класс ArrayDeque.
//      Поместить объекты в очередь с помощью метода offer().
//      Удалить объекты методом poll().
public class Queue {
    public static void main(String[] args) {
        Deque<HeavyBox> queuePeople = new ArrayDeque<>();
        queuePeople.offer(new HeavyBox(3, 5, 4, 8));
        queuePeople.offer(new HeavyBox(8, 4, 6, 2));
        queuePeople.offer(new HeavyBox(1, 2, 7, 9));

        System.out.println(queuePeople.size() + " box in HeavyBox \n");

        while (!queuePeople.isEmpty()){
            System.out.println(queuePeople.poll() + " box leaves of us \n");
            System.out.println(queuePeople.size() + " boxes left \n");
        }
    }
}
