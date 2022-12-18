//QUESTION LINK 
// https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution
{   
    // arr[] : the input array
    // n : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int n)
	{
	HashMap <Integer,Boolean> hm = new HashMap<>();
    for(int i=0;i<n;i++)
    {
        hm.put(arr[i],true);
    }

    for(int ele : arr){
        if(hm.containsKey(ele-1)){
            hm.put(ele,false);
        }
    }
    int maxlen=0;
    int strpt=0;
    for(int ele : arr)
    {
        if(hm.get(ele)==true){
            int templen =1;
            int tempstr=ele;
            while(hm.containsKey(tempstr+templen)){
                templen++;
            }
            if(maxlen<templen)
            {
                maxlen=templen;
                strpt=ele;
            }
        }
    }
    return maxlen;

	}
}