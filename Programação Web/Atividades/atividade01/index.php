<?php

/*Calculadora de IMC*/
$peso = 100;
$altura = 1.80;

$IMC = 100/1.80**2;

echo "$IMC";

/*Tabuada completa*/
$lista = [0, 1, 2 , 3, 4 , 5, 6, 7, 8, 9, 10];
$contador= 0;
while($contador<=10){
    for($i = 0; $i <= 10; $i++){
    $resultado = $lista[$contador] * $lista[$i] . ("<br>");
    echo "$contador X $i= $resultado";

}
   echo  ("<br>");
    $contador++;
}
