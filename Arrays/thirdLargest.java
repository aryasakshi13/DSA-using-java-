class thirdLargest{
    int thirdLargest(int arr[]) {
    //   if(arr.length<3){
    //       return -1;
    //   }
    //     Arrays.sort(arr);
    //     return arr[arr.length-3];
    
    if(arr.length<3){
        return - 1;
    }
    
    int firstlargest = 0;
    int secondlargest = 0;
    int thirdlargest = 0; 
    
        for(int i = 0 ; i<arr.length; i++){
           if(arr[i]>firstlargest){
               thirdlargest = secondlargest; 
                secondlargest = firstlargest;
               firstlargest = arr[i];
           }else if(arr[i]>secondlargest){
                thirdlargest = secondlargest ; 
               secondlargest = arr[i];
              
           }else if(arr[i]>thirdlargest){
               thirdlargest = arr[i];
               
           }
           
         }
         
         return thirdlargest ; 
    }
}