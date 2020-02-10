class Solution 
{
    public int minDistance(String word1, String word2) 
    {
        int i=0,j=0;
        int p = word1.length();
        int q = word2.length();
        int mat[][] = new int[p+1][q+1];
        int c;
        for(i=0;i<=p;i++)
        {
          for(j=0;j<=q;j++)
          {
              if(i==0)
                mat[i][j]=j;
              else if(j==0)
                mat[i][j]=i;
              else if(word1.charAt(i-1)==word2.charAt(j-1))
                mat[i][j]=mat[i-1][j-1];
              else
                {
                    c=Math.min(mat[i][j-1],mat[i-1][j]);
                    mat[i][j]=1+Math.min(c,mat[i-1][j-1]);
                }
            }
        }
       return mat[p][q];
    }
}