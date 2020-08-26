import React, { useState, useEffect } from 'react'

import Header from './components/Header'
import api from './services/api'

import './components/geral.css'

export default function App() {
	const	[projects, setProjects] = useState([])

	useEffect(() => { api.get('/projects').then(response => setProjects(response.data)) }, [])

	async function handleAddProject(){
		const response =  api.post('/projects', {
			title: `Mobile com React ${Date.now()}`,
			owner: "William Mendes"
		})

		const project = response;
		setProjects([...projects, project]);
	}

	return (
		<>
			<Header title="Projects"/>
			<button type="button" onClick={handleAddProject} >Adicionar Projeto</button>
			<ul>
				{	projects.map(project => <li key={project.id}> {project.title}</li>) }
			</ul>
		</>
	)
}
