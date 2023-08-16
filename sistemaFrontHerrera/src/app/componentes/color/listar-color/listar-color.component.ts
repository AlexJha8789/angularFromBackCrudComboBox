import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Color } from 'src/app/modelos/Color';
import { ColorService } from 'src/app/servicio/color.service';

@Component({
  selector: 'app-listar-color',
  templateUrl: './listar-color.component.html',
  styleUrls: ['./listar-color.component.css']
})
export class ListarColorComponent implements OnInit {

  colors?:Color[];

  constructor(private colorService:ColorService,private router:Router) { }

  ngOnInit(): void {

    this.colorService.getColors().subscribe(
      data=>{
        this.colors=data;
        console.log(data);
      },
      error=>{
        console.log(error);
      }
    );
  }

  nuevo():void{
    this.router.navigate(['nuevoColor']);
  }
  editar(color:Color):void{
    localStorage.setItem("id",color.id.toString());
    this.router.navigate(['editarColor']);
  }
  eliminar(color:Color):void{
    this.colorService.deleteColor(color).subscribe(data=>{
      this.colors=this.colors!.filter(p=>p!==color);
    });
  }

}
