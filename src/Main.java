public class Main {
    public static void main(String [] args) {
        int value = 1;
        if (value == 1) {
            System.out.println ("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3 or a 4 or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char testAnswer = 'A';
        switch(testAnswer) {
            case 'A':
                System.out.println("You answered A");
                break;
            case 'B':
                System.out.println("You answered B");
                break;
            case 'C':
                System.out.println("You answered C");
                break;
            case 'D':
                System.out.println("You answered D");
                break;
            case 'E':
                System.out.println("You answered E");
                break;
            default:
                System.out.println("You have entered an invalid letter");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "march":
                System.out.println("Mar");
                break;
            default:
                System.out.println("Enter a month of a year");
                break;
        }
    }
}
