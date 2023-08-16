import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Color } from 'src/app/modelos/Color';
import { ColorService } from 'src/app/servicio/color.service';

@Component({
  selector: 'app-edit-color',
  templateUrl: './edit-color.component.html',
  styleUrls: ['./edit-color.component.css']
})
export class EditColorComponent implements OnInit {

  color: Color = new Color();

  constructor(private router:Router, private colorService:ColorService) { }

  ngOnInit(): void {
    this.editar();
  }
  editar():void{
    let id= JSON.parse(localStorage.getItem('id') as string);
    this.colorService.getColorId(id).subscribe(
      data=>{
         this.color=data; 
      }
    )
}

actualizar(color:Color):void{
  this.colorService.updateColor(color).subscribe(
    data=>{
        this.color=data;
        this.router.navigate(['colors']);
    }
  );
}

}
