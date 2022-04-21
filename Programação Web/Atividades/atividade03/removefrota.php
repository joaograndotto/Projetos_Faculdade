<?php include("cabecalho.php");
include("conecta.php");
include("bancoproduto.php");


$id = $_GET["id"];
removeFrota($conexao, $id);
header("Location: frotasrelatorio.php?removido=true");
die();
