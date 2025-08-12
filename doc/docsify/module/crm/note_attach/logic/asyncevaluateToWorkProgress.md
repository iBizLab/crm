## 异步添加评估到工作进展 <!-- {docsify-ignore-all} -->

   

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
state "开始" as Begin <<start>> [[$./asyncevaluateToWorkProgress#begin {"开始"}]]
state "结束" as END1 <<end>> [[$./asyncevaluateToWorkProgress#end1 {"结束"}]]
state "异步将评估更新到工作进展" as DEACTION1  [[$./asyncevaluateToWorkProgress#deaction1 {"异步将评估更新到工作进展"}]]


Begin --> DEACTION1
DEACTION1 --> END1


@enduml
```


### 处理步骤说明

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 结束 :id=END1<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



*- N/A*

#### 异步将评估更新到工作进展 :id=DEACTION1<sup class="footnote-symbol"> <font color=gray size=1>[实体行为]</font></sup>



调用实体 [备注(NOTE_ATTACH)](module/crm/note_attach.md) 行为 [异步新建评估时添加到工作进展(Async_evaluateToWorkProgress)](module/crm/note_attach#行为) ，行为参数为`Default(传入变量)`



### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[备注(NOTE_ATTACH)](module/crm/note_attach.md)||
