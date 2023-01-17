import { Component, OnInit } from '@angular/core';
import {AppService} from "./app.service";
import {ArtWork, ART_WORKS} from './domain';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'Emboldino App';
  artWorks : ArtWork[] = [];

  constructor(private _service : AppService) {}

  ngOnInit(): void {
    this._service.getAllArtWorks().subscribe(artWorks => this.artWorks = artWorks);
  }

  deleteArtWork(id : number) : void {
    this.artWorks = this.artWorks.filter(aw => aw.id != id);
  } 
}
