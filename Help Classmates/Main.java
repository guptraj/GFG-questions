// QUESTION LINK
// https://practice.geeksforgeeks.org/problems/fab3dbbdce746976ba35c7b9b24afde40eae5a04/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
    	int [] ans = new int [n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++){
            while(st.size()!=0 && arr[st.peek()]>arr[i]){
                int idx = st.pop();
                ans[idx]=arr[i];
            }
            st.push(i);
        }
        return ans;
	} 
}
