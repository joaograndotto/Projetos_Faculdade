<?php include("cabecalho.php"); ?>
<?php include("conecta.php"); ?>
<?php include("bancoproduto.php"); ?>

<?php

$modelo = $_GET["modelo"];
$marca = $_GET["marca"];
$placa = $_GET["placa"];
$id = $_GET["id"];


if (cadastrarFrota($conexao, $modelo, $marca, $placa, $id)) {
?>
    <p class="alert alert-success">O veículo
        <?= $modelo; ?> foi cadastrado com sucesso! </p>
<?php
} else {
    $msg = mysqli_error($conexao);

?>
    <p class="alert-danger"> O veículo <?= $modelo; ?> não foi cadastrado:<?= $msg ?></p>
<?php
}
?>



<?php include("rodape.php"); ?>