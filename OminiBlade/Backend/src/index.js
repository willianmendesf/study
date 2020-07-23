const express = require('express');
const app = express();
const { uuid } = require('uuidv4')

const project = {}

const projects = [];

app.get('/projects', (req, res) => res.json(projects))

app.post('/projects', (req, res) => {
	const project = { id:uuid()}
	projects.push(project)
	res.json(project)
})

app.put('/projects/:id', (req, res) => {
	const { id } = req.params;
	const projectIndex = projects.findIndex(project => project.id === id)
	if (projectIndex < 0) {
		res.status(400).json({error:"Project not found"})
	} else {
		res.json(projectIndex)
	}
})

app.delete('/projects/:id', (req, res) => {
	res.json({
		"message":"item delete"
	})
})

app.listen(3333, () => console.log('🚀 Application Started 😊'))
