public class HelloWorld {
    public static void main(String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};

        int minstetall = min(a);

        System.out.println(minstetall);
    }

    public static int min(int[] a) {
        if (a.length < 1) {
            throw new java.util.NoSuchElementException("Tabellen a er tom!");
        }

        int min = a[0];
        int minIndex = 0;

        for (int i = 1; i < a.length; ++i) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }

        }
        return minIndex;
    }


}
