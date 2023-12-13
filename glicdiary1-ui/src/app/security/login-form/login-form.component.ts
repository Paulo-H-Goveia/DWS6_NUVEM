import { Component } from '@angular/core';
import { Title } from '@angular/platform-browser';
import { ActivatedRoute, Router } from '@angular/router';

import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent {

  msg: any;

  constructor(
    private auth: AuthService,
    private route: ActivatedRoute,
    private router: Router,
    private title: Title) {
  }

  ngOnInit(): void {
    this.title.setTitle('Login de Usuário');
  }

  login(user: string, password: string) {
    this.auth.login(user, password)
    .then(() => {
      this.router.navigate(['/measures']);
    })
    .catch(() => {
      this.msg = 'Usuário e/ou senha inválida!';
    });
  }

}
