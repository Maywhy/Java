import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { NovoCadastroComponent } from './novo-cadastro/novo-cadastro.component';
import { ListagemComponent } from './listagem/listagem.component';


const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'novocadastro', component: NovoCadastroComponent },
  { path: 'listagem', component: ListagemComponent } 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
