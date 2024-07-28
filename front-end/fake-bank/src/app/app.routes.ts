import { Routes } from '@angular/router';
import { SignInComponent } from './external/sign-in/sign-in.component';
import { SignUpComponent } from './external/sign-up/sign-up.component';

export const routes: Routes = [
    { path: 'signin', component: SignInComponent },
    { path: 'signup', component: SignUpComponent },
];
