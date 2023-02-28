import { HttpClient} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Onibus } from '../onibus';

@Injectable({
  providedIn: 'root'
})
export class OnibusService {

  constructor(private http: HttpClient) { }

  getOnibus(): Observable<Onibus[]> {
    return this.http.get<Onibus[]>('http://localhost:8092/services');
  }
}
