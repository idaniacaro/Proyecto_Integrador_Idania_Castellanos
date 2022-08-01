import { Component, OnInit } from '@angular/core';
import { Hard } from 'src/app/model/hard';
import { HardService } from 'src/app/service/hard.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {
  hr: Hard[] = [];

  constructor(private hard: HardService, private tokenService: TokenService) { }

  isLogged = false;

  ngOnInit(): void {
    this.cargarHard();
    if (this.tokenService.getToken()) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }

  cargarHard(): void {
    this.hard.lista().subscribe(data => { this.hr = data; })
  }

  delete(id?: number){
    if(id != undefined){
      this.hard.delete(id).subscribe(
        data => {
          this.cargarHard();
        }, err => {
          alert("No se pudo borrar la experiencia");
        }
      )
    }
  }
}