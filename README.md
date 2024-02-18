# CKIN - Eureka Server

### Build and Push Docker Image

```shell
cd eureka # Change to the eureka directory

docker build -t nhnckin/eureka .
echo Dp48ymKMzs,Yc+u | docker login --username nhnckin --password-stdin
docker push nhnckin/eureka
```