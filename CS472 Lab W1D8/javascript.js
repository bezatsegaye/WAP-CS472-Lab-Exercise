
const sumAndReset ={
    counter : 0,
    add : (function () { 
    return function () {
    return this.counter += 1;
    }
})(),
    reset : (function () { 
    return function () {
    return this.counter =0;
    }
})()
};


console.log("Assigment six result: \n");
console.log("Add " + sumAndReset.add());
console.log("Add " +sumAndReset.add());
console.log("Add " +sumAndReset.add());
console.log("Reset " +sumAndReset.reset());  
console.log("Add " +sumAndReset.add()); 


document.writeln("");


var make_addr = function(x){ 
var counter = 0;
return function () {
return counter += x;
}
} ;

Add = make_addr(5);
console.log("Assigment eight result: \n");

console.log(Add() + " ");
console.log(Add() + " ");
console.log(Add() + " ");

console.log("Assigment ten result: \n");
let employee = (function(){
    let name="";
    let age =0;
    let salary=0.0;
    return {setName: function (newName){
        name =newName;
    },
    setAge: function (newAge){
        age =newAge;
    },
    setSalary: function (newSalary){
        salary =newSalary;
    },
    getName: function (newName){
        return name;
    },
    getAge:function getAge(newAge){
        return age;
    },
    getSalary:function (newSalary){
        return salary;
    }
}

})()

employee.setName("Tsegaye");
employee.setAge(45);
employee.setSalary(10,000);

console.log(employee.getName());
console.log(employee.getAge());
console.log(employee.getSalary());

employee.setName("Farouk");
employee.setAge(67);
employee.setSalary(50,000);

console.log(employee.getName());
console.log(employee.getAge());
console.log(employee.getSalary());

