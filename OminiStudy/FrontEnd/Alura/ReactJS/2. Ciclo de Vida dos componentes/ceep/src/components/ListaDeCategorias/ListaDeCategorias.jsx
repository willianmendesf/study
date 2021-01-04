import React, { Component } from 'react';

import './estilo.css';

class ListaDeCategorias extends Component {
	constructor() {
		super();
		this.title = "";
	}

	_handleAddCategory(event){
		this.title = event.target.value;
		if (event.key === "Enter") {
			(!event.target.value)
				? alert('Nome da Categoria não pode ser vazio!')
				: this.props.createCategory(this.title)
			event.target.value = ""
		}
	}

	render() {
		return (
			<section className="listacategorias">
				<ul className="listacategorias-list">
					{this.props.categories.map((category, index) => {
						return (
							<li key={index} className="listacategorias-list-item">{category}</li>
						)
					})}
				</ul>
				<input
					className="listacategorias-input"
					placeholder="Adicionar Categoria"
					type="text"
					onKeyUp={this._handleAddCategory.bind(this)}
				/>
			</section>
		);
	}
}

export default ListaDeCategorias;
