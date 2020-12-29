import React, { Component } from 'react'
import FormularioCadastro from './components/FormularioCadastro';
import ListaDeNotas from './components/ListaDeNotas'
import "./assets/css/App.css";
class App extends Component {

	constructor() {
		super();
		this.state = {
			notes: []
		}
	}

	createNote(title, content) {
		const newNote = {title, content}
		const newArrayNotes = [...this.state.notes, newNote]
		const newState = {notes: newArrayNotes}
		this.setState(newState)
	}

	render() {
		return (
			<secion className="my-app">
				<FormularioCadastro createNote={this.createNote.bind(this)}/>
				<ListaDeNotas notes={this.state.notes}/>
			</secion>
		)
	}
}

export default App;
