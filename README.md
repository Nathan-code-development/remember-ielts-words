# remember-ielts-words

项目简介
Remember IELTS Words 是一个用于帮助用户记忆雅思词汇的项目。该项目结合了前后端技术，前端采用 uni-app 框架开发，可实现多端兼容，后端使用 Spring Boot 搭建，配合 MyBatis 进行数据库操作，以提供稳定的接口服务。用户可以通过该项目进行单词默写练习，同时具备评论和步骤引导等功能，帮助用户更高效地学习雅思词汇。
项目结构
后端部分（RememberWords）
pom.xml：项目的 Maven 配置文件，管理项目的依赖和构建信息。
application.yml：Spring Boot 的配置文件，配置了数据库连接信息、服务器端口、MyBatis 映射文件位置等。
src 目录：包含项目的源代码，如实体类、控制器、服务层、持久层等。
前端部分（remember-words-uniapp）
components 目录：存放项目的自定义组件，如引导页组件、评论组件、步骤条组件、评分组件等。
pages 目录：存放项目的页面，如单词默写页面等。
common 目录：存放项目的公共方法，如请求封装文件 requset.js。
index.html：项目的入口文件。
技术栈
后端
Spring Boot：快速搭建项目，简化配置，提高开发效率。
MyBatis：持久层框架，用于与数据库进行交互。
MySQL：关系型数据库，用于存储雅思词汇信息和用户数据。
前端
uni-app：跨平台开发框架，可同时开发小程序、H5、App 等多端应用。
Vue.js：用于构建用户界面，实现数据绑定和组件化开发。
功能模块
引导页（code-elf-guide）
展示引导图片，帮助用户了解项目的基本功能。
提供 “IP 端口设置” 和 “立即体验” 按钮，点击 “立即体验” 可进入项目主界面。
评论模块（dl-review）
展示评论列表，支持上拉加载更多评论。
点击评论可查看评论详情，支持展开和关闭评论详情。
单词默写页面（word_memorize）
根据用户选择的单元，从后端获取该单元的单词和释义。
用户在输入框中输入单词，点击 “确定” 按钮进行答案验证。
若输入正确，显示绿色字体；若输入错误，显示红色字体，并在一段时间后隐藏正确答案。
组件模块
uni-steps：步骤条组件，可用于展示操作步骤。
uni-rate：评分组件，可用于用户对单词或课程进行评分。
uni-grid-item：宫格组件，可用于展示多个项目。
uni-link：外部网页超链接组件，可在不同端打开外部网页。
环境搭建
后端环境
安装 Java 17 及以上版本。
安装 MySQL 数据库，并创建名为 english_word_database 的数据库。
修改 application.yml 文件中的数据库连接信息：
yaml
spring:
  datasource:
    url: jdbc:mysql://121.40.144.4:3306/english_word_database?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&useSSL=false
    username: english_word
    password: Nls_040718yyds
    driver-class-name: com.mysql.cj.jdbc.Driver
使用 Maven 构建项目：
sh
mvn clean install
启动项目：
sh
mvn spring-boot:run
前端环境
安装 Node.js 和 npm。
全局安装 HBuilderX 或使用命令行工具安装 uni-app 脚手架：
sh
npm install -g @vue/cli
进入 remember-words-uniapp 目录，安装依赖：
sh
npm install
运行项目：
sh
npm run dev:h5
API 接口
获取单词列表
请求方式：GET
请求 URL：http://121.40.144.4:857/WordLesson{unit_number}/findAll
请求参数：unit_number 为单元编号
响应数据：返回该单元的单词和释义列表
注意事项
请确保后端数据库服务正常运行，否则可能会导致数据获取失败。
在前端开发过程中，可根据不同的平台需求进行配置和调试。
贡献指南
如果你想为该项目做出贡献，请遵循以下步骤：
Fork 该项目到你的 GitHub 仓库。
创建一个新的分支进行开发：
sh
git checkout -b feature/your-feature-name
提交你的代码并推送至你的分支：
sh
git add .
git commit -m "Add your commit message"
git push origin feature/your-feature-name
在 GitHub 上创建一个 Pull Request，描述你的修改内容。
许可证
本项目采用 MIT 许可证。
联系方式
如果你有任何问题或建议，请通过以下方式联系我们：
GitHub Issues：https://github.com/Nathan-code-development/remember-ielts-words/issues
Email：1175235190@qq.com
