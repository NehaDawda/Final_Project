import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegistrationComponent } from './components/registration/registration.component';
import { LoginComponent } from './components/login/login.component';
import { LogoutComponent } from './components/logout/logout.component';
import { HomeComponent } from './components/home/home.component';
import { ProspectListComponent } from './components/prospect-list/prospect-list.component';
import { ProspectDetailsComponent } from './components/prospect-details/prospect-details.component';
import { ApproveloansComponent } from './components/approveloans/approveloans.component';


const appRoutes:Routes = [
  {path:'', component:HomeComponent},
  {path:'Home', component:HomeComponent},
  {path: 'registration', component:RegistrationComponent},
  {path: 'login', component:LoginComponent},
  {path: 'logout', component:LogoutComponent},
  {path: 'prospectlist', component:ProspectListComponent},
  {path: 'approveloans', component:ApproveloansComponent},
  {path: 'prospectdetails/:prospectId', component:ProspectDetailsComponent}
  
]

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
