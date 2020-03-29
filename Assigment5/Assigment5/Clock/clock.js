
function showTime(){
    let date = new Date();
    let year = date.getFullYear();
    let day = date.getDate();
    let mon = date.getMonth()+1;
    let h = date.getHours();
    let m = date.getMinutes();
    let s = date.getSeconds();
    let session = "AM";
    
    if(h==0){
    h=12;
    }
    if(h>12)
    {
    h=h-12;
    session = "PM";    
    }
    day=(day<10)? "0" +day :day;
    mon=(mon<10)? "0" +mon :mon;
    h=(h<10)? "0" +h :h;
    m=(m<10)? "0" +m :m;
    s=(s<10)? "0" +s :s;
    
    let time =  year + "- " + mon + "- " + day + ": " + h + ":" + m + ":" + s + " " + session;
    document.getElementById("clockDisplay").innerText = time;
    document.getElementById("clockDisplay").textContent = time;
    setTimeout(showTime,1000); 
}
showTime();
