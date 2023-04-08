//Question link
// https://practice.geeksforgeeks.org/problems/badefd58bace4f2ca25267ccfe0c9dc844415e90/1

class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        Stack<Integer> st =new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(st.size()==0){
                st.push(arr[i]);
                continue;
            }
            if(st.peek()<0 && arr[i]<0) st.push(arr[i]);
            else if(st.peek()>=0 && arr[i]>=0) st.push(arr[i]);
            else st.pop();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(st.size()!=0){
            ans.add(st.peek());
            st.pop();
        }
        Collections.reverse(ans);
        return ans;
    }
}