// let out;

// out = document.all;

// console.log(out);

// console.log(window);
console.log(window.document);

console.log(document.body.innerHTML);

console.log(document.getElementById("main"));

// document.body.innerHTML = "<h1>Hello World</h1>";

// document.write("Hello from JS");

// console.dir(window.document);
// console.log(document.body.innerText);
// document.write("hello from js");

const main = document.getElementById("main");
main.innerHTML = "<h1>Hello from main</h1>";

document.querySelector("#main h1").innerText = "Hi";
