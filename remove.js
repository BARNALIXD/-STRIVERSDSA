 function removeDuplicate(arr){
    let set = new Set(arr);
    let uniqueArr = Array.from(set);
    for (let i =0; i< uniqueArr.length ; i++) {
        arr[i] = uniqueArrlength[i];
    }
    return uniqueArr.length;
 }

 const arr = [1,1,2,2,2,3,3];
 const k = removeDuplicate(arr);

 console.log("The array after removing the duplicate elements is :");
 for (let i = 0 ; i < k ; i++) {
    console.log(arr[i]);
 }