============================================================================================
在用到这个库的项目的gradle配置文件加入如下
android{
  ... ...
  configurations.all {
      resolutionStrategy.force 'com.google.code.findbugs:jsr305:1.3.9'
  }
}