import React, { Component } from 'react'
import FormularioCadastro from './components/FormularioCadastro';
import ListaDeNotas from './components/ListaDeNotas'
import ListaDeCategorias from './components/ListaDeCategorias'

import "./assets/css/App.css";

class App extends Component {
	constructor() {
		super();
		this.state = {
			notes: [],
			categories: [],
		}
	}

	createNote(title, content, category, color) {
		const newNote = {title, content, category, color}
		const newArrayNotes = [...this.state.notes, newNote]
		const newState = {notes: newArrayNotes}
		this.setState(newState)
	}

	deleteNote(index) {
		let arrNotes = this.state.notes;
		arrNotes.splice(index, 1)
		this.setState({notes: arrNotes})
	}

	createCategory(title) {
		const newCat = title
		const newArrayCat = [...this.state.categories, newCat]
		const newState = {categories: newArrayCat}
		this.setState(newState)
	}

	render() {
		return (
			<section className="my-app">
				<FormularioCadastro
					categories={this.state.categories}
					createNote={this.createNote.bind(this)}
				/>
				<main className="my-app_principal">
					<ListaDeCategorias
						categories={this.state.categories}
						createCategory={this.createCategory.bind(this)}
					/>
					<ListaDeNotas
						notes={this.state.notes}
						deleteNote={this.deleteNote.bind(this)}
					/>
				</main>
			</section>
		)
	}
}

export default App;
