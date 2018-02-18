/**
 * Funcionario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.logicalis.la.rd.web_service.funcionarios;

public class Funcionario  implements java.io.Serializable {
    private java.lang.String registro;

    private java.lang.String nome;

    private java.lang.String apelido;

    private java.lang.String email;

    private java.util.Date data_nascimento;

    private java.lang.String endereco;

    private java.lang.String bairro;

    private java.lang.String complemento;

    private java.lang.String cep;

    private java.lang.Integer ramal;

    private java.lang.String rg;

    private java.lang.String cpf;

    private java.lang.String pis;

    private java.util.Date data_admissao;

    private java.util.Date data_demissao;

    private java.lang.Integer id_cidade_funcionario_totvs;

    private java.lang.String registro_gestor;

    private boolean apontamento_via_relogio_ponto;

    private int id_cargo_totvs;

    private java.lang.String descricao_cargo_totvs;

    private int cargo_confianca;

    private int codigo_categoria_horaria;

    private java.lang.String descricao_categoria_horaria;

    private java.lang.String codigo_lotacao;

    private java.lang.String descricao_lotacao;

    private java.lang.String id_localidade_base_totvs;

    private java.lang.String nome_localidade;

    private java.lang.String cep_localidade;

    private int id_cidade_localidade_totvs;

    private java.lang.String nome_cidade_localidade;

    private int id_uf_localidade_totvs;

    private java.lang.String nome_uf_localidade;

    private java.lang.String sigla_uf_localidade;

    private java.lang.String endereco_localidade;

    private java.lang.String bairro_localidade;

    private java.lang.String numero_localidade;

    private java.lang.String complemento_localidade;

    private java.lang.String cnpj;

    private int id_disciplina_totvs;

    private java.lang.String descricao_disciplina;

    private int id_empresa_totvs;

    private java.lang.String descricao_empresa;

    private int id_pais_localidade_totvs;

    private java.lang.String nome_localidade_pais;

    private java.lang.String locale_pais;

    public Funcionario() {
    }

    public Funcionario(
           java.lang.String registro,
           java.lang.String nome,
           java.lang.String apelido,
           java.lang.String email,
           java.util.Date data_nascimento,
           java.lang.String endereco,
           java.lang.String bairro,
           java.lang.String complemento,
           java.lang.String cep,
           java.lang.Integer ramal,
           java.lang.String rg,
           java.lang.String cpf,
           java.lang.String pis,
           java.util.Date data_admissao,
           java.util.Date data_demissao,
           java.lang.Integer id_cidade_funcionario_totvs,
           java.lang.String registro_gestor,
           boolean apontamento_via_relogio_ponto,
           int id_cargo_totvs,
           java.lang.String descricao_cargo_totvs,
           int cargo_confianca,
           int codigo_categoria_horaria,
           java.lang.String descricao_categoria_horaria,
           java.lang.String codigo_lotacao,
           java.lang.String descricao_lotacao,
           java.lang.String id_localidade_base_totvs,
           java.lang.String nome_localidade,
           java.lang.String cep_localidade,
           int id_cidade_localidade_totvs,
           java.lang.String nome_cidade_localidade,
           int id_uf_localidade_totvs,
           java.lang.String nome_uf_localidade,
           java.lang.String sigla_uf_localidade,
           java.lang.String endereco_localidade,
           java.lang.String bairro_localidade,
           java.lang.String numero_localidade,
           java.lang.String complemento_localidade,
           java.lang.String cnpj,
           int id_disciplina_totvs,
           java.lang.String descricao_disciplina,
           int id_empresa_totvs,
           java.lang.String descricao_empresa,
           int id_pais_localidade_totvs,
           java.lang.String nome_localidade_pais,
           java.lang.String locale_pais) {
           this.registro = registro;
           this.nome = nome;
           this.apelido = apelido;
           this.email = email;
           this.data_nascimento = data_nascimento;
           this.endereco = endereco;
           this.bairro = bairro;
           this.complemento = complemento;
           this.cep = cep;
           this.ramal = ramal;
           this.rg = rg;
           this.cpf = cpf;
           this.pis = pis;
           this.data_admissao = data_admissao;
           this.data_demissao = data_demissao;
           this.id_cidade_funcionario_totvs = id_cidade_funcionario_totvs;
           this.registro_gestor = registro_gestor;
           this.apontamento_via_relogio_ponto = apontamento_via_relogio_ponto;
           this.id_cargo_totvs = id_cargo_totvs;
           this.descricao_cargo_totvs = descricao_cargo_totvs;
           this.cargo_confianca = cargo_confianca;
           this.codigo_categoria_horaria = codigo_categoria_horaria;
           this.descricao_categoria_horaria = descricao_categoria_horaria;
           this.codigo_lotacao = codigo_lotacao;
           this.descricao_lotacao = descricao_lotacao;
           this.id_localidade_base_totvs = id_localidade_base_totvs;
           this.nome_localidade = nome_localidade;
           this.cep_localidade = cep_localidade;
           this.id_cidade_localidade_totvs = id_cidade_localidade_totvs;
           this.nome_cidade_localidade = nome_cidade_localidade;
           this.id_uf_localidade_totvs = id_uf_localidade_totvs;
           this.nome_uf_localidade = nome_uf_localidade;
           this.sigla_uf_localidade = sigla_uf_localidade;
           this.endereco_localidade = endereco_localidade;
           this.bairro_localidade = bairro_localidade;
           this.numero_localidade = numero_localidade;
           this.complemento_localidade = complemento_localidade;
           this.cnpj = cnpj;
           this.id_disciplina_totvs = id_disciplina_totvs;
           this.descricao_disciplina = descricao_disciplina;
           this.id_empresa_totvs = id_empresa_totvs;
           this.descricao_empresa = descricao_empresa;
           this.id_pais_localidade_totvs = id_pais_localidade_totvs;
           this.nome_localidade_pais = nome_localidade_pais;
           this.locale_pais = locale_pais;
    }


    /**
     * Gets the registro value for this Funcionario.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this Funcionario.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the nome value for this Funcionario.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Funcionario.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the apelido value for this Funcionario.
     * 
     * @return apelido
     */
    public java.lang.String getApelido() {
        return apelido;
    }


    /**
     * Sets the apelido value for this Funcionario.
     * 
     * @param apelido
     */
    public void setApelido(java.lang.String apelido) {
        this.apelido = apelido;
    }


    /**
     * Gets the email value for this Funcionario.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Funcionario.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the data_nascimento value for this Funcionario.
     * 
     * @return data_nascimento
     */
    public java.util.Date getData_nascimento() {
        return data_nascimento;
    }


    /**
     * Sets the data_nascimento value for this Funcionario.
     * 
     * @param data_nascimento
     */
    public void setData_nascimento(java.util.Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }


    /**
     * Gets the endereco value for this Funcionario.
     * 
     * @return endereco
     */
    public java.lang.String getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this Funcionario.
     * 
     * @param endereco
     */
    public void setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
    }


    /**
     * Gets the bairro value for this Funcionario.
     * 
     * @return bairro
     */
    public java.lang.String getBairro() {
        return bairro;
    }


    /**
     * Sets the bairro value for this Funcionario.
     * 
     * @param bairro
     */
    public void setBairro(java.lang.String bairro) {
        this.bairro = bairro;
    }


    /**
     * Gets the complemento value for this Funcionario.
     * 
     * @return complemento
     */
    public java.lang.String getComplemento() {
        return complemento;
    }


    /**
     * Sets the complemento value for this Funcionario.
     * 
     * @param complemento
     */
    public void setComplemento(java.lang.String complemento) {
        this.complemento = complemento;
    }


    /**
     * Gets the cep value for this Funcionario.
     * 
     * @return cep
     */
    public java.lang.String getCep() {
        return cep;
    }


    /**
     * Sets the cep value for this Funcionario.
     * 
     * @param cep
     */
    public void setCep(java.lang.String cep) {
        this.cep = cep;
    }


    /**
     * Gets the ramal value for this Funcionario.
     * 
     * @return ramal
     */
    public java.lang.Integer getRamal() {
        return ramal;
    }


    /**
     * Sets the ramal value for this Funcionario.
     * 
     * @param ramal
     */
    public void setRamal(java.lang.Integer ramal) {
        this.ramal = ramal;
    }


    /**
     * Gets the rg value for this Funcionario.
     * 
     * @return rg
     */
    public java.lang.String getRg() {
        return rg;
    }


    /**
     * Sets the rg value for this Funcionario.
     * 
     * @param rg
     */
    public void setRg(java.lang.String rg) {
        this.rg = rg;
    }


    /**
     * Gets the cpf value for this Funcionario.
     * 
     * @return cpf
     */
    public java.lang.String getCpf() {
        return cpf;
    }


    /**
     * Sets the cpf value for this Funcionario.
     * 
     * @param cpf
     */
    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }


    /**
     * Gets the pis value for this Funcionario.
     * 
     * @return pis
     */
    public java.lang.String getPis() {
        return pis;
    }


    /**
     * Sets the pis value for this Funcionario.
     * 
     * @param pis
     */
    public void setPis(java.lang.String pis) {
        this.pis = pis;
    }


    /**
     * Gets the data_admissao value for this Funcionario.
     * 
     * @return data_admissao
     */
    public java.util.Date getData_admissao() {
        return data_admissao;
    }


    /**
     * Sets the data_admissao value for this Funcionario.
     * 
     * @param data_admissao
     */
    public void setData_admissao(java.util.Date data_admissao) {
        this.data_admissao = data_admissao;
    }


    /**
     * Gets the data_demissao value for this Funcionario.
     * 
     * @return data_demissao
     */
    public java.util.Date getData_demissao() {
        return data_demissao;
    }


    /**
     * Sets the data_demissao value for this Funcionario.
     * 
     * @param data_demissao
     */
    public void setData_demissao(java.util.Date data_demissao) {
        this.data_demissao = data_demissao;
    }


    /**
     * Gets the id_cidade_funcionario_totvs value for this Funcionario.
     * 
     * @return id_cidade_funcionario_totvs
     */
    public java.lang.Integer getId_cidade_funcionario_totvs() {
        return id_cidade_funcionario_totvs;
    }


    /**
     * Sets the id_cidade_funcionario_totvs value for this Funcionario.
     * 
     * @param id_cidade_funcionario_totvs
     */
    public void setId_cidade_funcionario_totvs(java.lang.Integer id_cidade_funcionario_totvs) {
        this.id_cidade_funcionario_totvs = id_cidade_funcionario_totvs;
    }


    /**
     * Gets the registro_gestor value for this Funcionario.
     * 
     * @return registro_gestor
     */
    public java.lang.String getRegistro_gestor() {
        return registro_gestor;
    }


    /**
     * Sets the registro_gestor value for this Funcionario.
     * 
     * @param registro_gestor
     */
    public void setRegistro_gestor(java.lang.String registro_gestor) {
        this.registro_gestor = registro_gestor;
    }


    /**
     * Gets the apontamento_via_relogio_ponto value for this Funcionario.
     * 
     * @return apontamento_via_relogio_ponto
     */
    public boolean isApontamento_via_relogio_ponto() {
        return apontamento_via_relogio_ponto;
    }


    /**
     * Sets the apontamento_via_relogio_ponto value for this Funcionario.
     * 
     * @param apontamento_via_relogio_ponto
     */
    public void setApontamento_via_relogio_ponto(boolean apontamento_via_relogio_ponto) {
        this.apontamento_via_relogio_ponto = apontamento_via_relogio_ponto;
    }


    /**
     * Gets the id_cargo_totvs value for this Funcionario.
     * 
     * @return id_cargo_totvs
     */
    public int getId_cargo_totvs() {
        return id_cargo_totvs;
    }


    /**
     * Sets the id_cargo_totvs value for this Funcionario.
     * 
     * @param id_cargo_totvs
     */
    public void setId_cargo_totvs(int id_cargo_totvs) {
        this.id_cargo_totvs = id_cargo_totvs;
    }


    /**
     * Gets the descricao_cargo_totvs value for this Funcionario.
     * 
     * @return descricao_cargo_totvs
     */
    public java.lang.String getDescricao_cargo_totvs() {
        return descricao_cargo_totvs;
    }


    /**
     * Sets the descricao_cargo_totvs value for this Funcionario.
     * 
     * @param descricao_cargo_totvs
     */
    public void setDescricao_cargo_totvs(java.lang.String descricao_cargo_totvs) {
        this.descricao_cargo_totvs = descricao_cargo_totvs;
    }


    /**
     * Gets the cargo_confianca value for this Funcionario.
     * 
     * @return cargo_confianca
     */
    public int getCargo_confianca() {
        return cargo_confianca;
    }


    /**
     * Sets the cargo_confianca value for this Funcionario.
     * 
     * @param cargo_confianca
     */
    public void setCargo_confianca(int cargo_confianca) {
        this.cargo_confianca = cargo_confianca;
    }


    /**
     * Gets the codigo_categoria_horaria value for this Funcionario.
     * 
     * @return codigo_categoria_horaria
     */
    public int getCodigo_categoria_horaria() {
        return codigo_categoria_horaria;
    }


    /**
     * Sets the codigo_categoria_horaria value for this Funcionario.
     * 
     * @param codigo_categoria_horaria
     */
    public void setCodigo_categoria_horaria(int codigo_categoria_horaria) {
        this.codigo_categoria_horaria = codigo_categoria_horaria;
    }


    /**
     * Gets the descricao_categoria_horaria value for this Funcionario.
     * 
     * @return descricao_categoria_horaria
     */
    public java.lang.String getDescricao_categoria_horaria() {
        return descricao_categoria_horaria;
    }


    /**
     * Sets the descricao_categoria_horaria value for this Funcionario.
     * 
     * @param descricao_categoria_horaria
     */
    public void setDescricao_categoria_horaria(java.lang.String descricao_categoria_horaria) {
        this.descricao_categoria_horaria = descricao_categoria_horaria;
    }


    /**
     * Gets the codigo_lotacao value for this Funcionario.
     * 
     * @return codigo_lotacao
     */
    public java.lang.String getCodigo_lotacao() {
        return codigo_lotacao;
    }


    /**
     * Sets the codigo_lotacao value for this Funcionario.
     * 
     * @param codigo_lotacao
     */
    public void setCodigo_lotacao(java.lang.String codigo_lotacao) {
        this.codigo_lotacao = codigo_lotacao;
    }


    /**
     * Gets the descricao_lotacao value for this Funcionario.
     * 
     * @return descricao_lotacao
     */
    public java.lang.String getDescricao_lotacao() {
        return descricao_lotacao;
    }


    /**
     * Sets the descricao_lotacao value for this Funcionario.
     * 
     * @param descricao_lotacao
     */
    public void setDescricao_lotacao(java.lang.String descricao_lotacao) {
        this.descricao_lotacao = descricao_lotacao;
    }


    /**
     * Gets the id_localidade_base_totvs value for this Funcionario.
     * 
     * @return id_localidade_base_totvs
     */
    public java.lang.String getId_localidade_base_totvs() {
        return id_localidade_base_totvs;
    }


    /**
     * Sets the id_localidade_base_totvs value for this Funcionario.
     * 
     * @param id_localidade_base_totvs
     */
    public void setId_localidade_base_totvs(java.lang.String id_localidade_base_totvs) {
        this.id_localidade_base_totvs = id_localidade_base_totvs;
    }


    /**
     * Gets the nome_localidade value for this Funcionario.
     * 
     * @return nome_localidade
     */
    public java.lang.String getNome_localidade() {
        return nome_localidade;
    }


    /**
     * Sets the nome_localidade value for this Funcionario.
     * 
     * @param nome_localidade
     */
    public void setNome_localidade(java.lang.String nome_localidade) {
        this.nome_localidade = nome_localidade;
    }


    /**
     * Gets the cep_localidade value for this Funcionario.
     * 
     * @return cep_localidade
     */
    public java.lang.String getCep_localidade() {
        return cep_localidade;
    }


    /**
     * Sets the cep_localidade value for this Funcionario.
     * 
     * @param cep_localidade
     */
    public void setCep_localidade(java.lang.String cep_localidade) {
        this.cep_localidade = cep_localidade;
    }


    /**
     * Gets the id_cidade_localidade_totvs value for this Funcionario.
     * 
     * @return id_cidade_localidade_totvs
     */
    public int getId_cidade_localidade_totvs() {
        return id_cidade_localidade_totvs;
    }


    /**
     * Sets the id_cidade_localidade_totvs value for this Funcionario.
     * 
     * @param id_cidade_localidade_totvs
     */
    public void setId_cidade_localidade_totvs(int id_cidade_localidade_totvs) {
        this.id_cidade_localidade_totvs = id_cidade_localidade_totvs;
    }


    /**
     * Gets the nome_cidade_localidade value for this Funcionario.
     * 
     * @return nome_cidade_localidade
     */
    public java.lang.String getNome_cidade_localidade() {
        return nome_cidade_localidade;
    }


    /**
     * Sets the nome_cidade_localidade value for this Funcionario.
     * 
     * @param nome_cidade_localidade
     */
    public void setNome_cidade_localidade(java.lang.String nome_cidade_localidade) {
        this.nome_cidade_localidade = nome_cidade_localidade;
    }


    /**
     * Gets the id_uf_localidade_totvs value for this Funcionario.
     * 
     * @return id_uf_localidade_totvs
     */
    public int getId_uf_localidade_totvs() {
        return id_uf_localidade_totvs;
    }


    /**
     * Sets the id_uf_localidade_totvs value for this Funcionario.
     * 
     * @param id_uf_localidade_totvs
     */
    public void setId_uf_localidade_totvs(int id_uf_localidade_totvs) {
        this.id_uf_localidade_totvs = id_uf_localidade_totvs;
    }


    /**
     * Gets the nome_uf_localidade value for this Funcionario.
     * 
     * @return nome_uf_localidade
     */
    public java.lang.String getNome_uf_localidade() {
        return nome_uf_localidade;
    }


    /**
     * Sets the nome_uf_localidade value for this Funcionario.
     * 
     * @param nome_uf_localidade
     */
    public void setNome_uf_localidade(java.lang.String nome_uf_localidade) {
        this.nome_uf_localidade = nome_uf_localidade;
    }


    /**
     * Gets the sigla_uf_localidade value for this Funcionario.
     * 
     * @return sigla_uf_localidade
     */
    public java.lang.String getSigla_uf_localidade() {
        return sigla_uf_localidade;
    }


    /**
     * Sets the sigla_uf_localidade value for this Funcionario.
     * 
     * @param sigla_uf_localidade
     */
    public void setSigla_uf_localidade(java.lang.String sigla_uf_localidade) {
        this.sigla_uf_localidade = sigla_uf_localidade;
    }


    /**
     * Gets the endereco_localidade value for this Funcionario.
     * 
     * @return endereco_localidade
     */
    public java.lang.String getEndereco_localidade() {
        return endereco_localidade;
    }


    /**
     * Sets the endereco_localidade value for this Funcionario.
     * 
     * @param endereco_localidade
     */
    public void setEndereco_localidade(java.lang.String endereco_localidade) {
        this.endereco_localidade = endereco_localidade;
    }


    /**
     * Gets the bairro_localidade value for this Funcionario.
     * 
     * @return bairro_localidade
     */
    public java.lang.String getBairro_localidade() {
        return bairro_localidade;
    }


    /**
     * Sets the bairro_localidade value for this Funcionario.
     * 
     * @param bairro_localidade
     */
    public void setBairro_localidade(java.lang.String bairro_localidade) {
        this.bairro_localidade = bairro_localidade;
    }


    /**
     * Gets the numero_localidade value for this Funcionario.
     * 
     * @return numero_localidade
     */
    public java.lang.String getNumero_localidade() {
        return numero_localidade;
    }


    /**
     * Sets the numero_localidade value for this Funcionario.
     * 
     * @param numero_localidade
     */
    public void setNumero_localidade(java.lang.String numero_localidade) {
        this.numero_localidade = numero_localidade;
    }


    /**
     * Gets the complemento_localidade value for this Funcionario.
     * 
     * @return complemento_localidade
     */
    public java.lang.String getComplemento_localidade() {
        return complemento_localidade;
    }


    /**
     * Sets the complemento_localidade value for this Funcionario.
     * 
     * @param complemento_localidade
     */
    public void setComplemento_localidade(java.lang.String complemento_localidade) {
        this.complemento_localidade = complemento_localidade;
    }


    /**
     * Gets the cnpj value for this Funcionario.
     * 
     * @return cnpj
     */
    public java.lang.String getCnpj() {
        return cnpj;
    }


    /**
     * Sets the cnpj value for this Funcionario.
     * 
     * @param cnpj
     */
    public void setCnpj(java.lang.String cnpj) {
        this.cnpj = cnpj;
    }


    /**
     * Gets the id_disciplina_totvs value for this Funcionario.
     * 
     * @return id_disciplina_totvs
     */
    public int getId_disciplina_totvs() {
        return id_disciplina_totvs;
    }


    /**
     * Sets the id_disciplina_totvs value for this Funcionario.
     * 
     * @param id_disciplina_totvs
     */
    public void setId_disciplina_totvs(int id_disciplina_totvs) {
        this.id_disciplina_totvs = id_disciplina_totvs;
    }


    /**
     * Gets the descricao_disciplina value for this Funcionario.
     * 
     * @return descricao_disciplina
     */
    public java.lang.String getDescricao_disciplina() {
        return descricao_disciplina;
    }


    /**
     * Sets the descricao_disciplina value for this Funcionario.
     * 
     * @param descricao_disciplina
     */
    public void setDescricao_disciplina(java.lang.String descricao_disciplina) {
        this.descricao_disciplina = descricao_disciplina;
    }


    /**
     * Gets the id_empresa_totvs value for this Funcionario.
     * 
     * @return id_empresa_totvs
     */
    public int getId_empresa_totvs() {
        return id_empresa_totvs;
    }


    /**
     * Sets the id_empresa_totvs value for this Funcionario.
     * 
     * @param id_empresa_totvs
     */
    public void setId_empresa_totvs(int id_empresa_totvs) {
        this.id_empresa_totvs = id_empresa_totvs;
    }


    /**
     * Gets the descricao_empresa value for this Funcionario.
     * 
     * @return descricao_empresa
     */
    public java.lang.String getDescricao_empresa() {
        return descricao_empresa;
    }


    /**
     * Sets the descricao_empresa value for this Funcionario.
     * 
     * @param descricao_empresa
     */
    public void setDescricao_empresa(java.lang.String descricao_empresa) {
        this.descricao_empresa = descricao_empresa;
    }


    /**
     * Gets the id_pais_localidade_totvs value for this Funcionario.
     * 
     * @return id_pais_localidade_totvs
     */
    public int getId_pais_localidade_totvs() {
        return id_pais_localidade_totvs;
    }


    /**
     * Sets the id_pais_localidade_totvs value for this Funcionario.
     * 
     * @param id_pais_localidade_totvs
     */
    public void setId_pais_localidade_totvs(int id_pais_localidade_totvs) {
        this.id_pais_localidade_totvs = id_pais_localidade_totvs;
    }


    /**
     * Gets the nome_localidade_pais value for this Funcionario.
     * 
     * @return nome_localidade_pais
     */
    public java.lang.String getNome_localidade_pais() {
        return nome_localidade_pais;
    }


    /**
     * Sets the nome_localidade_pais value for this Funcionario.
     * 
     * @param nome_localidade_pais
     */
    public void setNome_localidade_pais(java.lang.String nome_localidade_pais) {
        this.nome_localidade_pais = nome_localidade_pais;
    }


    /**
     * Gets the locale_pais value for this Funcionario.
     * 
     * @return locale_pais
     */
    public java.lang.String getLocale_pais() {
        return locale_pais;
    }


    /**
     * Sets the locale_pais value for this Funcionario.
     * 
     * @param locale_pais
     */
    public void setLocale_pais(java.lang.String locale_pais) {
        this.locale_pais = locale_pais;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Funcionario)) return false;
        Funcionario other = (Funcionario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registro==null && other.getRegistro()==null) || 
             (this.registro!=null &&
              this.registro.equals(other.getRegistro()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.apelido==null && other.getApelido()==null) || 
             (this.apelido!=null &&
              this.apelido.equals(other.getApelido()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.data_nascimento==null && other.getData_nascimento()==null) || 
             (this.data_nascimento!=null &&
              this.data_nascimento.equals(other.getData_nascimento()))) &&
            ((this.endereco==null && other.getEndereco()==null) || 
             (this.endereco!=null &&
              this.endereco.equals(other.getEndereco()))) &&
            ((this.bairro==null && other.getBairro()==null) || 
             (this.bairro!=null &&
              this.bairro.equals(other.getBairro()))) &&
            ((this.complemento==null && other.getComplemento()==null) || 
             (this.complemento!=null &&
              this.complemento.equals(other.getComplemento()))) &&
            ((this.cep==null && other.getCep()==null) || 
             (this.cep!=null &&
              this.cep.equals(other.getCep()))) &&
            ((this.ramal==null && other.getRamal()==null) || 
             (this.ramal!=null &&
              this.ramal.equals(other.getRamal()))) &&
            ((this.rg==null && other.getRg()==null) || 
             (this.rg!=null &&
              this.rg.equals(other.getRg()))) &&
            ((this.cpf==null && other.getCpf()==null) || 
             (this.cpf!=null &&
              this.cpf.equals(other.getCpf()))) &&
            ((this.pis==null && other.getPis()==null) || 
             (this.pis!=null &&
              this.pis.equals(other.getPis()))) &&
            ((this.data_admissao==null && other.getData_admissao()==null) || 
             (this.data_admissao!=null &&
              this.data_admissao.equals(other.getData_admissao()))) &&
            ((this.data_demissao==null && other.getData_demissao()==null) || 
             (this.data_demissao!=null &&
              this.data_demissao.equals(other.getData_demissao()))) &&
            ((this.id_cidade_funcionario_totvs==null && other.getId_cidade_funcionario_totvs()==null) || 
             (this.id_cidade_funcionario_totvs!=null &&
              this.id_cidade_funcionario_totvs.equals(other.getId_cidade_funcionario_totvs()))) &&
            ((this.registro_gestor==null && other.getRegistro_gestor()==null) || 
             (this.registro_gestor!=null &&
              this.registro_gestor.equals(other.getRegistro_gestor()))) &&
            this.apontamento_via_relogio_ponto == other.isApontamento_via_relogio_ponto() &&
            this.id_cargo_totvs == other.getId_cargo_totvs() &&
            ((this.descricao_cargo_totvs==null && other.getDescricao_cargo_totvs()==null) || 
             (this.descricao_cargo_totvs!=null &&
              this.descricao_cargo_totvs.equals(other.getDescricao_cargo_totvs()))) &&
            this.cargo_confianca == other.getCargo_confianca() &&
            this.codigo_categoria_horaria == other.getCodigo_categoria_horaria() &&
            ((this.descricao_categoria_horaria==null && other.getDescricao_categoria_horaria()==null) || 
             (this.descricao_categoria_horaria!=null &&
              this.descricao_categoria_horaria.equals(other.getDescricao_categoria_horaria()))) &&
            ((this.codigo_lotacao==null && other.getCodigo_lotacao()==null) || 
             (this.codigo_lotacao!=null &&
              this.codigo_lotacao.equals(other.getCodigo_lotacao()))) &&
            ((this.descricao_lotacao==null && other.getDescricao_lotacao()==null) || 
             (this.descricao_lotacao!=null &&
              this.descricao_lotacao.equals(other.getDescricao_lotacao()))) &&
            ((this.id_localidade_base_totvs==null && other.getId_localidade_base_totvs()==null) || 
             (this.id_localidade_base_totvs!=null &&
              this.id_localidade_base_totvs.equals(other.getId_localidade_base_totvs()))) &&
            ((this.nome_localidade==null && other.getNome_localidade()==null) || 
             (this.nome_localidade!=null &&
              this.nome_localidade.equals(other.getNome_localidade()))) &&
            ((this.cep_localidade==null && other.getCep_localidade()==null) || 
             (this.cep_localidade!=null &&
              this.cep_localidade.equals(other.getCep_localidade()))) &&
            this.id_cidade_localidade_totvs == other.getId_cidade_localidade_totvs() &&
            ((this.nome_cidade_localidade==null && other.getNome_cidade_localidade()==null) || 
             (this.nome_cidade_localidade!=null &&
              this.nome_cidade_localidade.equals(other.getNome_cidade_localidade()))) &&
            this.id_uf_localidade_totvs == other.getId_uf_localidade_totvs() &&
            ((this.nome_uf_localidade==null && other.getNome_uf_localidade()==null) || 
             (this.nome_uf_localidade!=null &&
              this.nome_uf_localidade.equals(other.getNome_uf_localidade()))) &&
            ((this.sigla_uf_localidade==null && other.getSigla_uf_localidade()==null) || 
             (this.sigla_uf_localidade!=null &&
              this.sigla_uf_localidade.equals(other.getSigla_uf_localidade()))) &&
            ((this.endereco_localidade==null && other.getEndereco_localidade()==null) || 
             (this.endereco_localidade!=null &&
              this.endereco_localidade.equals(other.getEndereco_localidade()))) &&
            ((this.bairro_localidade==null && other.getBairro_localidade()==null) || 
             (this.bairro_localidade!=null &&
              this.bairro_localidade.equals(other.getBairro_localidade()))) &&
            ((this.numero_localidade==null && other.getNumero_localidade()==null) || 
             (this.numero_localidade!=null &&
              this.numero_localidade.equals(other.getNumero_localidade()))) &&
            ((this.complemento_localidade==null && other.getComplemento_localidade()==null) || 
             (this.complemento_localidade!=null &&
              this.complemento_localidade.equals(other.getComplemento_localidade()))) &&
            ((this.cnpj==null && other.getCnpj()==null) || 
             (this.cnpj!=null &&
              this.cnpj.equals(other.getCnpj()))) &&
            this.id_disciplina_totvs == other.getId_disciplina_totvs() &&
            ((this.descricao_disciplina==null && other.getDescricao_disciplina()==null) || 
             (this.descricao_disciplina!=null &&
              this.descricao_disciplina.equals(other.getDescricao_disciplina()))) &&
            this.id_empresa_totvs == other.getId_empresa_totvs() &&
            ((this.descricao_empresa==null && other.getDescricao_empresa()==null) || 
             (this.descricao_empresa!=null &&
              this.descricao_empresa.equals(other.getDescricao_empresa()))) &&
            this.id_pais_localidade_totvs == other.getId_pais_localidade_totvs() &&
            ((this.nome_localidade_pais==null && other.getNome_localidade_pais()==null) || 
             (this.nome_localidade_pais!=null &&
              this.nome_localidade_pais.equals(other.getNome_localidade_pais()))) &&
            ((this.locale_pais==null && other.getLocale_pais()==null) || 
             (this.locale_pais!=null &&
              this.locale_pais.equals(other.getLocale_pais())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRegistro() != null) {
            _hashCode += getRegistro().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getApelido() != null) {
            _hashCode += getApelido().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getData_nascimento() != null) {
            _hashCode += getData_nascimento().hashCode();
        }
        if (getEndereco() != null) {
            _hashCode += getEndereco().hashCode();
        }
        if (getBairro() != null) {
            _hashCode += getBairro().hashCode();
        }
        if (getComplemento() != null) {
            _hashCode += getComplemento().hashCode();
        }
        if (getCep() != null) {
            _hashCode += getCep().hashCode();
        }
        if (getRamal() != null) {
            _hashCode += getRamal().hashCode();
        }
        if (getRg() != null) {
            _hashCode += getRg().hashCode();
        }
        if (getCpf() != null) {
            _hashCode += getCpf().hashCode();
        }
        if (getPis() != null) {
            _hashCode += getPis().hashCode();
        }
        if (getData_admissao() != null) {
            _hashCode += getData_admissao().hashCode();
        }
        if (getData_demissao() != null) {
            _hashCode += getData_demissao().hashCode();
        }
        if (getId_cidade_funcionario_totvs() != null) {
            _hashCode += getId_cidade_funcionario_totvs().hashCode();
        }
        if (getRegistro_gestor() != null) {
            _hashCode += getRegistro_gestor().hashCode();
        }
        _hashCode += (isApontamento_via_relogio_ponto() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getId_cargo_totvs();
        if (getDescricao_cargo_totvs() != null) {
            _hashCode += getDescricao_cargo_totvs().hashCode();
        }
        _hashCode += getCargo_confianca();
        _hashCode += getCodigo_categoria_horaria();
        if (getDescricao_categoria_horaria() != null) {
            _hashCode += getDescricao_categoria_horaria().hashCode();
        }
        if (getCodigo_lotacao() != null) {
            _hashCode += getCodigo_lotacao().hashCode();
        }
        if (getDescricao_lotacao() != null) {
            _hashCode += getDescricao_lotacao().hashCode();
        }
        if (getId_localidade_base_totvs() != null) {
            _hashCode += getId_localidade_base_totvs().hashCode();
        }
        if (getNome_localidade() != null) {
            _hashCode += getNome_localidade().hashCode();
        }
        if (getCep_localidade() != null) {
            _hashCode += getCep_localidade().hashCode();
        }
        _hashCode += getId_cidade_localidade_totvs();
        if (getNome_cidade_localidade() != null) {
            _hashCode += getNome_cidade_localidade().hashCode();
        }
        _hashCode += getId_uf_localidade_totvs();
        if (getNome_uf_localidade() != null) {
            _hashCode += getNome_uf_localidade().hashCode();
        }
        if (getSigla_uf_localidade() != null) {
            _hashCode += getSigla_uf_localidade().hashCode();
        }
        if (getEndereco_localidade() != null) {
            _hashCode += getEndereco_localidade().hashCode();
        }
        if (getBairro_localidade() != null) {
            _hashCode += getBairro_localidade().hashCode();
        }
        if (getNumero_localidade() != null) {
            _hashCode += getNumero_localidade().hashCode();
        }
        if (getComplemento_localidade() != null) {
            _hashCode += getComplemento_localidade().hashCode();
        }
        if (getCnpj() != null) {
            _hashCode += getCnpj().hashCode();
        }
        _hashCode += getId_disciplina_totvs();
        if (getDescricao_disciplina() != null) {
            _hashCode += getDescricao_disciplina().hashCode();
        }
        _hashCode += getId_empresa_totvs();
        if (getDescricao_empresa() != null) {
            _hashCode += getDescricao_empresa().hashCode();
        }
        _hashCode += getId_pais_localidade_totvs();
        if (getNome_localidade_pais() != null) {
            _hashCode += getNome_localidade_pais().hashCode();
        }
        if (getLocale_pais() != null) {
            _hashCode += getLocale_pais().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Funcionario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rd.la.logicalis.com/web-service/funcionarios", "funcionario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apelido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apelido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data_nascimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data_nascimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endereco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bairro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bairro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complemento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "complemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ramal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ramal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data_admissao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data_admissao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data_demissao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data_demissao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_cidade_funcionario_totvs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_cidade_funcionario_totvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro_gestor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registro_gestor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apontamento_via_relogio_ponto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apontamento_via_relogio_ponto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_cargo_totvs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_cargo_totvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao_cargo_totvs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao_cargo_totvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargo_confianca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargo_confianca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo_categoria_horaria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo_categoria_horaria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao_categoria_horaria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao_categoria_horaria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo_lotacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo_lotacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao_lotacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao_lotacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_localidade_base_totvs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_localidade_base_totvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome_localidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome_localidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cep_localidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cep_localidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_cidade_localidade_totvs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_cidade_localidade_totvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome_cidade_localidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome_cidade_localidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_uf_localidade_totvs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_uf_localidade_totvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome_uf_localidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome_uf_localidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigla_uf_localidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigla_uf_localidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endereco_localidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endereco_localidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bairro_localidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bairro_localidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero_localidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero_localidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complemento_localidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "complemento_localidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_disciplina_totvs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_disciplina_totvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao_disciplina");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao_disciplina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_empresa_totvs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_empresa_totvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao_empresa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao_empresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_pais_localidade_totvs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_pais_localidade_totvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome_localidade_pais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome_localidade_pais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale_pais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locale_pais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
