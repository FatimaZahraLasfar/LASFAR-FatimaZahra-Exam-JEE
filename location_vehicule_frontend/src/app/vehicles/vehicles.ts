import { Component, OnInit } from '@angular/core';
import { VehicleService } from '../../app/services.spec';
import { Vehicle } from '../../app/models/models';

@Component({
  selector: 'app-vehicle-list',
  template: `
    <h2>Vehicles</h2>

    <table class="table table-bordered">
      <thead>
        <tr>
          <th>ID</th>
          <th>Marque</th>
          <th>Modele</th>
          <th>Matricule</th>
          <th>Prix/Jour</th>
          <th>Statut</th>
        </tr>
      </thead>

      <tbody>
        <tr *ngFor="let vehicle of vehicles">
          <td>{{ vehicle.id }}</td>
          <td>{{ vehicle.marque }}</td>
          <td>{{ vehicle.modele }}</td>
          <td>{{ vehicle.matricule }}</td>
          <td>{{ vehicle.prixParJour }}</td>
          <td>{{ vehicle.statut }}</td>
        </tr>
      </tbody>
    </table>
  `,
})
export class VehicleListComponent implements OnInit {
  vehicles: Vehicle[] = [];

  constructor(private vehicleService: VehicleService) {}

  ngOnInit(): void {
    this.vehicleService.getVehicles().subscribe((data) => {
      this.vehicles = data;
    });
  }
}
