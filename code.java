/*
NUMBER OF UNIQUE PATHS
 Given a A X B matrix with your initial position at the top-left cell, find the number of possible unique paths to reach the bottom-right cell of the matrix from the initial
 position.*/
class Solution
{
    //Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b) 
    {
        int[][] dp = new int[a][b];
        
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(i==0 || j==0){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[a-1][b-1];
    }
}

/* Leaders in an array*/
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> leads = new ArrayList<>();
        leads.add(arr[n-1]);
        int max=arr[n-1];
        for(int i=n-2; i >=0; i--){
            if(arr[i] >= max){
                max=arr[i];
                leads.add(arr[i]);
            }
        }
        Collections.reverse(leads);
        return leads;
       
    }

}