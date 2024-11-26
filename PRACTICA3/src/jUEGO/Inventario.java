package jUEGO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
class Inventario {
 private List<String> items;

 public Inventario() {
     this.items = new ArrayList<>();
 }

 public void agregarItem(String item) {
     items.add(item);
     System.out.println(item + " ha sido añadido al inventario.");
 }

 public void mostrarItems() {
     System.out.println("Items en el inventario: " + items);
 }
}