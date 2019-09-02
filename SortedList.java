package home.Task_12;

/*
List of K sorted arrays:
[1,2,5]
[2,3]
[1,3,4,7]
create iterator:
[1,1,2,2,3,3,4,5,7]
 */

public class SortedList {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 5},
                {2, 3},
                {1, 3, 4, 7}};

        Iterator iterator = new Iterator(array);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
