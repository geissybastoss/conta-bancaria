# Projeto de Conta Bancária

Este projeto foi desenvolvido como resposta a um desafio de Programação Orientada a Objetos (POO) da Digital Innovation One (DIO). O objetivo do projeto é criar um sistema básico de gestão de contas bancárias, aplicando os princípios da POO.

> Nota: Este projeto foi criado com fins educacionais para demonstrar a
> aplicação de conceitos de POO. Ele pode ser expandido e aprimorado com
> funcionalidades adicionais conforme necessário.

## Descrição do Projeto

O projeto consiste em um sistema bancário simples que permite a criação de contas correntes e contas poupança para clientes, bem como a realização de operações bancárias como depósito, saque e transferência entre contas. Além disso, o sistema permite a visualização do extrato das contas.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **Banco**: Representa um banco que possui um nome e uma lista de contas.
- **Cliente**: Representa um cliente do banco com um nome.
- **Conta**: Classe abstrata que representa uma conta bancária genérica com métodos para saque, depósito, transferência e impressão de extrato. É herdada pelas classes `ContaCorrente` e `ContaPoupanca`.
- **ContaCorrente**: Representa uma conta corrente, herdando da classe `Conta`.
- **ContaPoupanca**: Representa uma conta poupança, herdando da classe `Conta`.
- **IConta**: Interface que define os métodos básicos para uma conta bancária.
- **Main**: Classe principal que demonstra a criação de clientes, contas e operações bancárias.

## Funcionalidades Implementadas

- Criação de contas correntes e contas poupança.
- Depósito em contas.
- Saque de contas.
- Transferência entre contas.
- Impressão do extrato das contas.
- Listagem de todas as contas em um banco.

## Como Executar

1. Certifique-se de ter o JDK instalado e configurado no seu sistema.
2. Compile todas as classes do projeto.
3. Execute a classe `Main` para ver o sistema em funcionamento.


## Contribuição
Se você quiser contribuir com o projeto, sinta-se à vontade para fazer um fork do repositório, criar uma branch para suas alterações e enviar um pull request. Todas as contribuições são bem-vindas!

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (git checkout -b feature/sua-feature).
3. Faça commit das suas alterações (git commit -m 'Adicionando uma nova feature').
4. Faça push para a branch (git push origin feature/sua-feature).
5. Abra um pull request.

## Agradecimentos
Gostaria de agradecer à Digital Innovation One (DIO) pelo desafio e pela oportunidade de aprimorar meus conhecimentos em Programação Orientada a Objetos.

## Contato
Para mais informações sobre o desafio, visite a Digital Innovation One (DIO). Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato.
