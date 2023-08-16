import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Motor } from 'src/app/modelos/Motor';
import { MotorService } from 'src/app/servicio/motor.service';

@Component({
  selector: 'app-edit-motor',
  templateUrl: './edit-motor.component.html',
  styleUrls: ['./edit-motor.component.css']
})
export class EditMotorComponent implements OnInit {

  motor: Motor = new Motor();

  constructor(private router:Router, private motorService:MotorService) { }

  ngOnInit(): void {
    this.editar();
  }
  editar():void{
    let id= JSON.parse(localStorage.getItem('id') as string);
    this.motorService.getMotorId(id).subscribe(
      data=>{
         this.motor=data; 
      }
    )
}

actualizar(motor:Motor):void{
  this.motorService.updateMotor(motor).subscribe(
    data=>{
        this.motor=data;
        this.router.navigate(['motors']);
    }
  );
}

}
