const prompt = require("prompt-sync")();
const lenght = Number(prompt("Enter your lenght : "));
const width = Number(prompt("Enter your width : "));
            
const area = lenght * width;           
console.log("The area of your rectangle  is : " + area); 

