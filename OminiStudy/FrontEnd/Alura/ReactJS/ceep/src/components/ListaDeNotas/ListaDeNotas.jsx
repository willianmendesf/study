import React, { Component } from 'react';
import CardNota from '../CardNota';

import "./estilo.css";

class ListaDeNotas extends Component {

	render() {
		return (
			<ul className="lista-notas">
				{this.props.notes.map((note, index) => {
					return (
						<li key={index} className="lista-notas_item">
							<CardNota title={note.title} content={note.content}/>
						</li>
					)
				})}
			</ul>
		)
	}
}

export default ListaDeNotas;
