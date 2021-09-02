import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { Customer } from 'src/app/model/customer';
import { CustomerService } from 'src/app/service/customer.service';



@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  public displayedColumns = ['position', 'name', 'lastname', 'DNI'];
  public dataSource: MatTableDataSource<Customer>;
  public customerList: Customer[] = [];

  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
    this.readAll();
  }

  readAll(): void {
    let request = this.customerService.readAll();
    request.subscribe( data => {
      console.log(data);
      this.dataSource = new MatTableDataSource(data);
    });
  }

}
