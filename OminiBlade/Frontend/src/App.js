import React from 'react';
import Header from './components/Header'

/**
 * CONCEITOS CENTRAIS DO REACT;
 * Component
 * Propriedade
 * Estado & Imutabilidade
 */

export default function App() {
	return (
		<>
			<Header title="Header">
				<ul>
					<li>Home</li>
					<li>Projetos</li>
					<li>Contato</li>
				</ul>
			</Header>
			<Header title="Projects">
				<ul>
					<li>Login</li>
				</ul>
			</Header>
		</>
	)
}
