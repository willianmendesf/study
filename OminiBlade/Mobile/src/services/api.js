import axios from 'axios'

const api = axios.create({
	baseURL: 'http://localhost:3333'
})

export default api;

// IOS com emulador:  localhost.
// IOS com fisico: IP da máquina.

// Android com emulador: Adb reverse
// adb reverse tcp:3333 tcp:3333

// Android com emulador: Android localhost emulator. (10.0.0.2) (Android Studio)
// Andorid com emulador: 10.0.3.2 (Genymotion)
// Android com físico: IP da máquina.
