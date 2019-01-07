import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegistrationComponent } from './components/registration/registration.component';
import { LoginComponent } from './components/login/login.component';
import { LogoutComponent } from './components/logout/logout.component';
import { HomeComponent } from './components/home/home.component';
import { ProspectListComponent } from './components/prospect-list/prospect-list.component';
import { ProspectDetailsComponent } from './components/prospect-details/prospect-details.component';


const appRoutes:Routes = [
  {path:'Home', component:HomeComponent},
  {path: 'registration/:pid', component:RegistrationComponent},
  {path: 'login', component:LoginComponent},
  {path: 'logout', component:LogoutComponent},
  {path: 'prospectlist', component:ProspectListComponent},
  {path: 'prospectdetails', component:ProspectDetailsComponent}
  
]

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
