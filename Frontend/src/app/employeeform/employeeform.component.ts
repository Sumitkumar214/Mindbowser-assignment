import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../model/employee';
import { EmployeeServiceService } from '../services/employee-service.service';

@Component({
  selector: 'app-employeeform',
  templateUrl: './employeeform.component.html',
  styleUrls: ['./employeeform.component.css']
})
export class EmployeeformComponent implements OnInit {
  
  employee : Employee ;
  submitted = false;
  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private employeeService: EmployeeServiceService) {
    this.employee = new Employee();
  }


  ngOnInit(): void {
  }

  onSubmit() {
    this.submitted = true;
    this.employeeService.save(this.employee).subscribe(result => this.gotoEmployeeList());
  }

  gotoEmployeeList() {
    this.router.navigate(['/employees']);
  }
}
