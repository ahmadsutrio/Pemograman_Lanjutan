package Table;

public class Sorting {
    public static int[] getAscending(String text, int jumlah) {
        int num, i, j, temp;
        num = jumlah;

        int arr[] = new int[num];
        String[] tmp = text.split(",");

        int a = 0;
        for (String s : tmp) {
            arr[a] = Integer.parseInt(s.trim());
            a++;
        }
        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        return arr;
    }

    public static int[] getDescending(String text, int jumlah) {
        int num, i, j, temp;
        num = jumlah;

        int arr[] = new int[num];
        String[] tmp = text.split(",");

        int b = 0;
        for (String s : tmp) {
            arr[b] = Integer.parseInt(s.trim());
            b++;
        }
        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        return arr;
    }
}

