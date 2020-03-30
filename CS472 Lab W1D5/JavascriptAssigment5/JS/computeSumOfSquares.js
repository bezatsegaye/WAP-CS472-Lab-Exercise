"use strict"

function computeSumOfSquares()
{
    let sum =0;
    let number = [4,3,2,5];

    sum = number.map(number=>number*number)+sum;
    console.log(sum);
}
computeSumOfSquares();