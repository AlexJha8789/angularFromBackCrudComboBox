import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Marca } from 'src/app/modelos/Marca';
import { MarcaService } from 'src/app/servicio/marca.service';

@Component({
  selector: 'app-edit-marca',
  templateUrl: './edit-marca.component.html',
  styleUrls: ['./edit-marca.component.css']
})
export class EditMarcaComponent implements OnInit {

  marca: Marca = new Marca();

  constructor(private router:Router, private marcaService:MarcaService) { }

  ngOnInit(): void {
    this.editar();
  }
  editar():void{
    let id= JSON.parse(localStorage.getItem('id') as string);
    this.marcaService.getMarcaId(id).subscribe(
      data=>{
         this.marca=data; 
      }
    )
}

actualizar(marca:Marca):void{
  this.marcaService.updateMarca(marca).subscribe(
    data=>{
        this.marca=data;
        this.router.navigate(['marcas']);
    }
  );
}

}
