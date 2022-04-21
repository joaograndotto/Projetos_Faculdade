<?php include("cabecalho.php"); ?>

<h1>Formulário de cadastro frotas</h1>

<form action="adicionafrota.php">
    <table class="table">
        <tr>
            <td>Modelo:</td>
            <td><input class="form-control" type="text" name="modelo" placeholder="Digite o modelo"> </td>
        </tr>
        <tr>
            <td>Marca:</td>
            <td><input class="form-control" type="text" name="marca" placeholder="Digite a marca"> </td>
        </tr>
        <tr>
            <td>Placa:</td>
            <td><input class="form-control" type="text" name="placa" placeholder="Digite a placa"> </td>
        </tr>
        <tr>
            <td>ID:</td>
            <td><input class="form-control" type="number" name="id" placeholder="Digite o id"> </td>
        </tr>
        <tr>
            <td><input class="btn btn-primary" type="submit" value="Cadastrar"></td>
        </tr>
    </table>

</form>

<?php include("rodape.php"); ?>