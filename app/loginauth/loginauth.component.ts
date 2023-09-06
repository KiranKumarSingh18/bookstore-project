import { Component } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { AppService } from '../app.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-loginauth',
  templateUrl: './loginauth.component.html',
  styleUrls: ['./loginauth.component.css']
})
export class LoginauthComponent {
  constructor(private appService:AppService,
    private router: Router){}

  onsubmit(txt1: string, txt2: string, txt3: string, txt4: string, txt5: string, txt6: string){
    
    this.appService.onsubmitService(txt1, txt2, txt3, parseInt(txt4), txt5, txt6).subscribe((response)=>{
      
        this.router.navigate(['books']);
      alert("Successfully Registered")
    },
    (error)=>{
      console.log(error)
      alert("User Exist")
    })
  }

}
