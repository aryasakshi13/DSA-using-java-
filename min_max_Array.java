class min_max_Array{
    public Pair<Integer, Integer> getMinMax(int[] arr) {
      // method 1  
    //  Arrays.sort(arr);
    //  return new Pair<>(arr[0],arr[arr.length-1]);
       
    // Method2 
     int min = Integer.MAX_VALUE ;
     int max = 0 ; 
     
     for(int i = 0;i<arr.length;i++){
         if(arr[i]<min){
            min = arr[i];
         }
         if(arr[i]>max){
            max = arr[i]; 
         }
     }
     
     return new Pair<>(min,max);
}