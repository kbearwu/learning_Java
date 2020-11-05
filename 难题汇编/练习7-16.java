class Practice {

    static int minOf(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++)
            if (a[i] < min)
                min = a[i];
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-2,4,5,6,7};
        System.out.println(minOf(arr));
    }
}
