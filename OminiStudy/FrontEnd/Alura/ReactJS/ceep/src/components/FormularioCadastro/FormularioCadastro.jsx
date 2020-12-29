import React, { Component } from 'react';
import "./estilo.css"

class FormularioCadastro extends Component {

	constructor() {
		super();
		this.title = "";
		this.content = "";
	}

	_handleChangeTitle(event){
		this.title = event.target.value;
	}

	_handleChangeContent(event) {
		this.content = event.target.value;
	}

	_createNote(event) {
		event.preventDefault()
		if (!this.title){alert('Titulo não pode ser vazio!')}
		else if (!this.content){alert('Conteúdo não pode ser vazio!')}
		else {this.props.createNote(this.title, this.content)}
	}

	render() {
		return (
			<form
				className="formulario-cadastro"
				onSubmit={this._createNote.bind(this)}
			>
				<input
					type="text"
					placeholder="Título"
					className="formulario-cadastro_input formulario-cadastro_title"
					onChange={this._handleChangeTitle.bind(this)}
				/>
				<textarea
					className="formulario-cadastro_input formulario-cadastro_textarea"
					placeholder="Escreva sua nota!"
					rows={12}
					onChange={this._handleChangeContent.bind(this)}
				/>
				<button
					className="formulario-cadastro_button"
				>
						Criar nota
				</button>
		</form>
		)
	}
}

export default FormularioCadastro;
