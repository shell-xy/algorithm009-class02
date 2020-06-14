package Week_04;

public class NumIslands {
    char[][] g;

    public int numIslands(char[][] grid) {
        g = grid;
        int islands = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                islands += isOrNot(i, j);
            }
        }
        return islands;
    }

    private int isOrNot(int i, int j) {
        if (i < 0 || i == g.length || j < 0 || j == g[i].length || g[i][j] == '0') {
            return 0;
        }
        g[i][j] = '0';
        isOrNot(i + 1, j);
        isOrNot(i - 1, j);
        isOrNot(i, j + 1);
        isOrNot(i, j - 1);
        return 1;
    }
}