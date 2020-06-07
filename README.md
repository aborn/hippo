# Hippo 河马--开源的运营配置系统

## 包说明
hippo-admin 提供给后台管理端（M端）使用的服务，war类型  
hippo-api 提供给SDK使用的API接口服务，依赖hippo-contract，接口流量大，war类型  
hippo-contract 定义的Dubbo接口，jar类型  
hippo-node 前端页面代码，主要采用react + antd  
hippo-repository 数据操作包，获取数据库的接口等  
hippo-sdk 提供给业务使用的sdk，jar类型  

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
后端采用grade进行构建

### 服务器部署

## 开发人员
@aborn  
@lxl1024  
@ArtoriasXuPF  

## 参与开发
