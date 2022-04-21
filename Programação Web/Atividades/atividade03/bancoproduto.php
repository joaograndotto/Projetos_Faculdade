<?php

function cadastrarAluno($conexao, $nome, $cpf, $endereco, $numcelular, $senha)
{
    $query = "INSERT INTO aluno (nome, cpf, endereco,numcelular, senha) VALUES('{$nome}', {$cpf}, '{$endereco}', '{$numcelular}','{$senha}')";
    $resultadoDaInsercao = mysqli_query($conexao, $query);
    return $resultadoDaInsercao;
}

function cadastrarServidor($conexao, $nome, $cpf, $endereco, $numcelular, $senha, $cargo)
{
    $query = "INSERT INTO servidor (nome, cpf, endereco,numcelular, senha, cargo) VALUES('{$nome}', {$cpf}, '{$endereco}', '{$numcelular}','{$senha}','{$cargo}')";
    $resultadoDaInsercao = mysqli_query($conexao, $query);
    return $resultadoDaInsercao;
}

function cadastrarInstituicao($conexao, $nome, $cnpj, $endereco, $numcelular, $senha)
{
    $query = "INSERT INTO instituicao (nome, cnpj, endereco,numcelular, senha) VALUES('{$nome}', {$cnpj}, '{$endereco}', '{$numcelular}','{$senha}')";
    $resultadoDaInsercao = mysqli_query($conexao, $query);
    return $resultadoDaInsercao;
}
function cadastrarFrota($conexao, $modelo, $marca, $placa, $id)
{
    $query = "INSERT INTO frota (modelo, marca, placa, id) VALUES('{$modelo}', '{$marca}', '{$placa}', {$id})";
    $resultadoDaInsercao = mysqli_query($conexao, $query);
    return $resultadoDaInsercao;
}

function relatorioAluno($conexao)
{
    $alunos = array();
    $resultado = mysqli_query($conexao, "select * from aluno");
    while ($aluno = mysqli_fetch_assoc($resultado)) {
        array_push($alunos, $aluno);
    }
    return $alunos;
}

function relatorioInsituicao($conexao)
{
    $instituicoes = array();
    $resultado = mysqli_query($conexao, "select * from instituicao");
    while ($instituicao = mysqli_fetch_assoc($resultado)) {
        array_push($instituicoes, $instituicao);
    }
    return $instituicoes;
}

function relatorioServidor($conexao)
{
    $servidores = array();
    $resultado = mysqli_query($conexao, "select * from servidor");
    while ($servidor = mysqli_fetch_assoc($resultado)) {
        array_push($servidores, $servidor);
    }
    return $servidores;
}

function relatorioFrotas($conexao)
{
    $frotas = array();
    $resultado = mysqli_query($conexao, "select * from frota");
    while ($frota = mysqli_fetch_assoc($resultado)) {
        array_push($frotas, $frota);
    }
    return $frotas;
}

/*Metódo para verificar os dados para efetivar o login, já que para fazer o 
login, é necessario que o usuário já tenha se cadastrado*/
function verificarLogin($conexao, $cpf, $senha)
{
    $dados = array();
    $resultado = mysqli_query($conexao, "select cpf, senha from aluno");
    while ($frota = mysqli_fetch_assoc($resultado)) {
        array_push($dados, $frota);
    }

    foreach ($dados as $dado) {

        if ($dado["cpf"] == $cpf and  $dado["senha"] == $senha) {

            return true;
        } else {

            return false;
        }
    }
}


function removeAluno($conexao, $cpf)
{
    $query = "delete from aluno where cpf = {$cpf} ";
    return mysqli_query($conexao, $query);
}

function removeServidor($conexao, $cpf)
{
    $query = "delete from servidor where cpf = {$cpf} ";
    return mysqli_query($conexao, $query);
}

function removeInstituicao($conexao, $cnpj)
{
    $query = "delete from instituicao where cnpj = {$cnpj} ";
    return mysqli_query($conexao, $query);
}

function removeFrota($conexao, $id)
{
    $query = "delete from frota where id = {$id} ";
    return mysqli_query($conexao, $query);
}
