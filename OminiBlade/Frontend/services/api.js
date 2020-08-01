import axios from 'axios'

const api = (params, content) => axios
		.get(`http://localhost:3333/${params}`)
		.then(
			response => {
				console.log(response)
				setProjects(response.data)
			})
		.catch(error =>  console.log(error))

export default api;
