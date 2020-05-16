package vn.edu.ntu.truonghoangkhoa.controller;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import vn.edu.ntu.truonghoangkhoa.controller.ICartController;
import vn.edu.ntu.truonghoangkhoa.model.Product;

public class CartController extends Application implements ICartController
{
    List<Product> listProducts = new ArrayList<>();

    public CartController()
    {
        listProducts.add(new Product("khoai lang",2500, "Khoai lang theo tieu chuan VietGap"));
        listProducts.add(new Product("khoai so",3500, "Khoai so trong tai nh"));
        listProducts.add(new Product("khoai tim",4500, "Khoai tim mau tim"));
        listProducts.add(new Product("sau rieng",90500, "Sau rieng ngon vl"));
        listProducts.add(new Product("buoi nam roi",90500, "buoi to vl"));
        listProducts.add(new Product("buoi canong",90500, "buoi to vl luon"));
        listProducts.add(new Product("buoi canong",90500, "buoi to vl luon"));
        listProducts.add(new Product("buoi canong",90500, "buoi to vl luon"));
        listProducts.add(new Product("buoi canong",90500, "buoi to vl luon"));
        listProducts.add(new Product("buoi canong",90500, "buoi to vl luon"));
        listProducts.add(new Product("buoi canong",90500, "buoi to vl luon"));
        listProducts.add(new Product("buoi canong",90500, "buoi to vl luon"));
        listProducts.add(new Product("buoi canong",90500, "buoi to vl luon"));
        listProducts.add(new Product("buoi canong",90500, "buoi to vl luon"));
        listProducts.add(new Product("buoi canong",90500, "buoi to vl luon"));
        listProducts.add(new Product("buoi canong",90500, "buoi to vl luon"));
        listProducts.add(new Product("buoi canong",90500, "buoi to vl luon"));
    }



    @Override

    public List<Product> getAllProduct() {
        return listProducts;
    }
}
