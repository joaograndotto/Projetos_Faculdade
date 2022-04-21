<?php include("cabecalho.php"); ?>

<h1>Formulário de cadastro de servidores</h1>

<form action="adicionaservidor.php">
    <table class="table">
        <tr>
            <td>Nome:</td>
            <td><input class="form-control" type="text" name="nome" placeholder="Digite seu nome"> </td>
        </tr>
        <tr>
            <td>CPF:</td>
            <td><input class="form-control" type="number" name="cpf" placeholder="Digite seu CPF"> </td>
        </tr>
        <tr>
            <td>Endereco:</td>
            <td><input class="form-control" type="text" name="endereco" placeholder="Digite seu endereço"> </td>
        </tr>
        <tr>
            <td>Nº de celular:</td>
            <td><input class="form-control" type="text" name="numcelular" placeholder="Digite seu celular" > </td>
        </tr>
        <tr>
            <td>Senha:</td>
            <td><input class="form-control" type="text" name="senha" placeholder="Digite sua senha 8 digitos">  </td>
        </tr>
        <tr>
            <td>Cargo:</td>
            <td><input class="form-control" type="text" name="cargo" placeholder="Digite seu cargo">  </td>
        </tr>
        <tr>
            <td><input class="btn btn-primary" type="submit" value="Cadastrar"></td>
        </tr>
    </table>

</form>

<?php include("rodape.php"); ?>