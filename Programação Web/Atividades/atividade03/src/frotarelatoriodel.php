<?php include("cabecalho.php"); ?>
<?php include("conecta.php"); ?>
<?php include("bancoproduto.php"); ?>





<?php
$frotas = relatorioFrotas($conexao);
foreach ($frotas as $coisa) {
?>
    <table class="table table_striped table-bordered">

        <table class="table table_striped table-bordered">
            <h1>Relatorios Escolas</h1> <br>
            <tr>
                <td>Modelo</td>
                <td>ID</td>
                <td>Marca</td>
                <td>Placa</td>


            <tr>
                <td><?= $coisa["modelo"] ?></td>
                <td><?= $coisa["id"] ?></td>
                <td><?= $coisa["marca"] ?></td>
                <td><?= $coisa["placa"] ?></td>

                <td>
                    <a href="removefrota.php?id=<?= $coisa['id'] ?>" class="text-danger">remover</a>
                </td>
            </tr>




            </tr>
        <?php
    }
        ?>
        <table>
            <?php include("rodape.php"); ?>
        </table>