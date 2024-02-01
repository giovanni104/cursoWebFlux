package com.pyt.springboot.webflux.models.dao;


import com.pyt.springboot.webflux.models.documents.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;



public interface ProductoDao extends ReactiveMongoRepository<Producto, String>{

}
