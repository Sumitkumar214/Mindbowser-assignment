import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthenticationService } from './services/authenticate-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'mb-assignment';
  isLoggedIn = false;
  constructor (private route: ActivatedRoute,
    private router: Router,
    private authenticationService: AuthenticationService){}

  ngOnInit(): void {
    this.isLoggedIn = this.authenticationService.isUserLoggedIn();
    
  }

  handleLogout() {
    this.authenticationService.logout();
    // this.router.navigate(['/login']);
  }
}


