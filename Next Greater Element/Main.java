// QUESTION LINK 
// https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
       long [] ans = new long [n];
       Stack<Integer> st = new Stack<>();
       Arrays.fill(ans,-1);
       for(int i=0;i<n;i++){
           while(st.size()!=0 && arr[st.peek()]<arr[i]){
               int idx = st.pop();
               ans[idx]=arr[i];
           }
           st.push(i);
       }
       return ans;
    } 
}