package cn.tu;

public class Test1{
    public  int dfs(int n,int m){
        if(n < m) {
            return 0;
        }
        if(n == m) {
            return 1;
        }
        if(m == 1) {
            return n;
        }

        return dfs(n-1,m-1)+dfs(n-1,m);
    }
}

