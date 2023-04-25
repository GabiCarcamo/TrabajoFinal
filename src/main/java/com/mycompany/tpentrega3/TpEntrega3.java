/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpentrega3;

/**
 *
 * @author Gabrieña Carcamo
 */
public class TpEntrega3 {

   public static PronosticoDeportivo PRODE;
    public static ListaEquipos LISTAEQUIPOS; 
    public static ListaParticipantes PRODE3;
    public static ListaPronosticos PRODE4;
    public static ListaPartidos LISTAPARTIDOS;
    
    public static void main(String[] args) {
        System.out.println ("Sistema de simulación de pronósticos deportivos.");
        System.out.println ("Ejecutándose desde:"+System.getProperty("user.dir"));
        
        PRODE = new PronosticoDeportivo();
  //      LISTAEQUIPOS = new ListaEquipos();
  //      PRODE3 = new ListaParticipantes();
  //      PRODE4 = new ListaPronosticos();
  //      LISTAPARTIDOS = new ListaPartidos();
        //     System.out.println ("cargando ARCHIVO Lista Equipos");
        //     LISTAEQUIPOS.cargarDeArchivo();
        //      LISTAEQUIPOS.cargarDeBD();
        //      LISTAPARTIDOS.cargarDeArchivo(LISTAEQUIPOS);
        //      System.out.println ("Mostranbdo Lista");
        //      System.out.println(LISTAEQUIPOS.listar());
        //       System.out.println ("cargando ARCHIVO Lista Participantes");
        //      PRODE3.cargarDeArchivo();
        //      System.out.println ("Mostranbdo Lista Participantes");
        //      System.out.println(PRODE3.listar());
        //      System.out.println ("cargando ARCHIVO Lista Participantes");
        //     PRODE4.cargarDeArchivo();
        //      System.out.println ("Mostranbdo Lista Participantes");
        //     System.out.println(PRODE4.listar());
        
        
        PRODE.play();
    }

    }

