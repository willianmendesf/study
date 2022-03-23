import { Request, Response } from 'express'
import CreateUser from './CreateUser';

// string, number, boolean, object, Array;
// interface, vetores

export function helloWorld(request: Request, response: Response) {
	const user = CreateUser({
		email: 'willianmendesf@gmail.com',
		password: '123456',
		techs: [
			'React',
			'ReactNative',
			'NodeJS',
			{ title: 'Javascript', experience: 100 },
			{ title: 'React', experience: 200 }
		]
	});

	return response.json({message: "helloWorld"})
}
