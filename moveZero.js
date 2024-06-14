function moveZeros(n,a) {
    // temporary array initialization
    let temp = [];

    for(i= 0 ;i < n ; i++) {
        if (a[i]!==0) {
            temp.push(a[i]);
        }
    }

   // number of non zero elements in the array
   let nz = temp.length;

   for(let i = 0 ; i < nz ; i++) {
    a[i]= temp[i];
   }

   for ( let i = nz ; i< n ; i++) {
    a[i]=0;
   }
   return a;
}

let arr = [1,1,1,0,0,0,0,1,1,1,1];
let n = 11;
let ans = moveZeros(n,arr);
console.log(ans.join(''));