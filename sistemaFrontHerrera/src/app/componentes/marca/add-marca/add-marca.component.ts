import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Marca } from 'src/app/modelos/Marca';
import { MarcaService } from 'src/app/servicio/marca.service';

@Component({
  selector: 'app-add-marca',
  templateUrl: './add-marca.component.html',
  styleUrls: ['./add-marca.component.css']
})
export class AddMarcaComponent implements OnInit {

  modelMarca=new Marca();

  constructor(private router:Router,private marcaService:MarcaService) { }

  ngOnInit(): void {
  }
  guardar(marca:Marca){
    this.marcaService.createMarca(marca).subscribe(data=>{
      console.log(data);
      this.router.navigate(['marcas']);
    });
  }

}
