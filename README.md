# Projeto GUI Livraria - Sistema de Gerenciamento

## Descrição
Este projeto é um sistema básico de gerenciamento de clientes para uma livraria, desenvolvido em Java com interface gráfica Swing. O sistema permite realizar operações CRUD (Criar, Ler, Atualizar, Deletar) nos dados dos clientes, integrando uma interface amigável com um banco de dados relacional via JDBC.

## Estrutura do Projeto
- **model**: Contém a classe `Cliente` que representa o modelo de dados do cliente.
- **dao**: Implementa a camada de acesso a dados (`ClienteDAO`), responsável pelas operações CRUD no banco de dados.
- **view**: Implementa a interface gráfica (`ViewCliente`) utilizando Java Swing para interação com o usuário.
- **enumeration**: Enumeração `Sexo` para representar o gênero do cliente.
- **tablemodel**: `ClienteTableModel`, modelo personalizado para exibir os clientes em tabelas Swing.

## Funcionalidades
- Cadastro completo de clientes com validação.
- Visualização dos clientes em tabela interativa.
- Atualização e exclusão de registros existentes.
- Separação clara entre interface, lógica de negócios e acesso a dados.
- Uso de padrões de projeto MVC básico para organização do código.

## Tecnologias Utilizadas
- Java SE 8+
- Java Swing(GUI desktop)
- JDBC para conexão com banco de dados MySQL (ou similar)
- Maven para gerenciamento de dependências e build (`pom.xml` incluído)

## Como Rodar
1. Configure um banco de dados MySQL e crie a tabela `clientes` conforme especificado no código.
2. Ajuste as configurações de conexão no `ClienteDAO` (URL, usuário, senha).
3. Compile e execute o projeto via Maven ou sua IDE favorita.
4. A interface gráfica abrirá, permitindo o gerenciamento dos clientes.

## Considerações Finais
Este projeto serve como base para um sistema de cadastro de futuros clientes com interface gráfica e conexão com banco de dados, podendo ser expandido para funcionalidades mais complexas, como autenticação, relatórios e integração web.

