public // QUESTTION LINK
// https://practice.geeksforgeeks.org/problems/k-distance-from-root/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
import java.util.*; 

// class Node
// {
//     int data;
//     Node left, right;
//    Node(int item)    {
//         data = item;
//         left = right = null;
//     }
// } 

class Tree
{
    public  void KdistanceHelper(Node root,int k, ArrayList<Integer> ans){
        if(root==null || k<0) return ;
        if(k==0){
            ans.add(root.data);
            return;
        }
        KdistanceHelper(root.left,k-1,ans);
        KdistanceHelper(root.right,k-1,ans);
    }
    public ArrayList<Integer> Kdistance(Node root, int k)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        KdistanceHelper(root,k,ans);
        return ans;
        
    }
}