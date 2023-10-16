class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int j = 0;j<image.length;j++){
            int[] temp = image[j];
            int counter = temp.length-1;
            for(int i = 0;i<temp.length/2;i++){
                int hold = temp[i];
                temp[i] = temp[counter];
                temp[counter] = hold;
                counter--;
            }
            image[j] = temp;
        }
        for(int i = 0;i<image.length;i++){
            for(int j = 0;j<image[0].length;j++){
                if(image[i][j]==0){
                    image[i][j] = 1;
                }else{
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}