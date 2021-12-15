import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        int choiceentry=0;
        Scanner scanner = new Scanner(System.in);
        ListComparator listComparator = new ListComparator();

        while (true) {
            System.out.print("Menu:\n 1) Compare\n 2) Exit\n Pick - ");

            if (scanner.hasNextInt())
                choiceentry = scanner.nextInt();

            switch (choiceentry) {
                case 2 -> {
                    System.exit(0);
                }
                case 1 -> {
                    int amount;
                    System.out.print("\n\nEnter amount of Object you want to test methods with = ");
                    amount = scanner.nextInt();
                    System.out.println("Results of testing:");
                    String[][] results=listComparator.compareMethod_(amount);
                    for(int i=0;i<6;i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print(results[i][j] + " ");
                        }
                        System.out.println();
                    }

                    System.out.println("\n\n");
                }
            }
        }
    }
}