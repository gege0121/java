package LeetCode;

public class Number {
    static int numIslands(int[][] map) {
        int count = 0;
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[0].length; j++){
                if (map[i][j]==1){
                    count++;
                    flip(map,i,j);
                }
            }
        }
        return count;
    }
    static void flip(int[][] map, int i, int j){
        if (i>=0 & i<map.length & j>=0 & j<map[0].length){
            if (map[i][j]==1){
                map[i][j]=0;
                flip(map,i-1,j);
                flip(map,i+1,j);
                flip(map,i,j-1);
                flip(map,i,j+1);
            }
        }
    }
    public static void main(String[] args) {
        int[][] map = {
                {1,1,0,0,1,0},
                {0,1,0,1,1,0},
                {1,0,1,0,0,0},
                {0,1,1,0,1,0}
        };
        System.out.println(numIslands(map));
    }
}
