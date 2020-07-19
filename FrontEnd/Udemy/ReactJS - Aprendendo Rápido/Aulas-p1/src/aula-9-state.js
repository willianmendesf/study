import React, { Component } from 'react';
import { render } from 'react-dom';
import Button from "./components/Button";

class App extends Component {
  
  state = {
    contador: 0,
    name: 'William',
  }

  changeName = (e) => {
    this.setState({
      nome: e.target.value,
    })
  }

  adicionar = () => {
    this.setState({
      nome: this.state.contador+1,
    })
  }

  render() {
    return (
      <h1>
        React

        <input onChange={this.changeName}/><br/>
        nome:  {this.state.nome}<br/>
        contador: {this.state.contador}

        <Button click={this.adicionar}> 
          Update
        </Button>
      </h1>
    );
  }
}

render(<App />, document.getElementById('app'));