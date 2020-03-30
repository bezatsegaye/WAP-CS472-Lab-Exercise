"use restrict"
let stringChar = "jag testar";
let sumChar='';
function stringReverse(stringChar){
for(let i= stringChar.length-1;i>=0;i--)
{
    sumChar = sumChar+stringChar.charAt(i);
}
console.log(sumChar);
}
stringReverse(stringChar);