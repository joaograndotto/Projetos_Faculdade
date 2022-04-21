<?php include("cabecalho.php"); ?>
<?php include("conecta.php"); ?>
<?php include("bancoproduto.php"); ?>

<?php

$cpf = $_GET["cpf"];
$senha = $_GET["senha"];



if (verificarLogin($conexao, $cpf, $senha)) {
?>
    <p class="alert alert-success">O usuario
        <?= $cpf; ?> foi logado com sucesso! </p>
<?php
} else {
    $msg = mysqli_error($conexao);

?>
    <p class="alert-danger"> A instituição<?= $cpf; ?> não foi cadastrada:<?= $msg ?></p>
<?php
}
?>



<?php include("rodape.php"); ?>