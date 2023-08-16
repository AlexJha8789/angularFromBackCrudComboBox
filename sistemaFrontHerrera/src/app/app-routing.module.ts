import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddAutomovilComponent } from './componentes/automovil/add-automovil/add-automovil.component';
import { EditAutomovilComponent } from './componentes/automovil/edit-automovil/edit-automovil.component';
import { ListarAutomovilComponent } from './componentes/automovil/listar-automovil/listar-automovil.component';

import { AddColorComponent } from './componentes/color/add-color/add-color.component';
import { EditColorComponent } from './componentes/color/edit-color/edit-color.component';
import { ListarColorComponent } from './componentes/color/listar-color/listar-color.component';
import { AddMarcaComponent } from './componentes/marca/add-marca/add-marca.component';
import { EditMarcaComponent } from './componentes/marca/edit-marca/edit-marca.component';
import { ListarMarcaComponent } from './componentes/marca/listar-marca/listar-marca.component';
import { AddMotorComponent } from './componentes/motor/add-motor/add-motor.component';
import { EditMotorComponent } from './componentes/motor/edit-motor/edit-motor.component';
import { ListarMotorComponent } from './componentes/motor/listar-motor/listar-motor.component';

const routes: Routes = [
  {path:'automovils',component:ListarAutomovilComponent},
  {path:'nuevoAutomovil',component:AddAutomovilComponent},
  {path:'editarAutomovil',component:EditAutomovilComponent},
  {path:'colors',component:ListarColorComponent},
  {path:'nuevoColor',component:AddColorComponent},
  {path:'editarColor',component:EditColorComponent},
  {path:'marcas',component:ListarMarcaComponent},
  {path:'nuevoMarca',component:AddMarcaComponent},
  {path:'editarMarca',component:EditMarcaComponent},
  {path:'motors',component:ListarMotorComponent},
  {path:'nuevoMotor',component:AddMotorComponent},
  {path:'editarMotor',component:EditMotorComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
