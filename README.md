# Hippo 河马--开源的运营配置（投放）系统

## 包说明
hippo-admin 提供给后台管理端（M端）使用的服务，war类型  
hippo-api 提供给SDK使用的API接口服务，依赖hippo-contract，接口流量大，war类型  
hippo-contract 定义的Dubbo接口，jar类型  
hippo-node 前端页面代码，主要采用react + antd  
hippo-repository 数据操作包，获取数据库的接口，不提供对外使用
hippo-sdk 提供给业务使用的sdk，jar类型  

### 依赖的第三方
dubbo rpc 框架 （可选）  
ant-d  
react  

## 如何安装使用

### 前端构建与运行
```
➜  hippo git:(master) ✗ pwd
/Users/aborn/github/hippo
➜  hippo git:(master) ✗ cd hippo-node
➜  hippo-node git:(master) ✗ yarn
➜  hippo-node git:(master) ✗ yarn start
yarn run v1.22.4
$ umi dev
Starting the development server...

✔ Webpack
  Compiled successfully in 29.58s

 DONE  Compiled successfully in 29577ms                                                                                        9:55:18 PM


  App running at:
  - Local:   http://localhost:8000 (copied to clipboard)
```
然后在浏览器里打开 http://localhost:8000 就可以了。

### 后端构建与运行
后端采用gradle进行构建，运行hippo-admin

#### hippo-admin
如果是本地调试，可使用bootRun进行运行或者在idea里运行，需要总署的使用bootJar打包
```shell script
gradle :hippo-admin:bootRun     ## 本地运行
gradle :hippo-admin:bootJar     ## 打可运行的jar包
```
成功后在浏览器里打开 http://localhost:8080/test/hello 看接口是否正常。
admin与node同时构建并启动后，整体运营管理后台就启动完成。

#### hippo-api
运行hippo-api
```shell script
gradle :hippo-api:bootRun
```

#### hippo-sdk
打jar包
```shell script
gradle :hippo-sdk:jar
```

### 服务器部署
将打包好的jar上传到服务器，然后进行部署
```shell script
java -jar hippo-admin/build/libs/hippo-admin-0.0.1-SNAPSHOT.jar
```

## 开发人员
@aborn  
@lxl1024  
@ArtoriasXuPF  

## 参与开发
