# FineUI.Java 空项目

包含最少功能的 FineUI.Java 骨架工程（Spring Boot），便于快速熟悉用法、或在向我们反馈问题时**重现问题**。含四个页面：

- **开始页面**（`/hello`）：一个按钮，点击弹出对话框；
- **首页框架**（`/`）：左侧菜单树 + 顶部工具栏 + 选项卡工作区；
- **登录页面**（`/login`）：表单校验示例（用户名/密码 admin/admin）；
- **主题仓库**（`/themes`）：切换内置/自定义主题。

## 前提条件

- **JDK 17+**（用 JDK 21 亦可），并设置环境变量 `JAVA_HOME` 指向它；
- **Maven**（`mvn` 命令在 PATH 中）。

## 一、类库依赖

项目文件已经声明 `com.fineui:fineui-java` 依赖。正常联网时，下面的 `mvn` 命令会从 Maven 中央仓库自动下载。

> **离线备选**：内网上不了公网、或公司私有仓库没有镜像中央仓库时，下载 FineUI.Java 社区版【类库】压缩包：解压后 Windows 双击 `install.bat`、
> Linux / macOS 执行 `sh install.sh`，即把 jar 装入本地 Maven 仓库（`~/.m2`）。

## 二、运行空项目

在本项目根目录执行：

```
mvn spring-boot:run
```

启动后浏览器访问 <http://localhost:8082/> 即可。

## 说明

- FineUI 前端运行时（`/F/FineUI.js`、CSS、主题、语言包）已内嵌在类库 jar 内，随依赖自动提供，无需单独部署。
- `res/` 下是项目自带的静态资源（图标、CSS、主题缩略图等），已随本项目提供。
## 仓库与依赖边界

本仓库是 FineUI.Java.EmptyProject 的唯一真相源。项目文件已声明从 Maven Central 获取的 `com.fineui:fineui-java` 依赖；仓库不提交 FineUI DLL、JAR 或框架源码。

## 许可边界

本仓库中由合肥三生石上软件有限公司拥有著作权的示例或应用项目源代码采用 [MIT 许可证](LICENSE)。FineUI 各端框架源码、二进制软件包、内嵌的 FineUI.js 运行时以及 FineUI 名称、标识和商标不属于 MIT 授权范围，仍适用各自的商业或社区版许可。具体边界见 [NOTICE.md](NOTICE.md)。
## 构建

安装 JDK 17 与 Maven 后，在仓库根目录运行：

```bash
mvn package
```
