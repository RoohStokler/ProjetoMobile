package com.example.projetointegrador.data.bd.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Cadastro")
public class cadastroEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;

    //Dados Pessoais
    @ColumnInfo(name = "nomeCompleto")
    public String nome;
    @ColumnInfo(name = "cpf")
    public String cpf;
    @ColumnInfo(name = "data")
    public String data;

    //Endereço
    @ColumnInfo(name = "rua")
    public String rua;
    @ColumnInfo(name = "bairro")
    public String bairro;
    @ColumnInfo(name = "numero")
    public int numero;
    @ColumnInfo(name = "cep")
    public String cep;
    @ColumnInfo(name = "complemento")
    public String complemento;
    @ColumnInfo(name = "cidade")
    public String cidade;
    @ColumnInfo(name = "estado")
    public String estado;

    //Contatos
    @ColumnInfo(name = "telResidencial")
    public String telResidencial;
    @ColumnInfo(name = "telRecado")
    public String telRecado;
    @ColumnInfo(name = "celular")
    public String celular;
}
