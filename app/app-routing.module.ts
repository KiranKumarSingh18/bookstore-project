import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ShowbooksComponent } from './showbooks/showbooks.component';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path:"",redirectTo:"login",pathMatch:"full"},
  {path:"books",component:ShowbooksComponent},
  {path:"register",component:RegistrationComponent},
  {path:"login",component:LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
