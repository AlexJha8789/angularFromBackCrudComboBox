import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Motor } from 'src/app/modelos/Motor';
import { MotorService } from 'src/app/servicio/motor.service';

@Component({
  selector: 'app-add-motor',
  templateUrl: './add-motor.component.html',
  styleUrls: ['./add-motor.component.css']
})
export class AddMotorComponent implements OnInit {

  modelMotor=new Motor();

  constructor(private router:Router,private motorService:MotorService) { }

  ngOnInit(): void {
  }
  guardar(motor:Motor){
    this.motorService.createMotor(motor).subscribe(data=>{
      console.log(data);
      this.router.navigate(['motors']);
    });
  }

}
