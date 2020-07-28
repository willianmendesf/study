import React, { useState, useEffect } from 'react'
import Header from './components/Header'
import axios from 'axios'

import './components/geral.css'

export default function App() {
	const	[projects, setProjects] = useState([])

	useEffect(() => {
		axios.get('http://localhost:3333/projects').then(response => {
			setProjects(response.data)
		}, [])
	});

	function handleAddProject(){
		setProjects([...projects, `Novo Projeto ${Date.now()}`])
	}

	return (
		<>
			<Header title="Projects"/>

			<button type="button" onClick={handleAddProject} >Adicionar Projeto</button>

			<ul>
				{	projects.map(project => <li key={project.id}> { project.title } </li>) }
			</ul>
		</>
	)
}
