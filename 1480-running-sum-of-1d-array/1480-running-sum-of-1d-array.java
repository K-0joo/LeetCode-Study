class Solution {
    public int[] runningSum(int[] nums) {
        int[] results = new int[nums.length]; // 배열 선언할 때 int[] 변수명 = new int[배열의 길이]; 로 초기화 및 생성을 해줘야 한다.
        
        results[0] = nums[0]; // results가 output의 역할이고 nums가 intput의 역할이니 results는 점점 더한 값을 넣어줘야 하기 때문에 이와 같이 선언해준다.
        
        
        
        for(int i = 1; i < nums.length; i++){ // 1부터 시작해야 하는 이유는 시작이 0이기 때문에 -1하면 오류가 나지 않을까..(예상.)
            results[i] = results[i-1] + nums[i];
        }        
        return results;
    }
    // 더 간단한 식도 존재한다. 그건 나중에 다시 풀어보기
}