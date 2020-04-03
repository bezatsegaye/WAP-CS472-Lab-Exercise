"use strict"
/*
* Assigment question number one
*/
let person = {
    name:"",
    dateOfBirth:"",
    setName(name){
        this.name = name;
    },
    setdateOfBirth(dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    },
    getName(){
        return this.name;
    },
    getdateOfBirth(){
        return this.dateOfBirth;
    },
    
}
/*
* Assigment question number two
*/
    let John  = Object.create(person);
    John .setName("John");
    John .setdateOfBirth("1998-12-10");
    console.log("The person’s name is " + John .getName());
    console.log(John .getName() + " was born on " + John .getdateOfBirth())

        let employee = Object.create(person);
        employee.salary = 0;
        employee.hireDate= Date.now();
    
        employee.name = "Anne";
        employee.salary=249995.50 ;
        employee.doJob = function(jobTitle){
          return (this.getName() +" is a "+ jobTitle +" who earns "+ "$"+ this.salary);
        }

    console.log(employee.doJob("Programmer"));

    
 
/*
* Assigment question number three
*/
function Person1(Name,dat){
    this.name = Name;
    this.dateOfBirth =dat;
    toString: () => {
        return "Name " + this.name + " Date of Birth " + this.dateOfBirth 
    }
}
const Studet = new Person1("Peter","1998-12-10");
Person1.prototype.toString = function(){
    return "Name: " + this.name + " Date of Birth: " + this.dateOfBirth;
}
 console.log(Studet.toString());
 //console.log(Studet);
