import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Color } from '../modelos/Color';

@Injectable({
  providedIn: 'root'
})
export class ColorService {

  constructor(private http:HttpClient) { }
  url='http://localhost:8080/api/colors';

  getColors(){
    return this.http.get<Color[]>(this.url);
  }

  createColor(color:Color){
    return this.http.post<Color>(this.url,color);
  }

  getColorId(id:number){
    return this.http.get<Color>(this.url+"/"+id);
  }

  updateColor(color:Color){
    return this.http.put<Color>(this.url,color);
  }

  deleteColor(color:Color){
    return this.http.delete<Color>(this.url+"/"+color.id);
  }
}
