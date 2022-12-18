// QUESTION LINK
// https://practice.geeksforgeeks.org/problems/k-largest-elements4206/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution {
    int[] kLargest(int[] arr, int n, int K) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
		for(int i=0;i<n;i++){
			if(i<K){
				pq.add(arr[i]);
				continue;
			}
			if(pq.peek()<arr[i]){
				pq.remove();
				pq.add(arr[i]);
			}
		}
		
        int [] ans = new int [K];
        K=K-1;
        while(pq.size() != 0){
			ans[K]=pq.peek();
			pq.remove();
			K--;
		}
		return ans;
    }
}