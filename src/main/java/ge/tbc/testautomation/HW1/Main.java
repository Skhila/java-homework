package ge.tbc.testautomation.HW1;

public class Main {

    public static void main(String[] args){
//        Task 4
        int a1 = add(1, 2);
        int a2 = add(3, 11);
        int a3 = add(8, 21);

        int s1 = subtract(30, 5);
        int s2 = subtract(11, 5);
        int s3 = subtract(21, 13);

//        Task 5
        int[] additionResults = {a1, a2, a3};

        int[] subtractionResults = {s1, s2, s3};

//        Task 6
        System.out.println("Addition Results: ");
        for (int additionResult : additionResults) {
            System.out.println(additionResult);
        }

        System.out.println("Subtraction Results: ");
        for (int subtractionResult : subtractionResults){
            System.out.println(subtractionResult);
        }

//        Task 7
        int index = 0;

        System.out.println("Addition Results: ");
        while (index < additionResults.length){
            System.out.print(additionResults[index] + " ");
            index++;
        }

        index = 0;

        System.out.println("\nSubtraction Results: ");
        while (index < subtractionResults.length){
            System.out.print(subtractionResults[index] + " ");
            index++;
        }

//        Task 8

//        Using for loop
        System.out.println("\nAddition Results: ");
        for (int additionResult : additionResults) {
            if (additionResult % 2 == 0){
                System.out.println("even: " + additionResult);
            }else{
                System.out.println("odd: " + additionResult);
            }
        }

        System.out.println("Subtraction Results: ");
        for (int subtractionResult : subtractionResults){
            if (subtractionResult % 2 == 0){
                System.out.println("even: " + subtractionResult);
            }else{
                System.out.println("odd: " + subtractionResult);
            }
        }

//        Using while loop
        int i = 0;

        System.out.println("Addition Results: ");
        while (i < additionResults.length){
            if (additionResults[i] % 2 == 0){
                System.out.print("even: " + additionResults[i] + " ");
            }else{
                System.out.print("odd: " + additionResults[i] + " ");
            }

            i++;
        }

        i = 0;

        System.out.println("\nSubtraction Results: ");
        while (i < subtractionResults.length){
            if (subtractionResults[i] % 2 == 0){
                System.out.print("even: " + subtractionResults[i] + " ");
            }else{
                System.out.print("odd: " + subtractionResults[i] + " ");
            }

            i++;
        }

    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }
}