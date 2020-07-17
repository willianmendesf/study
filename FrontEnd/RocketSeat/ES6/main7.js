const usuario = {
  nome : "William",
  idade : "27",
  endereco : {
    cidade : "Sao Paulo",
    estado : "SP",
  }
}

// const { nome, idade, endereco: { cidade } } = usuario;
// console.log(nome, idade, cidade)

const mostraNome = ({ nome, idade, endereco: { estado } }) => {
  
  console.log( nome, idade, estado )

}

mostraNome(usuario);