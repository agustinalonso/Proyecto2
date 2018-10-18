package com.company;

import banco.CajaAhorro;
import banco.Cliente;
import banco.Cuenta;
import banco.CuentaCorriente;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        //List<CuentaCorriente> cuenta=new ArrayList<>();
        //List<Cliente> cliente=new ArrayList<>();
        //cliente.add(new Cliente("40.000.000","carlos","lopez"));
        //cuenta.add(new CuentaCorriente("1234",40000));
        Cliente cliente1=new Cliente("40.302.106","Agustin","Alonso");
        CajaAhorro ahorro=new CajaAhorro("13",400000);
        cliente1.addCuenta(ahorro);



        System.out.println(cliente1);





        //System.out.print(cliente);
        //System.out.println(cuenta);

    }
    }

