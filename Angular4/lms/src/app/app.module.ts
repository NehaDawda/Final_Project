import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { LoginComponent } from './components/login/login.component';
import { LogoutComponent } from './components/logout/logout.component';
import { HomeComponent } from './components/home/home.component';
import { ProspectDetailsComponent } from './components/prospect-details/prospect-details.component';
import { ProspectListComponent } from './components/prospect-list/prospect-list.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { ApproveloansComponent } from './components/approveloans/approveloans.component';

const appRoutes:Routes = [
  {path:'Home', component:HomeComponent},
  {path: 'registration', component:RegistrationComponent},
  {path: 'login', component:LoginComponent},
  {path: 'logout', component:LogoutComponent}
  
]

@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    LoginComponent,
    LogoutComponent,
    HomeComponent,
    ProspectDetailsComponent,
    ProspectListComponent,
    ApproveloansComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
