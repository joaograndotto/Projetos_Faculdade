<?php include("cabecalho.php"); ?>
<?php include("conecta.php"); ?>
<?php include("bancoproduto.php"); ?>



<?php if (
    array_key_exists("removido", $_GET) &&
    $_GET["removido"] == "true"
) { ?>
    <p class="alert alert-success"> O aluno não foi apagado com sucesso </p>
<?php } ?>

<table class="table table_striped table-bordered">

    <?php
    $alunos = relatorioAluno($conexao);
    foreach ($alunos as $coisa) {
    ?>

        <h1>Relatorios dos Alunos</h1> <br>
        <tr>
            <td>Nome</td>
            <td>CPF</td>
            <td>Endereço</td>
            <td>Número do celular</td>
            <td>Senha</td>

        <tr>
            <td><?= $coisa["nome"] ?></td>
            <td><?= $coisa["cpf"] ?></td>
            <td><?= $coisa["endereco"] ?></td>
            <td><?= $coisa["numcelular"] ?></td>
            <td><?= $coisa["senha"] ?></td>
        </tr>


        <tr>
            <form action="alunorelatoriodel.php">
                <td><input href="alunorelatoriodel.php" class="btn btn-primary" type="submit" value="Remover Alunos"></td>
            </form>
        </tr>
        </tr>
    <?php
    }
    ?>
    <table>
        <?php include("rodape.php"); ?>
    </table>