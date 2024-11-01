package edu.icet.crm.controller.admin.productController;

import edu.icet.crm.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Slf4j
public class ProductController {


    @GetMapping("/admin/product/allitems")
    public String getAllStudents() {

        return "/admin/product/allitems";
    }

    @PostMapping("/admin/product/addItem")
    public Product addItems(@RequestBody Product product) {
        log.info(product.toString());
        return product;
    }
}
