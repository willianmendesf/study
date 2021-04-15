import React, { Component } from 'react';
import { ReactComponent as DeleteSVG } from "../../assets/img/delete.svg";
// import MiniModal from '../partials/MiniModal';

import "./estilo.css";

class CardNota extends Component {

	delete() {
		const indice = this.props.indice;
		this.props.deleteNote(indice);
	}

	_changeColorBg(event) {
		console.log(event)
		return `style='background-color:${this.props.color}'`;
	}

	render() {
		return (
			<section className="card-notas_item_section">
				<div className="card-notas_item_section_editar">
					<span className="card-notas_item_section_editar_cat">
						<div className="card-notas_item_section_editar_cat_color"></div>
						{this.props.category}
					</span>
					<DeleteSVG
						className="card-notas_item_section_editar_delete"
						onClick={this.delete.bind(this)}
					/>
				</div>
				<header className="card-notas_item_section_header">
					<h3 className="card-notas_item_section_header_title">
						{this.props.title}
					</h3>
				</header>
				<p className="card-notas_item_section_text">
						{this.props.content}
				</p>
			</section>
		)
	}
}

export default CardNota;
//style="background-color:blue"
