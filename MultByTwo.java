class MultByTwo {
    public static void main(String args[]) {
        int i;
        int num = 128789885;
        for (i = 0; i < 8; i++) {
            num = num << 1;
            System.out.println(num);

        }
        num = -1;
        for (i = 0; i < 8; i++) {
            num = num >> 1;
            System.out.println(num);
        }
        num = -1;
        for (i = 0; i < 24; i++) {
            num = num >>> 1;
            System.out.println(num);
        }
    }
}
