package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class WebShopController {

    private List<ShopItem> shopItemList = new ArrayList<>();

    public WebShopController() {
        this.shopItemList.add(new ShopItem("Running shoes","Nike running shoes for everyday sport", 15000, 5));
        this.shopItemList.add(new ShopItem("Printer","Basic HP printer", 8000, 0));
        this.shopItemList.add(new ShopItem("Coca cola","Sugary beverage", 280, 2));
        this.shopItemList.add(new ShopItem("Wok","A Wok for you to cook in", 8000, 10));
        this.shopItemList.add(new ShopItem("Shirt","T-shirt in different colors", 3000, 25));
        this.shopItemList.add(new ShopItem("Gaming mouse","Gaming mouse", 6500, 0));
    }

    @RequestMapping(value = "/webshop")
    public String getWebshop(Model model) {
        model.addAttribute("shopItems", shopItemList);
        return "webshop_template";
    }

    @RequestMapping(value = "/only-available")
    public String getOnlyAvailableItems(Model model) {
        List<ShopItem> availableItemsOnly = shopItemList.stream()
                .filter(i -> i.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
        model.addAttribute("shopItems", availableItemsOnly);
        return "webshop_template";
    }

    @RequestMapping(value = "/cheapest-first")
    public String orderByPriceAscending(Model model) {
        List<ShopItem> ascendingOrderByPrice = shopItemList.stream()
                .sorted()
                .collect(Collectors.toList());
        model.addAttribute("shopItems", ascendingOrderByPrice);
        return "webshop_template";
    }

    @RequestMapping(value = "/contains-nike")
    public String containsNike(Model model) {
        List<ShopItem> relatedToNike = shopItemList.stream()
                .filter(i -> i.getName().toLowerCase().contains("nike") || i.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
        model.addAttribute("shopItems", relatedToNike);
        return "webshop_template";
    }

    @RequestMapping(value = "/average-stock")
    public String averageOfStock(Model model) {
        String averageOfStock = "Average stock: " + shopItemList.stream()
                .mapToInt(ShopItem::getQuantityOfStock)
                .summaryStatistics().getAverage();
        model.addAttribute("singleItem", averageOfStock);
        return "single_element_template";
    }

    @RequestMapping(value = "/most-expensive")
    public String getMostExpensive(Model model) {
         Optional<ShopItem> mostExpensiveShopItem = shopItemList.stream()
                 .max(ShopItem::compareTo);

        mostExpensiveShopItem.ifPresent(shopItem -> model.addAttribute("singleItem", shopItem.getName()));
        return "single_element_template";
    }

    @RequestMapping(value = "/search", method= RequestMethod.POST)
    public String search(Model model, @RequestParam("keyword") String keyword) {

        List<ShopItem> matchingItemsList = shopItemList.stream()
                .filter(i -> i.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                        i.getDescription().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
        model.addAttribute("shopItems", matchingItemsList);

        return "webshop_template";
    }
}