class Solution {
    public int[] findRightInterval(int[][] intervals) {
        // 구간에 대한 배열이 주어진다, intervals[i] = [starti, endi]이고 각각의 starti는 고유한 값을 가지고 있다.
        // 구간 i의 오른쪽 구간은 startj >= end와 startj의 최소가 되는 구간 j이다. i는 아마 j와 같아 질 수 있다.

        // 각 구간 i에 대한 오른쪽 구간 인덱스 배열을 반환한다.
        // 구간 i에 오른쪽 구간이 없으면 인덱스 -1을 넣는다.
        int n = intervals.length;
        int[] arr = new int[n];
        int[] ans = new int[n];

        for(int i = 0; i < n; ++i)
            arr[i] = intervals[i][0];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n; ++i)
            map.put(arr[i],i);

        Arrays.sort(arr);

        for(int i = 0; i < n; ++i){

            int val = binarySearch(arr,intervals[i][1]);

            if(val == -1)
                ans[i] = -1;
            else
             ans[i] = map.get(arr[val]);
        }
        
        return ans;
    }


    int binarySearch(int[] arr,int target){
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target){
                ans = mid;
                r = mid - 1;
            }
            else
                l = mid + 1;
        }
        return ans;
    }
}