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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //FINAL DE LA CLASE
}


    
