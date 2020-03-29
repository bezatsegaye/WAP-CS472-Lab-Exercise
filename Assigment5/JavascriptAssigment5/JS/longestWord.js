"use strict"
let word = ["Tsegaye", "Samuel", "Farouk","Eden", "Hana", "Eden Ali Mohammed"];
let maxWord =word[0].length;
let maxWordValue=word[0];
function longestWord(){
  
    for(let i=1;i<word.length;i++)
    {
        if(maxWord < word[i].length){
        maxWord = word[i].length;
        maxWordValue = word[i];    
        }
    }
    console.log("Maximum word " + maxWord + " Word " + maxWordValue );
}
longestWord();