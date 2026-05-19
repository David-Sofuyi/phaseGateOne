const prompt = require("prompt-sync")();

let password = prompt("Enter password: ")

if (password === "admin123")
    console.log("Password matches");

else
    console.log("It does not match")
