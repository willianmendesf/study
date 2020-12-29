import React, { Component } from 'react';
import "./estilo.css"

class FormularioCadastro extends Component {

	constructor() {
		super();
		this.title = "";
	}

	handleChangeTitle(event){
		this.title = event.target.value;
		console.log(this.title)
	}

	render() {
		return (
			<form className="formulario-cadastro">
				<input
					type="text"
					placeholder="Título"
					className="formulario-cadastro_input formulario-cadastro_title"
					onChange={this.handleChangeTitle.bind(this)}
				/>
				<textarea
					className="formulario-cadastro_input formulario-cadastro_textarea"
					placeholder="Escreva sua nota!"
					rows={12}
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
