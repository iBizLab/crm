## 异步添加活动到工作进展 <!-- {docsify-ignore-all} -->

   

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
state "开始" as Begin <<start>> [[$./asyncManeuverToWorkProgres#begin {"开始"}]]
state "结束" as END1 <<end>> [[$./asyncManeuverToWorkProgres#end1 {"结束"}]]
state "异步添加活动到工作进展" as DEACTION1  [[$./asyncManeuverToWorkProgres#deaction1 {"异步添加活动到工作进展"}]]


Begin --> DEACTION1
DEACTION1 --> END1


@enduml
```


### 处理步骤说明

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 结束 :id=END1<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



*- N/A*

#### 异步添加活动到工作进展 :id=DEACTION1<sup class="footnote-symbol"> <font color=gray size=1>[实体行为]</font></sup>



调用实体 [任务&活动(TASK)](module/crm/task.md) 行为 [异步新建活动时添加到工作进展(Async_maneuverToWorkProgress)](module/crm/task#行为) ，行为参数为`Default(传入变量)`



### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[任务&活动(TASK)](module/crm/task.md)||
