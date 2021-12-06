package conditionalstatement;

public class SwitchCase {

    public static void main(String[] args) {

        String monthname = "November";

        switch (monthname) {
            case "January":
                System.out.println("Month No. 1"); break;
            case "February":
                System.out.println("Month No. 2"); break;
            case "March":
                System.out.println("Month No. 3"); break;
            case "April":
                System.out.println("Month Nn. 4"); break;
            case "May":
                System.out.println("Month No. 5"); break;
            case "June":
                System.out.println("Month No. 6"); break;
            case "July":
                System.out.println("Month N0. 7"); break;
            case "August":
                System.out.println("Month No. 8"); break;
            case"September":
                System.out.println("Month No.9"); break;
            case"October":
                System.out.println("Month No. 10"); break;
            case"November":
                System.out.println("Month No. 11"); break;
            case"December":
                System.out.println("Month No. 12");
                default:
                System.out.println("Invalid Month No.");

        }
    }
    }