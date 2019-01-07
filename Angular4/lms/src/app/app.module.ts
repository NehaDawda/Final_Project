import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { LoginComponent } from './components/login/login.component';
import { LogoutComponent } from './components/logout/logout.component';
import { HomeComponent } from './components/home/home.component';

import { ProspectDetailsComponent } from './components/prospect-details/prospect-details.component';

import { ProspectListComponent } from './components/prospect-list/prospect-list.component';

const appRoutes:Routes = [
  {path:'home', component:HomeComponent},
  {path: 'employeeslist', component:RegistrationComponent},
  {path: 'employeeslist', component:ProspectListComponent},
  {path: 'employees', component:ProspectDetailsComponent},
  {path:'', redirectTo:'/home', pathMatch:'full'}
  
]

@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    LoginComponent,
    LogoutComponent,
    HomeComponent,
    ProspectDetailsComponent,
    ProspectListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
