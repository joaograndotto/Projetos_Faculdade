<?php include("cabecalho.php");
include("conecta.php");
include("bancoproduto.php");
?>


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
            <td> 
                <a href="removealuno.php?cpf=<?= $coisa['cpf'] ?>" class="text-danger">remover</a>              
            </td>
        </tr>



        </tr>
    <?php
    }
    ?>
    <table>
        <?php include("rodape.php"); ?>
    </table>