"use strict";
let sum=0;
let prod =1;
function sumMult(){
    let arrayVal = [7,2,6,5,4];
    for(let i=0;i<arrayVal.length;i++)
    {
        sum= arrayVal[i]+sum;
        prod =  arrayVal[i]*prod;
    }
console.log("Total Sum " + sum);
console.log("Total product " + prod);
}
sumMult();