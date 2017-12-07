class Solution {
    char[][] grid;
    int[] father;
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        this.grid = grid;
        father = new int[grid.length * grid[0].length];
        for(int i = 0; i < father.length; i++) father[i] = i;
        for(int i = 0; i < father.length; i++) union(i);
        int sum = 0;
        for(int i = 0; i < father.length; i++) {
            if(father[i] == i && grid[i / grid[0].length][i % grid[0].length] == '1') sum++;
        }
        return sum;
    }
    
    public void union(int i, int j) {
        if(0 <= i && i < father.length && 0 <= j && j < father.length) {
            if(grid[j / grid[0].length][j % grid[0].length] == '1') father[find(i)] = father[find(j)];
        }
    }
    
    public void union(int i) {
        int y = i / grid[0].length, x = i % grid[0].length;
        if(grid[y][x] == '1') {
            if(x != 0) union(i, i - 1);
            if(x != grid[0].length - 1) union(i, i + 1);
            union(i, i - grid[0].length);
            union(i, i + grid[0].length);
        }
    }
    
    public int find(int i) {
        while(i != father[i]) {
            i = father[i];
        }
        return i;
    }
}