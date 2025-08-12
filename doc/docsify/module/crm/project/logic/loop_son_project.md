## 循环子订单判断 <!-- {docsify-ignore-all} -->

   循环订单下的子订单来判断是否有未关闭的订单

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
state "开始" as Begin <<start>> [[$./loop_son_project#begin {"开始"}]]
state "查看订单详细内容" as DEBUGPARAM3  [[$./loop_son_project#debugparam3 {"查看订单详细内容"}]]
state "准备参数" as PREPAREPARAM1  [[$./loop_son_project#prepareparam1 {"准备参数"}]]
state "查询下级订单" as DEDATASET1  [[$./loop_son_project#dedataset1 {"查询下级订单"}]]
state "查看子订单列表数据" as DEBUGPARAM2  [[$./loop_son_project#debugparam2 {"查看子订单列表数据"}]]
state "结束" as END1 <<end>> [[$./loop_son_project#end1 {"结束"}]]
state "抛出异常" as THROWEXCEPTION1  [[$./loop_son_project#throwexception1 {"抛出异常"}]]
state "循环子调用" as LOOPSUBCALL1  [[$./loop_son_project#loopsubcall1 {"循环子调用"}]] #green {
state "实体处理逻辑" as DELOGIC1  [[$./loop_son_project#delogic1 {"实体处理逻辑"}]]
}


Begin --> DEBUGPARAM3
DEBUGPARAM3 --> PREPAREPARAM1 : [[$./loop_son_project#debugparam3-prepareparam1{当前订单已关闭} 当前订单已关闭]]
PREPAREPARAM1 --> DEDATASET1
DEDATASET1 --> DEBUGPARAM2 : [[$./loop_son_project#dedataset1-debugparam2{存在子工作项} 存在子工作项]]
DEBUGPARAM2 --> LOOPSUBCALL1
LOOPSUBCALL1 --> DELOGIC1
LOOPSUBCALL1 --> END1
DEDATASET1 --> END1 : [[$./loop_son_project#dedataset1-end1{不存在子工作项} 不存在子工作项]]
DEBUGPARAM3 --> THROWEXCEPTION1 : [[$./loop_son_project#debugparam3-throwexception1{当前订单未关闭} 当前订单未关闭]]


@enduml
```


### 处理步骤说明

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 抛出异常 :id=THROWEXCEPTION1<sup class="footnote-symbol"> <font color=gray size=1>[抛出异常]</font></sup>



> [!ATTENTION|label:抛出异常|icon:fa fa-warning]
> 错误信息：有子订单未关闭，请检查！

#### 查看订单详细内容 :id=DEBUGPARAM3<sup class="footnote-symbol"> <font color=gray size=1>[调试逻辑参数]</font></sup>



> [!NOTE|label:调试信息|icon:fa fa-bug]
> 调试输出参数`Default(传入变量)`的详细信息


#### 准备参数 :id=PREPAREPARAM1<sup class="footnote-symbol"> <font color=gray size=1>[准备参数]</font></sup>



1. 将`Default(传入变量).ID(标识)` 设置给  `project_pid_filter(订单过滤pid).n_pid_eq`

#### 查询下级订单 :id=DEDATASET1<sup class="footnote-symbol"> <font color=gray size=1>[实体数据集]</font></sup>



调用实体 [订单(PROJECT)](module/crm/project.md) 数据集合 [数据集(DEFAULT)](module/crm/project#数据集合) ，查询参数为`project_pid_filter(订单过滤pid)`

将执行结果返回给参数`project_info(订单列表)`

#### 查看子订单列表数据 :id=DEBUGPARAM2<sup class="footnote-symbol"> <font color=gray size=1>[调试逻辑参数]</font></sup>



> [!NOTE|label:调试信息|icon:fa fa-bug]
> 调试输出参数`project_info(订单列表)`的详细信息


#### 循环子调用 :id=LOOPSUBCALL1<sup class="footnote-symbol"> <font color=gray size=1>[循环子调用]</font></sup>



循环参数`project_info(订单列表)`，子循环参数使用`project_sub(循环临时统计数据)`
#### 实体处理逻辑 :id=DELOGIC1<sup class="footnote-symbol"> <font color=gray size=1>[实体逻辑]</font></sup>



调用实体 [订单(PROJECT)](module/crm/project.md) 处理逻辑 [循环子订单判断]((module/crm/project/logic/loop_son_project.md)) ，行为参数为`project_sub(循环临时统计数据)`

#### 结束 :id=END1<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



*- N/A*


### 连接条件说明
#### 当前订单已关闭 :id=DEBUGPARAM3-PREPAREPARAM1

`Default(传入变量).STATUS(状态)` EQ `20`
#### 存在子工作项 :id=DEDATASET1-DEBUGPARAM2

`project_info(订单列表).size` GT `0`
#### 不存在子工作项 :id=DEDATASET1-END1

`project_info(订单列表).size` EQ `0`
#### 当前订单未关闭 :id=DEBUGPARAM3-THROWEXCEPTION1

`Default(传入变量).STATUS(状态)` NOTEQ `20`


### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[订单(PROJECT)](module/crm/project.md)||
|订单列表|project_info|分页查询|||
|订单过滤pid|project_pid_filter|过滤器|||
|循环临时统计数据|project_sub|数据对象|[订单(PROJECT)](module/crm/project.md)||
