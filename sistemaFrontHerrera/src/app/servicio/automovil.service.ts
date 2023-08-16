import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Automovil } from '../modelos/Automovil';
import { Color } from '../modelos/Color';
import { Marca } from '../modelos/Marca';
import { Motor } from '../modelos/Motor';

@Injectable({
  providedIn: 'root'
})
export class AutomovilService {

  constructor(private http:HttpClient) { }
  url='http://localhost:8080/api/automovils';
  urlMarcas='http://localhost:8080/api/marcas';
  urlMotors='http://localhost:8080/api/motors';
  urlColors='http://localhost:8080/api/colors';

  getAutomovils(){
    return this.http.get<Automovil[]>(this.url);
  }

  createAutomovil(automovil:Automovil){
    return this.http.post<Automovil>(this.url,automovil);
  }

  getAutomovilId(id:number){
    return this.http.get<Automovil>(this.url+"/"+id);
  }

  updateAutomovil(automovil:Automovil){
    return this.http.put<Automovil>(this.url,automovil);
  }

  deleteAutomovil(automovil:Automovil){
    return this.http.delete<Automovil>(this.url+"/"+automovil.id);
  }

  getMarcas(){
    return this.http.get<Marca[]>(this.urlMarcas);
  }

  getMotors(){
    return this.http.get<Motor[]>(this.urlMotors);
  }

  getColors(){
    return this.http.get<Color[]>(this.urlColors);
  }
}
