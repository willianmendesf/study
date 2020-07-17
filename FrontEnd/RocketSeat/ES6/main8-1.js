// REST 

const usuario = {
  nome : "William",
  idade : "27",
  empresa : "Corp",
  endereco : {
    cidade : "Sao Paulo",
    estado : "SP",
  }
}

const { nome, ...resto } = usuario;

// console.log(nome) console.log(resto)

const arr = [1, 2, 3, 4];

const [ a, b, ...c ] = arr;

// console.log(a); console.log(b); console.log(c);


function soma(a, b, ...params) {
  return params;
  // return params.reduce((total, next) => total + next);
}

console.log(soma(1,2,4,5,6,7))