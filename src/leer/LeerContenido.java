/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ricky_000
 */
public class LeerContenido {
        File fichero;
      //  FileReader lectura;    
      //  BufferedReader contenido;
        Scanner s;
    public void mostrarContenido(String archivo) throws IOException{
      //  String aqui;
        try{
            fichero = new File(archivo);
       //     lectura = new FileReader(fichero);
       //     contenido = new BufferedReader(lectura);
            s = new Scanner(fichero);
       //     aqui = contenido.readLine();
            System.out.println(s.nextLine());
       //     System.out.println(aqui);
        }catch(FileNotFoundException ex){
            System.out.println("Erro1"+ex.getMessage());
        }
        finally
        {
            s.close();
          //  lectura.close();
        }
    }
}
