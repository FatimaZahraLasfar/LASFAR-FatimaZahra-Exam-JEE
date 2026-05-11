
import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  template: `
    <div class="card p-4">
      <h2>Login</h2>

      <form>
        <div class="mb-3">
          <label>Email</label>
          <input type="email" class="form-control">
        </div>

        <div class="mb-3">
          <label>Password</label>
          <input type="password" class="form-control">
        </div>

        <button class="btn btn-success">Login</button>
      </form>
    </div>
  `
})
export class login {}
