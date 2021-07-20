import { Component, OnInit } from '@angular/core';
import { Client } from "./Client";



 @Component({
  selector: 'app-main-life-cycle',
  templateUrl: './main-life-cycle.component.html',
  styleUrls: ['./main-life-cycle.component.css']
})

export class MainLifeCycleComponent implements OnInit {
  private foods : string[] = ["Rice","Beans","Pizza"]
  private clients : Client[] = []
  private name : string;
  private age : number;
  private food : string;
  private editClient : Client = null;

  constructor() { }

  ngOnInit() {}

  clearForm() {
    this.age = null;
    this.name = null
    this.food = null
  }

  save() {
    if (this.editClient == null) {
      this.clients.push({
        name: this.name,
        food: this.food,
        age: this.age
      })
      this.clearForm()
    }
  }
}
