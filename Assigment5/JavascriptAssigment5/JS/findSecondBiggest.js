"use strict";
let arrayValue11 = [4,6,8,2,9];
let firstmax=arrayValue11[0];
let secondmax=0;
function findSecondBiggest(arrayValue11)
{
for(let i =1;i<arrayValue11.length;i++)
{
    if(firstmax<arrayValue11[i])
    {
        secondmax = firstmax;
        firstmax = arrayValue11[i];
        

    }
    
}
console.log("The second Largest No of " + arrayValue11 + " is " + secondmax);
}
findSecondBiggest(arrayValue11);