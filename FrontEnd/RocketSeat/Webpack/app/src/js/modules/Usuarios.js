export class Usuario {
  constructor () {
    this.nome = "William";
    this.idade = 27,
    this.endereco = {
      rua : "Rua Francisco",
      numero : "32",
      cidade : "Sao Paulo",
      uf : "SP"
    }
  }

  addNome (newName) {
    this.nome = newName;
    return this.nome;
  }
}