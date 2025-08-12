## 获取对应订单信息 <!-- {docsify-ignore-all} -->

   订单信息回填到表单中

### 处理过程

```plantuml
@startuml
hide empty description
<style>
root {
  HyperlinkColor #42b983
}
</style>

hide empty description
state "开始" as Begin <<start>> [[$./project_get#begin {"开始"}]]
state "结束" as END1 <<end>> [[$./project_get#end1 {"结束"}]]
state "准备参数" as PREPAREPARAM1  [[$./project_get#prepareparam1 {"准备参数"}]]
state "实体行为" as DEACTION1  [[$./project_get#deaction1 {"实体行为"}]]
state "调试逻辑参数" as DEBUGPARAM1  [[$./project_get#debugparam1 {"调试逻辑参数"}]]
state "准备参数" as PREPAREPARAM2  [[$./project_get#prepareparam2 {"准备参数"}]]


Begin --> PREPAREPARAM1 : [[$./project_get#begin-prepareparam1{连接名称} 连接名称]]
PREPAREPARAM1 --> DEACTION1
DEACTION1 --> DEBUGPARAM1
DEBUGPARAM1 --> PREPAREPARAM2
PREPAREPARAM2 --> END1


@enduml
```


### 处理步骤说明

#### 结束 :id=END1<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



返回 `Default(传入变量)`

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 准备参数 :id=PREPAREPARAM1<sup class="footnote-symbol"> <font color=gray size=1>[准备参数]</font></sup>



1. 将`Default(传入变量).PROJECT_ID(订单标识)` 设置给  `project(订单).ID(标识)`

#### 实体行为 :id=DEACTION1<sup class="footnote-symbol"> <font color=gray size=1>[实体行为]</font></sup>



调用实体 [订单(PROJECT)](module/crm/project.md) 行为 [Get](module/crm/project#行为) ，行为参数为`project(订单)`

将执行结果返回给参数`project(订单)`

#### 调试逻辑参数 :id=DEBUGPARAM1<sup class="footnote-symbol"> <font color=gray size=1>[调试逻辑参数]</font></sup>



> [!NOTE|label:调试信息|icon:fa fa-bug]
> 调试输出参数`project(订单)`的详细信息


#### 准备参数 :id=PREPAREPARAM2<sup class="footnote-symbol"> <font color=gray size=1>[准备参数]</font></sup>



1. 将`project(订单).SETTLEMENT_AMOUNT(业绩结算金额)` 设置给  `Default(传入变量).SETTLEMENT_AMOUNT(业绩结算金额)`
2. 将`project(订单).O_NUMBER(订单编号)` 设置给  `Default(传入变量).O_NUMBER(订单编号)`
3. 将`project(订单).ACCOUNT_NAME(客户名称)` 设置给  `Default(传入变量).ACCOUNT_NAME(客户名称)`
4. 将`project(订单).BUSINESS_LINE(业务条线)` 设置给  `Default(传入变量).BUSINESS_LINE(业务条线)`
5. 将`project(订单).ORDER_DATE(订单日期)` 设置给  `Default(传入变量).ORDER_DATE(订单日期)`


### 连接条件说明
#### 连接名称 :id=Begin-PREPAREPARAM1

`Default(传入变量).PROJECT_ID(订单标识)` ISNOTNULL


### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[收款记录(PAYEE)](module/crm/payee.md)||
|订单|project|数据对象|[订单(PROJECT)](module/crm/project.md)||
