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

 let productno = document.getElementById("productno");
    let prodName = document.getElementById("name");
    let inputquanitityinstock = document.getElementById("inputquanitityinstock");
    let inputSupplier = document.getElementById("inputSupplier"); 
    let unitprice = document.getElementById("unitprice");
    let form_date = document.getElementById("form_date"); 
   
document.querySelector('form.form_product').addEventListener('submit', function (e) {

    //prevent the normal submission of the form
    e.preventDefault();
    alert("Product No:" + productno.value + "\n" +  
    "Product name:" + prodName.value + "\n" +
    "Quantity in Stock :" + inputquanitityinstock.value + "\n" +
    "Supplier:" + inputSupplier.value + "\n" +
    "Unit Price:" + unitprice.value + "\n" +
    
    "Date " + form_date.value
    );
    
});