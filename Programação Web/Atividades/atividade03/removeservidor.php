<?php include("cabecalho.php");
include("conecta.php");
include("bancoproduto.php");


$cpf = $_GET["cpf"];
removeServidor($conexao, $cpf);
header("Location: servidorrelatorio.php?removido=true");
die();
