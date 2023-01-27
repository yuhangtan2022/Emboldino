import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {ArtWork, ART_WORKS} from './domain';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  private backendUrl = "http://localhost:8080/artworks/";

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) { }

  getAllArtWorks() : Observable<ArtWork[]> {
    // return ART_WORKS; 
    console.log("send request");
    return this.http.get<ArtWork[]>(this.backendUrl)
  }

  saveArtWork(artWork : ArtWork) : Observable<any> {
    artWork.id = 0;
    console.log("http - artWork", artWork);
    return this.http.post<ArtWork>(this.backendUrl, artWork, this.httpOptions);
  }
}
