package com.marzenap.tests;

import com.marzenap.pages.PageCategoriesPanel;
import org.testng.annotations.Test;

public class AddToBasketTest extends BaseTest{



    @Test
    public void addProductToBasketTest(){
        new PageCategoriesPanel(driver)
                .goToWomensJackets()
                .selectColorFilterTab()
                .selectBlueFilter()
                .goToProductPage()
                .selectSizeM()
                .selectColorBlue()
                .addToCart()
                .checkMessage();
    }
}
