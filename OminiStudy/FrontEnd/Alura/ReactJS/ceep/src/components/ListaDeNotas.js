import React, { Component } from 'react';
import CardNota from './CardNota';

class ListaDeNotas extends Component {
	render() {
		return (
			<ul>
				{Array.of("Trabalho", "Trabalho", "Estudos").map(item => {
					return (
						<li>
							<section>
								<header>
									<h3>{item}</h3>
								</header>
								<body>
									<p>Escreva sua nota</p>
								</body>
							</section>
						</li>
					)
				})}
			</ul>
		)
	}
}

export default ListaDeNotas;
