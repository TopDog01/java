package Laptop;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var shop = new Shop<Computer>();
        var comp = new ArrayList<Computer>();
        addProduct(comp);
        shop.setComputersFromShop(comp);


        Map<String, String> sortStore = new HashMap<>();
        sortStore.put(String.valueOf(OS.Windows), String.valueOf(RAM.RAM_16GB));
        sortStore.put(String.valueOf(OS.linux), String.valueOf(Color.blue));

        var filteredTable = Filter.getFilteredComputersBy(sortStore, shop.getComputersFromShop());
        System.out.println(filteredTable);

        System.out.println(SortingList.sortByPrice(filteredTable));
    }

    static void addProduct(List<Computer> product){
        product.add(new Computer(
                CPU.i7,
                RAM.RAM_16GB,
                Disk.HDD_512GB,
                GPU.nvidia_RTX4060,
                OS.Windows11,
                Color.black,
                70000));
        product.add(new Computer(
                CPU.i5,
                RAM.RAM_8GB,
                Disk.HDD_256GB,
                GPU.nvidia_RTX4050,
                OS.Windows10PRO,
                Color.blue,
                75000));
        product.add(new Computer(
                CPU.i7,
                RAM.RAM_16GB,
                Disk.HDD_1TB,
                GPU.nvidia_RTX4070,
                OS.Windows11,
                Color.blue,
                100000));
        product.add(new Computer(
                CPU.i3,
                RAM.RAM_8GB,
                Disk.HDD_258GB,
                GPU.nvidia_GTX1030,
                OS.linux,
                Color.blue,
                50000));
    }
}