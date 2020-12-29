import React, { Component } from 'react';
import "./estilo.css"

class FormularioCadastro extends Component {
	render() {
		return (
			<form className="formulario-cadastro">
				<input className="formulario-cadastro_input formulario-cadastro_title" type="text" placeholder="Título"/>
				<textarea
					className="formulario-cadastro_input formulario-cadastro_textarea"
					placeholder="Escreva sua nota!"
					rows={12}/>
				<button className="formulario-cadastro_button">Criar nota</button>
		</form>
		)
	}
}

export default FormularioCadastro;
