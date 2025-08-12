# 🚀 欢迎来到 iBizCRM

**现代化、企业级、开源 CRM 系统**，基于 [iBizModeling](https://modeling.ibizlab.cn/) 建模开发平台打造，来自 [iBizLab 开源实验室](https://www.ibizlab.cn/) 的又一开源力作。在用户体验、功能深度与业务自动化方面，iBizCRM 借鉴了卓豪 Zoho CRM 的优秀理念，提供强大又灵活的客户关系管理能力。

💡 **本地部署 · 数据安全可控 · 高度可定制**

---

## 🌐 在线体验

- **官方网站**: [https://crm.ibizlab.cn](https://crm.ibizlab.cn)
- **Demo 地址**：[https://crm.ibizlab.cn/demo/](https://crm.ibizlab.cn/demo/)
- **用户名 / 密码**：`demo_admin / 123456`
- **技术资料**: [https://crm.ibizlab.cn/doc/](https://crm.ibizlab.cn/doc/)
- **ModelingIDE** [https://crm.ibizlab.cn/modeling/](https://crm.ibizlab.cn/modeling/)
- **前端技术框架支持** [https://open.ibizlab.cn/apphub/](https://open.ibizlab.cn/apphub/)
---

## ✨ 为什么选择 iBizCRM？

- **开源自由** — 完全免费，可修改、分发，自主掌控源代码。
- **本地部署** — 非云端架构，商业数据安全可控，无需依赖封闭生态。
- **功能强大** — 借鉴 Zoho CRM 成熟经验，满足中小企业全流程业务需求。
- **灵活定制** — 模块、布局、工作流均可深度定制，贴合业务场景。
- **社区驱动** — 欢迎参与贡献，让 iBizCRM 与你一同成长。

---

## 🛠 核心功能

### 1. 主页工作台
- **标准工作台**：预设高效业务总览视图。

### 2. 客户关系管理
- **线索（Leads）**：多视图筛选、附件管理、活动跟踪、产品关联。
- **联系人（Contacts）**：多视图筛选、附件管理、活动记录。
- **客户（Accounts）**：联系人、商机、活动、销售人员信息关联管理。

### 3. 销售自动化
- **商机（Deals）**：阶段历史、活动、任务、产品信息全追踪。

### 4. 服务与支持
- **任务管理**：任务视图、详情查看。
- **文档管理**：集中化文件存储与管理。

### 5. 财务管理
- **订单收款计划**：制定收款计划并跟踪执行。
- **收款分析**：收款记录统计与分析。
- **产品管理**：统一管理产品数据。

### 6. 数据分析与报告
- **报表中心**：多维度报表生成与导出。

### 7. 系统管理
- 常规设置 & 安全控制，全面可控。

---

## ⚡ 快速上手

### 环境要求
- **CPU**：≥ 4 核
- **RAM**：≥ 16 GB
- **Disk**：≥ 50 GB
- **Docker**：≥ 24.0.0
- **Docker Compose**：≥ v2.26.1

### 安装步骤

1. **克隆项目**
   ```bash
   git clone https://gitee.com/ibizlab/crm.git


#### **1\. 前置条件**

- CPU >= 4 核
- RAM >= 16 GB
- Disk >= 50 GB
- Docker >= 24.0.0 & Docker Compose >= v2.26.1

#### **2\. 安装指南**

克隆项目仓库  
```bash
git clone https://gitee.com/ibizlab/crm.git
```

进入 **compose** 文件夹，利用提前编译好的 Docker 镜像启动服务器：


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

## 📸 演示图

![img](doc/images/0.png)

![img](doc/images/1.png)

![img](doc/images/2.png)

![img](doc/images/3.png)

![img](doc/images/4.png)

![img](doc/images/5.png)

![img](doc/images/6.png)

![img](doc/images/7.png)

![img](doc/images/8.png)

![img](doc/images/9.png)
 


## 🤝 如何贡献

我们非常欢迎社区的贡献！如果您有兴趣，请通过以下方式参与：

* **报告 Bug**：如果您发现了任何问题，请通过 GITEE Issues提交。  
* **提交建议**：欢迎提出任何关于新功能或改进的建议。  
* **提交代码**：请遵循我们的贡献指南，提交 Pull Request。

## 📜 许可证

iBizCRM 采用 **MIT License** 许可证。详情请参阅项目根目录下的 LICENSE 文件。

## ❤️ 加入我们
我们致力于为中小企业提供一个功能强大、灵活可定制且完全开源的解决方案，帮助您高效管理销售、营销和客户服务，从而建立和维护牢固的客户关系。

感谢您对 iBizCRM 的关注！让我们一起打造最棒的开源CRM系统吧！


- 🌐 开源实验室官网：https://www.ibizlab.cn

- 💬 开源社区：https://open.ibizlab.cn

- 📱 微信公众号：iBiz开放平台

- 💬 QQ交流群：1067434627