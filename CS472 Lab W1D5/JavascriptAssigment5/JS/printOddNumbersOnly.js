"use strict";

function sumMult(){
    let arrayVal = [1,2,3,4];
    for(let i=0;i<arrayVal.length;i++)
    {
        if(arrayVal[i]%2==1)
        console.log("Odd " + arrayVal[i]);
    }
}
sumMult();