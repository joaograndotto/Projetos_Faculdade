<?php include("cabecalho.php"); ?>
<?php include("conecta.php"); ?>
<?php include("bancoproduto.php"); ?>

<?php

$nome = $_GET["nome"];
$cpf = $_GET["cpf"];
$endereco = $_GET["endereco"];
$numcelular = $_GET["numcelular"];
$senha = $_GET["senha"];

if (cadastrarAluno($conexao, $nome, $cpf, $endereco, $numcelular, $senha)) {
?>
    <p class="alert alert-success">O aluno
        <?= $nome; ?> foi cadastrado com sucesso! </p>
<?php
} else {
    $msg = mysqli_error($conexao);

?>
    <p class="alert-danger"> O aluno<?= $nome; ?> não foi cadastrado:<?= $msg ?></p>
<?php
}
?>



<?php include("rodape.php"); ?>