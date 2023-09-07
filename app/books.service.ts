import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class BooksService {

  constructor(private httpClient:HttpClient) { }

    public getAllbookDetails(con:string) : Observable<any>
    {
        return this.httpClient.get('http://localhost:8086/book'+con);
    }

    public addToCart(id:number,price:number):Observable<any>{

      // return sessionStorage.getItem('email');
      const url="http://localhost:8086/cart/";
      const data = {
        "price": price,
        "bookId": {
          "bookID": id
        }
        
      };
  
      return this.httpClient.post(url,data);
    }
    
}
