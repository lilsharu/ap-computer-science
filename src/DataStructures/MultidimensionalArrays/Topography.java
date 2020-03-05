package DataStructures.MultidimensionalArrays;

import java.io.*;
import java.util.*;

/**
 * I have a countPeaks() method, which is a for loop which does the organizing. To make everything cleaner,
 * I made another method to see if a number is the highest in its cluster. The initial idea was highestInCluster(),
 * which used 4 if statements to collect the minimum and maximum values of the x and y in the cluster. Then, I
 * came up with a much more effective try-catch method called highestTry(). This just used simple bounds of x -1 , x + 1,
 * y - 1, and y + 1 to find the cluster, but if the index was out of bounds, it just threw the exception and did nothing.
 *
 * @author Shourya Bansal
 * @version 2
 */
public class Topography {
    private int[][] map;

    public static void main(String[] args) throws IOException {
        Topography a = new Topography("test.txt");
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
                if (highestTry(x, y)) {
                    count++;
                }
            }
        }

        return count;
    }

    /**
     * @deprecated {@link #highestTry(int, int)}
     */
    public boolean highestInCluster(int x, int y) {
        int inMap = map[x][y];

        int beginX = x - 1;
        if (beginX < 0) beginX = 0;

        int maxX = x + 1;
        if (maxX > map.length - 1) maxX = map.length - 1;

        int beginY = y - 1;
        if (beginY < 0) beginY = 0;

        int maxY = y + 1;
        if (maxY > map[0].length - 1) maxY = map[0].length - 1;

        for (int a = beginX; a <= maxX; a++) {
            for (int b = beginY; b <= maxY; b++) {
                if (!(a == x && b == y) && !(inMap > map[a][b])) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean highestTry(int x, int y) {
        int inMap = map[x][y];

        for (int i = x - 1; i <= x + 1; i++){
            for (int k = y - 1; k <= y + 1; k++) {
                try {
                    if (!(i == x && k == y) && !(inMap > map[i][k])) {
                        return false;
                    }
                }
                catch (IndexOutOfBoundsException ex) {
                    //Do Nothing
                }
            }
        }

        return true;
    }

    public int[][] getMap() {
        return map;
    }
}