<?php include("cabecalho.php"); ?>
<?php include("conecta.php"); ?>
<?php include("bancoproduto.php"); ?>



<?php if (
    array_key_exists("removido", $_GET) &&
    $_GET["removido"] == "true"
) { ?>
    <p class="alert alert-success">Aluno não foi apagado com sucesso </p>
<?php } ?>

<table class="table table_striped table-bordered">

    <?php
    $escolas = relatorioInsituicao($conexao);
    foreach ($escolas as $coisa) {
    ?>

        <h1>Relatorios Escolas</h1> <br>
        <tr>
            <td>Nome</td>
            <td>CNPJ</td>
            <td>Endereço</td>
            <td>Número do celular</td>
            <td>Senha</td>

        <tr>
            <td><?= $coisa["nome"] ?></td>
            <td><?= $coisa["cnpj"] ?></td>
            <td><?= $coisa["endereco"] ?></td>
            <td><?= $coisa["numcelular"] ?></td>
            <td><?= $coisa["senha"] ?></td>
            <td>
                <a href="removeescola.php?cnpj=<?= $coisa['cnpj'] ?>" class="text-danger">remover</a>
            </td>
        </tr>




        </tr>
    <?php
    }
    ?>
    <table>
        <?php include("rodape.php"); ?>
    </table>