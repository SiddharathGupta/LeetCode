class Solution {
    public int removeDuplicates(int[] arr) {
        int newLen = 0;
        int size = arr.length;
		for(int i=1;i<size;i++) {
			if(arr[i] != arr[newLen]) {
                newLen++;
                arr[newLen] = arr[i];
            }
        }
		// System.out.println(newLen+1);
        return newLen+1;
    }
}