import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { AppService } from '../app.service';
import { ShowbooksService } from '../showbooks.service'; 
@Component({
  selector: 'app-showbooks',
  templateUrl: './showbooks.component.html',
  styleUrls: ['./showbooks.component.css']
})
export class ShowbooksComponent implements OnInit
{
  books:any[]=[];

  constructor(private showbookservice : ShowbooksService){}

  ngOnInit(): void
    {
        this.showbookservice.getAllbookDetails().subscribe((data)=> this.books = data);
        console.log(this.books)
    }

}
 