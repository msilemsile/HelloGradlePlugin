# HelloGradlePlugin
first gradle plugin test!!!

测试 测试

在项目根目录 build.gradle

buildscript {
    
    repositories {
        jcenter()
    }
    dependencies {
        classpath 'me.msile.train.plugin:plugin:0.0.1' //添加依赖
        ...
    }
}

在app module目录 build.gradle

apply plugin: 'me.msile.train.plugin.HelloPlugin'

HelloPluginExt{

    hello "你妹的。。。。"
    
}

dependencies {

    compile 'me.msile.train.plugin:plugin:0.0.1'
    ...

}


项目根目录执行>>gradlew hello
