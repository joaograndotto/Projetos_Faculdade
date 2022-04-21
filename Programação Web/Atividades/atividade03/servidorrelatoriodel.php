<?php include("cabecalho.php");
include("conecta.php");
include("bancoproduto.php");
?>



<table class="table table_striped table-bordered">

    <?php
    $servidores = relatorioServidor($conexao);
    foreach ($servidores as $coisa) {
    ?>

        <h1>Relatorios dos Servidores</h1> <br>
        <tr>
            <td>Nome</td>
            <td>CPF</td>
            <td>Endereço</td>
            <td>Número do celular</td>
            <td>Senha</td>
            <td>Cargo</td>

        <tr>
            <td><?= $coisa["nome"] ?></td>
            <td><?= $coisa["cpf"] ?></td>
            <td><?= $coisa["endereco"] ?></td>
            <td><?= $coisa["numcelular"] ?></td>
            <td><?= $coisa["senha"] ?></td>
            <td><?= $coisa["cargo"] ?></td>
    
                <a href="removeservidor.php?cpf=<?= $coisa['cpf'] ?>" class="text-danger">remover</a>
            
        </tr>



        </tr>
    <?php
    }
    ?>
    <table>
        <?php include("rodape.php"); ?>
    </table>