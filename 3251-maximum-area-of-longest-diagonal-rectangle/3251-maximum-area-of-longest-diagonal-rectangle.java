class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal=0;
        int answer=0;

        for(int i=0; i<dimensions.length;i++){
            int length=dimensions[i][0];
            int width=dimensions[i][1];

            double diagonal=Math.sqrt(length*length + width*width);
            int area=length*width;
            if(diagonal>maxDiagonal){
                maxDiagonal=diagonal;
                answer=area;
            }else if(diagonal==maxDiagonal && area>answer){
                answer=area;
            }
        }

        return answer;
    }
}