function isSorted(arr);{
    for(let i=1 ; i<arr.length ; i++){
        if (arr[i]<arr[i-1])
            return false;
    }
            return true;
 }
 const arr = [1,2,4,7,9]

 console.log (isSorted(arr)? "True" : "False");

    
