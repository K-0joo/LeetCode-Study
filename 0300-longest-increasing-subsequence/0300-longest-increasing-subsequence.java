class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        for(int n : nums){
            // 배열이 비어있다면 추가하기
            // arr 배열 마지막 값이 nums 값 보다 작다면 추가하기
            if(arr.isEmpty() || arr.get(arr.size() - 1) < n){
                arr.add(n);
            } else {
                int ind = binarySearch(arr, n);
                arr.set(ind, n);
            }
        }

        return arr.size();
    }

    private int binarySearch(List<Integer> arr, int target){
        int left = 0;
        int right = arr.size() - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr.get(mid) == target)  {
                return mid;
            } else if (arr.get(mid) > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}