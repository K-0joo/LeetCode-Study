/**
 * Definition for a binary tree node.
 * public class TreeNode { // 1. 클래스 공간(노드) 생성
 *     int val; // 값 받을 값 선언
 *     TreeNode left; // 왼쪽 트리노드 선언
 *     TreeNode right; // 오른쪽 트리노드 선언
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; } // val 값을 입력 받아 매개 변수 초기화, 2. root 먼저 변수 초기화
 *     TreeNode(int val, TreeNode left, TreeNode right) { // 값을 입력 받아 매개 변수 초기화, 3. child인 left와 right 변수 초기화
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean checkTree(TreeNode root) {
        TreeNode leftNode = root.left; // 각각의 자리를 선언해주는 것
        TreeNode rightNode = root.right; 
        
        if(root.val == (root.left.val + root.right.val)){ // .val을 써야 해당 값을 가져올 수 있다.
            return true;
        } else {
            return false;
        }
    }
}