# Spring Cloud Etcd

Etcd integration with Spring Cloud

download etcd from the link - https://github.com/etcd-io/etcd/releases

## Example

```
Configure etcd properties:
```
spring:
  cloud:
    etcd:
      endpoints: http://127.0.0.1:2379
      discovery:
        prefix: /services
```

After server started up, check service-registry by etcdctl:

```
-> % ETCDCTL_API=3 etcdctl get /services --prefix
/services/application/192.168.1.102:8080
{"serviceName":"application","address":"192.168.1.102","port":8080,"serviceId":"application"}
```