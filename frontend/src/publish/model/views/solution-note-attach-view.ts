export default {
  enableDirtyChecking: true,
  xdataControlName: 'form',
  loadDefault: true,
  deviewCodeName: 'note_attach_view',
  deviewId: 'f47312128cbe0b0e4974953839bdaee9',
  accUserMode: 2,
  caption: '备注',
  codeName: 'solution_note_attach_view',
  appDataEntityId: 'crmweb.solution',
  appViewNavContexts: [
    {
      key: 'PRINCIPAL_ID',
      value: 'solution',
      name: 'PRINCIPAL_ID',
      id: 'principal_id',
    },
    {
      rawValue: true,
      key: 'PRINCIPAL_TYPE',
      value: 'SOLUTION',
      name: 'PRINCIPAL_TYPE',
      id: 'principal_type',
    },
    {
      key: 'N_OWNER_ID_EQ',
      value: 'solution',
      name: 'N_OWNER_ID_EQ',
      id: 'n_owner_id_eq',
    },
  ],
  appViewNavParams: [
    {
      rawValue: true,
      key: 'principal_type',
      value: 'SOLUTION',
      id: 'principal_type',
    },
    {
      key: 'n_owner_id_eq',
      value: 'solution',
      id: 'n_owner_id_eq',
    },
    {
      key: 'principal_id',
      value: 'solution',
      id: 'principal_id',
    },
  ],
  viewLayoutPanel: {
    viewProxyMode: true,
    layoutMode: 'FLEX',
    layout: {
      layout: 'FLEX',
    },
    rootPanelItems: [
      {
        actionGroupExtractMode: 'ITEM',
        panelItems: [
          {
            actionGroupExtractMode: 'ITEM',
            panelItems: [
              {
                caption: 'FORM',
                itemStyle: 'DEFAULT',
                itemType: 'CTRLPOS',
                layoutPos: {
                  shrink: 1,
                  heightMode: 'FULL',
                  layout: 'FLEX',
                },
                showCaption: true,
                id: 'form',
              },
              {
                actionGroupExtractMode: 'ITEM',
                panelItems: [
                  {
                    actionGroupExtractMode: 'ITEM',
                    panelItems: [
                      {
                        actionGroupExtractMode: 'ITEM',
                        panelItems: [
                          {
                            actionGroupExtractMode: 'ITEM',
                            panelItems: [
                              {
                                actionGroupExtractMode: 'ITEM',
                                panelItems: [
                                  {
                                    editor: {
                                      editorParams: {
                                        USERINSCRIPT:
                                          'value.replaceAll(/\\@\\{\\"(user)?id\\":\\"(.+?)\\",\\"name\\":\\"(.+?)\\"\\}/g,(x, user, id, name) => {return controller.getNodeInfo({ id, name })}).replaceAll(/\\@\\{userid=(.+?),name=(.+?)\\}/g,(x, id, name) => {return controller.getNodeInfo({ id, name })})',
                                        QUOTEFIELDMAP:
                                          '{"identifier":"show_identifier","name":"name","id":"id","type":"owner_subtype"}',
                                        QUOTEPARAMS:
                                          '{"page":0,"size":20,"sort":"update_time,desc"}',
                                        QUOTEINSCRIPT:
                                          'value.replaceAll(/\\#\\{\\"id\\":\\"(.+?)\\",\\"name\\":\\"(.+?)\\",\\"identifier\\":\\"(.+?)\\",\\"icon\\":\\"((.|[\\t\\r\\f\\n\\s])+?)\\"\\}/g,(x, id, name, identifier, icon) => {return controller.getNodeInfo({ id, name, identifier, icon })}).replaceAll(/\\#\\{id=(.+?),name=(.+?),identifier=(.+?),icon=((.|[\\t\\r\\f\\n\\s])+?)\\}/g,(x, id, name, identifier, icon) => {return controller.getNodeInfo({ id, name, identifier, icon })})',
                                        USERSCRIPT:
                                          '`@{"id":"${data.id}","name":"${data.name}"}`',
                                        QUOTESCRIPT:
                                          '`#{"id":"${data.id}","name":"${data.name}","identifier":"${data.identifier}","icon":"${data.icon}"}`',
                                        REPLYSCRIPT:
                                          'value?.replace(/@{[^,]*,"name":"(.*?)"}/g,"<span class=\\\'comment-tag\\\'>@$1</span>").replace(/@{[^,]*,name=(.*?)}/g,"<span class=\\\'comment-tag\\\'>@$1</span>").replace(/#{"id":"(.+?)","name":"(.+?)","identifier":"(.+?)","icon":"((.|[\\t\\r\\f\\n\\s])+?)"}/g, "<span class=\\\'comment-tag\\\'>$4 $3 $2</span>").replace(/#{id=(.+?),name=(.+?),identifier=(.+?),icon=((.|[\\t\\r\\f\\n\\s])+?)}/g, "<span class=\\\'comment-tag\\\'>$4 $3 $2</span>")',
                                        USERFIELDMAP:
                                          '{"id":"user_id","name":"name"}',
                                        USERURL:
                                          '`projects/${context.project}/project_members/fetchdefault`',
                                        QUOTEURL:
                                          '`recents/fetchrecent_access`',
                                      },
                                      editorStyle: 'COMMENT_PROJECT',
                                      editorType: 'HTMLEDITOR',
                                      sysPFPluginId: 'comment',
                                      predefinedType: 'FIELD_TEXT_DYNAMIC',
                                      valueType: 'SIMPLE',
                                      editable: true,
                                      id: 'field_textbox',
                                    },
                                    allowEmpty: true,
                                    caption: '文本(动态)',
                                    itemStyle: 'DEFAULT',
                                    itemType: 'FIELD',
                                    layoutPos: {
                                      grow: 10,
                                      shrink: 1,
                                      layout: 'FLEX',
                                    },
                                    id: 'field_textbox',
                                  },
                                  {
                                    actionType: 'UIACTION',
                                    buttonStyle: 'INFO',
                                    buttonType: 'PANELBUTTON',
                                    uiactionId: 'clear_comment@note_attach',
                                    renderMode: 'BUTTON',
                                    tooltip: '取消',
                                    uiactionTarget: 'NONE',
                                    caption: '取消',
                                    dynaClass:
                                      "['ibiz-panel-button--comment__cancel']",
                                    itemStyle: 'INFO',
                                    itemType: 'BUTTON',
                                    layoutPos: {
                                      shrink: 0,
                                      layout: 'FLEX',
                                    },
                                    panelItemGroupLogics: [
                                      {
                                        logicCat: 'PANELVISIBLE',
                                        relatedItemNames: ['field_textbox'],
                                        groupOP: 'AND',
                                        panelItemLogics: [
                                          {
                                            condOp: 'ISNOTNULL',
                                            dstModelField: 'FIELD_TEXTBOX',
                                            logicType: 'SINGLE',
                                            id: '逻辑项',
                                          },
                                        ],
                                        logicType: 'GROUP',
                                      },
                                    ],
                                    showCaption: true,
                                    id: 'comment_cancel',
                                  },
                                  {
                                    actionType: 'UIACTION',
                                    buttonStyle: 'DEFAULT',
                                    buttonType: 'PANELBUTTON',
                                    uiactionId: 'send_comment@note_attach',
                                    renderMode: 'BUTTON',
                                    tooltip: '提交',
                                    uiactionTarget: 'SINGLEDATA',
                                    caption: '提交',
                                    dynaClass:
                                      "['ibiz-panel-button--comment__send']",
                                    itemStyle: 'DEFAULT',
                                    itemType: 'BUTTON',
                                    layoutPos: {
                                      shrink: 0,
                                      layout: 'FLEX',
                                    },
                                    panelItemGroupLogics: [
                                      {
                                        logicCat: 'PANELVISIBLE',
                                        relatedItemNames: ['field_textbox'],
                                        groupOP: 'AND',
                                        panelItemLogics: [
                                          {
                                            condOp: 'ISNOTNULL',
                                            dstModelField: 'FIELD_TEXTBOX',
                                            logicType: 'SINGLE',
                                            id: '逻辑项',
                                          },
                                        ],
                                        logicType: 'GROUP',
                                      },
                                    ],
                                    showCaption: true,
                                    id: 'comment_send',
                                  },
                                  {
                                    rawItem: {
                                      sysImage: {
                                        cssClass: 'fa fa-arrow-circle-o-right',
                                        glyph: 'xf18e@FontAwesome',
                                      },
                                      contentType: 'IMAGE',
                                      dynaClass:
                                        "['ibiz-panel-button--comment__icon']",
                                      sysCss: {
                                        cssName: 'comment_icon',
                                      },
                                      predefinedType: 'STATIC_IMAGE',
                                      rawItemHeight: 48,
                                      id: 'comment_icon',
                                    },
                                    caption: '图片',
                                    contentHeight: 48,
                                    height: 48,
                                    itemStyle: 'DEFAULT',
                                    itemType: 'RAWITEM',
                                    layoutPos: {
                                      shrink: 0,
                                      height: 48,
                                      heightMode: 'PX',
                                      layout: 'FLEX',
                                    },
                                    sysCss: {
                                      cssName: 'comment_icon',
                                    },
                                    sysImage: {
                                      cssClass: 'fa fa-arrow-circle-o-right',
                                      glyph: 'xf18e@FontAwesome',
                                    },
                                    showCaption: true,
                                    id: 'comment_icon',
                                  },
                                ],
                                layout: {
                                  dir: 'row',
                                  layout: 'FLEX',
                                  valign: 'flex-start',
                                },
                                dataRegionType: 'INHERIT',
                                caption: '容器',
                                itemStyle: 'DEFAULT',
                                itemType: 'CONTAINER',
                                layoutPos: {
                                  shrink: 1,
                                  heightMode: 'FULL',
                                  layout: 'FLEX',
                                  widthMode: 'FULL',
                                },
                                id: 'container_comment',
                              },
                            ],
                            layout: {
                              dir: 'column',
                              layout: 'FLEX',
                            },
                            dataRegionType: 'INHERIT',
                            itemStyle: 'DEFAULT',
                            itemType: 'CONTAINER',
                            layoutPos: {
                              colMD: 24,
                              heightMode: 'FULL',
                              layout: 'TABLE_24COL',
                              widthMode: 'FULL',
                            },
                            id: 'page_container',
                          },
                        ],
                        predefinedType: 'PANELPART',
                        layout: {
                          columnCount: 24,
                          layout: 'TABLE_24COL',
                        },
                        dataRegionType: 'INHERIT',
                        caption: '引用布局面板',
                        itemStyle: 'DEFAULT',
                        itemType: 'CONTAINER',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'panelpart',
                      },
                    ],
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    dataRegionType: 'INHERIT',
                    caption: '面板容器',
                    itemStyle: 'DEFAULT',
                    itemType: 'CONTAINER',
                    layoutPos: {
                      grow: 12,
                      shrink: 1,
                      layout: 'SIMPLEFLEX',
                    },
                    id: 'container',
                  },
                ],
                predefinedType: 'CONTAINER_GRID',
                layout: {
                  layout: 'SIMPLEFLEX',
                },
                dataRegionType: 'INHERIT',
                caption: '栅格容器',
                itemStyle: 'DEFAULT',
                itemType: 'CONTAINER',
                layoutPos: {
                  shrink: 1,
                  layout: 'FLEX',
                  spacingLeft: 'OUTERSMALL',
                  spacingRight: 'OUTERSMALL',
                },
                id: 'container_view_bottom',
              },
            ],
            predefinedType: 'CONTAINER',
            layout: {
              layout: 'FLEX',
            },
            dataRegionType: 'INHERIT',
            caption: '容器',
            contentHeight: 100,
            height: 100,
            itemStyle: 'DEFAULT',
            itemType: 'CONTAINER',
            layoutPos: {
              shrink: 1,
              height: 100,
              heightMode: 'PERCENTAGE',
              layout: 'FLEX',
            },
            id: 'container3',
          },
        ],
        predefinedType: 'CONTAINER',
        layout: {
          dir: 'column',
          layout: 'FLEX',
        },
        dataRegionType: 'INHERIT',
        caption: '容器',
        itemStyle: 'DEFAULT',
        itemType: 'CONTAINER',
        layoutPos: {
          shrink: 1,
          layout: 'FLEX',
        },
        id: 'page_container',
      },
    ],
    layoutPanel: true,
    appViewEngines: [
      {
        engineCat: 'VIEW',
        engineType: 'EditView9',
        id: 'engine',
      },
    ],
    controls: [
      {
        createControlAction: {
          appDEMethodId: 'create',
          appDataEntityId: 'crmweb.solution',
          id: 'create',
        },
        getDraftFromControlAction: {
          appDataEntityId: 'crmweb.solution',
          id: 'loaddraftfrom',
        },
        getDraftControlAction: {
          appDEMethodId: 'get_draft',
          appDataEntityId: 'crmweb.solution',
          id: 'loaddraft',
        },
        getControlAction: {
          appDEMethodId: 'get',
          appDataEntityId: 'crmweb.solution',
          id: 'load',
        },
        removeControlAction: {
          appDEMethodId: 'remove',
          appDataEntityId: 'crmweb.solution',
          id: 'remove',
        },
        updateControlAction: {
          appDEMethodId: 'update',
          appDataEntityId: 'crmweb.solution',
          id: 'update',
        },
        deformPages: [
          {
            layout: {
              columnCount: 24,
              layout: 'TABLE_24COL',
            },
            deformDetails: [
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    appViewId: 'crmweb.note_attach_list_view',
                    parentDataJO: {
                      srfparentdename: 'SOLUTION',
                      SRFPARENTTYPE: 'CUSTOM',
                    },
                    codeName: 'druipart1',
                    detailStyle: 'DEFAULT',
                    detailType: 'DRUIPART',
                    layoutPos: {
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    showCaption: true,
                    id: 'druipart1',
                  },
                ],
                caption: '备注',
                codeName: 'grouppanel1',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel1',
              },
              {
                dataType: 25,
                enableCond: 3,
                labelPos: 'LEFT',
                labelWidth: 130,
                noPrivDisplayMode: 1,
                appDEFieldId: 'id',
                editor: {
                  editorType: 'HIDDEN',
                  valueType: 'SIMPLE',
                  editable: true,
                  id: 'id',
                },
                allowEmpty: true,
                hidden: true,
                capLanguageRes: {
                  lanResTag: 'DEF.LNAME.ID',
                },
                caption: '标识',
                codeName: 'id',
                detailStyle: 'DEFAULT',
                detailType: 'FORMITEM',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                id: 'id',
              },
            ],
            codeName: 'formpage1',
            detailStyle: 'DEFAULT',
            detailType: 'FORMPAGE',
            id: 'formpage1',
          },
        ],
        layout: {
          columnCount: 24,
          layout: 'TABLE_24COL',
        },
        tabHeaderPos: 'TOP',
        noTabHeader: true,
        autoLoad: true,
        showBusyIndicator: true,
        codeName: 'note_attach_view_form',
        controlType: 'FORM',
        logicName: '备注_表单',
        appDataEntityId: 'crmweb.solution',
        controlParam: {
          id: 'form',
        },
        modelId: 'b06668b7ba72e28c967e8c147223293e',
        modelType: 'PSDEFORM_EDITFORM',
        name: 'form',
        id: 'crmweb.solution.note_attach_view_form',
      },
      {
        caption: '备注',
        codeName: 'note_attach_view_captionbar',
        controlType: 'CAPTIONBAR',
        appDataEntityId: 'crmweb.solution',
        controlParam: {},
        name: 'captionbar',
        id: 'note_attach_view_captionbar',
      },
    ],
    codeName: 'usr0322032518',
    controlType: 'VIEWLAYOUTPANEL',
    logicName: 'note_attach_viewDEEDITVIEW',
    appDataEntityId: 'crmweb.solution',
    controlLogics: [
      {
        eventNames: 'onBlur',
        itemName: 'FIELD_TEXTBOX',
        logicTag: 'layoutpanel',
        logicType: 'APPDEUILOGIC',
        appDEUILogicId: 'note_icon_hidden',
        appDataEntityId: 'crmweb.note_attach',
        triggerType: 'CTRLEVENT',
        name: 'onBlur',
        id: 'onblur',
      },
      {
        eventNames: 'onFocus',
        itemName: 'FIELD_TEXTBOX',
        logicTag: 'layoutpanel',
        logicType: 'APPDEUILOGIC',
        appDEUILogicId: 'note_icon_show',
        appDataEntityId: 'crmweb.note_attach',
        triggerType: 'CTRLEVENT',
        name: 'onFocus',
        id: 'onfocus',
      },
    ],
    controlParam: {},
    modelId: '6f0f293f715d05a5f351b3aa105587cb',
    modelType: 'PSSYSVIEWLAYOUTPANEL',
    name: 'layoutpanel',
    id: 'usr0322032518',
  },
  title: '备注',
  viewStyle: 'DEFAULT',
  viewType: 'DEEDITVIEW9',
  enableDP: true,
  showCaptionBar: true,
  modelId: 'c016829250a9d6e419cef82cec92c503',
  modelType: 'PSAPPDEVIEW',
  name: 'solutionnote_attach_view',
  id: 'crmweb.solution_note_attach_view',
};
