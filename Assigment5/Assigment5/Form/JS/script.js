"use script"
// function login(){
//     let webAddress = document.getElementById("exampleInputWebAddr").value;
//     let userName = document.getElementById("exampleInputEmail1").value; 
//     let password = document.getElementById("exampleInputPassword1").value;

//     console.log("WEB ADRESS "+ webAddress);
//     console.log("USER NAME " + userName);
//     console.log("PASSWORD "+ password);

// }
// var submitButton = document.getElementById("button");
// submitButton.onclick = login;


    let webAddress = document.getElementById("exampleInputWebAddr");
    let userName = document.getElementById("exampleInputEmail1"); 
    let password = document.getElementById("exampleInputPassword1");

document.querySelector('form.form_login').addEventListener('submit', function (e) {

    //prevent the normal submission of the form
    e.preventDefault();
    
    console.log("WEB ADRESS "+ webAddress.value);
    console.log("USER NAME " + userName.value);
    console.log("PASSWORD "+ password.value);
});