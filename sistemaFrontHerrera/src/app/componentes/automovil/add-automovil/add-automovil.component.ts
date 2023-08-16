import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Automovil } from 'src/app/modelos/Automovil';
import { Color } from 'src/app/modelos/Color';
import { Marca } from 'src/app/modelos/Marca';
import { Motor } from 'src/app/modelos/Motor';
import { AutomovilService } from 'src/app/servicio/automovil.service';

@Component({
  selector: 'app-add-automovil',
  templateUrl: './add-automovil.component.html',
  styleUrls: ['./add-automovil.component.css']
})
export class AddAutomovilComponent implements OnInit {

  modelAutomovil=new Automovil();
  marcas!:Marca[];
  motors!:Motor[];
  colors!:Color[];

  constructor(private router:Router,private automovilService:AutomovilService) { }

  ngOnInit(): void {
    this.cargarMarcas();
    this.cargarMotors();
    this.cargarColors();
  }
  guardar(automovil:Automovil){
    console.log(automovil);
    console.log("automovil");
    this.automovilService.createAutomovil(automovil).subscribe(data=>{
      console.log(data);
      console.log("data");
      this.router.navigate(['automovils']);
    });
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
