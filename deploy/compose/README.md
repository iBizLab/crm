### **安装说明**
####  前提条件

- CPU >= 4 核
- RAM >= 16 GB
- Disk >= 50 GB
- Docker >= 24.0.0 & Docker Compose >= v2.26.1
> 如果你并没有在本机安装 Docker（Windows、Mac，或者 Linux）, 可以参考文档 [Install Docker Engine](https://docs.docker.com/engine/install/) 自行安装。

> [!CAUTION]
> 新安装脚本使用docker volumes 管理持久化卷，之前青云镜像用相对路径做卷的用户谨慎升级！！具体可参见[旧版升级说明](#问题3旧版青云镜像安装环境想升级)


#### 启动CRM服务
1. 克隆仓库：

```bash
$ git clone https://gitee.com/ibizlab/crm.git
```

2. 进入 **compose** 文件夹，利用提前编译好的 Docker 镜像启动服务器：

```bash
$ cd crm/deploy/compose
$ docker compose -f docker-compose.yml --env-file .env up -d

# ARM64架构启动:
# docker-compose -f docker-compose-arm64.yml --env-file .env up -d

```

> [!TIP]
> 如果你想修改MySQL、ZooKeeper、Redis、Nacos、EMQX、ebsx服务为本地已有服务，可以在 **deploy/compose/.env** 文件内根据变量注释提示调整对应参数；调整MySQL服务为本地服务需要预先导入deploy/compose/init.sql。

> [!CAUTION]
> 如果你已经安装过iBizLab的其他开源产品，比如iBizPLM，这种情况下MySQL、zk、Nacos、ebsx等环境已具备，可以使用 .share 启动，执行前请自行在mysql中创建crm数据库。
> ```
> create database crm default character set utf8 collate utf8_general_ci;
> create user 'crm'@'%' identified by 'crm@2024';
> grant ALL PRIVILEGES on crm.* to 'crm'@'%' ;
> ```
> ```bash
> $ cd crm/deploy/compose
> $ docker compose -f docker-compose.yml --env-file .share up -d
> # ARM64架构启动:
> # docker-compose -f docker-compose-arm64.yml --env-file .share up -d
> ```

3. 服务器启动成功后再次确认服务器状态：

```bash
$ docker logs -f crmservice
```

   _出现以下界面提示说明服务器启动成功：_

```bash
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : 系统[ibizcrm]已经注册
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Heap Memory Usage:
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Init: 786432000
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Used: 1489565680
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Committed: 4904714240
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Max: 11169955840
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Non-Heap Memory Usage:
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Init: 2555904
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Used: 222739928
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Committed: 231342080
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Max: -1
```

等待启动完成访问

假定本机使用localhost访问，如果跨机器访问请将localhost更换为服务器ip地址或域名：


**iBizCRM桌面端**：http://localhost:30350/ibizcrm-crmweb/

**UAA系统管理**：http://localhost:32666


#### 数据卷
> [!CAUTION]
> 请注意，本次更新替换文件映射为Docker数据卷，升级前请做好数据备份。

- mysql_data：MySQL数据库的数据卷

- allinone_data：ibiz-ebsx-allinone服务存放文件的数据卷，例如：图片，附件等

- task_data：task服务存放文件的数据卷：发布文件、模型文件


### 常见错误
##### 问题1、资源不足

本系统部署模式走微服务和前后分离，启动需要有多个独立服务，流畅运行建议16G或以上，如果启动后看到有容器未能启动成功或者启动成功又自行退出，许多人反映是mysql和nacos服务，这种情况下基本都是资源不足。

另外虽然主机资源充足，但是Windows或MacOS上使用了DockerDesktop，docker虚拟机的资源阈值分配不够，也烦请提高分配额。
 

##### 问题2、首次部署初始化数据时中断

这种情况下，就是持久化数据文件不完整了，很难救活了，需要重置部署下，进入安装目录先停止所有服务，删除持久化目录，最后重新启动，请按照以下命令重置。
> [!CAUTION]
> 此操作会清空所有之前的持久化数据

```shell
$ cd crm/deploy/compose 
$ docker-compose down -v  #清空默认安装环境 删除持久化卷
$ docker-compose up -d    #重新启动，重新初始持久化数据
```
