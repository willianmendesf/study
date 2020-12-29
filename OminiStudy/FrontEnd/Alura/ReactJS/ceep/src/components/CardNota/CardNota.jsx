import React, { Component } from 'react';
import "./estilo.css";

class CardNota extends Component {
	render() {
		return (
			<section className="card-notas_item_secion">
				<header className="card-notas_item_secion_header">
					<h3 className="card-notas_item_secion_header_title">
						{this.props.title}
					</h3>
				</header>
				<p className="card-notas_item_secion_text">
						{this.props.content}
				</p>
			</section>
		)
	}
}

export default CardNota;
