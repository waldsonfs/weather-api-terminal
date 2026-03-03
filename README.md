# 🌤️ Weather Terminal App

Aplicação em **Java** que consome uma **API REST de clima** e exibe informações meteorológicas diretamente no terminal.

Projeto desenvolvido com foco em aprendizado de:

* Consumo de APIs
* Manipulação de JSON
* Organização básica em camadas (Service + Printer)
* Boas práticas iniciais em Java

---

## 🚀 Funcionalidades

* Consulta de clima por nome da cidade
* Exibição de:

  * 🌡️ Temperatura atual
  * 🤗 Sensação térmica
  * 💧 Umidade
  * 🌬️ Velocidade do vento
  * 🌡️ Pressão atmosférica
  * 📅 Data e hora da atualização
* Tratamento de erro para cidade não encontrada
* Loop interativo até o usuário digitar **"sair"**

---

## 🛠️ Tecnologias utilizadas

* Java
* API REST
* Biblioteca `org.json`
* Programação orientada a objetos
* Terminal / Console Application

---

## 📂 Estrutura do Projeto

```
📦 weather-terminal-app
 ┣ 📜 Main.java
 ┣ 📜 ClimaService.java
 ┣ 📜 ClimaPrinter.java
 ┗ 📁 lib (caso utilize jar manual)
```

---

## ⚙️ Como executar

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/seuusuario/weather-terminal-app.git
```

### 2️⃣ Compilar

Se estiver usando biblioteca manual (.jar):

```bash
javac -cp ".;lib/json-20231013.jar" Main.java
```

(Linux/Mac trocar `;` por `:`)

### 3️⃣ Executar

```bash
java -cp ".;lib/json-20231013.jar" Main
```

---

## 📌 Exemplo de uso

```
=====================================
   SISTEMA DE CONSULTA DE CLIMA 🌤️
=====================================

Digite o nome da cidade: Belo Horizonte

Informações Meteorológicas para Belo Horizonte, Brazil
Temperatura Atual: 26°C
Umidade: 60%
...
```

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido para praticar:

* Comunicação entre aplicação e API externa
* Conversão de JSON para objetos manipuláveis
* Organização inicial de código pensando em arquitetura

---

## 📈 Próximas melhorias (Roadmap)

* [ ] Criar model (DTO) para resposta da API
* [ ] Melhorar tratamento de erros usando JSON estruturado
* [ ] Transformar em aplicação com Spring Boot
* [ ] Criar versão Web com frontend

---

## 👨‍💻 Autor

Waldson Fernandes
Estudante de desenvolvimento backend focado em Java e APIs REST.

---

⭐ Se este projeto te ajudou, deixe uma estrela no repositório!
