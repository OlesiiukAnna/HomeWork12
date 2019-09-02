package home.Task_12;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class Iterator {

    private final int[][] array;
    private Queue<Integer> priorityQueue;
    private int numberOfElements;

    public Iterator(int[][] arr) {
        this.array = arr;
        numberOfElements = countElements(array);
        priorityQueue = new PriorityQueue<>(numberOfElements);
        addElementsToQueue(array);
    }

    private Queue addElementsToQueue(int[][] array) {
        for (int[] line : array) {
            for (int number : line) {
                priorityQueue.add(number);
            }
        }
        return priorityQueue;
    }

    private int countElements(int[][] array) {
        int count = 0;
        for (int[] line : array) {
            count += line.length;
        }
        return count;
    }

    public boolean hasNext() {
        return !priorityQueue.isEmpty();
    }

    public int next() {
        if (priorityQueue.isEmpty()) {
            throw new NoSuchElementException();
        }
        return priorityQueue.poll();
    }
}
