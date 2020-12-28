# Introdução

Bem vindo(a) ao Bootcamp, no qual foi feito com muito carinho para você aprender e evoluir de forma exponencial 
(#aprendizadoAcimaDoPlano), pois afinal somos Zuppers (#ZupperAjudaZupper)!

Imagina que já tenha ouvido falar bastante sobre o Bootcamp e seus objetivos, essa introdução será mais técnica e como 
gostaríamos que seguisse o treinamento, tudo bem? Vamos lá!?

O treinamento foi pensado para trazer um caso real, ou seja, muitas integrações e bastantes desafios 
técnicos te espera, tais como:

- Apache Kafka
- OpenTracing
- Métricas
- Kubernetes

Gostou das tecnologias? Foi apenas uma amostra tem muito mais pela frente!

Nesse treinamento você será responsável por criar um sistema de cartões, porém no escopo de provisionamento do cartão, 
fatura e extrato, não seremos responsáveis por gerenciar as transações, pois, as mesmas são gerenciadas através de um 
sistema de rede de captura e o nosso sistema somente será notificado via Apache Kafka!

Para que seja possível desenvolver as funcionalidades citadas a acima, precisaremos criar três Microsserviços, sim a 
gente irá trabalhar com arquitetura distribuída (Microsserviços), que irão em algum momento se integrar com o sistema 
legado(sistema de rede de captura), conforme imagem abaixo:

![alt text](/images/big-picture.png "Big Picture")

Está ansioso(a) para começar? Vamos lá!?

O desenvolvimento das funcionalidades devem seguir uma ordem, que deve ser:

**1º** Desenvolvimento das funcionalidades da Proposta

**2º** Desenvolvimento das funcionalidades da Transação

**3ª** Desenvolvimento das funcionalidades da Fatura

> **Você deve seguir a sequência do treinamento, na qual foi pensando com muito carinho, para que você aproveitar ao 
>máximo e aprender gradativamente cada técnica, tecnologia e conceito!**

Cada funcionalidade está segmentada em pastas:

- [Proposta](https://github.com/claudiooliveirazup/documentacao-cartao-branco/tree/master/proposta)
- [Transação](https://github.com/claudiooliveirazup/documentacao-cartao-branco/tree/master/transacao)
- [Fatura](https://github.com/claudiooliveirazup/documentacao-cartao-branco/tree/master/fatura)

Cada pasta tem seus desafios ordenados, novamente você deve seguir a sequência, como por exemplo:

```text
/proposta
    000.setup_projeto.md
    001.setup_docker_compose.md
    005.criacao_proposta.md
```

Demais né! Está ansioso(a) para codificar?

Antes de codificar precisamos configurar nosso ambiente de desenvolvimento!

Esse é o momento para fazer isso! Vamos lá?

Configure e verifique as instalações das seguintes ferramentas:

* [Docker 1.13 ou superior](https://docs.docker.com/get-docker/)
* [Docker Compose 3 ou superior](https://docs.docker.com/compose/install/)
* [Java 11 ou superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
* [Maven 3.6 ou superior](https://maven.apache.org/install.html)
* [IntelliJ](https://www.jetbrains.com/idea/) ou [Eclipse](https://www.eclipse.org/ide/)

Eba está tudo configurado! Vamos codificar?

Um último pedido! Para cada serviço (Proposta, Transação e Fatura) a gente criou um template e pedimos que façam um fork,
assim fica fácil a gente rastrear sua codificação e poder te ajudar em dúvidas, etc!

- [Template Proposta](https://github.com/luramarchanjozup/bootcamp-template-proposta)
- [Template Transação](https://github.com/luramarchanjozup/bootcamp-template-transacao)
- [Template Fatura](https://github.com/luramarchanjozup/bootcamp-template-fatura)

Eba está tudo ok! Muito obrigado por estar nesse treinamento! 

Estamos a disposição para te ajudar sempre! 

## Bom treinamento!
