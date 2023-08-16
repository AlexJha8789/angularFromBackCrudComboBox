import { Color } from "./Color";
import { Marca } from "./Marca";
import { Motor } from "./Motor";

export class Automovil{
   id:number;
   marca!:Marca;
   motor!:Motor;
   color!:Color;
   anioFabricacion:number;
   cilindrada:number;
   numPuertas:number;
   precio:number;

   constructor(){
    this.id=0;
    this.anioFabricacion=0;
    this.cilindrada=0;
    this.numPuertas=0;
    this.precio=0;
   }
}