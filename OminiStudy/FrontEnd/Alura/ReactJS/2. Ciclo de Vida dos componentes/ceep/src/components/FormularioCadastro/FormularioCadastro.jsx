import React, { Component } from 'react';
import "./estilo.css"

class FormularioCadastro extends Component {

	constructor() {
		super();
		this.title = "";
		this.content = "";
		this.category = "";
		this.color = "";
	}

	_handleChangeTitle(event){
		this.title = event.target.value;
	}

	_handleChangeContent(event) {
		this.content = event.target.value;
	}

	_handleChangeCategory(event) {
		this.category = event.target.value;
	}

	_handleChangeColor(event) {
		this.color = event.target.value;
	}

	_createNote(event) {
		event.preventDefault()
		if (!this.title){alert('Titulo não pode ser vazio!')}
		else if (!this.content){alert('Conteúdo não pode ser vazio!')}
		else if (!this.category || this.category === "---Selecione uma opção---"){alert('Selecione uma opção')}
		else {this.props.createNote(this.title, this.content, this.category, this.color)}
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
				<select
					className="formulario-cadastro_input formulario-cadastro_select"
					onClick={this._handleChangeCategory.bind(this)}
				>
					<option>---Selecione uma opção---</option>
					{this.props.categories.map(
						(category, index) => {
							return (
								<option
									key={index}>
									{category}
								</option>
							)
						}
					)}
				</select>
				<input
					type="text"
					placeholder="Cor da categoria"
					className="formulario-cadastro_input formulario-cadastro_color"
					onChange={this._handleChangeColor.bind(this)}
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
