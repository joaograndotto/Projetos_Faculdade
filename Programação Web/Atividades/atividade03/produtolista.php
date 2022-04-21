<?php include("cabecalho.php"); ?>
<?php include("conecta.php"); ?>
<?php include("bancoproduto.php"); ?>


<table class="table table_striped table-bordered">

    <?php
    $produtos = listaProduto($conexao);
    foreach ($produtos as $coisa) {
    ?>
        <tr>
            <td><?= $coisa["NOME"] ?></td>
            <td><?= $coisa["PRECO"] ?></td>

        </tr>
    <?php
    }
    ?>
    <table>
        <?php include("rodape.php"); ?>
    </table>




















</table>