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
							<CardNota
								indice={index}
								title={note.title}
								content={note.content}
								category={note.category}
								deleteNote={this.props.deleteNote}
							/>
						</li>
					)
				})}
			</ul>
		)
	}
}

export default ListaDeNotas;
