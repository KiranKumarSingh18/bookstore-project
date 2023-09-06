import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { RouterModule } from "@angular/router";
import { LoginauthComponent } from "./loginauth.component";
import { FormsModule } from '@angular/forms';

@NgModule({

    declarations:[LoginauthComponent],
    imports:[ CommonModule, RouterModule,FormsModule],
    exports:[LoginauthComponent],
    providers:[]

})

export class LoginauthModule
{

}