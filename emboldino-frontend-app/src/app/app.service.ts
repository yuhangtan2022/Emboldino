import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {ArtWork, ART_WORKS} from './domain';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  private backendUrl = "http://localhost:8080/artworks/";

  constructor(private http: HttpClient) { }

  getAllArtWorks() : Observable<ArtWork[]> {
    // return ART_WORKS; 
    console.log("send request");
    return this.http.get<ArtWork[]>(this.backendUrl)
  }
}
