class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        
        int targetElements[] = findMatchingElements(arr, target);
        for (int a = 0; a < targetElements.length; a++) {
            System.out.println("targetElements[" + a + "]: " + targetElements[a]);
        }
    }
    
    public static int[] findMatchingElements(int[] arr, int target) {
        int targetElements[] = new int[2];
        int l = 0;
        int h = arr.length - 1;
        
        while (l < h) {
            if (arr[l] + arr[h] == target) {
                targetElements[0] = l + 1;
                targetElements[1] = h + 1;
                return targetElements;
            } else if (arr[l] + arr[h] < target) {
                l++;
            } else {
                h--;
            }
        }
        return targetElements;
    }
}
