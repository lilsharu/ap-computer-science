package DataStructures.MultidimensionalArrays;

import java.io.*;
import java.util.*;

public class Topography {
    private int[][] map;
    public static String fileLocation = "AP Computer Science\\";

    public static void main(String[] args) throws IOException {
        Topography a = new Topography(fileLocation + "test.txt");
        System.out.println(a.countPeaks());
    }

    public Topography(File file) throws IOException {
        BufferedReader read = new BufferedReader(new FileReader(file));
        StringTokenizer st = new StringTokenizer(read.readLine());

        int rows = Integer.parseInt(st.nextToken());
        int columns = Integer.parseInt(st.nextToken());

        map = new int[rows][columns];

        for (int x = 0; x < rows; x++) {
            st = new StringTokenizer(read.readLine());
            for (int y = 0; y < columns; y++) {
                map[x][y] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public Topography(String fileName) throws IOException {
        BufferedReader read = new BufferedReader(new FileReader(fileName));
        StringTokenizer st = new StringTokenizer(read.readLine());

        int rows = Integer.parseInt(st.nextToken());
        int columns = Integer.parseInt(st.nextToken());

        map = new int[rows][columns];

        for (int x = 0; x < rows; x++) {
            st = new StringTokenizer(read.readLine());
            for (int y = 0; y < columns; y++) {
                map[x][y] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public int countPeaks() {
        int count = 0;
        for (int x = 0; x < map.length; x++) {
            for (int y = 0; y < map[x].length; y++) {
                if (highestInCluster(x, y)) {
                    System.out.println(x + " " + y);
                    System.out.println(map[x][y]);
                    count++;
                }
            }
        }

        return count;
    }

    public boolean highestInCluster(int x, int y) {
        int inMap = map[x][y];

        int beginX;
        if (x == 0)
            beginX = x;
        else
            beginX = x - 1;

        int maxX;
        if (x == map.length - 1) {
            maxX = x;
        }
        else maxX = x + 1;

        int maxY;
        if (y == map[x].length - 1) {
            maxY = y;
        }
        else maxY = y + 1;


        int beginY;
        if (y == 0)
            beginY = y;
        else
            beginY = y -1;

        for (int a = beginX; a <= maxX; a++) {
            for (int b = beginY; b <= maxY; b++) {
                if (a != x && b != y){
                    if (!(inMap > map[a][b])) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public int[][] getMap() {
        return map;
    }
}