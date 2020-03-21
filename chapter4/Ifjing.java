public class Ifjing {
    public static void main(String[] args) {
        int month = 3;
        int days = 0;
//        if (month == 1) {
//            days = 31;
//        } else if (month == 2) {
//            days = 28;
//        } else if (month == 3) {
//            days = 31;
//        } else if (month == 4) {
//            days = 30;
//        } else if (month == 5) {
//            days = 31;
//        } else if (month == 6) {
//            days = 30;
//        } else if (month == 7) {
//            days = 31;
//        } else if (month == 8) {
//            days = 31;
//        } else if (month == 9) {
//            days = 30;
//        } else if (month == 10) {
//            days = 31;
//        } else if (month == 11) {
//            days = 30;
//        } else if (month == 12) {
//            days = 31;
//        }
        switch (month) {
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }
        System.out.println(days);

    }
}