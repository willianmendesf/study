const express = require('express');
const cors = require("cors");
const app = express();
const { uuid } = require('uuidv4')

app.use(express.json());
app.use(cors());

const projects = [];

app.get('/projects', (req, res) => {
	const { title, owner } = req.query;
	const results = title
		? projects.filter( item => item.title.includes(title))
		: projects;

	return res.json(results)
})

app.post('/projects', (req, res) => {
		const { title, owner } = req.body;
		const project = { id: uuid(), title, owner }
		projects.push(project)
		return res.json(project)
	}
)

app.put('/projects/:id', (req, res) => {
	const { id } = req.params;
	const projectIndex = projects.findIndex(item => item.id === id)

	if (projectIndex < 0) {
		res.status(400).json({error:"Project not found"})
	}
	const { title, owner } = req.body;
	const project = {
		id,
		title,
		owner
	}
	projects[projectIndex] = project;
	return res.json(project)
})

app.delete('/projects/:id', (req, res) => {
	const { id } = req.params;
	const projectIndex = projects.findIndex(item => item.id === id)

	if (projectIndex < 0) {
		res.status(400).json({error:"Project not found"})
	}
	projects.splice(projectIndex, 1)

	return res.status(204).send()

})

module.exports = app;
