import React, { Component } from 'react';
import CardNota from '../CardNota';

import "./estilo.css";

class ListaDeNotas extends Component {
	render() {
		return (
			<ul className="lista-notas">
				{/* <CardNota/> */}
				{Array.of("Trabalho", "Trabalho", "Estudos", "Pesquisas").map((item, index) => {
					return (
						<li key={index} className="lista-notas_item">
							<section className="lista-notas_item_secion">
								<header className="lista-notas_item_secion_header">
									<h3 className="lista-notas_item_secion_header_title">{item}</h3>
								</header>
								<p className="lista-notas_item_secion_text">Escreva sua nota</p>
							</section>
						</li>
					)
				})}
			</ul>
		)
	}
}

export default ListaDeNotas;
