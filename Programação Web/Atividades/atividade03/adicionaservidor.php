<?php include("cabecalho.php"); ?>
<?php include("conecta.php"); ?>
<?php include("bancoproduto.php"); ?>

<?php

$nome = $_GET["nome"];
$cpf = $_GET["cpf"];
$endereco = $_GET["endereco"];
$numcelular = $_GET["numcelular"];
$senha = $_GET["senha"];
$cargo = $_GET["cargo"];

if (cadastrarServidor($conexao, $nome, $cpf, $endereco, $numcelular, $senha, $cargo)) {
?>
    <p class="alert alert-success">O servidor
        <?= $nome; ?> foi cadastrado com sucesso! </p>
<?php
} else {
    $msg = mysqli_error($conexao);

?>
    <p class="alert-danger"> O servidor<?= $nome; ?> não foi cadastrado:<?= $msg ?></p>
<?php
}
?>



<?php include("rodape.php"); ?>