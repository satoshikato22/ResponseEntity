/**
 * 
 */
'use strict';
const nedan = (mikan, kosu) => mikan * kosu;


console.log(nedan(100, 20))


document.querySelector("html").addEventListener("click", () => {
	fetch("http://localhost:8080/api/user", {
	  method: "POST",
	  headers: {
	    "Content-Type": "application/json"
	  },
	  body: JSON.stringify({
	    name: "Taro",
	    age: 25,
		test:60
	  })
	})
	.then(res => res.json())
	.then(data => { 
		document.getElementById("name").textContent = data.name; 
		document.getElementById("age").textContent = data.age; 
		document.getElementById("birthYear").textContent = data.birthYear;     				})
	.catch(err => console.error(err));
});