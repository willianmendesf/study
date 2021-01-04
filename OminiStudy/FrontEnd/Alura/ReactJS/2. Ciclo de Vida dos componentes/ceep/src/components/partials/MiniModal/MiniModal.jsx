import React, { Component } from 'react';

import "./estilo.css";

class MiniModal extends Component {
	constructor(props){
		super();
	}

	_handleCloseModal() {
		const close = document.querySelector('.minimodal-close')
		const minimodal = document.querySelector('.minimodal')

		close.addEventListener('click', () => {
			minimodal.style.display = "none";
		})
	}

	render() {
		return (
			<div className="minimodal">
				<div className="minimodal-close">x</div>
				<div className="minimodal-content" onClick={this._handleCloseModal()}>
					<h3 className="minimodal-content-title">
						{ this.props.MMtitle }
					</h3>
					<p className="minimodal-content-text">
						{ this.props.MMtext }
					</p>
				</div>
			</div>
		);
	}
}

export default MiniModal;
