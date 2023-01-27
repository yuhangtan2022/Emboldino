import { Component, OnInit } from '@angular/core';
import {AppService} from "./app.service";
import {ArtWork, ART_WORKS} from './domain';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  title = 'Emboldino App';
  artWorks : ArtWork[] = [];
  showEmbark = false;
  currentArtWork : ArtWork | undefined;

  constructor(private _service : AppService) {}

  ngOnInit(): void {
    this._service.getAllArtWorks().subscribe(artWorks => this.artWorks = artWorks);
  }

  deleteArtWork(id : number) : void {
    this.artWorks = this.artWorks.filter(aw => aw.id != id);
  } 

  showEmbarkPage(): void {
    this.showEmbark = true;
  }

  showPaint(artWorkId : number) : void {
    console.log("artWork.id", artWorkId);
    this.currentArtWork = this.artWorks.filter(artWork => artWork.id === artWorkId)[0];
  }
}
