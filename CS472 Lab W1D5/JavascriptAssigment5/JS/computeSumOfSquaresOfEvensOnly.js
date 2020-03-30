"use strict";

let arrayVal = [2,9,7,6,4,3,8];
let sumOfEvenNumber=0;
let prodOfEvenNumber=1;
function computeSumOfSquaresOfEvensOnly(arrayVal)
{
   
    for(let i=0;i<arrayVal.length;i++)
    {
        prodOfEvenNumber =1;
        if(arrayVal[i] % 2 ==0)
        {
            prodOfEvenNumber = arrayVal[i] * arrayVal[i]; 
            sumOfEvenNumber = sumOfEvenNumber+prodOfEvenNumber;
        }
        
    }
    console.log("The sum of Squares of Events number only " + sumOfEvenNumber);
}

computeSumOfSquaresOfEvensOnly(arrayVal);
