
import { Component, Output, EventEmitter } from '@angular/core';
import { NumberValueAccessor } from '@angular/forms';

@Component({
  selector: 'app-nova-transferencia',
  templateUrl: './nova-transferencia.component.html',
  styleUrls: ['./nova-transferencia.component.scss']
})
export class NovaTransferenciaComponent {

  @Output() aoTransferir = new EventEmitter<any>();

  destino = 0;
  valor = 0;

  transferir(): void{
    console.log('Solicitada nova transferência!');
    const transferencia = {destino: this.destino, valor: this.valor}
    this.aoTransferir.emit(transferencia);
    this.clearForm();

  }

  clearForm() {
    this.destino = 0;
    this.valor = 0;
  }
}
