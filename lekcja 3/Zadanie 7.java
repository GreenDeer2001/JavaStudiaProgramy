package com.company;


public class Main {
    static final int WIDTH = 6;


//     w moim przypadku są sztywne granice( skrajne komórki nie graniczą z sobą
//     np. a[0][0] ma tylko 3 sąsiadów

    public static void main(String[] args) {

        boolean[][] grid = new boolean[WIDTH][WIDTH];

        grid[1][4] = true;
        grid[2][5] = true;
        grid[3][3] = true;
        grid[3][4] = true;
        grid[3][5] = true;


        for (int i = 0; i < 88; i++) {
            printGrid(grid);
            gridIterator(grid);
            System.out.println();
            System.out.println("-----------------");
        }
    }

    public static void printGrid(boolean[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                char a = grid[i][j] ? '#' : '_';
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    public static void gridIterator(boolean[][] grid) {
        boolean[][] gridClone = new boolean[WIDTH][WIDTH];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                gridClone[i][j] = grid[i][j];
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int count = checkCeil(gridClone, i, j);
                if (!grid[i][j] && (count == 2 || count == 3)) {
                    grid[i][j] = true;
                } else if (grid[i][j] && (count != 2 && count != 3)) {
                    grid[i][j] = false;
                }
            }
        }
    }

    public static int checkCeil(boolean[][] grid, int x, int y) {
        int count = 0;

//        poziom wyzej
        if (x != 0) {
            if (grid[x - 1][y]) count++;
            if (y != WIDTH - 1 && grid[x - 1][y + 1]) count++;
            if (y != 0 && grid[x - 1][y - 1]) count++;
        }
//        poziom niżej
        if (x != WIDTH - 1) {
            if (grid[x + 1][y]) count++;
            if (y != WIDTH - 1 && grid[x + 1][y + 1]) count++;
            if (y != 0 && grid[x + 1][y - 1]) count++;
        }
//        ten sam poziom

        if (y != WIDTH - 1 && grid[x][y + 1]) count++;
        if (y != 0 && grid[x][y - 1]) count++;

        return count;
    }
}


