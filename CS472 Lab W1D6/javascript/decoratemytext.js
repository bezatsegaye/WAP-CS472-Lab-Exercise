"use strict"
function TextAreafont()
{
    //  alert("Hello, world!");
 
    //document.getElementById("textAreaID45").style.fontSize="24pt";
    let prop = window.getComputedStyle(document.getElementById("textAreaID45")).fontSize;
    let    newProp = parseInt(prop) + 2 + "pt";
        document.getElementById("textAreaID45").style.fontSize = newProp;
        
}

function interval() {
    var id = setInterval(TextAreafont,500);
             setTimeout(clearInterval, 3000, id);
    
}

function checkBoxDecoration()
{
    if(document.getElementById("checkBoxtextDecoration").checked==true)
    {
        // alert();
        
        document.getElementById("textAreaID45").style.fontWeight = "bold";
        document.getElementById("textAreaID45").style.color = "green";
        document.getElementById("textAreaID45").style.textDecoration = "underline";
        document.body.style.backgroundImage = 'url("http://www.cs.washington.edu/education/courses/190m/CurrentQtr/labs/6/hundred-dollar-bill.jpg")';
    }
    else
    {
        document.getElementById("textAreaID45").style.fontWeight = "";
        document.getElementById("textAreaID45").style.color = "black";
        document.getElementById("textAreaID45").style.textDecoration = "";
        document.body.style.backgroundImage ="";
    }
}

function IgpayAtinlay() {
    var words = document.getElementById("textAreaID45").value;
    var splittedword = words.split(/\s+/);
    var result = "";
    for (var i = 0; i < splittedword.length; i++) {
        if (splittedword[i].charAt(0).match("[aeoiuAEOIU]")) {
            changed = splittedword[i] + "ay";
        } else {
            var word = splittedword[i];
            for (var j = 0; j < word.length; j++) {
                if (word[j].match("[aeoiuAEOIU]")) {
                    var changed = word.substring(j) + word.substring(0, j) + "ay";
                    break;
                }

            }
        }
        result += changed + " ";

    }
    document.getElementById("textAreaID45").value = result;

}{
    let textAreaValue = document.getElementById("textAreaID45").value;
   if( textAreaValue.charAt(0)=='a' || textAreaValue.charAt(0)=='e' || textAreaValue.charAt(0)=='i' || textAreaValue.charAt(0)=='o' || textAreaValue.charAt(0)=='u')
   {

   }
}
function Malkovitch()
{
    var words = document.getElementById("textAreaID45").value;
    var arr = words.split(/\s+/);
    var result = "";
    for (let i = 0; i < arr.length; i++) {
        if (arr[i].length >= 5) {
            arr[i] = "Malkovitch";
        }
        result += arr[i] + " ";
    }
    document.getElementById("textAreaID45").value = result;

}