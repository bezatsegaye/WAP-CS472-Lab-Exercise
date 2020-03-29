"use strict"
let fibNumber=21;
let i=2;
let c =[];
c[0]=0;
c[1]=1;
function Fibonacci(fibNumber){
    let a=0;
    let b=1;
while(a+b<=fibNumber)
{
    c[i]=a+b;
    a=b;
    b=c[i];
    i++;
}
console.log("Fiboanacii number " + c);
}
Fibonacci(fibNumber);