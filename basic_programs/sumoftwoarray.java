class sumoftwoarray {
    public static void main(String args[]) {
        double a[] = { 10.1, 11.2, 12.3, 13.4, 14.5 };
        double b[] = { 10.1, 11.2, 12.3, 13.4, 14.5 };
        double c[] = new double[5];

        int i;
        for (i = 0; i < 5; i++) {
            c[i] = a[i] + b[i];
        }
        System.out.println("Result array is ");
        for (i = 0; i < 5; i++) {
            System.out.println(c[i]);
        }
    }

}
