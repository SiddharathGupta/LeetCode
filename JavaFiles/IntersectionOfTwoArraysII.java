class Solution {
    // static Set<Integer> set;
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        int n = nums1.length, m = nums2.length;
        for(int i=0;i<n;i++) {
            if(map.containsKey(nums1[i])) map.put(nums1[i], map.get(nums1[i])+1);
            else map.put(nums1[i], 1);
        }
        for(int i=0;i<m;i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0) {
                al.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }
        int[] arr = new int[al.size()];
        for(int i=0;i<arr.length;i++) arr[i] = al.get(i);
        return arr;
    }
}