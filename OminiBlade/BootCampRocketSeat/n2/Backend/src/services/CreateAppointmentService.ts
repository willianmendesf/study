import Appointment from '../models/Appointment'
import appointmentsRepository from '../repositories/AppointmentsRepository'
import { startOfHour } from 'date-fns'

/**
 * PROBLEMAS A SEREM RESOLVIDOS:
 *
 * [x] Recebimento das informações
 * [x] Tratativa de erros/excessões
 * [x] Acesso ao repositorio
 *
 *  SOLID
 * 	Single Reponsability Principle
 * 	Dependency Inversion Principle
 */

interface Request {
	provider: string;
	date: Date;
}

/**
 * Dependency Inversion (SOLID)
 */

class CreateAppointmentService {
	private appointmentsRepository: appointmentsRepository

	constructor (appointmentsRepository: appointmentsRepository) {
		this.appointmentsRepository = appointmentsRepository;
	}

	public execute({ provider, date }: Request) : Appointment {
		const appointmentDate = startOfHour(date)

		const findAppointmentInSameDate = this.appointmentsRepository.findByDate(
			appointmentDate,
		)

		if (findAppointmentInSameDate)
			throw Error("This appointment is already booked");


		const appointment = this.appointmentsRepository.create({
			provider,
			date: appointmentDate
		})

		return appointment
	}
}

export default CreateAppointmentService
