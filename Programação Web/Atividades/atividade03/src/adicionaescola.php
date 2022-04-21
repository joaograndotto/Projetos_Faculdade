<?php include("cabecalho.php"); ?>
<?php include("conecta.php"); ?>
<?php include("bancoproduto.php"); ?>

<?php

$nome = $_GET["nome"];
$cnpj = $_GET["cnpj"];
$endereco = $_GET["endereco"];
$numcelular = $_GET["numcelular"];
$senha = $_GET["senha"];


if (cadastrarInstituicao($conexao, $nome, $cnpj, $endereco, $numcelular, $senha)) {
?>
    <p class="alert alert-success">A instituição
        <?= $nome; ?> foi cadastrada com sucesso! </p>
<?php
} else {
    $msg = mysqli_error($conexao);

?>
    <p class="alert-danger"> A instituição<?= $nome; ?> não foi cadastrada:<?= $msg ?></p>
<?php
}
?>



<?php include("rodape.php"); ?>