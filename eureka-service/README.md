### Steps
#### 1. Add following lines to your hosts:**
```shell
127.0.0.1 peer1
127.0.0.1 peer2
```

#### 2. Run with profile argument
```shell
java -jar eureka-service.jar --spring.profiles.active=peer1
java -jar eureka-service.jar --spring.profiles.active=peer2
```