package com.mycompany.app.ODATA;

import java.io.*;

public class LeerTxt {

    public LeerTxt (File archivo){
        String cadena;
        try {
            FileReader f = new FileReader(archivo);
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine())!= null){
                if (cadena.contains(",")){
                    String parts[] = cadena.split(",");
                    for (int i=0; i <parts.length; i++){
                        System.out.print(parts[i]+" ");
                    }
                }else{
                    throw new IllegalArgumentException("La cadena no contiene el separador ',' ");
                }

            }
            b.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
