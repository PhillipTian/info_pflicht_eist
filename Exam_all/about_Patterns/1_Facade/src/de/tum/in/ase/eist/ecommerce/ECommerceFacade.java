package de.tum.in.ase.eist.ecommerce;

public class ECommerceFacade {
    private AdvertisementController advertisementController;
    private ShippingController shippingController;
    private OrderController orderController;

    public void shipOrder(Order order, String address){
        order.setShipping(shippingController.createShipping(address));
        shippingController.shipOrder(order);
    }


    public void processOrder(Order order){
        orderController.processOrder(order);
    }
    public void processOrder(Order order, String str){
        orderController.processOrder(order,str);
    }
    public Order retrieveLatestOrder(int id){
        return orderController.retrieveLatestOrder(id);
    }

    public void playAdvertisement(int i){
        advertisementController.playAdvertisement(i);
    }

}


