## 税率(TAX) <!-- {docsify-ignore-all} -->

   

### 税率值规则 :id=DEFValueRule

```plantuml
@startuml
hide empty description
<style>
root {
  HyperlinkColor #42b983
}
</style>

state "start" as start  <<start>>
state "end" as end <<end>>
state "(TAX) TAX" as e019302d6d8630e0a198be1faa716cb0 [[$./Tax#ae019302d6d8630e0a198be1faa716cb0 {"[数值范围] TAX"}]]


start --> e019302d6d8630e0a198be1faa716cb0 
e019302d6d8630e0a198be1faa716cb0 --> end 


@enduml
```

#### 条件说明

##### (TAX) TAX :id=ae019302d6d8630e0a198be1faa716cb0



`TAX(税率)` 值在区间 `
(-∞ , 100.0]` 内

> [!ATTENTION|label:规则信息|icon:fa fa-warning]
> 税率必须在[0~100]之间



### 比率值规则 :id=DEFValueRule2

```plantuml
@startuml
hide empty description
<style>
root {
  HyperlinkColor #42b983
}
</style>

state "start" as start  <<start>>
state "end" as end <<end>>
state "(ratio) ratio" as a5ffc2c4956834f92ad9f06e46ce8d2a [[$./Tax#aa5ffc2c4956834f92ad9f06e46ce8d2a {"[数值范围] ratio"}]]


start --> a5ffc2c4956834f92ad9f06e46ce8d2a 
a5ffc2c4956834f92ad9f06e46ce8d2a --> end 


@enduml
```

#### 条件说明

##### (ratio) ratio :id=aa5ffc2c4956834f92ad9f06e46ce8d2a



`ratio` 值在区间 `
(-∞ , 100.0]` 内

> [!ATTENTION|label:规则信息|icon:fa fa-warning]
> 比率需要在[1~100]之间







