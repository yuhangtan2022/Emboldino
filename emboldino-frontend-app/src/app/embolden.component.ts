import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AppService } from './app.service';
import { ArtWork } from './domain';

@Component({
  selector: 'app-embolden',
  templateUrl: './embolden.component.html',
  styleUrls: ['./embolden.component.css']
})
export class EmboldenComponent {

  artWork : ArtWork = new ArtWork();

  constructor(private _service : AppService, private router: Router) { }

  saveArtWork() {
    console.log("artWork", this.artWork);
    this._service.saveArtWork(this.artWork).subscribe(_=>{
      this.router.navigate(['/dashboard']);
    })
  }

}
