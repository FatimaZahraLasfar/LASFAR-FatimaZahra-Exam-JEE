
import { Component } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  template: `
    <div class="card p-4">
      <h2>Dashboard</h2>
      <p>Welcome to the Vehicle Rental System.</p>
      <a routerLink="/vehicles" class="btn btn-primary">Manage Vehicles</a>
    </div>
  `
})
export class DashboardComponent {}
