import React, { useEffect, useState } from 'react'
import { View, Text, StyleSheet, StatusBar } from 'react-native'
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
			console.log(response.data)
			setProjects(response.data)
		})
	})

	return (
		<>
		 	<StatusBar barStyle="ligth-content" backgroundColor="purple"/>
			<View style={styles.container}>
				<Text style={styles.text}> GoStack </Text>
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
	},
	text: {
		color: 'white',
		fontSize: 30,
		fontWeight:'bold',
		padding:40,
	}
})
