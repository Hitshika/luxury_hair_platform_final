package za.ac.cput.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.services.IProductService;
import za.ac.cput.services.ProductService;


@Component
public class ProductApi {

    private ProductService service;

    private IProductService iProductService;

    @Autowired
    ProductApi(ProductService service, IProductService iProductService){
        this.service = service;
        this.iProductService = iProductService;
    }



}
