/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ist440.springmvc.repositories;

import edu.ist440.springmvc.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gramos855
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByProdName(final String prodName);

}
