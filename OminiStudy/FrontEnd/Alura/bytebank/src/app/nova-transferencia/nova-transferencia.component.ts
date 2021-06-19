import { Component, OnInit, Output } from '@angular/core';
import { NumberValueAccessor } from '@angular/forms';
import { EventEmitter } from 'stream';

@Component({
  selector: 'app-nova-transferencia',
  templateUrl: './nova-transferencia.component.html',
  styleUrls: ['./nova-transferencia.component.scss']
})
export class NovaTransferenciaComponent {

  @Output() aoTransferir = new EventEmitter<any>();

  valor: number;
  destino: number;

  transferir() {
    console.log("Solicitada nova transferência")
    const valorEmitir: Object = { valor: this.valor, destino: this.destino };
    this.aoTransferir.emit(valorEmitir);
  }

}
