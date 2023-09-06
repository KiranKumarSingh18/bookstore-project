import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginauthComponent } from './loginauth/loginauth.component';
import { LoginauthModule } from './loginauth/loginauth.module';
import { FormsModule } from '@angular/forms';
import { AppService } from './app.service';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './login/login.component';
import { LoginModule } from './login/login.module';
import { ShowbooksComponent } from './showbooks/showbooks.component';
import { ShowbooksService } from './showbooks.service';
import { ShowbooksModule } from './showbooks/showbooks.module';

@NgModule({
  declarations: [
    AppComponent,
    // LoginComponent,
    // LoginauthComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    LoginauthModule,
    FormsModule,
    HttpClientModule,
    LoginModule,
    ShowbooksModule
  ],
  providers: [AppService],
  bootstrap: [AppComponent]
})
export class AppModule { }
