import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Marca } from 'src/app/modelos/Marca';
import { MarcaService } from 'src/app/servicio/marca.service';

@Component({
  selector: 'app-listar-marca',
  templateUrl: './listar-marca.component.html',
  styleUrls: ['./listar-marca.component.css']
})
export class ListarMarcaComponent implements OnInit {

  marcas?:Marca[];

  constructor(private marcaService:MarcaService,private router:Router) { }

  ngOnInit(): void {

    this.marcaService.getMarcas().subscribe(
      data=>{
        this.marcas=data;
        console.log(data);
      },
      error=>{
        console.log(error);
      }
    );
  }

  nuevo():void{
    this.router.navigate(['nuevoMarca']);
  }
  editar(marca:Marca):void{
    localStorage.setItem("id",marca.id.toString());
    this.router.navigate(['editarMarca']);
  }
  eliminar(marca:Marca):void{
    this.marcaService.deleteMarca(marca).subscribe(data=>{
      this.marcas=this.marcas!.filter(p=>p!==marca);
    });
  }

}
