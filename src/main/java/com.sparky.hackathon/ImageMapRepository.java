package com.sparky.hackathon;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin()
@RepositoryRestResource(collectionResourceRel = "imagemaps", path = "imagemaps")
public interface ImageMapRepository extends CrudRepository<ImageMap, Long> {  }
