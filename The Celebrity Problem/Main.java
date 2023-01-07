// QUESTION LINK
// https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int arr[][], int n)
    {
    	Stack <Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++) st.push(i);
        while(st.size()>=2){
            int j= st.pop();
            int i= st.pop();
            if(arr[i][j]==1) st.push(j);
            else st.push(i);
        }
        int i=st.pop();
        boolean flag=true;
        for(int j=0;j<n;j++){
            if(i!=j && arr[i][j]==1){ flag=false;
                break;
            }
            if(i!=j && arr[j][i]==0) {flag=false;
                break;
            }
        }
        if(flag==true) return i;
        return -1;
    }
}