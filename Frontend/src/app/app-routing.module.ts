import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { EmployeeformComponent } from './employeeform/employeeform.component';
import { LoginComponent } from './login/login.component';
import { ManagerListComponent } from './manager-list/manager-list.component';
import { ManagerformComponent } from './managerform/managerform.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserformComponent } from './userform/userform.component';
import { WelcomeComponent } from './welcome/welcome.component';

const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: '', component: LoginComponent},
  { path: 'welcome', component: WelcomeComponent },
  { path: 'users', component: UserListComponent },
  { path: 'managers', component: ManagerListComponent },
  { path: 'employees', component: EmployeeListComponent },
  { path: 'adduser', component: UserformComponent },
  { path: 'addmanager', component: ManagerformComponent },
  { path: 'addemployee', component: EmployeeformComponent },
  { path: 'update/:id', component: UpdateEmployeeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
