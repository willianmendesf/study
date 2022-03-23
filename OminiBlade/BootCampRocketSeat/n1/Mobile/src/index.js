import React, { useEffect, useState } from 'react'
import { SafeAreaView, FlatList, Text, StyleSheet, StatusBar, TouchableOpacity } from 'react-native'
 import api from './services/api'

// Não possuem valor semântico (significado) (São abstratos).
// Não possuem estilização própria.
// Todos compoents possuem por padrão "display: flex".

// View: div, footer, header, main, aside, section.
// Text: p, span, strong, h1, h2 h*...

export default function App () {
	const [projects, setProjects] = useState([])

	useEffect(() => {
		api.get('/projects').then(response => {
			setProjects(response.data)
			console.table(projects)
		})
	}, [])

	async function handleAddProject () {
		const reponse = await api.post('/projects', {
			title: `MongoDB ${Date.now()}`,
			owner: 'William Mendes'
		})
		const project = reponse.data
		setProjects([...projects, project])
	}

	return (
		<>
			<StatusBar barStyle="ligth-content" backgroundColor="purple"/>

			<SafeAreaView style={styles.container}>
				<FlatList
					data={projects}
					keyExtractor={project => project.id}
					renderItem={({ item: project }) => (
						<Text style={styles.project}> {project.title} </Text>
					)}
				/>

				<TouchableOpacity
					activeOpacity={1}
					style={styles.button}
					onPress={handleAddProject}
				>
					<Text style={styles.buttonText}>Adicionar Projeto</Text>
				</TouchableOpacity>
			</SafeAreaView>
		</>
		);
}

const styles = StyleSheet.create({
	container: {
		flex: 1,
		backgroundColor: 'purple',
	},
	project: {
		color: '#FFF',
		fontSize: 20,
		textAlign: 'center'
	},
	button:{
		backgroundColor: '#fff',
		margin: 20,
		height: 50,
		borderRadius: 4,
		justifyContent: 'center',
		alignItems: 'center',
	},
	buttonText: {
		fontWeight: 'bold',
		fontSize: 18,
		color: '#666',

	}
})
