public class StarPatternDiamond {
    public static void main(String[] args) {
        int size = 9; // Size of the diamond pattern

        int middle = size / 2;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row <= middle) {
                    if (col == middle - row || col == middle + row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (col == middle - (size - 1 - row) || col == middle + (size - 1 - row)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}


 