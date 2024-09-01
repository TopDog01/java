package Laptop;

import java.util.List;

public interface IShop {
    List<E> getComputersFromShop();
    void setComputersFromShop(List<E> computers);
    void addComputerToShop(E product);
}
