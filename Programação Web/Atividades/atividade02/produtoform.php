<?php include ("cabecalho.php"); ?>

<h1>Formulário de Produtos</h1>

    <form action="adicionaproduto.php">
    <table class = "table">
        <tr>
            <td>Nome:</td>
            <td><input   class= "form-control" type="text" name="nome"> </td>
        </tr>
        <tr>
            <td>Cpf:</td>
            <td><input class= "form-control"  type="number" name="cpf"> </td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input class= "form-control"  type="email" name="email"> </td>
        </tr>
        <tr>
            <td>Endereço:</td>
            <td><input class= "form-control"  type="text" name="endereco"> </td>
        </tr>
        <tr><td><input  class = "btn btn-primary"type="submit" value="Cadastrar"></td></tr>
    </table>
    
    </form>

<?php include("rodape.php");?>