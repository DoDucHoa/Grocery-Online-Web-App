package com.hoadd.onlinemarket.controller;

import com.hoadd.onlinemarket.entities.Category;
import com.hoadd.onlinemarket.entities.Product;
import com.hoadd.onlinemarket.entities.User;
import com.hoadd.onlinemarket.services.CategoryService;
import com.hoadd.onlinemarket.services.ProductService;
import com.hoadd.onlinemarket.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class AppController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Category> categoryList = categoryService.listAll();
        model.addAttribute("categoryList", categoryList);
        model.addAttribute("user", new User());
        return "index";
    }

    @RequestMapping("/process_register")
    public String createUser(User user) {
        userService.save(user);
        return "redirect:/";
    }

    @RequestMapping("/login")
    public String showManagerPage(Model model) {
        List<Product> productList = productService.listAll();
        model.addAttribute("productList", productList);
        return "manager_product";
    }

    @RequestMapping("/category_manage")
    public String showCategoryManagePage(Model model) {
        List<Category> categoryList = categoryService.listAll();
        model.addAttribute("categoryList", categoryList);
        return "manager_category";
    }

    @RequestMapping("/create_product")
    public String showCreateProductPage(Model model) {
        model.addAttribute("product", new Product());
        return "manager_product_create";
    }

    @RequestMapping("/edit_web")
    public String showEditWebPage(Model model) {
        return "manager_web_page";
    }

    @RequestMapping("/quick_view")
    public String showQuickViewPage(Model model) {
        return "single";
    }
}
