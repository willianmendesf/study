import api from './api';

class App {
  constructor () {
    this.repositories = [];

    this.formEl = document.getElementById('repo-form')
    this.inputEl = document.querySelector('input[name=repository]')
    this.listEl = document.getElementById("repo-list")

    this.registerHandlers();
  }

  registerHandlers () {
    this.formEl.onsubmit = event => this.addRepository(event)
  }

  setLoading (loading = true) {
    if(loading === true) {
      let loadingEl = document.createElement('span')
      loadingEl.appendChild(document.createTextNode('Carregando'))
      loadingEl.setAttribute('id', 'loading')

      this.formEl.appendChild(loadingEl)
    } else {
      document.getElementById('loading').remove()
    }
  }

  async addRepository (event) {
    event.preventDefault()

    const repoInput = this.inputEl.value;

    if(!repoInput)
      return;
    
    this.setLoading()

    try {
      const response = await api.get(`/repos/${repoInput}`)
      const { name, description, html_url, owner: {avatar_url}} = response.data;
      console.log(name, description, html_url, avatar_url)

      this.repositories.push({
        name: name,
        description: description,
        avatar_url: avatar_url,
        html_url: html_url,
      })

      this.render()
    } catch (err) {
      alert('O Repositório ou não existe, ou é privado!')
    }

    this.setLoading(false);
  }

  render () {
    this.listEl.innerHTML = '';

    this.repositories.forEach(repo => {
      let { name, avatar_url, html_url, description } = repo;
      
      let imgEl = document.createElement('img')
      imgEl.setAttribute('src', avatar_url)

      let titleEl = document.createElement('strong')
      titleEl.appendChild(document.createTextNode(name))
      
      let descriptionEl = document.createElement('p')
      descriptionEl.appendChild(document.createTextNode(description))

      let linkEl = document.createElement('a')
      linkEl.setAttribute('target', '_blank')
      linkEl.setAttribute('href', html_url)
      linkEl.appendChild(document.createTextNode('Acessar'))

      let listItemEl = document.createElement('li')
      listItemEl.appendChild(imgEl)
      listItemEl.appendChild(titleEl)
      listItemEl.appendChild(descriptionEl)
      listItemEl.appendChild(linkEl)

      this.listEl.appendChild(listItemEl)
    })

  }
}

new App();