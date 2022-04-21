<?php include("cabecalho.php"); ?>
<?php include("conecta.php"); ?>
<?php include("bancoproduto.php"); ?>


<?php if (
    array_key_exists("removido", $_GET) &&
    $_GET["removido"] == "true"
) { ?>
    <p class="alert alert-success">O Veiculo foi apagado com sucesso </p>
<?php } ?>


<table class="table table_striped table-bordered">

    <table class="table table_striped table-bordered">

        <?php
        $frotas = relatorioFrotas($conexao);
        foreach ($frotas as $coisa) {
        ?>
            <h1>Relatorios das Frotas</h1> <br>
            <tr>
            <tr>
                <td>Modelo</td>
                <td>Marca</td>
                <td>Placa</td>
                <td>ID</td>
            </tr>

            <tr>
                <td><?= $coisa["modelo"] ?></td>
                <td><?= $coisa["marca"] ?></td>
                <td><?= $coisa["placa"] ?></td>
                <td><?= $coisa["id"] ?></td>
            </tr>




            <tr>
                <form action="frotarelatoriodel.php">
                    <td><input href="frotarelatoriodel.php" class="btn btn-primary" type="submit" value="Remover frotas"></td>
                </form>
            </tr>
            </tr>
            
        <?php
        }
        ?>
        <table>
            <?php include("rodape.php"); ?>
        </table>