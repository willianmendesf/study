import React, { useEffect, useState } from 'react'
import { View, FlatList, Text, StyleSheet, StatusBar, Button } from 'react-native'
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
			console.log(response.data)
		})
	}, [])

	console.table(projects)

	return (
		<>
			<StatusBar barStyle="ligth-content" backgroundColor="purple"/>
			<View style={styles.container}>
				<Text style={styles.welcome}> Welcome! </Text>
				<Text style={styles.project}>Blade</Text>
				<Text style={styles.list}>
					{ projects.map(project => <Text key={project.id}> { project.title } </Text>) }
				</Text>
			</View>
		</>
		);
}

const styles = StyleSheet.create({
	container: {
		flex: 1,
		backgroundColor: 'purple',
		justifyContent: 'center',
		alignItems: 'center',
		color:'white',
	},
	welcome: {
		fontFamily: 'sans-serif',
		color: '#00000099',
		textTransform: 'lowercase',
		fontSize: 22,
	},
	project: {
		fontFamily: 'sans-serif',
		color: 'white',
		fontWeight:'bold',
		fontSize: 40,
	},
	list:{
		marginTop:20,
		width: 250,
		color: '#00000099',
		textAlign:'center',
	}
})
