import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {
        //Exercise 01
        System.out.println("Welcome to Object-Oriented Programming");
        System.out.println("Java Refresher -  week1");

        //Exercise 02
        String studentName = "kamal";
        int age = 20;
        double averageMArk = 67.5;
        char grade = 'B';
        boolean passed = true;

        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + age);
        System.out.println("Student Grade : " + grade);
        System.out.println("Student Passed : " + passed);


        //Exercise 03
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String name = input.nextLine();

        System.out.print("Enter Student Age : ");
        int userAge = input.nextInt();

        System.out.print("Enter Student module mark : ");
        double mark = input.nextDouble();

        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("marks : " + mark);
        System.out.println("Age : " + userAge);

        //Exercise 04
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = input2.nextInt();
        System.out.print("Enter second number : ");
        int second = input2.nextInt();

        int addition = first + second;
        System.out.println("Addition : " + addition);

        int subtraction = first - second;
        System.out.println("Subtraction : " + subtraction);

        int multiplication = first * second;
        System.out.println("Multiplication : " + multiplication);

        int division = first / second;
        System.out.println("Division : " + division);

        int remainder = first % second;
        System.out.println("Remainder : " + remainder);

        //Question

        int answer = 5/2;
        System.out.println("Answer : " + answer);

        //Exercise 05
        System.out.print("Enter radius : ");
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("Area : " + area);

        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference : " + circumference);

        //Challenge
        System.out.println("Area 2 decimal places : " + String.format("%.2f", area));
        System.out.println("Circumference 2 decimal places : " + String.format("%.2f", circumference));

        //Exercise 06
        Scanner input3 = new Scanner(System.in);

        System.out.print("Enter Your marks : ");
        int marks = input3.nextInt();

        if (marks >= 70) {
            System.out.println("Destination");
        } else if (marks >= 60) {
            System.out.println("Merit");
        } else if (marks >= 40) {
            System.out.println("pass");
        } else {
            System.out.println("Fail");
        }

        //Exercise 07

        System.out.print("Enter Your marks : ");
        int marksValidate = input3.nextInt();

        if (marksValidate >= 0 && marksValidate <= 100) {
            if (marksValidate >= 70) {
                System.out.println("Distinction");
            } else if (marksValidate >= 60) {
                System.out.println("Merit");
            } else if (marksValidate >= 40) {
                System.out.println("pass");
            } else {
                System.out.println("Fail");
            }

        }else {
            System.out.println("Invalid mark");
        }

        //Exercise 08
        for (int i = 0; i < 11; i++) {
            System.out.println(i);

        }
        //part2
        for (int i = 2; i <= 20; i+=2) {
            System.out.println(i);

        }

        //Challenge
        for (int i = 1; i <= 20; i++) {

            System.out.printf("5 x %d = %d%n ",i ,5 * i);

        }

        //Exercise 09
        System.out.print("Enter number : ");
        int userInput = input3.nextInt();

        while (userInput != 0) {
            System.out.print("Enter number (0 to stop): ");
            userInput = input3.nextInt();
        }
        System.out.println("Program ended");

        //Challenge

        Scanner input4 = new Scanner(System.in);

        System.out.print("Enter number (0 to stop): ");
        int userInput2 = input4.nextInt();
        int total = 0;
        while (userInput2 != 0) {
            total = total + userInput2;
            System.out.print("Enter number (0 to stop): ");
            userInput2 = input4.nextInt();

        }System.out.println("total : " + total);

        //Exercise 10
        double a = calculateArea(10);
        double b = calculateCircumference(10);
        System.out.println("Area : " + String.format("%.2f", a));
        System.out.println("Circumference : " + String.format("%.2f", b));


        //Exercise 11
        double[] marksArray = {65, 72, 48, 81, 56};
        double totalMarks = 0;
        double averageMarks = 0;
        double highestMarks = 0;

        System.out.println("--All marks--");
        for (int i = 0; i < marksArray.length; i++) {
            totalMarks += marksArray[i];
            if(marksArray[i] > highestMarks) {
                highestMarks = marksArray[i];
            }

            averageMarks = totalMarks / marksArray.length;
        }
        System.out.println("Total marks : " + totalMarks);
        System.out.println("Average marks : " + averageMarks);
        System.out.println("Highest marks : " + highestMarks);



        //Exercise 11
        System.out.println("-----Final Mini Challange-----");
        Scanner chalangeInput = new Scanner(System.in);
        double[] userNumbers = new double[5];


        //1.  asks the user for five numbers;
        for (int i = 0; i < userNumbers.length; i++) {

            //2.  stores them in an array;
            System.out.print("Enter number " + (i + 1) + ": ");
            userNumbers[i] = chalangeInput.nextDouble();

        }
        double chalangeHighest =  userNumbers[0];
        for (int i = 0; i < userNumbers.length; i++) {
            if(userNumbers[i] > chalangeHighest) {
                chalangeHighest = userNumbers[i];
            }
        }

        double calculateTotal = calculateTotal(userNumbers);
        double calculateAverage = calculateAverage(calculateTotal,userNumbers.length);
        System.out.println("Total : " + calculateTotal);
        System.out.println("Average : " + calculateAverage);
        System.out.println("Highest : " + chalangeHighest);
        if (calculateAverage > 50) {
            System.out.println("Average is greater than 50");

        }else{
            System.out.println("Average is less than 50");
        }






    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // Exercise 11 method

    //3.  calculates the total using a method;
    public static double calculateTotal(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;

    }
    //4.  calculates the average using another method;
    public static double calculateAverage(double total, int length){
        return total / length;
    }




}
