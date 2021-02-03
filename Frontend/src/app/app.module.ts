import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserformComponent } from './userform/userform.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { UserServiceService } from './services/user-service.service';
import { ManagerformComponent } from './managerform/managerform.component';
import { ManagerListComponent } from './manager-list/manager-list.component';
import { EmployeeformComponent } from './employeeform/employeeform.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';

import { WelcomeComponent } from './welcome/welcome.component';
import { LoginComponent } from './login/login.component';
import { HttpInterceptorService } from './services/http-interceptor.service';
import { LogoutComponent } from './logout/logout.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserformComponent,
    ManagerformComponent,
    ManagerListComponent,
    EmployeeformComponent,
    EmployeeListComponent,
    WelcomeComponent,
    LoginComponent,
    LogoutComponent,
    UpdateEmployeeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
    

  ],
  providers: [UserServiceService,{
    provide: HTTP_INTERCEPTORS,
      useClass: HttpInterceptorService,
      multi: true
  }],
  bootstrap: [AppComponent]
})
export class AppModule { }
