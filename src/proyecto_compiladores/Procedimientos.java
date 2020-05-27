/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_compiladores;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Bran
 */
public class Procedimientos {
    
    //Procedimiento para la Suma de matrices de 2x2
    public void SUMA_MATRIZ(JTextField A11, JTextField A12, JTextField A21, JTextField A22, JTextField B11, JTextField B12, JTextField B21, JTextField B22, JTextField C11, JTextField C12, JTextField C21, JTextField C22, JTextArea Mensaje) throws InterruptedException{
        //Declarar la Matriz A
        float[][] matriz1 = new float[2][2];
        float[][] matriz3 = new float[2][2];
        //Declarar la Matriz B
        float[][] matriz2 = new float[2][2];
        //Declarar la Matriz Resultante
        float[][] matrizR = new float[2][2];
        //Asignar valores
        matriz1[0][0]=Float.parseFloat(A11.getText());
        matriz1[0][1]=Float.parseFloat(A12.getText());
        matriz1[1][0]=Float.parseFloat(A21.getText());
        matriz1[1][1]=Float.parseFloat(A22.getText());
        matriz2[0][0]=Float.parseFloat(B11.getText());
        matriz2[0][1]=Float.parseFloat(B12.getText());
        matriz2[1][0]=Float.parseFloat(B21.getText());
        matriz2[1][1]=Float.parseFloat(B22.getText());
        
        Mensaje.append("Como Sumar 2 matrices de 2x2?");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        // contadores para poder especificar la posicion de los valores dentro de la matriz
            for(int i=0; i<2; i++)
		{
		for(int j=0; j<2; j++)
                    {				//SUMA
                    matrizR[i][j]=matriz1[i][j]+matriz2[i][j];	 // operar los valores con las mismas posiciones de la matriz 1 con la matriz 2
                    if(i==0 && j==0){
                        
                        Mensaje.append("1ro. Sumamos el coeficiente A11: "+A11.getText()+" + el coeficiente B11: "+B11.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C11.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C11: "+C11.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                    }
                    if(i==0 && j==1){
                        Mensaje.append("2Do. Sumamos el coeficiente A12: "+A12.getText()+" + el coeficiente B12: "+B12.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C12.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C12: "+C12.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                    }
                    if(i==1 && j==0){
                        Mensaje.append("3ro. Sumamos el coeficiente A21: "+A21.getText()+" + el coeficiente B21: "+B21.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C21.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C21: "+C21.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                        
                    }
                    if(i==1 && j==1){
                        Mensaje.append("4to. Sumamos el coeficiente A22: "+A22.getText()+" + el coeficiente B22: "+B22.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C22.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C22: "+C22.getText());
                        Mensaje.append(System.getProperty("line.separator"));                      
                    }
                    Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                    }		
		}
    }
    
    //Procedimiento para la Resta de matrices de 2x2
    public void RESTA_MATRIZ(JTextField A11, JTextField A12, JTextField A21, JTextField A22, JTextField B11, JTextField B12, JTextField B21, JTextField B22, JTextField C11, JTextField C12, JTextField C21, JTextField C22, JTextArea Mensaje) throws InterruptedException{
        //Declarar la Matriz A
        float[][] matriz1 = new float[2][2];
        //Declarar la Matriz B
        float[][] matriz2 = new float[2][2];
        //Declarar la Matriz Resultante
        float[][] matrizR = new float[2][2];
        //Asignar valores
        matriz1[0][0]=Float.parseFloat(A11.getText());
        matriz1[0][1]=Float.parseFloat(A12.getText());
        matriz1[1][0]=Float.parseFloat(A21.getText());
        matriz1[1][1]=Float.parseFloat(A22.getText());
        matriz2[0][0]=Float.parseFloat(B11.getText());
        matriz2[0][1]=Float.parseFloat(B12.getText());
        matriz2[1][0]=Float.parseFloat(B21.getText());
        matriz2[1][1]=Float.parseFloat(B22.getText());
        
        Mensaje.append("Como Restar 2 matrices de 2x2?");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        // contadores para poder especificar la posicion de los valores dentro de la matriz
            for(int i=0; i<2; i++)
		{
		for(int j=0; j<2; j++)
                    {				//RESTA
                    matrizR[i][j]=matriz1[i][j]-matriz2[i][j];	 // operar los valores con las mismas posiciones de la matriz 1 con la matriz 2
                    if(i==0 && j==0){
                        
                        Mensaje.append("1ro. Restamos el coeficiente A11: "+A11.getText()+" - el coeficiente B11: "+B11.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C11.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C11: "+C11.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                    }
                    if(i==0 && j==1){
                        Mensaje.append("2Do. Restamos el coeficiente A12: "+A12.getText()+" - el coeficiente B12: "+B12.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C12.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C12: "+C12.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                    }
                    if(i==1 && j==0){
                        Mensaje.append("3ro. Restamos el coeficiente A21: "+A21.getText()+" - el coeficiente B21: "+B21.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C21.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C21: "+C21.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                        
                    }
                    if(i==1 && j==1){
                        Mensaje.append("4to. Restamos el coeficiente A22: "+A22.getText()+" - el coeficiente B22: "+B22.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C22.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C22: "+C22.getText());
                        Mensaje.append(System.getProperty("line.separator"));                      
                    }
                    Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                    }		
		}
    }
    
    
    //Procedimiento para la Multiplicacion de matrices de 2x2
    public void MULTI_MATRIZ(JTextField A11, JTextField A12, JTextField A21, JTextField A22, JTextField B11, JTextField B12, JTextField B21, JTextField B22, JTextField C11, JTextField C12, JTextField C21, JTextField C22, JTextArea Mensaje) throws InterruptedException{
        //Declarar la Matriz A
        float[][] matriz1 = new float[2][2];
        //Declarar la Matriz B
        float[][] matriz2 = new float[2][2];
        //Declarar la Matriz Resultante
        float[][] matrizR = new float[2][2];
        //Asignar valores
        matriz1[0][0]=Float.parseFloat(A11.getText());
        matriz1[0][1]=Float.parseFloat(A12.getText());
        matriz1[1][0]=Float.parseFloat(A21.getText());
        matriz1[1][1]=Float.parseFloat(A22.getText());
        matriz2[0][0]=Float.parseFloat(B11.getText());
        matriz2[0][1]=Float.parseFloat(B12.getText());
        matriz2[1][0]=Float.parseFloat(B21.getText());
        matriz2[1][1]=Float.parseFloat(B22.getText());
        
        Mensaje.append("Como Multiplicar 2 matrices de 2x2?");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Para poder multiplicar 2 matrices, la 2da. matriz, tiene que tener");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("la cantidad de filas, tiene que ser la misma cantidad de columnas de la 1ra.");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Se tiene que multiplicar filas por columnas, para que nos den el resultado");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Para, la fila 1 por la columna 1, nos dara la posicion 11 y asi repetimos el proceso para obtener ");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Cada posicion de la matriz resultante, la matriz resultante tendra");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("la misma cantidad de filas que la primera matriz y la misma cantidad de columnas que la segunda");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        // contadores para poder especificar la posicion de los valores dentro de la matriz
	//Se realiza la operacion
	for(int i=0; i<2; i++)
	{
            for(int j=0; j<2; j++)
            {
            for(int x=0; x<2; x++)
            	{
		matrizR[i][j]=(matriz1[i][x]*matriz2[x][j])+matrizR[i][j];
                if(i==0 && x==0 && j==0){
                        Mensaje.append("1ro. Multiplicamos el coeficiente A11: "+A11.getText()+" * el coeficiente B11: "+B11.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C11.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C11: "+C11.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                    }
                    if(i==0 && x==1 && j==0){
                        Mensaje.append("2Do. Multiplicamos el coeficiente A12: "+A12.getText()+" * el coeficiente B21: "+B21.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C11.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego sumamos el resultado en C11: "+C11.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                    }
                    Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
		}
            if(i==0 && j==1){
                C12.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
            }
            if(i==1 && j==0){
                C21.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence  
            }
            if(i==1 && j==1){
                C22.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence                    
            }
            Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
            }		
	}
    }
    
    
    
    
    //Procedimiento para la Suma de matrices de 3x3
    public void SUMA_MATRIZ(JTextField A11, JTextField A12, JTextField A13, JTextField A21, JTextField A22, JTextField A23, JTextField A31, JTextField A32, JTextField A33, JTextField B11, JTextField B12, JTextField B13,  JTextField B21, JTextField B22, JTextField B23, JTextField B31, JTextField B32, JTextField B33, JTextField C11, JTextField C12, JTextField C13, JTextField C21, JTextField C22, JTextField C23, JTextField C31, JTextField C32, JTextField C33, JTextArea Mensaje) throws InterruptedException{
        //Declarar la Matriz A
        float[][] matriz1 = new float[3][3];
        //Declarar la Matriz B
        float[][] matriz2 = new float[3][3];
        //Declarar la Matriz Resultante
        float[][] matrizR = new float[3][3];
        //Asignar valores
        matriz1[0][0]=Float.parseFloat(A11.getText());
        matriz1[0][1]=Float.parseFloat(A12.getText());
        matriz1[0][2]=Float.parseFloat(A13.getText()); 
        matriz1[1][0]=Float.parseFloat(A21.getText());
        matriz1[1][1]=Float.parseFloat(A22.getText());
        matriz1[1][2]=Float.parseFloat(A23.getText());
        matriz1[2][0]=Float.parseFloat(A31.getText());
        matriz1[2][1]=Float.parseFloat(A32.getText());
        matriz1[2][2]=Float.parseFloat(A33.getText());
        
        matriz2[0][0]=Float.parseFloat(B11.getText());
        matriz2[0][1]=Float.parseFloat(B12.getText());
        matriz2[0][2]=Float.parseFloat(B13.getText()); 
        matriz2[1][0]=Float.parseFloat(B21.getText());
        matriz2[1][1]=Float.parseFloat(B22.getText());
        matriz2[1][2]=Float.parseFloat(B23.getText());
        matriz2[2][0]=Float.parseFloat(B31.getText());
        matriz2[2][1]=Float.parseFloat(B32.getText());
        matriz2[2][2]=Float.parseFloat(B33.getText());
        
        
        Mensaje.append("Como Sumar 2 matrices de 3x3?");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        // contadores para poder especificar la posicion de los valores dentro de la matriz
            for(int i=0; i<3; i++)
		{
		for(int j=0; j<3; j++)
                    {				//SUMA
                    matrizR[i][j]=matriz1[i][j]+matriz2[i][j];	 // operar los valores con las mismas posiciones de la matriz 1 con la matriz 2
                    if(i==0 && j==0){   
                        Mensaje.append("1ro. Sumamos el coeficiente A11: "+A11.getText()+" + el coeficiente B11: "+B11.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C11.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C11: "+C11.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                    }
                    if(i==0 && j==1){
                        Mensaje.append("2Do. Sumamos el coeficiente A12: "+A12.getText()+" + el coeficiente B12: "+B12.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C12.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C12: "+C12.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                    }
                    if(i==0 && j==2){
                        Mensaje.append("3ro. Sumamos el coeficiente A13: "+A13.getText()+" + el coeficiente B13: "+B13.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C13.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C13: "+C13.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                        Mensaje.append("Repetimos el mismo proceso con el resto de filas de las 2 matrices");
                        Mensaje.append(System.getProperty("line.separator"));
                    }
                    
                    if(i==1 && j==0){
                        C21.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                    }
                    if(i==1 && j==1){
                        C22.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence  
                    }
                    if(i==1 && j==2){
                        C23.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence                    
                    }
                    
                    if(i==2 && j==0){
                        C31.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                    }
                    if(i==2 && j==1){
                        C32.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence  
                    }
                    if(i==2 && j==2){
                        C33.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence                    
                    }
                    Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                    }		
		}
    }
    
    
    
    //Procedimiento para la Resta de matrices de 3x3
    public void RESTA_MATRIZ(JTextField A11, JTextField A12, JTextField A13, JTextField A21, JTextField A22, JTextField A23, JTextField A31, JTextField A32, JTextField A33, JTextField B11, JTextField B12, JTextField B13,  JTextField B21, JTextField B22, JTextField B23, JTextField B31, JTextField B32, JTextField B33, JTextField C11, JTextField C12, JTextField C13, JTextField C21, JTextField C22, JTextField C23, JTextField C31, JTextField C32, JTextField C33, JTextArea Mensaje) throws InterruptedException{
        //Declarar la Matriz A
        float[][] matriz1 = new float[3][3];
        //Declarar la Matriz B
        float[][] matriz2 = new float[3][3];
        //Declarar la Matriz Resultante
        float[][] matrizR = new float[3][3];
        //Asignar valores
        matriz1[0][0]=Float.parseFloat(A11.getText());
        matriz1[0][1]=Float.parseFloat(A12.getText());
        matriz1[0][2]=Float.parseFloat(A13.getText()); 
        matriz1[1][0]=Float.parseFloat(A21.getText());
        matriz1[1][1]=Float.parseFloat(A22.getText());
        matriz1[1][2]=Float.parseFloat(A23.getText());
        matriz1[2][0]=Float.parseFloat(A31.getText());
        matriz1[2][1]=Float.parseFloat(A32.getText());
        matriz1[2][2]=Float.parseFloat(A33.getText());
        
        matriz2[0][0]=Float.parseFloat(B11.getText());
        matriz2[0][1]=Float.parseFloat(B12.getText());
        matriz2[0][2]=Float.parseFloat(B13.getText()); 
        matriz2[1][0]=Float.parseFloat(B21.getText());
        matriz2[1][1]=Float.parseFloat(B22.getText());
        matriz2[1][2]=Float.parseFloat(B23.getText());
        matriz2[2][0]=Float.parseFloat(B31.getText());
        matriz2[2][1]=Float.parseFloat(B32.getText());
        matriz2[2][2]=Float.parseFloat(B33.getText());
        
        
        Mensaje.append("Como Restar 2 matrices de 3x3?");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        // contadores para poder especificar la posicion de los valores dentro de la matriz
            for(int i=0; i<3; i++)
		{
		for(int j=0; j<3; j++)
                    {				//RESTA
                    matrizR[i][j]=matriz1[i][j]-matriz2[i][j];	 // operar los valores con las mismas posiciones de la matriz 1 con la matriz 2
                    if(i==0 && j==0){   
                        Mensaje.append("1ro. Restamos el coeficiente A11: "+A11.getText()+" - el coeficiente B11: "+B11.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C11.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C11: "+C11.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                    }
                    if(i==0 && j==1){
                        Mensaje.append("2Do. Restamos el coeficiente A12: "+A12.getText()+" - el coeficiente B12: "+B12.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C12.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C12: "+C12.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                    }
                    if(i==0 && j==2){
                        Mensaje.append("3ro. Restamos el coeficiente A13: "+A13.getText()+" - el coeficiente B13: "+B13.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C13.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C13: "+C13.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                        Mensaje.append("Repetimos el mismo proceso con el resto de filas de las 2 matrices");
                        Mensaje.append(System.getProperty("line.separator"));
                    }
                    
                    if(i==1 && j==0){
                        C21.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                    }
                    if(i==1 && j==1){
                        C22.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence  
                    }
                    if(i==1 && j==2){
                        C23.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence                    
                    }
                    
                    if(i==2 && j==0){
                        C31.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                    }
                    if(i==2 && j==1){
                        C32.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence  
                    }
                    if(i==2 && j==2){
                        C33.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence                    
                    }
                    Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                    }		
		}
    }
    

    //Procedimiento para la Multiplicacion de matrices de 2x2
    public void MULTI_MATRIZ(JTextField A11, JTextField A12, JTextField A13, JTextField A21, JTextField A22, JTextField A23, JTextField A31, JTextField A32, JTextField A33, JTextField B11, JTextField B12, JTextField B13,  JTextField B21, JTextField B22, JTextField B23, JTextField B31, JTextField B32, JTextField B33, JTextField C11, JTextField C12, JTextField C13, JTextField C21, JTextField C22, JTextField C23, JTextField C31, JTextField C32, JTextField C33, JTextArea Mensaje) throws InterruptedException{
        //Declarar la Matriz A
        float[][] matriz1 = new float[2][2];
        //Declarar la Matriz B
        float[][] matriz2 = new float[2][2];
        //Declarar la Matriz Resultante
        float[][] matrizR = new float[2][2];
        //Asignar valores

        matriz1[0][0]=Float.parseFloat(A11.getText());
        matriz1[0][1]=Float.parseFloat(A12.getText());
        matriz1[0][2]=Float.parseFloat(A13.getText()); 
        matriz1[1][0]=Float.parseFloat(A21.getText());
        matriz1[1][1]=Float.parseFloat(A22.getText());
        matriz1[1][2]=Float.parseFloat(A23.getText());
        matriz1[2][0]=Float.parseFloat(A31.getText());
        matriz1[2][1]=Float.parseFloat(A32.getText());
        matriz1[2][2]=Float.parseFloat(A33.getText());
        
        matriz2[0][0]=Float.parseFloat(B11.getText());
        matriz2[0][1]=Float.parseFloat(B12.getText());
        matriz2[0][2]=Float.parseFloat(B13.getText()); 
        matriz2[1][0]=Float.parseFloat(B21.getText());
        matriz2[1][1]=Float.parseFloat(B22.getText());
        matriz2[1][2]=Float.parseFloat(B23.getText());
        matriz2[2][0]=Float.parseFloat(B31.getText());
        matriz2[2][1]=Float.parseFloat(B32.getText());
        matriz2[2][2]=Float.parseFloat(B33.getText());

        
        Mensaje.append("Como Multiplicar 2 matrices de 3x3?");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Para poder multiplicar 2 matrices, la 2da. matriz, tiene que tener");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("la misma cantidad de filas, tiene que ser la misma cantidad de columnas de la 1ra.");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Se tiene que multiplicar filas por columnas, para que nos den el resultado");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("La fila 1 por la columna 1, nos dara la posicion 11 y asi repetimos el proceso para obtener ");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Cada posicion de la matriz resultante, la matriz resultante tendra");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("la misma cantidad de filas que la primera matriz y la misma cantidad de columnas que la segunda");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        // contadores para poder especificar la posicion de los valores dentro de la matriz
	//Se realiza la operacion
	for(int i=0; i<3; i++)
	{
            for(int j=0; j<3; j++)
            {
            for(int x=0; x<3; x++)
            	{
		matrizR[i][j]=(matriz1[i][x]*matriz2[x][j])+matrizR[i][j];
                    if(i==0 && x==0 && j==0){
                        Mensaje.append("1ro. Multiplicamos el coeficiente A11: "+A11.getText()+" * el coeficiente B11: "+B11.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C11.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego seteamos el valor en C11: "+C11.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                    }
                    if(i==0 && x==1 && j==0){
                        Mensaje.append("2Do. Multiplicamos el coeficiente A12: "+A12.getText()+" * el coeficiente B21: "+B21.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C11.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego sumamos el resultado en C11: "+C11.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                    }
                    if(i==0 && x==2 && j==0){
                        Mensaje.append("3ro. Multiplicamos el coeficiente A13: "+A13.getText()+" * el coeficiente B22: "+B22.getText());//Envio de informacion a la ventana donde mostraremos la solucion
                        Mensaje.append(System.getProperty("line.separator"));  
                        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                        C11.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
                        Mensaje.append("Luego sumamos el resultado en C11: "+C11.getText());
                        Mensaje.append(System.getProperty("line.separator"));
                    }
                    Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
		}
            if(i==0 && j==1){
                C12.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
            }
            if(i==0 && j==2){
                C13.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence
            }
            if(i==1 && j==0){
                C21.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence  
            }
            if(i==1 && j==1){
                C22.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence                    
            }
            if(i==1 && j==2){
                C23.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence                    
            }
            if(i==2 && j==0){
                C31.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence  
            }
            if(i==2 && j==1){
                C32.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence                    
            }
            if(i==2 && j==2){
                C33.setText(Float.toString(matrizR[i][j])); //Setea el valor en el respectivo espacio al que pertenence                    
            }
            Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
            }		
	}
    }
    
    
    
    //Procedimiento para la Matriz Inversa de 2x2
    public void MATRIZ_INVERSA(JTextField A11, JTextField A12, JTextField A21, JTextField A22, JTextField B11, JTextField B12, JTextField B21, JTextField B22, JTextField Determinante, JTextArea Mensaje) throws InterruptedException{
        //Declarar la Matriz A
        float[][] matriz1 = new float[4][4];
        float [][] det= new float[50][50];	// Vector para guardar los valores de la matriz ingresada, pero conforme el proceso de va modificando
	float determinante;	// Variable para guardar el valor de la determinante
	int m;						// Variable auxiliar para la determinante
        float elem;					// Variable auxiliar para realizar la matriz inversa
        //Asignar valores
        matriz1[0][0]=Float.parseFloat(A11.getText());
        matriz1[0][1]=Float.parseFloat(A12.getText());
        matriz1[1][0]=Float.parseFloat(A21.getText());
        matriz1[1][1]=Float.parseFloat(A22.getText());
        for(int i=0; i<2; i++)
            {
                for(int j=0; j<2; j++)
                    {	
                    det[i][j]=matriz1[i][j];
                    }		
            }
        Mensaje.append("Calcular la Matriz Inversa de una matriz de 2x2?");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        //Encontrar determinante
	determinante=det[0][0];
	for(int x=0; x<2-1; x++)
                {
                    m=x+1;
                    for(int i=m; i<2; i++)
		        {
		           for(int j=m; j<2; j++)
		            {
		                det[i][j]= (det[x][x]*det[i][j]-det[x][j]*det[i][x]) / det[x][x];
		            }     
		        }
		determinante=determinante*det[x+1][x+1]; 
                }
        Determinante.setText(Float.toString(determinante)); //Setea el valor en el respectivo espacio al que pertenence
        if(determinante==0){
            Mensaje.append("El determinante de la matriz es 0");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("La matriz Ingresada, No tiene matriz Inversa.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
        }
        if(determinante!=0){
        // Proceso para hacer la matriz identidad junto a la matriz
            for (int i=0; i<2; i++)
		{
		for(int j=2; j<2*2; j++)
                    {
                    if (i==(j-2))
			{
			matriz1[i][j]=1;
			}
                    else {
			matriz1[i][j]=0;
                        }
                    }
		}
            B11.setText(Float.toString(matriz1[0][2])); //Setea el valor en el respectivo espacio al que pertenence
            B12.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
            B21.setText(Float.toString(matriz1[1][2])); //Setea el valor en el respectivo espacio al que pertenence
            B22.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
            Mensaje.append("Generamos los valores de la matriz Inversa y los Seteamos");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Para Encontrar la Matriz Inversa");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Lo hacemos por el metodo de Gauss Jordan");//Envio de informacion a la ventana donde mostraremos la solucion
            Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Tenemos las siguientes Operaciones de Fila");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Multiplicar una fila por un número distinto de 0.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Sumar (o restar) a una fila, el múltiplo de otra fila.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
            Mensaje.append("Intercambiar el orden de las filas.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Realizamos las operaciones de fila que tenemos a nuestro alcance");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Con tal, que nuestra Matriz Original, quede como la matriz identidad.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
	// Proceso para hace la matriz que ingresamos una identidad y la identidad hacerla matriz inversa
            for(int i=0; i<2; i++)
		{
		elem=matriz1[i][i];
		for(int j=0; j<2*2; j++)
                    {
                    matriz1[i][j]=matriz1[i][j]/elem;
                    }
                Mensaje.append("Convertimos en 1 el elemento en la diagonal");//Envio de informacion a la ventana donde mostraremos la solucion
                Mensaje.append(System.getProperty("line.separator"));
                Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                A11.setText(Float.toString(matriz1[0][0])); //Setea el valor en el respectivo espacio al que pertenence
                A12.setText(Float.toString(matriz1[0][1])); //Setea el valor en el respectivo espacio al que pertenence
                A21.setText(Float.toString(matriz1[1][0])); //Setea el valor en el respectivo espacio al que pertenence
                A22.setText(Float.toString(matriz1[1][1])); //Setea el valor en el respectivo espacio al que pertenence
                B11.setText(Float.toString(matriz1[0][2])); //Setea el valor en el respectivo espacio al que pertenence
                B12.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
                B21.setText(Float.toString(matriz1[1][2])); //Setea el valor en el respectivo espacio al que pertenence
                B22.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
		for(int x=0; x<2; x++)
                    {
                    if(x!=i)
                        {
			elem=matriz1[x][i];
			for(int j=0; j<2*2; j++)
                            {
                            matriz1[x][j]=matriz1[x][j]-(elem*matriz1[i][j]);
                            }
			}
                    }
                Mensaje.append("Convertimos en 0 el elemento que No esta en la diagonal");//Envio de informacion a la ventana donde mostraremos la solucion
                Mensaje.append(System.getProperty("line.separator"));
                Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                A11.setText(Float.toString(matriz1[0][0])); //Setea el valor en el respectivo espacio al que pertenence
                A12.setText(Float.toString(matriz1[0][1])); //Setea el valor en el respectivo espacio al que pertenence
                A21.setText(Float.toString(matriz1[1][0])); //Setea el valor en el respectivo espacio al que pertenence
                A22.setText(Float.toString(matriz1[1][1])); //Setea el valor en el respectivo espacio al que pertenence
                B11.setText(Float.toString(matriz1[0][2])); //Setea el valor en el respectivo espacio al que pertenence
                B12.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
                B21.setText(Float.toString(matriz1[1][2])); //Setea el valor en el respectivo espacio al que pertenence
                B22.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
		}
	//Imprimir la matriz Inversa
                Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                Mensaje.append(System.getProperty("line.separator"));
                Mensaje.append("Asi es como nos quedara nuestra Matriz Inversa Resuelta");//Envio de informacion a la ventana donde mostraremos la solucion
                Mensaje.append(System.getProperty("line.separator"));
                A11.setText(Float.toString(matriz1[0][0])); //Setea el valor en el respectivo espacio al que pertenence
                A12.setText(Float.toString(matriz1[0][1])); //Setea el valor en el respectivo espacio al que pertenence
                A21.setText(Float.toString(matriz1[1][0])); //Setea el valor en el respectivo espacio al que pertenence
                A22.setText(Float.toString(matriz1[1][1])); //Setea el valor en el respectivo espacio al que pertenence
                B11.setText(Float.toString(matriz1[0][2])); //Setea el valor en el respectivo espacio al que pertenence
                B12.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
                B21.setText(Float.toString(matriz1[1][2])); //Setea el valor en el respectivo espacio al que pertenence
                B22.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
        }
    }
    
    
    //Procedimiento para la Matriz Inversa de 3x3
    public void MATRIZ_INVERSA(JTextField A11, JTextField A12, JTextField A13, JTextField A21, JTextField A22, JTextField A23, JTextField A31, JTextField A32, JTextField A33, JTextField B11, JTextField B12, JTextField B13, JTextField B21, JTextField B22, JTextField B23, JTextField B31, JTextField B32, JTextField B33, JTextField Determinante, JTextArea Mensaje) throws InterruptedException{
        //Declarar la Matriz A
        float[][] matriz1 = new float[6][6];
        float [][] det= new float[50][50];	// Vector para guardar los valores de la matriz ingresada, pero conforme el proceso de va modificando
	float determinante;	// Variable para guardar el valor de la determinante
	int m;						// Variable auxiliar para la determinante
        float elem;					// Variable auxiliar para realizar la matriz inversa
        //Asignar valores
        matriz1[0][0]=Float.parseFloat(A11.getText());
        matriz1[0][1]=Float.parseFloat(A12.getText());
        matriz1[0][2]=Float.parseFloat(A13.getText());
        matriz1[1][0]=Float.parseFloat(A21.getText());
        matriz1[1][1]=Float.parseFloat(A22.getText());
        matriz1[1][2]=Float.parseFloat(A23.getText());
        matriz1[2][0]=Float.parseFloat(A31.getText());
        matriz1[2][1]=Float.parseFloat(A32.getText());
        matriz1[2][2]=Float.parseFloat(A33.getText());
        for(int i=0; i<3; i++)
            {
                for(int j=0; j<3; j++)
                    {	
                    det[i][j]=matriz1[i][j];
                    }		
            }
        Mensaje.append("Calcular la Matriz Inversa de una matriz de 3x3?");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        //Encontrar determinante
	determinante=det[0][0];
	for(int x=0; x<3-1; x++)
                {
                    m=x+1;
                    for(int i=m; i<3; i++)
		        {
		           for(int j=m; j<3; j++)
		            {
		                det[i][j]= (det[x][x]*det[i][j]-det[x][j]*det[i][x]) / det[x][x];
		            }     
		        }
		determinante=determinante*det[x+1][x+1]; 
                }
        Determinante.setText(Float.toString(determinante)); //Setea el valor en el respectivo espacio al que pertenence
        if(determinante==0){
            Mensaje.append("El determinante de la matriz es 0");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("La matriz Ingresada, No tiene matriz Inversa.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
        }
        if(determinante!=0){
        // Proceso para hacer la matriz identidad junto a la matriz
            for (int i=0; i<3; i++)
		{
		for(int j=3; j<3*2; j++)
                    {
                    if (i==(j-3))
			{
			matriz1[i][j]=1;
			}
                    else {
			matriz1[i][j]=0;
                        }
                    }
		}
            B11.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
            B12.setText(Float.toString(matriz1[0][4])); //Setea el valor en el respectivo espacio al que pertenence
            B13.setText(Float.toString(matriz1[0][5])); //Setea el valor en el respectivo espacio al que pertenence  
            B21.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
            B22.setText(Float.toString(matriz1[1][4])); //Setea el valor en el respectivo espacio al que pertenence
            B23.setText(Float.toString(matriz1[1][5])); //Setea el valor en el respectivo espacio al que pertenence
            B31.setText(Float.toString(matriz1[2][3])); //Setea el valor en el respectivo espacio al que pertenence
            B32.setText(Float.toString(matriz1[2][4])); //Setea el valor en el respectivo espacio al que pertenence
            B33.setText(Float.toString(matriz1[2][5])); //Setea el valor en el respectivo espacio al que pertenence
            Mensaje.append("Generamos los valores de la matriz Inversa y los Seteamos");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Para Encontrar la Matriz Inversa");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Lo hacemos por el metodo de Gauss Jordan");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
            Mensaje.append("Tenemos las siguientes Operaciones de Fila");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Multiplicar una fila por un número distinto de 0.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Sumar (o restar) a una fila, el múltiplo de otra fila.");//Envio de informacion a la ventana donde mostraremos la solucion
            Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Intercambiar el orden de las filas.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Realizamos las operaciones de fila que tenemos a nuestro alcance");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Con tal, que nuestra Matriz Original, quede como la matriz identidad.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
	// Proceso para hace la matriz que ingresamos una identidad y la identidad hacerla matriz inversa
            for(int i=0; i<3; i++)
		{
		elem=matriz1[i][i];
		for(int j=0; j<3*2; j++)
                    {
                    matriz1[i][j]=matriz1[i][j]/elem;
                    }
                Mensaje.append("Convertimos en 1 el elemento en la diagonal");//Envio de informacion a la ventana donde mostraremos la solucion
                Mensaje.append(System.getProperty("line.separator"));
                Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                A11.setText(Float.toString(matriz1[0][0])); //Setea el valor en el respectivo espacio al que pertenence
                A12.setText(Float.toString(matriz1[0][1])); //Setea el valor en el respectivo espacio al que pertenence
                A13.setText(Float.toString(matriz1[0][2])); //Setea el valor en el respectivo espacio al que pertenence
                A21.setText(Float.toString(matriz1[1][0])); //Setea el valor en el respectivo espacio al que pertenence
                A22.setText(Float.toString(matriz1[1][1])); //Setea el valor en el respectivo espacio al que pertenence
                A23.setText(Float.toString(matriz1[1][2])); //Setea el valor en el respectivo espacio al que pertenence
                A31.setText(Float.toString(matriz1[2][0])); //Setea el valor en el respectivo espacio al que pertenence
                A32.setText(Float.toString(matriz1[2][1])); //Setea el valor en el respectivo espacio al que pertenence
                A33.setText(Float.toString(matriz1[2][2])); //Setea el valor en el respectivo espacio al que pertenence
                B11.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
                B12.setText(Float.toString(matriz1[0][4])); //Setea el valor en el respectivo espacio al que pertenence
                B13.setText(Float.toString(matriz1[0][5])); //Setea el valor en el respectivo espacio al que pertenence
                B21.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
                B22.setText(Float.toString(matriz1[1][4])); //Setea el valor en el respectivo espacio al que pertenence
                B23.setText(Float.toString(matriz1[1][5])); //Setea el valor en el respectivo espacio al que pertenence
                B31.setText(Float.toString(matriz1[2][3])); //Setea el valor en el respectivo espacio al que pertenence
                B32.setText(Float.toString(matriz1[2][4])); //Setea el valor en el respectivo espacio al que pertenence
                B33.setText(Float.toString(matriz1[2][5])); //Setea el valor en el respectivo espacio al que pertenence
		for(int x=0; x<3; x++)
                    {
                    if(x!=i)
                        {
			elem=matriz1[x][i];
			for(int j=0; j<3*2; j++)
                            {
                            matriz1[x][j]=matriz1[x][j]-(elem*matriz1[i][j]);
                            }
			}
                    }
                Mensaje.append("Convertimos en 0 el elemento que No esta en la diagonal");//Envio de informacion a la ventana donde mostraremos la solucion
                Mensaje.append(System.getProperty("line.separator"));
                Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                A11.setText(Float.toString(matriz1[0][0])); //Setea el valor en el respectivo espacio al que pertenence
                A12.setText(Float.toString(matriz1[0][1])); //Setea el valor en el respectivo espacio al que pertenence
                A13.setText(Float.toString(matriz1[0][2])); //Setea el valor en el respectivo espacio al que pertenence
                A21.setText(Float.toString(matriz1[1][0])); //Setea el valor en el respectivo espacio al que pertenence
                A22.setText(Float.toString(matriz1[1][1])); //Setea el valor en el respectivo espacio al que pertenence
                A23.setText(Float.toString(matriz1[1][2])); //Setea el valor en el respectivo espacio al que pertenence
                A31.setText(Float.toString(matriz1[2][0])); //Setea el valor en el respectivo espacio al que pertenence
                A32.setText(Float.toString(matriz1[2][1])); //Setea el valor en el respectivo espacio al que pertenence
                A33.setText(Float.toString(matriz1[2][2])); //Setea el valor en el respectivo espacio al que pertenence
                B11.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
                B12.setText(Float.toString(matriz1[0][4])); //Setea el valor en el respectivo espacio al que pertenence
                B13.setText(Float.toString(matriz1[0][5])); //Setea el valor en el respectivo espacio al que pertenence
                B21.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
                B22.setText(Float.toString(matriz1[1][4])); //Setea el valor en el respectivo espacio al que pertenence
                B23.setText(Float.toString(matriz1[1][5])); //Setea el valor en el respectivo espacio al que pertenence
                B31.setText(Float.toString(matriz1[2][3])); //Setea el valor en el respectivo espacio al que pertenence
                B32.setText(Float.toString(matriz1[2][4])); //Setea el valor en el respectivo espacio al que pertenence
                B33.setText(Float.toString(matriz1[2][5])); //Setea el valor en el respectivo espacio al que pertenence
                }
	//Imprimir la matriz Inversa
                Mensaje.append(System.getProperty("line.separator"));
                Mensaje.append("Asi es como nos quedara nuestra Matriz Inversa Resuelta");//Envio de informacion a la ventana donde mostraremos la solucion
                Mensaje.append(System.getProperty("line.separator"));
                Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                A11.setText(Float.toString(matriz1[0][0])); //Setea el valor en el respectivo espacio al que pertenence
                A12.setText(Float.toString(matriz1[0][1])); //Setea el valor en el respectivo espacio al que pertenence
                A13.setText(Float.toString(matriz1[0][2])); //Setea el valor en el respectivo espacio al que pertenence
                A21.setText(Float.toString(matriz1[1][0])); //Setea el valor en el respectivo espacio al que pertenence
                A22.setText(Float.toString(matriz1[1][1])); //Setea el valor en el respectivo espacio al que pertenence
                A23.setText(Float.toString(matriz1[1][2])); //Setea el valor en el respectivo espacio al que pertenence
                A31.setText(Float.toString(matriz1[2][0])); //Setea el valor en el respectivo espacio al que pertenence
                A32.setText(Float.toString(matriz1[2][1])); //Setea el valor en el respectivo espacio al que pertenence
                A33.setText(Float.toString(matriz1[2][2])); //Setea el valor en el respectivo espacio al que pertenence
                B11.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
                B12.setText(Float.toString(matriz1[0][4])); //Setea el valor en el respectivo espacio al que pertenence
                B13.setText(Float.toString(matriz1[0][5])); //Setea el valor en el respectivo espacio al que pertenence
                B21.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
                B22.setText(Float.toString(matriz1[1][4])); //Setea el valor en el respectivo espacio al que pertenence
                B23.setText(Float.toString(matriz1[1][5])); //Setea el valor en el respectivo espacio al que pertenence
                B31.setText(Float.toString(matriz1[2][3])); //Setea el valor en el respectivo espacio al que pertenence
                B32.setText(Float.toString(matriz1[2][4])); //Setea el valor en el respectivo espacio al que pertenence
                B33.setText(Float.toString(matriz1[2][5])); //Setea el valor en el respectivo espacio al que pertenence	
        }
    }
    
    
    
     
    //Procedimiento para la Ecuacion Matriz Inversa de 2x2
    public void ECUACION_SIMULTANEA_MATRIZ_INVERSA(JTextField A11, JTextField A12, JTextField A13, JTextField A21, JTextField A22, JTextField A23, JTextField B11, JTextField B12, JTextField B21, JTextField B22, JTextField X, JTextField Y, JTextArea Mensaje) throws InterruptedException{
        //Declarar la Matriz A
        float[][] matriz1 = new float[5][5];
        float [][] det= new float[50][50];	// Vector para guardar los valores de la matriz ingresada, pero conforme el proceso de va modificando
	float determinante;	// Variable para guardar el valor de la determinante
	int m;						// Variable auxiliar para la determinante
        float elem;					// Variable auxiliar para realizar la matriz inversa
        //Asignar valores
        matriz1[0][0]=Float.parseFloat(A11.getText());
        matriz1[0][1]=Float.parseFloat(A12.getText());
        matriz1[0][2]=Float.parseFloat(A13.getText());
        matriz1[1][0]=Float.parseFloat(A21.getText());
        matriz1[1][1]=Float.parseFloat(A22.getText());
        matriz1[1][2]=Float.parseFloat(A23.getText());
        Mensaje.append("Solucionar un sistema de ecuaciones de 2x2 por medio de Matriz Inversa");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        //Encontrar determinante
        // Proceso para hacer la matriz identidad junto a la matriz
            for (int i=0; i<2; i++)
		{
		for(int j=3; j<5; j++)
                    {
                    if (i==(j-3))
			{
			matriz1[i][j]=1;
			}
                    else {
			matriz1[i][j]=0;
                        }
                    }
		}
            B11.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
            B12.setText(Float.toString(matriz1[0][4])); //Setea el valor en el respectivo espacio al que pertenence
            B21.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
            B22.setText(Float.toString(matriz1[1][4])); //Setea el valor en el respectivo espacio al que pertenence
            Mensaje.append("Generamos los valores de la matriz Identidad y los Seteamos");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Para Encontrar la Solucion a nuestra ecuacion");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Lo hacemos por el metodo de Gauss Jordan");//Envio de informacion a la ventana donde mostraremos la solucion
            Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Tenemos las siguientes Operaciones de Fila");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Multiplicar una fila por un número distinto de 0.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Sumar (o restar) a una fila, el múltiplo de otra fila.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
            Mensaje.append("Intercambiar el orden de las filas.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Realizamos las operaciones de fila que tenemos a nuestro alcance");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Con tal, que nuestra Matriz Original, quede como la matriz identidad.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
	// Proceso para hace la matriz que ingresamos una identidad y la identidad hacerla matriz inversa
            for(int i=0; i<2; i++)
		{
		elem=matriz1[i][i];
		for(int j=0; j<5; j++)
                    {
                    matriz1[i][j]=matriz1[i][j]/elem;
                    }
                Mensaje.append("Convertimos en 1 el elemento en la diagonal");//Envio de informacion a la ventana donde mostraremos la solucion
                Mensaje.append(System.getProperty("line.separator"));
                Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                A11.setText(Float.toString(matriz1[0][0])); //Setea el valor en el respectivo espacio al que pertenence
                A12.setText(Float.toString(matriz1[0][1])); //Setea el valor en el respectivo espacio al que pertenence
                A13.setText(Float.toString(matriz1[0][2])); //Setea el valor en el respectivo espacio al que pertenence
                
                A21.setText(Float.toString(matriz1[1][0])); //Setea el valor en el respectivo espacio al que pertenence
                A22.setText(Float.toString(matriz1[1][1])); //Setea el valor en el respectivo espacio al que pertenence
                A23.setText(Float.toString(matriz1[1][2])); //Setea el valor en el respectivo espacio al que pertenence
      
                B11.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
                B12.setText(Float.toString(matriz1[0][4])); //Setea el valor en el respectivo espacio al que pertenence
                
                B21.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
                B22.setText(Float.toString(matriz1[1][4])); //Setea el valor en el respectivo espacio al que pertenence
		
                for(int x=0; x<2; x++)
                    {
                    if(x!=i)
                        {
			elem=matriz1[x][i];
			for(int j=0; j<5; j++)
                            {
                            matriz1[x][j]=matriz1[x][j]-(elem*matriz1[i][j]);
                            }
			}
                    }
                Mensaje.append("Convertimos en 0 el elemento que No esta en la diagonal");//Envio de informacion a la ventana donde mostraremos la solucion
                Mensaje.append(System.getProperty("line.separator"));
                Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                A11.setText(Float.toString(matriz1[0][0])); //Setea el valor en el respectivo espacio al que pertenence
                A12.setText(Float.toString(matriz1[0][1])); //Setea el valor en el respectivo espacio al que pertenence
                A13.setText(Float.toString(matriz1[0][2])); //Setea el valor en el respectivo espacio al que pertenence
                
                A21.setText(Float.toString(matriz1[1][0])); //Setea el valor en el respectivo espacio al que pertenence
                A22.setText(Float.toString(matriz1[1][1])); //Setea el valor en el respectivo espacio al que pertenence
                A23.setText(Float.toString(matriz1[1][2])); //Setea el valor en el respectivo espacio al que pertenence
                
                B11.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
                B12.setText(Float.toString(matriz1[0][4])); //Setea el valor en el respectivo espacio al que pertenence
                B21.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
                B22.setText(Float.toString(matriz1[1][4])); //Setea el valor en el respectivo espacio al que pertenence
		}
	//Imprimir la matriz Inversa
                Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                Mensaje.append(System.getProperty("line.separator"));
                Mensaje.append("Asi es como nos quedara nuestra Ecuacion Resuelta");//Envio de informacion a la ventana donde mostraremos la solucion
                Mensaje.append(System.getProperty("line.separator"));
                A11.setText(Float.toString(matriz1[0][0])); //Setea el valor en el respectivo espacio al que pertenence
                A12.setText(Float.toString(matriz1[0][1])); //Setea el valor en el respectivo espacio al que pertenence
                A13.setText(Float.toString(matriz1[0][2])); //Setea el valor en el respectivo espacio al que pertenence            
                A21.setText(Float.toString(matriz1[1][0])); //Setea el valor en el respectivo espacio al que pertenence
                A22.setText(Float.toString(matriz1[1][1])); //Setea el valor en el respectivo espacio al que pertenence
                A23.setText(Float.toString(matriz1[1][2])); //Setea el valor en el respectivo espacio al que pertenence                
                B11.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
                B12.setText(Float.toString(matriz1[0][4])); //Setea el valor en el respectivo espacio al que pertenence
                B21.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
                B22.setText(Float.toString(matriz1[1][4])); //Setea el valor en el respectivo espacio al que pertenence		
                X.setText(Float.toString(matriz1[0][2])); //Setea el valor en el respectivo espacio al que pertenence
                Y.setText(Float.toString(matriz1[1][2])); //Setea el valor en el respectivo espacio al que pertenence               
    }
    
    
    
    //Procedimiento para la Matriz Inversa de 3x3
    public void ECUACION_SIMULTANEA_MATRIZ_INVERSA(JTextField A11, JTextField A12, JTextField A13, JTextField A14, JTextField A21, JTextField A22, JTextField A23, JTextField A24, JTextField A31, JTextField A32, JTextField A33, JTextField A34, JTextField B11, JTextField B12, JTextField B13, JTextField B21, JTextField B22, JTextField B23, JTextField B31, JTextField B32, JTextField B33, JTextField X, JTextField Y, JTextField Z, JTextArea Mensaje) throws InterruptedException{
        //Declarar la Matriz A
        float[][] matriz1 = new float[7][7];
        float [][] det= new float[50][50];	// Vector para guardar los valores de la matriz ingresada, pero conforme el proceso de va modificando
	float determinante;	// Variable para guardar el valor de la determinante
	int m;						// Variable auxiliar para la determinante
        float elem;					// Variable auxiliar para realizar la matriz inversa
        //Asignar valores
        matriz1[0][0]=Float.parseFloat(A11.getText());
        matriz1[0][1]=Float.parseFloat(A12.getText());
        matriz1[0][2]=Float.parseFloat(A13.getText());
        matriz1[0][3]=Float.parseFloat(A14.getText());
        
        matriz1[1][0]=Float.parseFloat(A21.getText());
        matriz1[1][1]=Float.parseFloat(A22.getText());
        matriz1[1][2]=Float.parseFloat(A23.getText());
        matriz1[1][3]=Float.parseFloat(A24.getText());
        
        matriz1[2][0]=Float.parseFloat(A31.getText());
        matriz1[2][1]=Float.parseFloat(A32.getText());
        matriz1[2][2]=Float.parseFloat(A33.getText());
        matriz1[2][3]=Float.parseFloat(A34.getText());
      
        Mensaje.append("Solucionar un sistema de ecuaciones de 3x3 por medio de Matriz Inversa");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        
        // Proceso para hacer la matriz identidad junto a la matriz
            for (int i=0; i<3; i++)
		{
		for(int j=4; j<7; j++)
                    {
                    if (i==(j-4))
			{
			matriz1[i][j]=1;
			}
                    else {
			matriz1[i][j]=0;
                        }
                    }
		}
            B11.setText(Float.toString(matriz1[0][4])); //Setea el valor en el respectivo espacio al que pertenence
            B12.setText(Float.toString(matriz1[0][5])); //Setea el valor en el respectivo espacio al que pertenence
            B13.setText(Float.toString(matriz1[0][6])); //Setea el valor en el respectivo espacio al que pertenence  
            
            B21.setText(Float.toString(matriz1[1][4])); //Setea el valor en el respectivo espacio al que pertenence
            B22.setText(Float.toString(matriz1[1][5])); //Setea el valor en el respectivo espacio al que pertenence
            B23.setText(Float.toString(matriz1[1][6])); //Setea el valor en el respectivo espacio al que pertenence
            
            B31.setText(Float.toString(matriz1[2][4])); //Setea el valor en el respectivo espacio al que pertenence
            B32.setText(Float.toString(matriz1[2][5])); //Setea el valor en el respectivo espacio al que pertenence
            B33.setText(Float.toString(matriz1[2][6])); //Setea el valor en el respectivo espacio al que pertenence
            
            Mensaje.append("Generamos los valores de la matriz Identidad y los Seteamos");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Para Encontrar la solucion a nuestro sistema de ecuaciones");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Lo hacemos por el metodo de Gauss Jordan");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
            Mensaje.append("Tenemos las siguientes Operaciones de Fila");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Multiplicar una fila por un número distinto de 0.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Sumar (o restar) a una fila, el múltiplo de otra fila.");//Envio de informacion a la ventana donde mostraremos la solucion
            Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Intercambiar el orden de las filas.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Realizamos las operaciones de fila que tenemos a nuestro alcance");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Mensaje.append("Con tal, que nuestra Matriz Original, quede como la matriz identidad.");//Envio de informacion a la ventana donde mostraremos la solucion
            Mensaje.append(System.getProperty("line.separator"));
            Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
	// Proceso para hace la matriz que ingresamos una identidad y la identidad hacerla matriz inversa
            for(int i=0; i<3; i++)
		{
		elem=matriz1[i][i];
		for(int j=0; j<7; j++)
                    {
                    matriz1[i][j]=matriz1[i][j]/elem;
                    }
                Mensaje.append("Convertimos en 1 el elemento en la diagonal");//Envio de informacion a la ventana donde mostraremos la solucion
                Mensaje.append(System.getProperty("line.separator"));
                Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                A11.setText(Float.toString(matriz1[0][0])); //Setea el valor en el respectivo espacio al que pertenence
                A12.setText(Float.toString(matriz1[0][1])); //Setea el valor en el respectivo espacio al que pertenence
                A13.setText(Float.toString(matriz1[0][2])); //Setea el valor en el respectivo espacio al que pertenence
                A14.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
                A21.setText(Float.toString(matriz1[1][0])); //Setea el valor en el respectivo espacio al que pertenence
                A22.setText(Float.toString(matriz1[1][1])); //Setea el valor en el respectivo espacio al que pertenence
                A23.setText(Float.toString(matriz1[1][2])); //Setea el valor en el respectivo espacio al que pertenence
                A24.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
                A31.setText(Float.toString(matriz1[2][0])); //Setea el valor en el respectivo espacio al que pertenence
                A32.setText(Float.toString(matriz1[2][1])); //Setea el valor en el respectivo espacio al que pertenence
                A33.setText(Float.toString(matriz1[2][2])); //Setea el valor en el respectivo espacio al que pertenence
                A34.setText(Float.toString(matriz1[2][3])); //Setea el valor en el respectivo espacio al que pertenence
                B11.setText(Float.toString(matriz1[0][4])); //Setea el valor en el respectivo espacio al que pertenence
                B12.setText(Float.toString(matriz1[0][5])); //Setea el valor en el respectivo espacio al que pertenence
                B13.setText(Float.toString(matriz1[0][6])); //Setea el valor en el respectivo espacio al que pertenence
                B21.setText(Float.toString(matriz1[1][4])); //Setea el valor en el respectivo espacio al que pertenence
                B22.setText(Float.toString(matriz1[1][5])); //Setea el valor en el respectivo espacio al que pertenence
                B23.setText(Float.toString(matriz1[1][6])); //Setea el valor en el respectivo espacio al que pertenence
                B31.setText(Float.toString(matriz1[2][4])); //Setea el valor en el respectivo espacio al que pertenence
                B32.setText(Float.toString(matriz1[2][5])); //Setea el valor en el respectivo espacio al que pertenence
                B33.setText(Float.toString(matriz1[2][6])); //Setea el valor en el respectivo espacio al que pertenence
		
                for(int x=0; x<3; x++)
                    {
                    if(x!=i)
                        {
			elem=matriz1[x][i];
			for(int j=0; j<7; j++)
                            {
                            matriz1[x][j]=matriz1[x][j]-(elem*matriz1[i][j]);
                            }
			}
                    }
                Mensaje.append("Convertimos en 0 el elemento que No esta en la diagonal");//Envio de informacion a la ventana donde mostraremos la solucion
                Mensaje.append(System.getProperty("line.separator"));
                Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                A11.setText(Float.toString(matriz1[0][0])); //Setea el valor en el respectivo espacio al que pertenence
                A12.setText(Float.toString(matriz1[0][1])); //Setea el valor en el respectivo espacio al que pertenence
                A13.setText(Float.toString(matriz1[0][2])); //Setea el valor en el respectivo espacio al que pertenence
                A14.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
                A21.setText(Float.toString(matriz1[1][0])); //Setea el valor en el respectivo espacio al que pertenence
                A22.setText(Float.toString(matriz1[1][1])); //Setea el valor en el respectivo espacio al que pertenence
                A23.setText(Float.toString(matriz1[1][2])); //Setea el valor en el respectivo espacio al que pertenence
                A24.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
                A31.setText(Float.toString(matriz1[2][0])); //Setea el valor en el respectivo espacio al que pertenence
                A32.setText(Float.toString(matriz1[2][1])); //Setea el valor en el respectivo espacio al que pertenence
                A33.setText(Float.toString(matriz1[2][2])); //Setea el valor en el respectivo espacio al que pertenence
                A34.setText(Float.toString(matriz1[2][3])); //Setea el valor en el respectivo espacio al que pertenence
                B11.setText(Float.toString(matriz1[0][4])); //Setea el valor en el respectivo espacio al que pertenence
                B12.setText(Float.toString(matriz1[0][5])); //Setea el valor en el respectivo espacio al que pertenence
                B13.setText(Float.toString(matriz1[0][6])); //Setea el valor en el respectivo espacio al que pertenence
                B21.setText(Float.toString(matriz1[1][4])); //Setea el valor en el respectivo espacio al que pertenence
                B22.setText(Float.toString(matriz1[1][5])); //Setea el valor en el respectivo espacio al que pertenence
                B23.setText(Float.toString(matriz1[1][6])); //Setea el valor en el respectivo espacio al que pertenence
                B31.setText(Float.toString(matriz1[2][4])); //Setea el valor en el respectivo espacio al que pertenence
                B32.setText(Float.toString(matriz1[2][5])); //Setea el valor en el respectivo espacio al que pertenence
                B33.setText(Float.toString(matriz1[2][6])); //Setea el valor en el respectivo espacio al que pertenence
                }
	//Imprimir la matriz Inversa
                Mensaje.append(System.getProperty("line.separator"));
                Mensaje.append("Asi es como nos quedara nuestra Matriz Inversa Resuelta");//Envio de informacion a la ventana donde mostraremos la solucion
                Mensaje.append(System.getProperty("line.separator"));
                Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
                A11.setText(Float.toString(matriz1[0][0])); //Setea el valor en el respectivo espacio al que pertenence
                A12.setText(Float.toString(matriz1[0][1])); //Setea el valor en el respectivo espacio al que pertenence
                A13.setText(Float.toString(matriz1[0][2])); //Setea el valor en el respectivo espacio al que pertenence
                A14.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
                A21.setText(Float.toString(matriz1[1][0])); //Setea el valor en el respectivo espacio al que pertenence
                A22.setText(Float.toString(matriz1[1][1])); //Setea el valor en el respectivo espacio al que pertenence
                A23.setText(Float.toString(matriz1[1][2])); //Setea el valor en el respectivo espacio al que pertenence
                A24.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
                A31.setText(Float.toString(matriz1[2][0])); //Setea el valor en el respectivo espacio al que pertenence
                A32.setText(Float.toString(matriz1[2][1])); //Setea el valor en el respectivo espacio al que pertenence
                A33.setText(Float.toString(matriz1[2][2])); //Setea el valor en el respectivo espacio al que pertenence
                A34.setText(Float.toString(matriz1[2][3])); //Setea el valor en el respectivo espacio al que pertenence
                B11.setText(Float.toString(matriz1[0][4])); //Setea el valor en el respectivo espacio al que pertenence
                B12.setText(Float.toString(matriz1[0][5])); //Setea el valor en el respectivo espacio al que pertenence
                B13.setText(Float.toString(matriz1[0][6])); //Setea el valor en el respectivo espacio al que pertenence
                B21.setText(Float.toString(matriz1[1][4])); //Setea el valor en el respectivo espacio al que pertenence
                B22.setText(Float.toString(matriz1[1][5])); //Setea el valor en el respectivo espacio al que pertenence
                B23.setText(Float.toString(matriz1[1][6])); //Setea el valor en el respectivo espacio al que pertenence
                B31.setText(Float.toString(matriz1[2][4])); //Setea el valor en el respectivo espacio al que pertenence
                B32.setText(Float.toString(matriz1[2][5])); //Setea el valor en el respectivo espacio al que pertenence
                B33.setText(Float.toString(matriz1[2][6])); //Setea el valor en el respectivo espacio al que pertenence
		X.setText(Float.toString(matriz1[0][3])); //Setea el valor en el respectivo espacio al que pertenence
                Y.setText(Float.toString(matriz1[1][3])); //Setea el valor en el respectivo espacio al que pertenence
                Z.setText(Float.toString(matriz1[2][3])); //Setea el valor en el respectivo espacio al que pertenence
    }
    
    
    
    //Procedimiento para la Ecuacion Matriz Inversa de 2x2
    public void ECUACION_SIMULTANEA_SUMA(JTextField A11, JTextField A12, JTextField A13, JTextField A21, JTextField A22, JTextField A23, JTextField B11, JTextField B12, JTextField B13, JTextField B21, JTextField B22, JTextField B23, JTextField X, JTextField Y, JTextArea Mensaje) throws InterruptedException{
        //Declarar la Matriz A
        float[][] ecuacion = new float[2][5];
        float[] ecuaciona = new float[5];
        float y=0;
        float temp1=0;
	float temp2=0;
        
        //Asignar valores
        ecuacion[0][0]=Float.parseFloat(A11.getText());
        ecuacion[0][2]=Float.parseFloat(A12.getText());
        ecuacion[0][4]=Float.parseFloat(A13.getText());
        
        ecuacion[1][0]=Float.parseFloat(A21.getText());
        ecuacion[1][2]=Float.parseFloat(A22.getText());
        ecuacion[1][4]=Float.parseFloat(A23.getText());
        Mensaje.append("Solucionar un sistema de ecuaciones de 2x2 por medio del");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Metodo de la Suma y Resta");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        //Mostrar la En matriz B
        B11.setText(Float.toString(ecuacion[0][0])); //Setea el valor en el respectivo espacio al que pertenence
        B12.setText(Float.toString(ecuacion[0][2])); //Setea el valor en el respectivo espacio al que pertenence
        B13.setText(Float.toString(ecuacion[0][4])); //Setea el valor en el respectivo espacio al que pertenence
        
        B21.setText(Float.toString(ecuacion[1][0])); //Setea el valor en el respectivo espacio al que pertenence
        B22.setText(Float.toString(ecuacion[1][2])); //Setea el valor en el respectivo espacio al que pertenence
        B23.setText(Float.toString(ecuacion[1][4])); //Setea el valor en el respectivo espacio al que pertenence
        
        //Guardo los valores de mi ecuacion 1
	for(int j=0;j<5;j++)
            {ecuaciona[j]=ecuacion[0][j];
            }
	
        //solucion de la primera incognita X1
	//obtencion de ecuacion eliminando la y de las dos ecuaciones
	for(int j=0;j<5;j++)
            {ecuacion[0][j]=ecuacion[0][j]*ecuacion[1][2];
            }
	for(int j=0;j<5;j++)
            {ecuacion[1][j]=ecuacion[1][j]*(-ecuaciona[2]);
            }
        Mensaje.append("Proceso para eliminar Y");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
	Mensaje.append("Multiplicamos el valor de Y de la segunda ecuacion por la 1ra. Ecuacion");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa    
	B11.setText(Float.toString(ecuacion[0][0])); //Setea el valor en el respectivo espacio al que pertenence
        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
        B12.setText(Float.toString(ecuacion[0][2])); //Setea el valor en el respectivo espacio al que pertenence
        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
        B13.setText(Float.toString(ecuacion[0][4])); //Setea el valor en el respectivo espacio al que pertenence
        Mensaje.append("Multiplicamos el valor de Y de la primera ecuacion por la 2da. Ecuacion");//Envio de informacion a la ventana donde mostraremos la solucion
        B21.setText(Float.toString(ecuacion[1][0])); //Setea el valor en el respectivo espacio al que pertenence
        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
        B22.setText(Float.toString(ecuacion[1][2])); //Setea el valor en el respectivo espacio al que pertenence
        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
        B23.setText(Float.toString(ecuacion[1][4])); //Setea el valor en el respectivo espacio al que pertenence
        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Esta es su ecuacion modificada para eliminar a Y");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        
        //Guardo los valores de mi ecuacion 1
	//ya he eliminado lo que es mi y de mis ecuaciones originales ahora encontrare el valor de y sumo las dos ecuaciones
	for(int j=0;j<5;j++)
	{ecuacion[1][j]=ecuacion[0][j]+ecuacion[1][j];
	}
	//Proceso de lo que se le va a mostrar al usuario
	Mensaje.append("Multiplicamos el valor de Y de la primera ecuacion por la 2da. Ecuacion");//Envio de informacion a la ventana donde mostraremos la solucion
        B21.setText(Float.toString(ecuacion[1][0])); //Setea el valor en el respectivo espacio al que pertenence
        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
        B22.setText(Float.toString(ecuacion[1][2])); //Setea el valor en el respectivo espacio al que pertenence
        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
        B23.setText(Float.toString(ecuacion[1][4])); //Setea el valor en el respectivo espacio al que pertenence
        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Luego Dividimos el coeficiente"+ecuacion[1][4]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));		
        Mensaje.append("Dividido el coeficiente"+ecuacion[1][0]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Y de esa manera obtenemos el valor de X");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        
        //encontrar valor de la x
	ecuacion[1][1]=ecuacion[1][4]/ecuacion[1][0];
	
        ecuaciona[3]=0;
	float c1=ecuaciona[4];
	float b1=ecuaciona[2];
			
        //solucion de la segunda Incognita
	y=((ecuaciona[4]-(ecuaciona[0]*ecuacion[1][1]))/ecuaciona[2]);
	
        Mensaje.append("Este es el valor de X: "+ecuacion[1][1]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        X.setText(Float.toString(ecuacion[1][1])); //Setea el valor en el respectivo espacio al que pertenence
        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
        Mensaje.append("Ahora sustituimos el valor de X en la ecuacion que nos quedo de haber despejado a Y en la Primera");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Y operamos, despues de haber operado obtendremos el Valor de Y");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Y = ("+c1+" - ("+ecuaciona[0]+" * "+ecuacion[1][1]+")) / "+b1);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Operamos y encontraremos el valor de Y ");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        
        B23.setText(Float.toString(ecuacion[1][4])); //Setea el valor en el respectivo espacio al que pertenence
        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
        Y.setText(Float.toString(ecuacion[1][4])); //Setea el valor en el respectivo espacio al que pertenence
        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa
        
        
        Mensaje.append("Este es el valor de Y "+y);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
                      
    }
    
    
    
    //Procedimiento para la Ecuacion Matriz Inversa de 2x2
    public void ECUACION_SIMULTANEA_SUSTITUCION(JTextField A11, JTextField A12, JTextField A13, JTextField A21, JTextField A22, JTextField A23, JTextField B11, JTextField B12, JTextField B13, JTextField B21, JTextField B22, JTextField B23, JTextField X, JTextField Y, JTextArea Mensaje) throws InterruptedException{
        //Declarar la Matriz A
        float[][] ecuacion = new float[2][5];
        float[] ecuaciona = new float[5];
        float y=0;
        float temp1=0;
	float temp2=0;
        
        //Asignar valores
        ecuacion[0][0]=Float.parseFloat(A11.getText());
        ecuacion[0][2]=Float.parseFloat(A12.getText());
        ecuacion[0][4]=Float.parseFloat(A13.getText());
        
        ecuacion[1][0]=Float.parseFloat(A21.getText());
        ecuacion[1][2]=Float.parseFloat(A22.getText());
        ecuacion[1][4]=Float.parseFloat(A23.getText());
        Mensaje.append("Solucionar un sistema de ecuaciones de 2x2 por medio del");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Metodo de la Sustitucion");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        //Mostrar la En matriz B
        B11.setText(Float.toString(ecuacion[0][0])); //Setea el valor en el respectivo espacio al que pertenence
        B12.setText(Float.toString(ecuacion[0][2])); //Setea el valor en el respectivo espacio al que pertenence
        B13.setText(Float.toString(ecuacion[0][4])); //Setea el valor en el respectivo espacio al que pertenence
        
        B21.setText(Float.toString(ecuacion[1][0])); //Setea el valor en el respectivo espacio al que pertenence
        B22.setText(Float.toString(ecuacion[1][2])); //Setea el valor en el respectivo espacio al que pertenence
        B23.setText(Float.toString(ecuacion[1][4])); //Setea el valor en el respectivo espacio al que pertenence
        
	//solucion de la primera incognita X1
	temp1=((ecuacion[1][2]*ecuacion[0][4])/ecuacion[0][2]);
	temp2=((-ecuacion[0][0]*ecuacion[1][2])/ecuacion[0][2]);
	ecuacion[1][0]=(ecuacion[1][0]+temp2);
	ecuacion[1][1]=((ecuacion[1][4]-temp1)/ecuacion[1][0]);
	
        //solucion de la segunda Incognita
	ecuacion[0][3]=((ecuacion[0][4]-(ecuacion[0][0]*ecuacion[1][1]))/ecuacion[0][2]);

        
        Mensaje.append("Proceso para Sustituir Y");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
	Mensaje.append("Despejamos a la incognita Y de la primera ecuacion y nos quedaria asi");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Y= ("+ecuacion[0][4]+" - ("+ecuacion[0][0]+"X ))");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("dividido    "+ecuacion[0][2]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Ahora sustituimos a Y en la segunda ecuacion y la multiplicamos por el coeficiente de Y en la segunda ecuacion");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Asi quedaria la segunda ecuacion:");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append(ecuacion[1][0]+"X + ("+ecuacion[1][2]+" por ("+ecuacion[0][4]+" - ("+ecuacion[0][0]+"X )"+"dividido    "+ecuacion[0][2]+")) = "+ecuacion[1][4]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Operamos hasta despejar X y de esta manera encontraremos el valor de X");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Este es el valor de X: "+ecuacion[1][1]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa    
	X.setText(Float.toString(ecuacion[1][1])); //Setea el valor en el respectivo espacio al que pertenence
        
        Mensaje.append("Ahora sustituimos el valor de X en la ecuacion que nos quedo de haber despejado a Y");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Y= ("+ecuacion[0][4]+" - ("+ecuacion[0][0]+"*"+ecuacion[1][1]+" ))"+" /"+ecuacion[0][2]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        
        Mensaje.append("Este es el valor de Y: "+ecuacion[0][3]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa    
	Y.setText(Float.toString(ecuacion[0][3])); //Setea el valor en el respectivo espacio al que pertenence
        
                      
    }
    
    
    //Procedimiento para la Ecuacion Matriz Inversa de 3x3
    public void ECUACION_SIMULTANEA_SUSTITUCION(JTextField A11, JTextField A12, JTextField A13, JTextField A14, JTextField A21, JTextField A22, JTextField A23, JTextField A24, JTextField A31, JTextField A32, JTextField A33, JTextField A34, JTextField B11, JTextField B12, JTextField B13, JTextField B14, JTextField B21, JTextField B22, JTextField B23, JTextField B24, JTextField B31, JTextField B32, JTextField B33, JTextField B34, JTextField X, JTextField Y, JTextField Z, JTextArea Mensaje) throws InterruptedException{
        //Declarar la Matriz A
        float[][] ecuacion = new float[3][7];
        
        //declaracion de mi vector para la ecuacion y de variables temporales a utilizar
	float temp1=0;
	float temp2=0;
	float temp3=0;
	float temp4=0;
	float temp5=0;
	float temp6=0;
	float temp7=0;
	float temp8=0;
	float temp9=0;
        
        //Asignar valores
        ecuacion[0][0]=Float.parseFloat(A11.getText());
        ecuacion[0][2]=Float.parseFloat(A12.getText());
        ecuacion[0][4]=Float.parseFloat(A13.getText());
        ecuacion[0][6]=Float.parseFloat(A14.getText());
        
        ecuacion[1][0]=Float.parseFloat(A21.getText());
        ecuacion[1][2]=Float.parseFloat(A22.getText());
        ecuacion[1][4]=Float.parseFloat(A23.getText());
        ecuacion[1][6]=Float.parseFloat(A24.getText());
        
        ecuacion[2][0]=Float.parseFloat(A31.getText());
        ecuacion[2][2]=Float.parseFloat(A32.getText());
        ecuacion[2][4]=Float.parseFloat(A33.getText());
        ecuacion[2][6]=Float.parseFloat(A34.getText());
        
        
        Mensaje.append("Solucionar un sistema de ecuaciones de 3x3 por medio del");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Metodo de la Sustitucion");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        
        //Mostrar la En matriz B
        B11.setText(Float.toString(ecuacion[0][0])); //Setea el valor en el respectivo espacio al que pertenence
        B12.setText(Float.toString(ecuacion[0][2])); //Setea el valor en el respectivo espacio al que pertenence
        B13.setText(Float.toString(ecuacion[0][4])); //Setea el valor en el respectivo espacio al que pertenence
        B14.setText(Float.toString(ecuacion[0][6])); //Setea el valor en el respectivo espacio al que pertenence
        
        B21.setText(Float.toString(ecuacion[1][0])); //Setea el valor en el respectivo espacio al que pertenence
        B22.setText(Float.toString(ecuacion[1][2])); //Setea el valor en el respectivo espacio al que pertenence
        B23.setText(Float.toString(ecuacion[1][4])); //Setea el valor en el respectivo espacio al que pertenence
        B24.setText(Float.toString(ecuacion[1][6])); //Setea el valor en el respectivo espacio al que pertenence
        
        B31.setText(Float.toString(ecuacion[2][0])); //Setea el valor en el respectivo espacio al que pertenence
        B32.setText(Float.toString(ecuacion[2][2])); //Setea el valor en el respectivo espacio al que pertenence
        B33.setText(Float.toString(ecuacion[2][4])); //Setea el valor en el respectivo espacio al que pertenence
        B34.setText(Float.toString(ecuacion[2][6])); //Setea el valor en el respectivo espacio al que pertenence
        
        //Proceso de calculo de los temporales y transposicion de estos ha las ecuaciones que seran las resultantes
            //Calculo de mis variables temporales guardaran los valores de haber sustituido z en la 1 y segunda ecuacion.
	temp3=((ecuacion[1][4]*ecuacion[2][6])/ecuacion[2][4]);
	temp4=((ecuacion[1][4]*-ecuacion[2][2])/ecuacion[2][4]);
	temp5=((ecuacion[1][4]*-ecuacion[2][0])/ecuacion[2][4]);
	temp6=((ecuacion[0][4]*ecuacion[2][6])/ecuacion[2][4]);
	temp7=((ecuacion[0][4]*-ecuacion[2][2])/ecuacion[2][4]);
	temp8=((ecuacion[0][4]*-ecuacion[2][0])/ecuacion[2][4]);
	//guardara el valor de temp5 saber xq no funciono al principio.
	temp9=temp5;
            //generacion de mi cuarta ecuacion al operar y aclarar los valores en la ecuacion #2. sobre esta misma
	ecuacion[1][0]=ecuacion[1][0]+temp5;
	ecuacion[1][2]=ecuacion[1][2]+temp4;
	ecuacion[1][6]=ecuacion[1][6]-temp3;
            //generacion de mi cuarta ecuacion al operar y aclarar los valores en la ecuacion #1. sobre esta misma
	ecuacion[0][0]=ecuacion[0][0]+temp8;
	ecuacion[0][2]=ecuacion[0][2]+temp7;
	ecuacion[0][6]=ecuacion[0][6]-temp6;
			
               
        Mensaje.append("Procederemos a Resolver nuestra ecuacion para ello despejamos la incognita Z de nuestra ecuacion #3.");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
	Mensaje.append("Quedandonos Z = "+ecuacion[2][6]+" + "+ecuacion[2][2]+"Y + "+ecuacion[2][0]+"X");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Todo eso dividido entre "+ecuacion[2][4]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Luego sustituimos la incognita Z en la ecuacion #1 ");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Quedandonos como resultante una ecuacion reducida ya solo con las Incognitas X y Y");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Siendo esta la ecuacion #4");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append(ecuacion[0][0]+"X + "+ecuacion[0][2]+"Y ="+ecuacion[0][6]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Hacemos lo mismo con la ecuacion #2 quedandonos asi una ecuacion resultante a la cual llamaremos ecuacion #5");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append(ecuacion[1][0]+"X + "+ecuacion[1][2]+"Y ="+ecuacion[1][6]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Luego trabajamos con estas dos ecuaciones para encontrar los valores de X y Y siendo este el Procedimiento: ");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        
        
	//Proceso ya para solucionar el sistema de 2 ecuaciones resultantes despues de haber sustituido
	ecuacion[1][0]=ecuacion[1][0]+temp9;
	//solucion de la primera incognita X1
	temp1=((ecuacion[1][2]*ecuacion[0][4])/ecuacion[0][2]);
	temp2=((-ecuacion[0][0]*ecuacion[1][2])/ecuacion[0][2]);
	ecuacion[1][0]=(ecuacion[1][0]+temp2);
	ecuacion[1][1]=((ecuacion[1][6]-temp1)/ecuacion[1][0]);
		
	//solucion de la segunda Incognita
	ecuacion[0][3]=((ecuacion[0][6]-(ecuacion[0][0]*ecuacion[1][1]))/ecuacion[0][2]);
			
	//solucion de la Tercera Incognita
	ecuacion[2][5]=(ecuacion[2][6]-(ecuacion[2][2]*ecuacion[0][3])-(ecuacion[2][0]*ecuacion[1][1]))/ecuacion[2][4];
	
        Thread.sleep(500);//Hace una pausa de 1/2 segundo en la ejecucion del programa    
	X.setText(Float.toString(ecuacion[1][1])); //Setea el valor en el respectivo espacio al que pertenence
        
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Despejamos a la incognita Y de la primera ecuacion y nos quedaria asi ");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("(esta misma ecuacion utilizaremos para encontrar Y al conocer el valor de X):");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Y= ("+ecuacion[0][6]+" - ("+ecuacion[0][0]+"X ))"+" / "+ecuacion[0][2]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Ahora sustituimos a Y en la segunda ecuacion y la multiplicamos por el coeficiente de Y en la segunda ecuacion.");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Asi quedaria la segunda ecuacion: ");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append(ecuacion[1][0]+"X + ("+ecuacion[1][2]+" por ("+ecuacion[0][6]+" - ("+ecuacion[0][0]+"X )"+" / "+ecuacion[0][2]+")) = "+ecuacion[1][6]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Operamos hasta despejar X y de esta manera encontraremos el valor de X");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Este es el valor de X = ");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Thread.sleep(1000);//Hace una pausa de 1 segundo en la ejecucion del programa    
	X.setText(Float.toString(ecuacion[1][1])); //Setea el valor en el respectivo espacio al que pertenence
        Mensaje.append(" "+ecuacion[1][1]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append(System.getProperty("line.separator"));
        
        Mensaje.append("Ahora sustituimos el valor de X en la ecuacion que nos quedo de haber despejado a Y");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("y operamos despues de haber operado obtendremos el Valor de Y");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Este es el valor de Y = ");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Thread.sleep(1000);//Hace una pausa de 1 segundo en la ejecucion del programa    
	Y.setText(Float.toString(ecuacion[0][3])); //Setea el valor en el respectivo espacio al que pertenence
        Mensaje.append(" "+ecuacion[0][3]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append(System.getProperty("line.separator"));
        
        Mensaje.append(System.getProperty("Por ultimo sustituimos los valores de X y Y en la ecuacion donde ya habiamos despejado la Incognita Z"));
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append(System.getProperty("de esta manera encontraremos el valor de Z"));
        Mensaje.append(System.getProperty("line.separator"));
        Mensaje.append("Este es el valor de Z = ");//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        Thread.sleep(1000);//Hace una pausa de 1 segundo en la ejecucion del programa    
	Z.setText(Float.toString(ecuacion[2][5])); //Setea el valor en el respectivo espacio al que pertenence
        Mensaje.append(" "+ecuacion[2][5]);//Envio de informacion a la ventana donde mostraremos la solucion
        Mensaje.append(System.getProperty("line.separator"));
        
                      
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //FINAL DE LA CLASE
}


    
