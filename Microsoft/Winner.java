package Microsoft;

public class Winner {
    public int findTheWinner(int n, int k) {
        if(n == 1) return 1;
       return helper(n,k) + 1;
    }
    public int helper(int n , int k) {
        if(n == 1) return 0;
        return (helper(n-1,k) + k) % n;
    }
}
