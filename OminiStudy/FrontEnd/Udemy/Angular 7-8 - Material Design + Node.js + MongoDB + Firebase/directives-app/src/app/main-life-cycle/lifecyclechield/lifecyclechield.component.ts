import { Component, Input, OnInit, OnChanges, OnDestroy } from '@angular/core';


export interface LifeCicleEvent {
  id    : number
  color : string
  name  : string
}
@Component({
  selector: 'app-lifecyclechield',
  templateUrl: './lifecyclechield.component.html',
  styleUrls: ['./lifecyclechield.component.scss']
})

export class LifecyclechieldComponent implements OnInit, OnDestroy, OnChanges {

  @Input() name : string;
  @Input() age  : number;
  @Input() food : string;

  public events : LifeCicleEvent[] = [];
  nexEventId : number = 0;
  colors : string[] = ["accent","warn", "primary"];

  constructor() {
    console.log(this.name + " constructor")
  }

  ngOnInit() {
    console.log(this.name + " ngOninit")
  }

  ngOnChanges() {
    console.log(this.name + " ngOnChanges")
  }

  ngAfterContentInit() {
    console.log(this.name + " ngAfterContentInit")
  }

  ngAfterViewInit() {
    console.log(this.name + " ngAfterViewInit")
  }

  ngOnDestroy() {
    console.log(this.name + " ngOnDestroy")
  }

  newEvent = (name : string) => {
    let id = this.nexEventId++
    this.events.push({
      id: id,
      color: "",
      name: name,
    })
  }

}
