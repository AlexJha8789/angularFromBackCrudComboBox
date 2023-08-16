import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Color } from 'src/app/modelos/Color';
import { ColorService } from 'src/app/servicio/color.service';

@Component({
  selector: 'app-add-color',
  templateUrl: './add-color.component.html',
  styleUrls: ['./add-color.component.css']
})
export class AddColorComponent implements OnInit {

  modelColor=new Color();

  constructor(private router:Router,private colorService:ColorService) { }

  ngOnInit(): void {
  }
  guardar(color:Color){
    this.colorService.createColor(color).subscribe(data=>{
      console.log(data);
      this.router.navigate(['colors']);
    });
  }

}
