<?php include("cabecalho.php"); 
include("conecta.php"); 
include("bancoproduto.php");


$cpf = $_GET["cpf"];
removeAluno($conexao, $cpf);
header("Location: alunorelatorio.php?removido=true");
die();
?>