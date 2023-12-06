class AutoArray {
    public static void main(String args[]) {
        int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String monthNames[] = { "Jan", "Feb", "Mar", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov",
                "Dec" };
        for (int i = 0; i < month.length; i++) {
            System.out.println(" Days in " + monthNames[i] + "  Month are :" + month[i]);
        }
    }
}
