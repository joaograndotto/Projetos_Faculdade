<?php include ("cabecalho.php"); ?>
<?php 
$nome = $_GET["nome"];
$cpf = $_GET["cpf"];
$email = $_GET["email"];
$endereco = $_GET["endereco"];

$query = "INSERT INTO produtos(NOME, CPF, EMAIL, ENDERECO) VALUES('{$nome}', '{$cpf}', '{$email}', '{$endereco}')";
$conexao = mysqli_connect('localhost','root','','loja');
if(mysqli_query($conexao,$query)){
?>
<p class="alert alert-success"> CADASTRO CONCLUÍDO </p>
<?php
}else{
    $msg = mysqli_error($conexao);

?>
<p class= "alert-danger">CADASTRO DA PESSOA<?= $nome;?> NÃO FOI FEITO:<?=$msg?></p>
<?php
}
?>



<?php include("rodape.php");?>
