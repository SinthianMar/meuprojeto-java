
# 📋 Cadastro de Pessoas em Java

Projeto simples de cadastro de pessoas feito em Java, com foco em consolidação de conceitos de orientação a objetos. Desenvolvido para praticar entrada de dados via terminal, manipulação de listas e estruturas básicas de controle.

## 🧠 Conceitos Utilizados

- Programação Orientada a Objetos (POO)
- Encapsulamento (`private`, getters)
- Sobrescrita de método (`toString`)
- Listas com `ArrayList`
- Scanner para entrada de dados
- Estruturas de repetição (`while`) e decisão (`if`, `else`)

## 🚀 Funcionalidades

- Cadastrar pessoa (nome e idade)
- Listar todas as pessoas cadastradas
- Encerrar o programa com segurança

## 📁 Estrutura do Projeto

```
meuprojeto/
├── Pessoa.java             # Classe que representa uma pessoa
└── CadastroPessoas.java    # Classe principal com menu no terminal
```

## ▶️ Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/seu-repo.git
cd seu-repo/meuprojeto
```

2. Compile os arquivos:
```bash
javac Pessoa.java CadastroPessoas.java
```

3. Execute o programa:
```bash
java CadastroPessoas
```

## 🖥️ Exemplo de Uso

```
=== MENU ===
1. Cadastrar pessoa
2. Listar pessoas
3. Sair
Escolha uma opção: 1
Digite o nome: Ana
Digite a idade: 25
Pessoa cadastrada com sucesso!!

=== MENU ===
1. Cadastrar pessoa
2. Listar pessoas
3. Sair
Escolha uma opção: 2

=== Lista de Pessoas ===
Nome: Ana, Idade: 25
```

## 🌱 Possíveis Melhorias

- Validação de entrada (idade negativa, nome vazio)
- Inclusão de CPF com verificação simples
- Armazenamento dos dados em arquivo `.txt`
- Interface gráfica com Swing ou JavaFX
- Conexão com banco de dados

## 👩‍💻 Autora

**Sinthian Marques**  
Desenvolvedora back-end em formação | São Paulo - SP  
📧 sinthianmarquesjp@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/sinthianmarques)

## 📜 Licença

Este projeto está sob a licença MIT. Sinta-se à vontade para estudar, modificar e compartilhar!
