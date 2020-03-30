"use strict";
let arrayValue10 = [7,2,6,5,4];
let funcsum = 0;
let funcprod =1;
function sumFunctionalProgramming(arrayValue10){

    funcsum = arrayValue10.reduce(function(total,sum) {
        return total+sum;
    },0)
    console.log("Total on Functional programming Sum " + funcsum);
}
function prodFunctionalProgramming(arrayValue10){

    funcprod = arrayValue10.reduce(function(total,funcprod) {
        return total*funcprod;
    },1)   
console.log("Total on Functional programming product " + funcprod);
}
sumFunctionalProgramming(arrayValue10);
prodFunctionalProgramming(arrayValue10);