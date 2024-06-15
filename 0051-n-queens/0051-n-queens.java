class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> ans=new ArrayList<List<String>>();
        int[] leftrow=new int[n];
        int[] lowerdiag=new int[2*n-1];
        int[] upperdiag=new int[2*n-1];
        f(0,board,leftrow,lowerdiag,upperdiag,ans);
        return ans;
    }
    public void f(int col,char[][] board,int[] leftrow,int[] lowerdiag,int[] upperdiag,List<List<String>> ans){
        if(col==board.length){
            ans.add(construct(board));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(leftrow[row]==0 && lowerdiag[row+col]==0 && upperdiag[board.length-1+row-col]==0){
                board[row][col]='Q';
                leftrow[row]=1;
                lowerdiag[row+col]=1;
                upperdiag[board.length-1+row-col]=1;
                f(col+1,board,leftrow,lowerdiag,upperdiag,ans);
                board[row][col]='.';
                leftrow[row]=0;
                lowerdiag[row+col]=0;
                upperdiag[board.length-1+row-col]=0;
            }
        }
    }
    static List < String > construct(char[][] board) {
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}