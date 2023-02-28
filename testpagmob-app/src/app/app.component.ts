import { Component, OnInit } from '@angular/core';
import { Onibus } from './onibus';
import { OnibusService } from './services/onibus.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {
  onibus: Onibus[] = [];
  constructor(private service:OnibusService){};
  ngOnInit():void{
    this.atualizar();
    setInterval(() => {
      this.atualizar();
    }, 30000);
  }

  arrival: String = "ARRIVAL";
  departure: String = "DEPARTURE";
  atualizar() {
    this.service.getOnibus()
      .subscribe(resposta=>this.onibus=resposta);
  }
}






