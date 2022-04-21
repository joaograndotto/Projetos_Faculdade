<?php include("cabecalho.php"); ?>

<h1>Tela de Login</h1>

<form action="loginverifica.php">
    <table class="table">

        <td>CPF:</td>
        <td><input class="form-control" type="number" name="cpf" placeholder="Digite seu CPF"> </td>
        </tr>

        <td>Senha:</td>
        <td><input class="form-control" type="text" name="senha" placeholder="Digite sua senha 8 digitos"> </td>
        </tr>
        <tr>
            <td><input class="btn btn-primary" type="submit" value="Entrar"></td>
        </tr>
    </table>

</form>

<?php include("rodape.php"); ?>