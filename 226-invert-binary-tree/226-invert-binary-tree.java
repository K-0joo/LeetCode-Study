/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/**
 * 아래처럼 풀어야 하는 이유
 * [문제였던 점 1] 처음에는 if문을 사용해서 비교한 다음에 하였다. 하지만 반복하지 못하였다.
 * <해결점> 그 이유는 영상에 나와 있듯이 child의 child 들을 바꾸지 못하는 문제의 발생이었기 때문에
 * 내부에서 invertTree를 한번씩 더 거쳐주게 된다면 child의 child까지 변경을 해줄 수 있다.
 *
 * [생각으로 또 풀 수 있을 것 같은 방법]
 * 노드의 연결 지점이나 child의 child 갯수를 세서 그 만큼 반복시킨다. 적고 보니 아래 내용과 동일함.
 *
 * [그 외로 나와있는 방법]
 * <해결점> queue를 사용하는 것이다.
 * 큐의 갯수만큼 하고 큐가 빌 때까지 반복하며 그 내부에서 queue값을 하나씩 빼주게 되면 child의 child까지 반복할 수 있다.
 * 또한 현재의 child의 child 값이 null이 아니면 값을 저장해준다.
*/

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) { return null; }
    
        TreeNode leftNode = invertTree(root.left);
        TreeNode rightNode = invertTree(root.right);
        root.left = rightNode;
        root.right = leftNode;
        
        return root;
    }
}