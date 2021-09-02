import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Customer } from '../model/customer';
import { Observable } from 'rxjs';
import { CustomerCreate } from '../model/customer-create';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private url: string = `${environment.HOST}/customers`;

  constructor(private http: HttpClient) { }

  readAll(): Observable<Customer[]> {

    return this.http.get<Customer[]>(this.url);

  }

  create(customerCreate: CustomerCreate): Observable<{}> {

    return this.http.post(this.url, customerCreate);

  }

}
