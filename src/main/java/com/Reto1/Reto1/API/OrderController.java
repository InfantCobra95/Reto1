package com.Reto1.Reto1.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.Reto1.Reto1.Model.Order;
import com.Reto1.Reto1.Model.OrderProduct;
import com.Reto1.Reto1.Model.OrderProductInfo;
import com.Reto1.Reto1.Model.Product;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private ProductController pc = new ProductController();

	private static ArrayList<Order> orders = new ArrayList<>(Arrays.asList(
        new Order(1, "25/10/2020", "25000", "En Curso"),
        new Order(2, "1/1/1988", "20000", "Aceptado")
    ));

    private static ArrayList<OrderProduct> orderProducts = new ArrayList<>(Arrays.asList(
        new OrderProduct(1, 1, 1, 1),
        new OrderProduct(2, 2, 2, 2),
        new OrderProduct(3, 2, 1, 5)
     ));

    private static ArrayList<OrderProductInfo> orderProductInfos= new ArrayList<>();

    @GetMapping("/order")
    public ArrayList<Order> getOrders(){
        return orders;
    }
    

    @GetMapping("/orderProduct")
     public ArrayList<OrderProductInfo> getOrderProducts(){
        orderProductInfos.clear();
         for(int i = 0; i < orderProducts.size(); i++){        
                for (int j = 0; j < pc.products.size(); j++) {
                    if ( orderProducts.get(i).getIdProduct() == pc.products.get(j).getIdProduct() ) {
                        OrderProductInfo opi = new OrderProductInfo(orderProducts.get(i).getIdOrderProduct(), orderProducts.get(i).getIdOrder(), pc.products.get(j).getName(), orderProducts.get(i).getQuantity());
                        orderProductInfos.add(opi);
                    }
                }
         };  
                
         return orderProductInfos;
     }

     @PostMapping("/orderProduct")
    public OrderProduct postOrderProduct(@RequestBody OrderProduct oc){
        orderProducts.add(oc);  
        System.out.println(oc.getIdOrderProduct());
        return oc;
    }

    @PostMapping("/order")
    public Order postOrder(@RequestBody Order order){
        orders.add(order);
        return order;
        
    }
    
    @DeleteMapping("/order/{id}")
    public void deleteOrder(@PathVariable("id") int id){
        for(int i = 0; i < orders.size(); i++){
            if (orders.get(i).getIdOrder() == id) {
                orders.remove(i);
            }
        }

        for(int j = (orderProducts.size()-1); j >= 0; j--){
            if(orderProducts.get(j).getIdOrder() == id){
                orderProducts.remove(j);
            }
        }
        throw new ErrorException();
    }

    @PutMapping("/orderProduct/{id}")
    public OrderProduct updateOrderProduct(@RequestBody OrderProduct op, @PathVariable("id") int id){
        for(int i = 0; i < orderProducts.size(); i++){
            if (orderProducts.get(i).getIdOrderProduct() == id) {
                if(op.getIdOrder() > 0){
                    orderProducts.get(i).setIdOrder(op.getIdOrder());
                }

                if(op.getIdProduct() > 0){
                    orderProducts.get(i).setIdProduct(op.getIdProduct());
                }

                if(op.getQuantity() > 0){
                    orderProducts.get(i).setQuantity(op.getQuantity());
                }
                
                return op;
            }
        }
        return op;
    }

}
