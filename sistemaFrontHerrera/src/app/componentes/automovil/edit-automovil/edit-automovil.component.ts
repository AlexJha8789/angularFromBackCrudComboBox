import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Automovil } from 'src/app/modelos/Automovil';
import { Color } from 'src/app/modelos/Color';
import { Marca } from 'src/app/modelos/Marca';
import { Motor } from 'src/app/modelos/Motor';
import { AutomovilService } from 'src/app/servicio/automovil.service';

@Component({
  selector: 'app-edit-automovil',
  templateUrl: './edit-automovil.component.html',
  styleUrls: ['./edit-automovil.component.css']
})
export class EditAutomovilComponent implements OnInit {
  automovil: Automovil = new Automovil();
  marcas!:Marca[];
  motors!:Motor[];
  colors!:Color[];

  constructor(private router:Router, private automovilService:AutomovilService) { }

  ngOnInit(): void {
    this.editar();
    this.cargarMarcas();
    this.cargarMotors();
    this.cargarColors();
  }
  editar():void{
    let id= JSON.parse(localStorage.getItem('id') as string);
    this.automovilService.getAutomovilId(id).subscribe(
      data=>{
         this.automovil=data; 
      }
    )
}

actualizar(automovil:Automovil):void{
  this.automovilService.updateAutomovil(automovil).subscribe(
    data=>{
        this.automovil=data;
        this.router.navigate(['automovils']);
    }
  );
}

cargarMarcas(){
  this.automovilService.getMarcas().subscribe(
    data=>{
      this.marcas=data;

    },
    error=>{
      console.log(error);
    }
  )
}

cargarMotors(){
  this.automovilService.getMotors().subscribe(
    data=>{
      this.motors=data;
    },
    error=>{
      console.log(error);
    }
  )
}

cargarColors(){
  this.automovilService.getColors().subscribe(
    data=>{
      this.colors=data;
    },
    error=>{
      console.log(error);
    }
  )
}

}
