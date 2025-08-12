## 发送评论 <!-- {docsify-ignore-all} -->

   

### 处理过程

```plantuml
@startuml
hide footbox
<style>
root {
  HyperlinkColor #42b983
}
</style>

hide empty description
state "开始" as Begin <<start>> [[$./send_comment#begin {开始}]]
state "结束" as END1 <<end>> [[$./send_comment#end1 {结束}]]
state "设置评论id" as PREPAREJSPARAM3  [[$./send_comment#preparejsparam3 {设置评论id}]]
state "Save" as DEACTION3  [[$./send_comment#deaction3 {Save}]]
state "查看view里面参数" as DEBUGPARAM1  [[$./send_comment#debugparam1 {查看view里面参数}]]
state "获取评论框内容" as RAWJSCODE1  [[$./send_comment#rawjscode1 {获取评论框内容}]]
state "查看view参数" as DEBUGPARAM2  [[$./send_comment#debugparam2 {查看view参数}]]
state "回复标识" as PREPAREJSPARAM2  [[$./send_comment#preparejsparam2 {回复标识}]]
state "注入脚本代码" as RAWJSCODE3  [[$./send_comment#rawjscode3 {注入脚本代码}]]
state "查看view" as DEBUGPARAM3  [[$./send_comment#debugparam3 {查看view}]]
state "设置评论principal_id与principal_type" as PREPAREJSPARAM1  [[$./send_comment#preparejsparam1 {设置评论principal_id与principal_type}]]
state "清空评论框与评论id" as RAWJSCODE2  [[$./send_comment#rawjscode2 {清空评论框与评论id}]]
state "Create" as DEACTION2  [[$./send_comment#deaction2 {Create}]]


Begin --> DEBUGPARAM2
DEBUGPARAM2 --> RAWJSCODE1
RAWJSCODE1 --> PREPAREJSPARAM1 : [[$./send_comment#rawjscode1-preparejsparam1{连接名称} 连接名称]]
PREPAREJSPARAM1 --> DEBUGPARAM1 : [[$./send_comment#preparejsparam1-debugparam1{连接名称} 连接名称]]
DEBUGPARAM1 --> DEACTION2 : [[$./send_comment#debugparam1-deaction2{无存在评论id} 无存在评论id]]
DEACTION2 --> RAWJSCODE2
RAWJSCODE2 --> RAWJSCODE3
RAWJSCODE3 --> END1
DEBUGPARAM1 --> PREPAREJSPARAM3 : [[$./send_comment#debugparam1-preparejsparam3{存在评论id} 存在评论id]]
PREPAREJSPARAM3 --> DEACTION3
DEACTION3 --> RAWJSCODE2
PREPAREJSPARAM1 --> DEBUGPARAM3 : [[$./send_comment#preparejsparam1-debugparam3{连接名称} 连接名称]]
DEBUGPARAM3 --> PREPAREJSPARAM2
PREPAREJSPARAM2 --> DEACTION2
RAWJSCODE1 --> RAWJSCODE3 : [[$./send_comment#rawjscode1-rawjscode3{连接名称} 连接名称]]


@enduml
```


### 处理步骤说明

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>




#### 查看view参数 :id=DEBUGPARAM2<sup class="footnote-symbol"> <font color=gray size=1>[调试逻辑参数]</font></sup>



> [!NOTE|label:调试信息|icon:fa fa-bug]
> 调试输出参数`当前视图对象`的详细信息

#### 获取评论框内容 :id=RAWJSCODE1<sup class="footnote-symbol"> <font color=gray size=1>[直接前台代码]</font></sup>



