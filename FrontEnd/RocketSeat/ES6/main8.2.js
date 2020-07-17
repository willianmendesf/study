// SPREAD 

const arr1 = [1,2,3];
const arr2 = [4,5,6];

const arr3 = [...arr1, ...arr2];
console.log(arr3);


const usuario = {
  nome : "William", 
  idade : 23, 
  empresa : "Corp"
}

const usuario2 = { ...usuario, nome : "José" }
console.log(usuario2)