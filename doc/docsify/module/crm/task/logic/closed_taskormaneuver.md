## 关闭任务 <!-- {docsify-ignore-all} -->

   

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
state "开始" as Begin <<start>> [[$./closed_taskormaneuver#begin {"开始"}]]
state "结束" as END1 <<end>> [[$./closed_taskormaneuver#end1 {"结束"}]]
state "将状态变为完成" as PREPAREPARAM1  [[$./closed_taskormaneuver#prepareparam1 {"将状态变为完成"}]]
state "更新任务/活动" as DEACTION1  [[$./closed_taskormaneuver#deaction1 {"更新任务/活动"}]]


Begin --> PREPAREPARAM1
PREPAREPARAM1 --> DEACTION1
DEACTION1 --> END1


@enduml
```


### 处理步骤说明

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 结束 :id=END1<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



*- N/A*

#### 将状态变为完成 :id=PREPAREPARAM1<sup class="footnote-symbol"> <font color=gray size=1>[准备参数]</font></sup>



1. 将`计算式 null` 设置给  `Default(传入变量).CLOSED_TIME(关闭时间)`
2. 将`40` 设置给  `Default(传入变量).STATUS(状态)`

#### 更新任务/活动 :id=DEACTION1<sup class="footnote-symbol"> <font color=gray size=1>[实体行为]</font></sup>



调用实体 [任务&活动(TASK)](module/crm/task.md) 行为 [Update](module/crm/task#行为) ，行为参数为`Default(传入变量)`



### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[任务&活动(TASK)](module/crm/task.md)||
