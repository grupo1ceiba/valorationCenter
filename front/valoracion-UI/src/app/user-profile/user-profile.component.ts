import { Component, OnInit } from '@angular/core';
import {tipoinmueble} from "../model/tipoinmueble";
import { CrudUserProfileService } from './crud-user-profile-service';


@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.css']
})
export class UserProfileComponent implements OnInit {

  tiposimueble: tipoinmueble[] = [{id:1, descripcion: 'apartamento' },{id:2, descripcion: 'casa' },{id:3, descripcion: 'local' },];
  constructor(public crudUserProfileService: CrudUserProfileService) { }

  ngOnInit() {

      this.consultarDato();
  }

  private consultarDato() {
    this.crudUserProfileService.get("/introduction/ping").subscribe(
      response => {
        console.log("linea numero 24 :::::: " + JSON.stringify(response));
      }
    )
  }

}
