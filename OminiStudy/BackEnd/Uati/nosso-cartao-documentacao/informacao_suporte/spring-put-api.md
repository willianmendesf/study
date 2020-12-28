# Como expor uma API PUT no Spring?

Para expor uma API PUT no Spring devemos utilizar a anotação [@PutMapping](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PutMapping.html).

1º Precisamos criar um Controller com a anotação [@RestController](https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/web/bind/annotation/RestController.html).

```java
@RestController
public class MeuController {
   // código omitido
}
```

2º Precisamos criar nossa API de acordo com o objetivo e seu método HTTP.

```java
@RestController
public class MeuController {

    @PutMapping("/v1/minha-api")
    public ResponseEntity<?> minhaOperacao() {
        // código omitido
        return ResponseEntity.status(status).body(body);
    }

}
```

Pronto!!!

Agora já sabemos como usar a anotação @PutMapping!

#Informação de Suporte

Quer saber mais sobre como criar API's REST no Spring? [Aqui você encontra como fazer isso !!!](https://spring.io/guides/gs/rest-service/)