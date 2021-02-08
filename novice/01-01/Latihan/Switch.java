public class Switch {
    public static void main(String[] args) {
        java.util.ArrayList<String> futureMonths = new java.util.ArrayList<String>();

        int month = 8;

        switch (month) {
            case 1:
                futureMonths.add("Januari");
            case 2:
                futureMonths.add("Februari");
            case 3:
                futureMonths.add("Maret");
            case 4:
                futureMonths.add("April");
            case 5:
                futureMonths.add("Mei");
            case 6:
                futureMonths.add("Juni");
            case 7:
                futureMonths.add("Juli");
            case 8:
                futureMonths.add("Agustus");
            case 9:
                futureMonths.add("September");
            case 10:
                futureMonths.add("Oktober");
            case 11:
                futureMonths.add("November");
            case 12:
                futureMonths.add("Desember");
                break;
            default:
                break;
        }
        if (futureMonths.isEmpty()) {
            System.out.println("Invalid nomor bulan");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }
        }
    }
}
