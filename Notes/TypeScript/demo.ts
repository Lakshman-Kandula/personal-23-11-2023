// const button = document.querySelector("button");
// const input1 = document.getElementById("num1")! as HTMLInputElement;
// const input2 = document.getElementById("num2")! as HTMLInputElement;

// function add(num1: number, num2: number)
// {
//     return num1 + num2;
// }

// button?.addEventListener("click", function(){
//     console.log(add(+input1.value, +input2.value));
// });

/*

//  union

function unionDemo(num1:number|string, num2:number|string)
{
    if(typeof num1 == "number" && typeof num2 == "number")
    {
        return num1+num2;
    }
    else
    {
        return num1.toString()+num2.toString();
    }
}

console.log(unionDemo(3, 3));
console.log(unionDemo("Laks", "hman"));
*/

/*
function addAndHandle(n1:number, n2:number, cb:(num:number)=>void)
{
    const result = n1+n2;
    cb(result);
} 

addAndHandle(3, 6, (result)=>{console.log(result)});
*/

/*
const arr1 = [1,2,3,4];
const arr2 = [5,6,7,8];
arr1.push(...arr2);
console.log(arr1);

const person = {
    name:"lakshman",
    age:24
};

const person1 = person;
console.log(person1);
const person2 = {...person};
console.log(person2);

const arr3 = [1,2,3,4,...arr2];
console.log(arr3);

//  reduce function    rest parameters

let arr:number[] = [1,2,3,4,5,6,7,8,9,10];
let sum = arr.reduce((acc,cur) => acc+cur, 0);
console.log(sum);

let ar:number[] = [1,2,3,4,5,6,7,8,9,10];
let sum1 = arr.reduce(function(acc,cur){
    return acc+cur;
}, 0);
console.log(sum1);


const add = (...numbers:number[]) => {
    return numbers.reduce((curResult, curValue) =>{
        return curResult+curValue;
    }, 0);
};

const addedNumbers = add(1,2,3,4,5);
console.log(addedNumbers);

//  array destructuring

const [n1, n2, ...remaining] = arr;
console.log(n1,n2,remaining,arr);
*/

// class and oop....

class Department
{
    // id:number;
    // name:string;
    employee:string[] = [];
    private mail:string;

    get getMail()
    {
        return this.mail;
    }

    set setMail(mail:string)
    {
        this.mail = mail;
    }

    constructor(private id:number, public name:string)
    {
        // this.name = name;
    }

    describe()
    {
        console.log("My name is "+this.name+" holding ID : "+this.id);
    }

    addEmployee(emp:string)
    {
        this.employee.push(emp);
    }

    printEmployeeInfo()
    {
        console.log(this.employee);
    }

}

const n = new Department(12009064, "Lakshman");
n.describe();
n.addEmployee("Sai Ram");
n.addEmployee("Pavani");
n.printEmployeeInfo();
n.setMail = "kandula.lakshman18@gmail.com";
n.getMail;
console.log(n);
// console.log(n);
// const nCopy = {name:"Sai", describe:n.describe};
// nCopy.describe();

