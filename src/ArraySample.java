public class ArraySample {
    public static void main(String[] args) {
        String[][] grid = new String[4][4];

        int count = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (count < 10) {
                    grid[i][j] = "0" + count;
                }
                else {
                    grid[i][j] = "" + count;
                }

                count++;
            }
        }
        printGrid(grid);


    }

    public static void printGrid(String[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
