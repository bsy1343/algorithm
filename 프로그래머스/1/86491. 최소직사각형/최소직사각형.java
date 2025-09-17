class Solution {
    public int solution(int[][] sizes) {
        
        int garo = 0;
        int sero = 0;
        for (int[] size : sizes) {
            garo = Math.max(garo, Math.max(size[0], size[1]));
            sero = Math.max(sero, Math.min(size[0], size[1]));
        }
        
        return garo * sero;
    }
}