import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListarAutomovilComponent } from './componentes/automovil/listar-automovil/listar-automovil.component';
import { EditAutomovilComponent } from './componentes/automovil/edit-automovil/edit-automovil.component';
import { AddAutomovilComponent } from './componentes/automovil/add-automovil/add-automovil.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { ListarColorComponent } from './componentes/color/listar-color/listar-color.component';
import { ListarMarcaComponent } from './componentes/marca/listar-marca/listar-marca.component';
import { ListarMotorComponent } from './componentes/motor/listar-motor/listar-motor.component';
import { AddMotorComponent } from './componentes/motor/add-motor/add-motor.component';
import { EditMotorComponent } from './componentes/motor/edit-motor/edit-motor.component';
import { EditMarcaComponent } from './componentes/marca/edit-marca/edit-marca.component';
import { AddMarcaComponent } from './componentes/marca/add-marca/add-marca.component';
import { AddColorComponent } from './componentes/color/add-color/add-color.component';
import { EditColorComponent } from './componentes/color/edit-color/edit-color.component';

@NgModule({
  declarations: [
    AppComponent,
    ListarAutomovilComponent,
    EditAutomovilComponent,
    AddAutomovilComponent,
    ListarColorComponent,
    ListarMarcaComponent,
    ListarMotorComponent,
    AddMotorComponent,
    EditMotorComponent,
    EditMarcaComponent,
    AddMarcaComponent,
    AddColorComponent,
    EditColorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
