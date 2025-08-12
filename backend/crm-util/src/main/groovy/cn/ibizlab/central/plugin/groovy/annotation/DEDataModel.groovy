package cn.ibizlab.central.plugin.groovy.annotation

import cn.ibizlab.central.plugin.groovy.dataentity.ast.DEDataModelASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformationClass

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

@Documented
@Retention(RetentionPolicy.SOURCE)
@Target([ElementType.TYPE])
@GroovyASTTransformationClass(classes = [DEDataModelASTTransformation])
@interface DEDataModel {

}