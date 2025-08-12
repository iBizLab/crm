# 消息通知 <!-- {docsify-ignore-all} -->


## 消息队列

|    中文名col200   | 代码名col200       |  类型col100     |  备注col750  |
| --------|------------| -----   |  -------- |
|默认消息队列|Default|Runtime||

## 实体消息通知

|    实体col200|    通知名称col200          |  消息模板col300   |  使用场景col250    |  备注col300  |
| --------|------------ |   -------- | -------- | -------- |
|[商机(DEAL)](module/crm/deal)|[商机新建、更新通知(deal_change_notify)](module/crm/deal/notify/deal_change_notify)|[商机新建、更新通知模板](#deal_change)|[商机新建、更新通知(changeNotiy)](module/crm/deal/logic/changeNotiy)||
|[备注(NOTE_ATTACH)](module/crm/note_attach)|[线索进展评估通知(LeadNotify)](module/crm/note_attach/notify/LeadNotify)|[进展评估通知模板](#progress_assess)|[新建、更新进展评估后通知(assess_notify)](module/crm/note_attach/logic/assess_notify)||
|[备注(NOTE_ATTACH)](module/crm/note_attach)|[商机进展评估通知(dealNotify)](module/crm/note_attach/notify/dealNotify)|[进展评估通知模板](#progress_assess)|[新建、更新进展评估后通知(assess_notify)](module/crm/note_attach/logic/assess_notify)||
|[备注(NOTE_ATTACH)](module/crm/note_attach)|[订单进展评估通知(progress_assess_notify)](module/crm/note_attach/notify/progress_assess_notify)|[进展评估通知模板](#progress_assess)|[新建、更新进展评估后通知(assess_notify)](module/crm/note_attach/logic/assess_notify)||
|[备注(NOTE_ATTACH)](module/crm/note_attach)|[任务进展评估通知(taskNotify)](module/crm/note_attach/notify/taskNotify)|[进展评估通知模板](#progress_assess)|[新建、更新进展评估后通知(assess_notify)](module/crm/note_attach/logic/assess_notify)||
|[订单(PROJECT)](module/crm/project)|[订单新建、更新通知(changeNotify)](module/crm/project/notify/changeNotify)|[订单新建、更新通知模板](#project_change)|[新建、更新订单后推送(project_change_notify)](module/crm/project/logic/project_change_notify)||
|[任务&活动(TASK)](module/crm/task)|[活动新建、更新通知(maneuverChangeNotify)](module/crm/task/notify/maneuverChangeNotify)|[活动新建、更新通知模板](#maneuver_change)|[新建、更新任务后推送(notify)](module/crm/task/logic/notify)||
|[任务&活动(TASK)](module/crm/task)|[任务新建、更新通知(taskChangeNotify)](module/crm/task/notify/taskChangeNotify)|[任务新建、更新通知模板](#task_change)|[新建、更新任务后推送(notify)](module/crm/task/logic/notify)||

## 通知目标

|    中文名col200   | 代码名col200       |  目标类型col150  | 数据集合col200   |  备注col500  |
| --------|------------| -----   |  -------- | -------- |
|销售领导|SalesLeader|实体数据集|[销售领导(SalesLeader)](module/crm/user/dataset/SalesLeader)||
|订单执行人|project_executor|实体数据集|[订单执行人(project_notify)](module/crm/executor/dataset/project_notify)||
|线索跟踪人|lead_executor|实体数据集|[线索跟踪人(lead_notify)](module/crm/executor/dataset/lead_notify)||
|任务执行人|task_executor|实体数据集|[任务通知对象(executor_notify)](module/crm/task_executor/dataset/executor_notify)||

## 消息模板

#### 订单新建、更新通知模板(project_change) :id=project_change


模板类型：`静态`

模板引擎：`FreeMarker`

内容类型：`HTML网页`

超链接：`route://-/index/project=${data.id}/project_main_view/-`

标题：
```
订单新建、更新通知模板
```

内容：
```
<div class="notice-card" style="display: flex; align-items: flex-start;">
    <div class="notice-card__avatar" style="flex-shrink: 0;">
        <span class="notice-card__avatar-icon" style="background-color: skyblue; border-radius: 50%; margin-right: 10px; width: 36px; height: 36px; display: flex; justify-content: center; align-items: center; font-size: 10px;">${data.update_mantext?substring(0,2)!}</span>
    </div>
    <div class="notice-card__content" style="flex-grow: 1;width: calc(100% - 46px);">
        <div class="notice-card__event">
            <div class="notice-card__event-title" style="font-size: 14px; color: #000;">
                <span class="notice-card__event-name" style="color: #999; font-size: 14px; text-transform: lowercase; display: inline-block; max-width: 100%; overflow: hidden; text-overflow: ellipsis; white-space: nowrap;">${data.update_mantext}</span> 
                <span class="notice-card__event-desc" style="font-size: 14px; text-transform: lowercase; display: inline-block; max-width: 100%; overflow: hidden; text-overflow: ellipsis; white-space: nowrap;"><#if data.create_time == data.update_time>新建了<#else>更新了</#if>订单</span>
            </div>
        </div>
		<div class="notice-card-object" style="display: inline-block; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; width: 100%;">
			<span class="notice-card__object-name" title="${data.name}">${data.name}</span>	
		</div>
		<div class="notice-card-pilot" style="font-size: 12px; color: #999; text-transform: lowercase; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;><span class="notice-time">${data.update_time?string("yyyy-MM-dd HH:mm:ss")}</span></div>
    </div>
</div>

```

钉钉内容：
```
${data.update_mantext}更改了${data.work_item_type_name} ${data.title}状态：<#if last.codeitem("STATE")??>${last.codeitem("STATE").text}<#else>无</#if>  → <#if data.codeitem("STATE")??>${data.codeitem("STATE").text}<#else>无</#if>
```
#### 商机新建、更新通知模板(deal_change) :id=deal_change


模板类型：`静态`

模板引擎：`FreeMarker`

内容类型：`HTML网页`

超链接：`route://-/index/deal=${data.id}/deal_main_view/-`

标题：
```
商机新建、更新通知
```

内容：
```
<div class="notice-card" style="display: flex; align-items: flex-start;">
    <div class="notice-card__avatar" style="flex-shrink: 0;">
        <span class="notice-card__avatar-icon" style="background-color: skyblue; border-radius: 50%; margin-right: 10px; width: 36px; height: 36px; display: flex; justify-content: center; align-items: center; font-size: 10px;">${data.update_mantext?substring(0,2)!}</span>
    </div>
    <div class="notice-card__content" style="flex-grow: 1;width: calc(100% - 46px);">
        <div class="notice-card__event">
            <div class="notice-card__event-title" style="font-size: 14px; color: #000;">
                <span class="notice-card__event-name" style="color: #999; font-size: 14px; text-transform: lowercase; display: inline-block; max-width: 100%; overflow: hidden; text-overflow: ellipsis; white-space: nowrap;">${data.update_mantext}</span> 
                <span class="notice-card__event-desc" style="font-size: 14px; text-transform: lowercase; display: inline-block; max-width: 100%; overflow: hidden; text-overflow: ellipsis; white-space: nowrap;"><#if data.create_time == data.update_time>新建了<#else>更新了</#if>商机</span>
            </div>
        </div>
		<div class="notice-card-object" style="display: inline-block; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; width: 100%;">
			<span class="notice-card__object-name" title="${data.deal_name}">${data.deal_name}</span>	
		</div>
		<div class="notice-card-pilot" style="font-size: 12px; color: #999; text-transform: lowercase; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;><span class="notice-time">${data.update_time?string("yyyy-MM-dd HH:mm:ss")}</span></div>
    </div>
</div>

```

钉钉内容：
```
${data.update_mantext}更改了${data.work_item_type_name} ${data.title}状态：<#if last.codeitem("STATE")??>${last.codeitem("STATE").text}<#else>无</#if>  → <#if data.codeitem("STATE")??>${data.codeitem("STATE").text}<#else>无</#if>
```
#### 任务新建、更新通知模板(task_change) :id=task_change


模板类型：`静态`

模板引擎：`FreeMarker`

内容类型：`HTML网页`

超链接：`route://-/index/task=${data.id}/task_main_view/-`

标题：
```
任务新建、更新通知模板
```

内容：
```
<div class="notice-card" style="display: flex; align-items: flex-start;">
    <div class="notice-card__avatar" style="flex-shrink: 0;">
        <span class="notice-card__avatar-icon" style="background-color: skyblue; border-radius: 50%; margin-right: 10px; width: 36px; height: 36px; display: flex; justify-content: center; align-items: center; font-size: 10px;">${data.update_mantext?substring(0,2)!}</span>
    </div>
    <div class="notice-card__content" style="flex-grow: 1;width: calc(100% - 46px);">
        <div class="notice-card__event">
            <div class="notice-card__event-title" style="font-size: 14px; color: #000;">
                <span class="notice-card__event-name" style="color: #999; font-size: 14px; text-transform: lowercase; display: inline-block; max-width: 100%; overflow: hidden; text-overflow: ellipsis; white-space: nowrap;">${data.update_mantext}</span> 
                <span class="notice-card__event-desc" style="font-size: 14px; text-transform: lowercase; display: inline-block; max-width: 100%; overflow: hidden; text-overflow: ellipsis; white-space: nowrap;"><#if data.create_time == data.update_time>新建了<#else>更新了</#if><#if data.type == 'TASK'>任务<#else>活动</#if></span>
            </div>
        </div>
		<div class="notice-card-object" style="display: inline-block; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; width: 100%;">
			<span class="notice-card__object-name" title="${data.subject}">${data.subject}</span>	
		</div>
		<div class="notice-card-pilot" style="font-size: 12px; color: #999; text-transform: lowercase; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;><span class="notice-time">${data.update_time?string("yyyy-MM-dd HH:mm:ss")}</span></div>
    </div>
</div>
```

钉钉内容：
```
${data.update_mantext}更改了${data.work_item_type_name} ${data.title}状态：<#if last.codeitem("STATE")??>${last.codeitem("STATE").text}<#else>无</#if>  → <#if data.codeitem("STATE")??>${data.codeitem("STATE").text}<#else>无</#if>
```
#### 评论@通知模板(comment_at) :id=comment_at


模板类型：`静态`

模板引擎：`FreeMarker`

内容类型：`HTML网页`

超链接：`<#if data.parent("principal_id")??><#if data.principal_type == 'PAGE'>view://article_pageshow_view_model?srfnavctx={"article_page":"${data.parent("principal_id").id}","space":"${data.parent("principal_id").space_id}"}<#else>view://${data.principal_type?lower_case}main_view?srfnavctx={"${data.principal_type?lower_case}":"${data.principal_id}"<#assign p = data.parent("principal_id")><#if p.parent("project_id")??>,"project":"${p.parent('project_id').id}"<#elseif p.parent("product_id")??>,"product":"${p.parent('product_id').id}"<#elseif p.parent("test_library_id")??>,"library":"${p.parent('test_library_id').id}"<#elseif p.parent("case_id")??>,"test_case":"${p.parent('case_id').id}","library":"${p.parent('case_id').test_library_id}"</#if>}</#if></#if>`

标题：
```
评论@通知
```

内容：
```
<div class="notice-card" style="display: flex; align-items: flex-start;">
    <div class="notice-card__avatar" style="flex-shrink: 0;">
        <span class="notice-card__avatar-icon" style="background-color: skyblue; border-radius: 50%; margin-right: 10px; width: 36px; height: 36px; display: flex; justify-content: center; align-items: center; font-size: 10px;">${data.update_mantext?substring(0,2)!}</span>
    </div>
    <div class="notice-card__content" style="flex-grow: 1;width: calc(100% - 46px);">
        <div class="notice-card__event">
            <div class="notice-card__event-title" style="font-size: 14px; color: #000;">
                <span class="notice-card__event-name" style="color: #999; font-size: 14px; text-transform: lowercase; display: inline-block; max-width: 100%; overflow: hidden; text-overflow: ellipsis; white-space: nowrap;">${data.update_mantext}</span> 
                <span class="notice-card__event-desc" style="font-size: 14px; text-transform: lowercase; display: inline-block; max-width: 100%; overflow: hidden; text-overflow: ellipsis; white-space: nowrap;">在评论中提及了你</span>
            </div>
        </div>
		<#if data.parent("principal_id")??>
			<#assign parent= data.parent("principal_id")>
				<div class="notice-card-object" style="display: inline-block; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; width: 100%;">
					<#if parent.show_identifier??>
						<span class="notice-card__object-id" style="color: #999; font-size:14px;">${parent.show_identifier}</span>
					</#if>
					<#if data.principal_type == 'CUSTOMER' || data.principal_type == 'PAGE'>
						<span class="notice-card__object-name" title="${parent.name}">${parent.name}</span>
					<#else>
						<span class="notice-card__object-name" title="${parent.title}">${parent.title}</span>
					</#if>		
				</div>
			<#assign content = data.content?replace('<img[^>]*>', '', 'r')?replace('<p[^>]*>', '', 'r')?replace('</?p[^>]*>', '', 'r')?replace('@','')><#assign regex = "(\\{.*?\\})">
				<#list content?matches(regex) as match>
					<#assign jsonStr = match>
						<#assign jsonObject = (jsonStr)?eval>  
							<#if jsonObject.name??>
								<#assign name = jsonObject.name>
									<#assign content = content?replace(jsonStr, '@' + name)>
							</#if>
				</#list>
			<div class="notice-card-object" style="display: inline-block; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; width: 100%;">
				<span class="notice-card__object-name" title="${content}">${content}</span>
			</div>
		</#if>
		<#if parent.parent("project_id")??>
		<#assign project= parent.parent("project_id")>
			<div class="notice-card-pilot" style="font-size: 12px; color: #999; text-transform: lowercase; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;><span class="notice-time">${data.update_time?string("yyyy-MM-dd HH:mm:ss")}</span><span class="notice-pilot-info">· 项目管理 · ${project.name}</span></div>
		<#elseif parent.parent("product_id")??>
        <#assign product= parent.parent("product_id")>
			<div class="notice-card-pilot" style="font-size: 12px; color: #999; text-transform: lowercase; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;><span class="notice-time">${data.update_time?string("yyyy-MM-dd HH:mm:ss")}</span><span class="notice-pilot-info">· 产品管理 · ${product.name}</span></div>
		<#elseif parent.parent("plan_id")??>
        <#assign plan= parent.parent("plan_id")>
			<div class="notice-card-pilot" style="font-size: 12px; color: #999; text-transform: lowercase; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;><span class="notice-time">${data.update_time?string("yyyy-MM-dd HH:mm:ss")}</span><span class="notice-pilot-info">· 测试管理 · ${plan.library_name}</span></div>
		<#elseif parent.parent("test_library_id")??>
        <#assign library= parent.parent("test_library_id")>
			<div class="notice-card-pilot" style="font-size: 12px; color: #999; text-transform: lowercase; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;><span class="notice-time">${data.update_time?string("yyyy-MM-dd HH:mm:ss")}</span><span class="notice-pilot-info">· 测试管理 · ${library.name}</span></div>
		<#elseif parent.parent("space_id")??>
        <#assign space= parent.parent("space_id")>
			<div class="notice-card-pilot" style="font-size: 12px; color: #999; text-transform: lowercase; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;><span class="notice-time">${data.update_time?string("yyyy-MM-dd HH:mm:ss")}</span><span class="notice-pilot-info">· 知识库管理 · ${space.name}</span></div>
		</#if>
    </div>
</div>
```

钉钉内容：
```
${data.update_mantext}在<#if data.principal_type == 'WORK_ITEM'>${data.parent("principal_id").work_item_type_name}<#elseif data.principal_type == 'IDEA'>需求<#elseif data.principal_type == 'TICKET'>工单<#elseif data.principal_type == 'TEST_CASE'>测试用例<#elseif data.principal_type == 'CUSTOMER'>客户<#elseif data.principal_type == 'RUN'>执行用例<#elseif data.principal_type == 'PAGE'>页面</#if>：
<#if data.owner_type == 'CUSTOMER' || data.owner_type == 'PAGE'>${data.parent("principal_id").name}<#else>${data.parent("principal_id").title}</#if>的评论中提及了你
```
#### 活动新建、更新通知模板(maneuver_change) :id=maneuver_change


模板类型：`静态`

模板引擎：`FreeMarker`

内容类型：`HTML网页`

超链接：`route://-/index/task=${data.id}/task_maneuver_main_view/-`

标题：
```
活动新建、更新通知模板
```

内容：
```
<div class="notice-card" style="display: flex; align-items: flex-start;">
    <div class="notice-card__avatar" style="flex-shrink: 0;">
        <span class="notice-card__avatar-icon" style="background-color: skyblue; border-radius: 50%; margin-right: 10px; width: 36px; height: 36px; display: flex; justify-content: center; align-items: center; font-size: 10px;">${data.update_mantext?substring(0,2)!}</span>
    </div>
    <div class="notice-card__content" style="flex-grow: 1;width: calc(100% - 46px);">
        <div class="notice-card__event">
            <div class="notice-card__event-title" style="font-size: 14px; color: #000;">
                <span class="notice-card__event-name" style="color: #999; font-size: 14px; text-transform: lowercase; display: inline-block; max-width: 100%; overflow: hidden; text-overflow: ellipsis; white-space: nowrap;">${data.update_mantext}</span> 
                <span class="notice-card__event-desc" style="font-size: 14px; text-transform: lowercase; display: inline-block; max-width: 100%; overflow: hidden; text-overflow: ellipsis; white-space: nowrap;"><#if data.create_time == data.update_time>新建了<#else>更新了</#if><#if data.type == 'TASK'>任务<#else>活动</#if></span>
            </div>
        </div>
		<div class="notice-card-object" style="display: inline-block; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; width: 100%;">
			<span class="notice-card__object-name" title="${data.subject}">${data.subject}</span>	
		</div>
		<div class="notice-card-pilot" style="font-size: 12px; color: #999; text-transform: lowercase; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;><span class="notice-time">${data.update_time?string("yyyy-MM-dd HH:mm:ss")}</span></div>
    </div>
</div>
```

钉钉内容：
```
${data.update_mantext}更改了${data.work_item_type_name} ${data.title}状态：<#if last.codeitem("STATE")??>${last.codeitem("STATE").text}<#else>无</#if>  → <#if data.codeitem("STATE")??>${data.codeitem("STATE").text}<#else>无</#if>
```
#### 进展评估通知模板(progress_assess) :id=progress_assess


模板类型：`静态`

模板引擎：`FreeMarker`

内容类型：`HTML网页`

超链接：`route://-/index/${data.principal_type?lower_case}=${data.principal_id}/${data.principal_type?lower_case}_main_view/-`

标题：
```
进展评估通知模板
```

内容：
```
<div class="notice-card" style="display: flex; align-items: flex-start;">
    <div class="notice-card__avatar" style="flex-shrink: 0;">
        <span class="notice-card__avatar-icon" style="background-color: skyblue; border-radius: 50%; margin-right: 10px; width: 36px; height: 36px; display: flex; justify-content: center; align-items: center; font-size: 10px;">${data.update_mantext?substring(0,2)!}</span>
    </div>
    <div class="notice-card__content" style="flex-grow: 1; padding-right: 15px;">
        <div class="notice-card__event">
            <div class="notice-card__event-title" style="font-size: 14px; color: #000;">
                <span class="notice-card__event-name" style="color: #999; font-size: 14px; text-transform: lowercase;">${data.update_mantext}</span> 
                <span class="notice-card__event-desc" style="font-size: 14px; text-transform: lowercase;">评估了<#if data.principal_type == 'TASK'>任务<#elseif data.principal_type == 'DEAL'>商机<#elseif data.principal_type == 'PROJECT'>订单<#elseif data.principal_type == 'LEAD'>线索</#if></span>
            </div>
        </div>

		<#if data.parent("principal_id")??>  
			<#assign parent= data.parent("principal_id")>
			<div class="notice-card-object">
            <span class="notice-card__object-name" title="<#if data.principal_type == 'TASK'>${parent.subject}<#elseif data.principal_type == 'DEAL'>${parent.deal_name}<#elseif data.principal_type == 'PROJECT'>${parent.name}<#elseif data.principal_type == 'LEAD'>${parent.subject}</#if>"><#if data.principal_type == 'TASK'>${parent.subject}<#elseif data.principal_type == 'DEAL'>${parent.deal_name}<#elseif data.principal_type == 'PROJECT'>${parent.name}<#elseif data.principal_type == 'LEAD'>${parent.subject}</#if></span> 
			</div>		
		<#else>  
			<div class="notice-card-object">
            <span class="notice-card__object-name" title="data.principal_name">${data.principal_name}</span> 
			</div>		
		</#if>
        <#assign content = data.content?replace('<img[^>]*>', '[图片]', 'r')?replace('<p[^>]*>', '', 'r')?replace('</?p[^>]*>', '', 'r')>
        <#assign regex = "(\\@\\{.*?\\})">
            <#list content?matches(regex) as match>
                <#assign jsonStr = match>
                <#assign jsonObject = (jsonStr?replace("@", ""))?eval>  
                <#if jsonObject.name??>
                    <#assign name = jsonObject.name>
                    <#assign content = content?replace(jsonStr, "<span class='comment-tag'>@" + name + "</span>")>
                </#if>
            </#list>
        <#assign regex = "\\#\\{\"id\":\"(.*?)\",\"name\":\"(.+?)\",\"identifier\":\"(.+?)\",\"icon\":\"((.|[\\t\\r\\f\\n\\s])+?)\"\\}">
            <#list content?matches(regex) as match>
                <#assign jsonStr = match>
                <#assign content = content?replace(jsonStr,"<span class='comment-tag'>" + match?groups[4]+ match?groups[3] + match?groups[2] + "</span>")>
            </#list>
        <div class="notice-card-object">
            <span class="notice-card__object-name">${content}</span>
        </div>
        <div class="notice-card-pilot" style="font-size: 12px; color: #999; text-transform: lowercase;"><span class="notice-time">${data.update_time?string("yyyy-MM-dd HH:mm:ss")}</span></div>
    </div>
</div>
```
