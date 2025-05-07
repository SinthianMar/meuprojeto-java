# 📋 Cadastro de Pessoas em Java

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/sinthianmarques)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![Project](https://img.shields.io/badge/-Project-blueviolet?style=for-the-badge)]()

> Projeto simples de cadastro de pessoas feito em Java, com foco em consolidação de conceitos de orientação a objetos. Desenvolvido para praticar entrada de dados via terminal,  manipulação de listas e estruturas básicas de controle.

---

## ➟  Conceitos Utilizados

- Programação Orientada a Objetos (POO)
- Encapsulamento (`private`, getters)
- Sobrescrita de método (`toString`)
- Listas com `ArrayList`
- Scanner para entrada de dados
- Estruturas de repetição (`while`) e decisão (`if`, `else`)

## ⚙️ Funcionalidades

- Cadastrar pessoa (nome e idade)
- Listar todas as pessoas cadastradas
- Encerrar o programa com segurança

## 📁 Estrutura do Projeto

```
meuprojeto/
├── Pessoa.java             # Classe que representa uma pessoa
└── Cadastro.java           # Classe principal com menu no terminal
```

## 🔹Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/meuprojeto-java.git
cd meuprojeto-java
```

2. Compile os arquivos:
```bash
javac Pessoa.java CadastroPessoas.java
```

3. Execute o programa:
```bash
java CadastroPessoas
```

## 💻 Exemplo de Uso

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

## 🔧 Possíveis Melhorias

- Validação de entrada (idade negativa, nome vazio)
- Inclusão de CPF com verificação simples
- Armazenamento dos dados em arquivo `.txt`
- Interface gráfica com Swing ou JavaFX
- Conexão com banco de dados

---

## 📜 Licença

Distribuído sob a Licença MIT.  
Consulte `LICENSE.md` para mais informações.

---

> _"Grandes projetos começam com pequenos cadastros."_  
Por [Sinthian Marques ](https://github.com/SinthianMar) | [LinkedIn](https://www.linkedin.com/in/sinthianmarques) | sinthianmarquesjp@gmail.com

