<?php include("cabecalho.php"); ?>
<?php include("conecta.php"); ?>
<?php include("bancoproduto.php"); ?>

<?php if (
    array_key_exists("removido", $_GET) &&
    $_GET["removido"] == "true"
) { ?>
    <p class="alert alert-success">O servidor foi apagado com sucesso </p>
<?php } ?>

<table class="table table_striped table-bordered">

    <?php
    $servidores = relatorioServidor($conexao);
    foreach ($servidores as $coisa) {
    ?>
        <h1>Relátorios dos Servidores</h1> <br>
        <tr>
            <td>Nome</td>
            <td>CPF</td>
            <td>Endereço</td>
            <td>Número de celular</td>
            <td>Senha</td>
            <td>Cargo</td>

        <tr>
            <td><?= $coisa["nome"] ?></td>
            <td><?= $coisa["cpf"] ?></td>
            <td><?= $coisa["endereco"] ?></td>
            <td><?= $coisa["numcelular"] ?></td>
            <td><?= $coisa["senha"] ?></td>
            <td><?= $coisa["cargo"] ?></td>


        </tr>

        <tr>
            <form action="servidorrelatoriodel.php">
                <td><input href="servidorrelatoriodel.php" class="btn btn-primary" type="submit" value="Remover Servidor"></td>
            </form>
        </tr>





        </tr>
    <?php
    }
    ?>
    <table>
        <?php include("rodape.php"); ?>
    </table>