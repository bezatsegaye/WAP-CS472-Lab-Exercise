"use strict"
let listWord = ["Tsegaye", "Farouk", "Samule","Hana","Leilena"];
let store=[];
function filterLongWords(listWord,len){
for(let i=0;i<listWord.length;i++){
if(listWord[i].length>len)
store.push(listWord[i]);
}
console.log(store);

}
filterLongWords(listWord,6);

