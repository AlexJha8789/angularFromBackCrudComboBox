import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Automovil } from 'src/app/modelos/Automovil';
import { AutomovilService } from 'src/app/servicio/automovil.service';

@Component({
  selector: 'app-listar-automovil',
  templateUrl: './listar-automovil.component.html',
  styleUrls: ['./listar-automovil.component.css']
})
export class ListarAutomovilComponent implements OnInit {

  automovils?:Automovil[];

  constructor(private automovilService:AutomovilService,private router:Router) { }

  ngOnInit(): void {

    this.automovilService.getAutomovils().subscribe(
      data=>{
        this.automovils=data;
        console.log(data);
      },
      error=>{
        console.log(error);
      }
    );
  }

  nuevo():void{
    this.router.navigate(['nuevoAutomovil']);
  }
  editar(automovil:Automovil):void{
    localStorage.setItem("id",automovil.id.toString());
    this.router.navigate(['editarAutomovil']);
  }
  eliminar(automovil:Automovil):void{
    this.automovilService.deleteAutomovil(automovil).subscribe(data=>{
      this.automovils=this.automovils!.filter(p=>p!==automovil);
    });
  }

}
