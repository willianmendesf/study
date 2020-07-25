import React, { useState } from 'react';
import Header from './components/Header'

/**
 * CONCEITOS CENTRAIS DO REACT;
 * Component
 * Propriedade
 * Estado & Imutabilidade
 */

export default function App() {
	const	[projects, setProjects] = useState(['developer of app','Frotend web'])

	// useState retorna array com duas posições,
	// 1. Variável com seu valor inicial
	// 2. Funcção para atualizarmos esse valor.

	function handleAddProject(){
		setProjects([...projects, `Novo Projeto ${Date.now()}`])
		console.log(projects)
	}

	return (
		<>
		{console.log('run')}
			<Header title="Projects"/>

			<ul>
				<button type="button" onClick={handleAddProject} >Adicionar Projeto</button>
				{	projects.map(project => <li key={project}> { project } </li>) }
			</ul>
		</>
	)
}
