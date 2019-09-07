package edu.vmsoft.tests;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
    private String name;
    private int[] shoppingCart;
}