const prompt = require("prompt-sync")();

let age = Number(prompt("Enter age: "));

if (age <= 12)
    console.log("Child");

else if (age < 18)
    console.log("Teen");

else
    console.log("Adult");
