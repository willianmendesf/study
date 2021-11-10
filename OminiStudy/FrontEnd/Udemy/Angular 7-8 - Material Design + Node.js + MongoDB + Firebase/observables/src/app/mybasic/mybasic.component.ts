import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-mybasic',
  templateUrl: './mybasic.component.html',
  styleUrls: ['./mybasic.component.css']
})
export class MybasicComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    const myFirstObservable = new Observable(
      // (observer: Observer<>) => {

      // }
    )
  }

}
