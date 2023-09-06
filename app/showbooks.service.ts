import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class ShowbooksService {

  constructor(private httpClient:HttpClient) { }

    public getAllbookDetails() : Observable<any>
    {
        return this.httpClient.get('http://localhost:8083/book');
    }
}
