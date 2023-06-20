package hw;

public class Quiz1 {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
				int max = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }

				System.out.println(max);
        }
    }
}

