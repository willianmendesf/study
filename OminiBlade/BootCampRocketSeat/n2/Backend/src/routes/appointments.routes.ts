import { Router } from 'express'
import { startOfHour, parseISO } from 'date-fns'

import Appointment from '../models/Appointment'
import AppointmentsRepository from '../repositories/AppointmentsRepository'
import CreateAppointmentService from '../services/CreateAppointmentService'

const appointmentsRouter = Router()
const appointmentsRepository = new AppointmentsRepository();

// Soc: Sepparation of Concerns (Separação de preocupações)
// DTO: Data Transfer Object (Transferindo objeto de dados)
// Rota: Receber a request, chamar outro arquivo, e devolver uma resposta.

appointmentsRouter.get('/', (request, response) => {
	const appointment = appointmentsRepository.all()

	return response.json(appointment)
})

appointmentsRouter.post('/', (request, response) => {
	try {
		const { provider, date } = request.body;

		const parsedDate = parseISO(date)

		const CreateAppointment = new CreateAppointmentService(appointmentsRepository)

		const appointment = CreateAppointment.execute({ provider, date: parsedDate })

		return response.json(appointment)
	} catch (err) {
		return response.status(400).json({ error: err.message })
	}

})

export default appointmentsRouter;
