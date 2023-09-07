import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { RouterModule } from "@angular/router";
import { FormsModule } from '@angular/forms';
import { ShowbooksComponent } from "./showbooks.component";
import { BooksService } from "../books.service";


@NgModule({

    declarations:[ShowbooksComponent],
    imports:[ CommonModule, RouterModule,FormsModule],
    exports:[ShowbooksComponent],
    providers:[BooksService]

})

export class ShowbooksModule
{


}