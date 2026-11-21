class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Character>> row = new HashMap<>();
        Map<Integer,Set<Character>> col = new HashMap<>();
        Map<String,Set<Character>> sqr = new HashMap<>();

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == '.')
                    continue;

                char c = board[i][j];
                String sqrKey = i/3 + "," + j/3;

                if((row.computeIfAbsent(i, k -> new HashSet<>()).contains(c)) || col.computeIfAbsent(j, k -> new HashSet<>()).contains(c) || sqr.computeIfAbsent(sqrKey, k -> new HashSet<>()).contains(c))
                    return false;
               
                row.get(i).add(c);
                col.get(j).add(c);
                sqr.get(sqrKey).add(c);
            }
        }
        return true;
    }
}
