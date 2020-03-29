"use strict"
let x=10;
let y =20;
let z = 30;
function max(x,y,z){
   
    if(x>y){
        if(x>z)
            console.log("Max of three number " + x + " "+y+ " "+z +" is "  + x);
            else
            console.log("Max of three number " + x + " "+y+ " "+z +" is " + z);
    }
    else
    {
        if(y>z)
             console.log("Max of Three number " + x + " "+y+ " "+z +" is " + y);
             else
            console.log("Max of three number " + x + " "+y+ " "+z +" is " + z);
    }
}
max(x,y,z);