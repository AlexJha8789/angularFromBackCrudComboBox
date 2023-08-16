import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Motor } from '../modelos/Motor';

@Injectable({
  providedIn: 'root'
})
export class MotorService {

  constructor(private http:HttpClient) { }
  url='http://localhost:8080/api/motors';

  getMotors(){
    return this.http.get<Motor[]>(this.url);
  }

  createMotor(motor:Motor){
    return this.http.post<Motor>(this.url,motor);
  }

  getMotorId(id:number){
    return this.http.get<Motor>(this.url+"/"+id);
  }

  updateMotor(motor:Motor){
    return this.http.put<Motor>(this.url,motor);
  }

  deleteMotor(motor:Motor){
    return this.http.delete<Motor>(this.url+"/"+motor.id);
  }
}
