class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxA = 0;
        int nsl[] = new int[heights.length];
        int nsr[] = new int[heights.length];
        //next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i = heights.length - 1; i >=0 ; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = heights.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
    }
        //next smaller left
        s = new Stack<>();
        for(int i = 0; i < heights.length ; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
    }
    //area
    for(int i = 0; i < heights.length; i++){
        int width = nsr[i] - nsl[i] - 1;
        int currArea = heights[i] * width;
        maxA = Math.max(currArea, maxA);

    }
    return maxA;
        
    }
}