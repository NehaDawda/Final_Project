import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { LoginComponent } from './components/login/login.component';
import { LogoutComponent } from './components/logout/logout.component';
import { HomeComponent } from './components/home/home.component';
import { HttpServiceComponent } from './http-service/http-service.component';
import { ProspectDetailsComponent } from './prospect-details/prospect-details.component';
import { ProspectdetailsComponent } from './components/prospectdetails/prospectdetails.component';
import { ProspectListComponent } from './components/prospect-list/prospect-list.component';

@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    LoginComponent,
    LogoutComponent,
    HomeComponent,
    HttpServiceComponent,
    ProspectDetailsComponent,
    ProspectdetailsComponent,
    ProspectListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
