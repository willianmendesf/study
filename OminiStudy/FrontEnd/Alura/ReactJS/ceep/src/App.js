import React, { Component } from 'react'
import FormularioCadastro from './components/FormularioCadastro';
import ListaDeNotas from './components/ListaDeNotas'
import "./assets/css/App.css";
class App extends Component {
	render() {
		return (
			<secion className="my-app">
				<FormularioCadastro/>
				<ListaDeNotas/>
			</secion>
		)
	}
}

export default App;
