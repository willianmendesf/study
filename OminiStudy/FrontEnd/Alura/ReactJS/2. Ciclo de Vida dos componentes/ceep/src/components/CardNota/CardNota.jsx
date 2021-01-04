import React, { Component } from 'react';
import { ReactComponent as DeleteSVG } from "../../assets/img/delete.svg";
import MiniModal from '../partials/MiniModal';

import "./estilo.css";

class CardNota extends Component {

	delete() {
		const indice = this.props.indice;
		this.props.deleteNote(indice);
	}

	render() {
		return (
			<section className="card-notas_item_secion">
				<div className="card-notas_item_secion_editar">
					<span className="card-notas_item_secion_editar_cat">
						{this.props.category}
					</span>
					<DeleteSVG
						className="card-notas_item_secion_editar_delete"
						onClick={this.delete.bind(this)}
					/>
				</div>
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
