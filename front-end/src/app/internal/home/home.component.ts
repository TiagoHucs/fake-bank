import { Component, OnInit } from '@angular/core';
import { HomeService } from './home.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {

  resource: any;

  constructor(private service: HomeService){}

  ngOnInit(): void {
    this.service.getHome().subscribe(res => {
        this.resource = res;
    })
  }





}
