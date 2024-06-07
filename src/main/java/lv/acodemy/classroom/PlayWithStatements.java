package lv.acodemy.classroom;

public class PlayWithStatements {
    public static void main(String[] args) {
        int a = 10;
        if (a < 5) ;
        {
            System.out.println("This is true");
        }
        int y = 8;
        if (y % 2 == 0) ;
        {
            System.out.println("y is even number");
        }
        int b = 50;
        if (b == 50) {
            System.out.println("b is equal to 50");
        }
        boolean isSummer = true;
        if (isSummer) {
            System.out.println("it is time to go on vacation");
        }
        // IF-ELSE

        /*
        if(condition) {
        will execute code if statmen is tru
        }else{
        execute code is tatement is false
        }
         */
        int z = -10;

        if (z >= 0) {
            System.out.println("z i positive number");
        } else {
            System.out.println("z is negative number");
        }
        String name = "anna";
        if (name.equals("john")) {
            System.out.println("varaible contanes name john ");
        } else {
            System.out.println("variable contanins name " + name);
        }
        /*

         */
        int e = 10;
        if (e > 10) {
            System.out.println("variable is more than 10");
        } else if (e == 10) {
            System.out.println("variable is equal to 10");
        } else {
            System.out.println("variable is less than 10");
        }
        int[] nums = {10, -5, 0, 25, -30, 15, -10, 5, -20};
        for (int num : nums) {
            if (num > 0) {
                System.out.printf("number: %d is positive\n", num);
            } else if (num < 0) {
                System.out.printf("number: %d is negative\n", num);
            } else {
                System.out.printf("number: %d is equal to 0\n", num);
            }

        }
        int[] grades = {95, 82, 74, 56, 48, 91, 87, 66, 77, 45};
        for (int grade : grades) {
            if (grade >= 90 && grade <= 100) {
                System.out.printf("grade %d is exelent \n", grade);
            } else if (grade >= 75 && grade < 90) {
                System.out.printf("grade %d is good \n", grade);
            } else if (grade >= 50 && grade < 75) {
                System.out.printf("grade %d is ok \n", grade);
            } else if (grade >= 0 && grade < 50) {
                System.out.printf("grade %d is not ok \n", grade);
            }
        }
        // Temperatures < -10 (holodno), from 0 to 10 prohladno, 10 to 20 teplo, 20 do 38 zarko, ot 38 ochen zarko
        int[] temperature = {45, 7, 27, -15, 16};
        for (int temp : temperature) {
            if (temp <= -10) {
                System.out.printf("%d holodno \n", temp);
            } else if (temp >= 0 && temp < 10) {
                System.out.printf("%d prohladno \n", temp);
            } else if (temp >= 10 && temp < 20) {
                System.out.printf("%d teplo \n", temp);
            } else if (temp >= 20 && temp < 38) {
                System.out.printf("%d zarko \n", temp);
            } else if (temp >= 38) {
                System.out.printf("%d ochen zarko \n", temp);
            }
        }
    }
}
