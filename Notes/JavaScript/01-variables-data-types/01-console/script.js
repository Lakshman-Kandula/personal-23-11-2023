// console.log(100);

// const styles = "padding: 10px; background-color:black; color: red";
// console.log("%cHello World", styles);

/*
const post = {
    id:1,
    title:"Lakshman",
    body:"empty body",
};

//covert to JSON string
const str = JSON.stringify(post);

const obj = JSON.parse(str);

console.log(obj);
*/

/*
// IIFE
(function(name){
    console.log("hello "+name);
})("Lakshman");


//challenge 3

((length, width)=>{
    const area = length*width;
    const out = `The area of a rectangle with a length of ${length} and a width of ${width} is ${area}.`;
    console.log(out);
})(5,10);


//  for of loop
let b;
b = true||10;
console.log(b);

const arr1 = ["Red", "Blue", "Green", "Orange"];
for(const ar of arr1)  //  this will give the properties
{
    console.log(ar);
}

/*
const colorObj1 = {
    color1 : "Red",
    color2 : "Blue",
    color3 : "Green",
    color4 : "White",
};
for(const color of colorObj1)
{
    console.log(color);
}
*/

/*
const map = new Map();
map.set("name", "Lakshman");
map.set("age", 23);
for(const [key, value] of map)
{
    console.log(key, value);
}

//  for in loop
const colorObj = {
    color1 : "Red",
    color2 : "Blue",
    color3 : "Green",
    color4 : "White",
};
for(const color in colorObj)
{
    console.log(colorObj[color]);
}

const arr4 = ["Red", "Blue", "Green", "White"];
for(const ar in arr4)  //  this will give the index
{
    console.log(arr4[ar]);
}


//ForEach
const arr2 = ["mohan", "pradeep", "ramakrishna", "yaswanth", "sai"];
// arr2.forEach(function(e){
//     console.log(e);
// });

// arr2.forEach(e => console.log(e)); 

arr2.forEach((index, arr, item) => console.log(`${index} - ${item}`, arr));

const socialObj = [
    {name:"mohan", designation:"Analyst"}, 
    {name:"Yaswanth", designation:"Analyst"},
    {name:"Pradeep", designation:"Analyst"},
    {name:"Ramakrishna", designation:"Analyst"},
];

// socialObj.forEach(i => console.log(i));
socialObj.forEach(i => console.log(i.name));

//  filter

const numbers = [1,2,3,4,5,6,7,8,9,10,11,12];

const num = [];
numbers.forEach(n => {
    if(n%2==0)
    {
        num.push(n);
    }
});
console.log(num);

const num1 = numbers.filter(function(num){
    return num%2==0;
});
console.log(num1);

const num2 = numbers.filter(num => num%2==0);
console.log(num2);
*/

const movies = [
    {name : "RRR", director : "SS Rajamouli", year : 2022},
    {name : "Baahubali", director : "SS Rajamouli", year : 2017},
    {name : "Pushpa", director : "Sukumar", year : 2022},
    {name : "Doctor", director : "Nelson", year : 2022},
    {name : "Master", director : "Nelson", year : 2022},
];

const movie = movies.filter(mov => mov.director=="SS Rajamouli");
console.log(movie);


//  map
const num = [1,2,3,4,5];
const double = num.map(num => num*3);
console.log(double);

const num1 = [];
num.forEach(num => num1.push(num*10));
console.log(num1);

const moviename = movies.map(m => m.name);
console.log(moviename);

const moviedetail = movies.map(m => {return{moviename:m.name, directorname:m.director,};});
console.log(moviedetail);

 const squ = num.map(m => Math.sqrt(m));
 console.log(squ);

 //  chain of maps
 const squareanddouble = num.map(m => Math.sqrt(m)).map(m => m*2);
 console.log(squareanddouble);

 //  chaining different methods
 const numbers = [1,2,3,4,5,6,7,8,9,10];
 const evendouble = numbers.filter(num => num%2==0).map(num => num*2);
 console.log(evendouble);

 //reduce
 const sum = numbers.reduce(function(acc, curr){
    return acc+curr;
 }, 0);
 console.log(sum);

 const sum1 = numbers.reduce((acc, curr) => acc+curr,0);
 console.log(sum1);

 const sum3 = () =>
 {
    let acc = 0;
    for(const curr of numbers)
    {
        acc+=curr;
    }    
    return acc;
 };
 console.log(sum3());

 const pro = [
    {id : 1, name : "one", price : 30},
    {id : 1, name : "one", price : 30},
    {id : 1, name : "one", price : 30},
 ];

 const value = pro.reduce(function(acc, prod) { 
    return acc+prod.price;}, 0);
console.log(value);