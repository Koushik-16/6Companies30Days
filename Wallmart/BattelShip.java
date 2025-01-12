package Wallmart;

public class BattelShip {
   
        public int countBattleships(char[][] board) {
            int row = board.length ;
            int col = board[0].length;
            int count  = 0;
            for(int i = 0 ; i < row ; i++){
                for(int j = 0 ;j < col ; j++){
                    if(board[i][j] == 'X'){
                        count ++;
                        dfs(board,i,j);
                    }
                }
            }
            return count;
        }
        public void dfs(char [][]board,int i , int j){
        if(i < 0 || j < 0  || j >= board[0].length || i >= board.length || board[i][j] != 'X') return ;
            board[i][j] = '.';
            if(i + 1 < board.length){
                dfs(board,i +1 ,j);
            }
            if(j + 1 < board[0].length){
                dfs(board,i , j+1);
            }
        }
}