<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.comment.content = uiLogic.view.layoutPanel.panelItems.field_textbox.value;
```

#### 设置评论principal_id与principal_type :id=PREPAREJSPARAM1<sup class="footnote-symbol"> <font color=gray size=1>[准备参数]</font></sup>



1. 将`ctx(应用上下文变量).principal_id` 设置给  `comment(评论对象).principal_id`
2. 将`ctx(应用上下文变量).principal_name` 设置给  `comment(评论对象).principal_name`
3. 将`ctx(应用上下文变量).principal_type` 设置给  `comment(评论对象).principal_type`
4. 将`view(当前视图对象).layoutPanel.panelItems.field_textbox.editor` 设置给  `editor(编辑器)`
5. 将`ctx(应用上下文变量).principal_type` 设置给  `comment(评论对象).owner_type`

#### 查看view :id=DEBUGPARAM3<sup class="footnote-symbol"> <font color=gray size=1>[调试逻辑参数]</font></sup>



> [!NOTE|label:调试信息|icon:fa fa-bug]
> 调试输出参数`当前视图对象`的详细信息

#### 查看view里面参数 :id=DEBUGPARAM1<sup class="footnote-symbol"> <font color=gray size=1>[调试逻辑参数]</font></sup>



> [!NOTE|label:调试信息|icon:fa fa-bug]
> 调试输出参数`当前视图对象`的详细信息

#### 回复标识 :id=PREPAREJSPARAM2<sup class="footnote-symbol"> <font color=gray size=1>[准备参数]</font></sup>



1. 将`view(当前视图对象).reply_comment_id` 设置给  `comment(评论对象).pid`

#### 设置评论id :id=PREPAREJSPARAM3<sup class="footnote-symbol"> <font color=gray size=1>[准备参数]</font></sup>



1. 将`view(当前视图对象).edit_comment_id` 设置给  `comment(评论对象).id`
2. 将`view(当前视图对象).edit_comment_id` 设置给  `ctx(应用上下文变量).comment`

#### Create :id=DEACTION2<sup class="footnote-symbol"> <font color=gray size=1>[实体行为]</font></sup>



调用实体 [备注(NOTE_ATTACH)](module/crm/note_attach.md) 行为 [Create](module/crm/note_attach#行为) ，行为参数为`comment(评论对象)`

#### Save :id=DEACTION3<sup class="footnote-symbol"> <font color=gray size=1>[实体行为]</font></sup>



调用实体 [备注(NOTE_ATTACH)](module/crm/note_attach.md) 行为 [Save](module/crm/note_attach#行为) ，行为参数为`comment(评论对象)`

#### 注入脚本代码 :id=RAWJSCODE3<sup class="footnote-symbol"> <font color=gray size=1>[直接前台代码]</font></sup>



<p class="panel-title"><b>执行代码</b></p>

```javascript
console.log("ceSsasasa")
```

#### 清空评论框与评论id :id=RAWJSCODE2<sup class="footnote-symbol"> <font color=gray size=1>[直接前台代码]</font></sup>



<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.view.layoutPanel.panelItems.field_textbox.value = '';
uiLogic.view.layoutPanel.panelItems.field_textbox.data.field_textbox = '';
uiLogic.view.edit_comment_id = null;
uiLogic.view.reply_comment_id = null;
uiLogic.editor.reply.value = null;
```

#### 结束 :id=END1<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>




### 连接条件说明
#### 连接名称 :id=RAWJSCODE1-PREPAREJSPARAM1

```comment(评论对象).content``` ISNOTNULL
#### 连接名称 :id=PREPAREJSPARAM1-DEBUGPARAM1

```editor(编辑器).reply.value``` ISNULL
#### 无存在评论id :id=DEBUGPARAM1-DEACTION2

```view(当前视图对象).edit_comment_id``` ISNULL
#### 存在评论id :id=DEBUGPARAM1-PREPAREJSPARAM3

```view(当前视图对象).edit_comment_id``` ISNOTNULL
#### 连接名称 :id=PREPAREJSPARAM1-DEBUGPARAM3

```editor(编辑器).reply.value``` ISNOTNULL
#### 连接名称 :id=RAWJSCODE1-RAWJSCODE3

```comment(评论对象).content``` ISNULL


### 实体逻辑参数

|    中文名   |    代码名    |  数据类型      |备注 |
| --------| --------| --------  | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象||
|当前视图对象|view|当前视图对象||
|应用上下文变量|ctx|导航视图参数绑定参数||
|编辑器|editor|数据对象||
|评论对象|comment|数据对象||
