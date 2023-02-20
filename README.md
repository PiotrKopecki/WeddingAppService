# Service for wedding app

## Example of running mysql db locally

``` 
docker run 
--name mysqldb 
-p 3306:3306 
-e MYSQL_ROOT_PASSWORD=root 
-e MYSQL_DATABASE=wedding-app-db 
-e MYSQL_USER=user 
-e MYSQL_PASSWORD=user 
-d mysql:8 
```


### In one line:
```docker run --name mysqldb -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=wedding-app-db -e MYSQL_USER=user -e MYSQL_PASSWORD=user -d mysql:8 ```

## Deploy (temporary)
```
docker build -t image .
docker tag image CONTAINER_REGISTRY_PATH
docker push CONTAINER_REGISTRY_PATH
```

### In case u need to authenticate use
* gcloud auth login
* gcloud auth configure-docker

## Running project locally
Add environment variables like this:
* GOOGLE_APPLICATION_CREDENTIALS='path to json credentials'

