<?php include("cabecalho.php");
include("conecta.php");
include("bancoproduto.php");


$cnpj = $_GET["cnpj"];
removeInstituicao($conexao, $cnpj);
header("Location: escolarelatorio.php?removido=true");
die();
