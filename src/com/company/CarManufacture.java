package com.company;

public class CarManufacture {

 public static Vehicle getVehicle(int intro){

      return switch (intro) {
           case 1 ->
                   new BMW();
           case 2 ->
                   new VW();
           case 3->
               new PORSCHE();
           default ->
               throw new RuntimeException("Wrong car!! Choose another one");
       };
    }
}
