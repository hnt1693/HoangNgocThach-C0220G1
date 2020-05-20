package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", productService.findAll());
        return "list";
    }

    @GetMapping("/product/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/product/save")
    public String save(Product product, RedirectAttributes redirectAttributes) {
        product.setId(ProductServiceImpl.count + 1);
        productService.addProduct(product);
        redirectAttributes.addFlashAttribute("mess", "Add Product Successfully");
        return "redirect:/list";
    }

    @GetMapping("/product/{id}/delete")
    public String delete(@PathVariable int id) {
        productService.deleteProduct(id);
        return "redirect:/list";
    }

    @GetMapping("/product/{id}/edit")
    public String editForm(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }

    @PostMapping("/product/update")
    public String update(Product product) {
        productService.updateProduct(product.getId(), product);
        return "redirect:/list";
    }
}
