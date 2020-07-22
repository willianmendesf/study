// let canais = ["Globo", "Sbt", "Record"]
// let numeros = [1,2,3,4,5]
// let alunos = [{nome:'joão',idade:15},{nome:'josé',idade:18},{nome:'maria',idade:20}]

// // MAP: nos devolve uma outra instância de Array com base nos retornos de cada uma das chamadas.
// let mapNumeros = numeros.map( numero => { return numero * 2 })

// // FILTER: retorna com todos os dados que cumprem o parametro.
// let filterAluno = alunos.filter( item => { return item.idade > 19 })

// // FIND: é utilizado para filtrar nossa lista de acordo com algum critério. 
// let findAluno = alunos.find( item => { return item.idade >= 19 })

// // EVERY: valida se TODOS os elementos de um Array respeitam uma dada condição.
// let everyAluno = alunos.every( item => { return item.idade >= 20 })
// console.log(everyAluno)

// // SOME: 
// let someAluno = alunos.some( item => { return item.nome >= "joão" })
// let soma = numeros.reduce((soma,numero) => { return soma + numero; })
// // console.log(soma)


let total = 28;
let valor = 18;
const porcentagem = (a, t) => {
  if(a <= t){
    return `Faltam ${Math.round(((t - a) * 100 / t))}% para você terminar este curso!`;
  } else {
    return "Parabéns, você já concluiu este curso.";
  }
}

porcentagem(valor, total)