import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { AppService } from '../app.service';
@Component({
  selector: 'app-showbooks',
  templateUrl: './showbooks.component.html',
  styleUrls: ['./showbooks.component.css']
})
export class ShowbooksComponent implements OnInit
{
  bookList:any[]=[];

  constructor(private appservice : AppService){}

  ngOnInit(): void
    {
        this.Appservice.getAllbookDetails().subscribe((data)=> this.bookList = data);
        console.log(this.bookList.length);

    }

    
}
 