import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Motor } from 'src/app/modelos/Motor';
import { MotorService } from 'src/app/servicio/motor.service';

@Component({
  selector: 'app-listar-motor',
  templateUrl: './listar-motor.component.html',
  styleUrls: ['./listar-motor.component.css']
})
export class ListarMotorComponent implements OnInit {

  motors?:Motor[];

  constructor(private motorService:MotorService,private router:Router) { }

  ngOnInit(): void {

    this.motorService.getMotors().subscribe(
      data=>{
        this.motors=data;
        console.log(data);
      },
      error=>{
        console.log(error);
      }
    );
  }

  nuevo():void{
    this.router.navigate(['nuevoMotor']);
  }
  editar(motor:Motor):void{
    localStorage.setItem("id",motor.id.toString());
    this.router.navigate(['editarMotor']);
  }
  eliminar(motor:Motor):void{
    this.motorService.deleteMotor(motor).subscribe(data=>{
      this.motors=this.motors!.filter(p=>p!==motor);
    });
  }

}
