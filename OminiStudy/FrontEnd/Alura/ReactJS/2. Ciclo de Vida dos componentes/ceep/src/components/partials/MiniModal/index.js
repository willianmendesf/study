import Modal from './MiniModal'

const closeBTN = document.querySelector('.minimodal-close')
const MiniModal = {

	Modal,

	openModal(target){
		const el = document.querySelector(target);
		el.addEventListener('click', () => {
			closeBTN.style.display = "initial";
		})
	}
}


export default MiniModal;
