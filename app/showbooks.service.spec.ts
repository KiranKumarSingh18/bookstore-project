import { TestBed } from '@angular/core/testing';

import { ShowbooksService } from './showbooks.service';

describe('ShowbooksService', () => {
  let service: ShowbooksService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ShowbooksService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
