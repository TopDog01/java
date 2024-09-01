package Laptop;

import java.util.ArrayList;
import java.util.List;



public class Shop<E> implements IShop<E> {
    private List<E> product = new ArrayList<>();

    @Override
    public List<E> getComputersFromShop() {
        return this.product;
        }

    @Override
    public void setComputersFromShop(List<E> computers) {
        this.product.addAll(product);
        for(var item : product){
            this.setComputersFromShop((List<E>) item);
        }
    }
    @Override
    public void addProduct(E product) {
        this.product.add(product);
    }
}
