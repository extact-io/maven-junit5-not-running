# openliberty-devcontainer
> 豆蔵デベロッパーサイトのブログ記事で利用しているサンプルアプリ

## 利用している記事

|記事| 利用内容 |
|---|---|
|[今さら聞けないMaven - JUnit5のテストクラスがなぜか実行されない](https://developer.mamezou-tech.com/blogs/2022/08/24/maven-junit5-not-running/)| SurefireプラグインでProviderにJUnit5を指定するpom設定とJUnit5のそのサンプルコード |

## ビルドと実行
サンプルアプリのビルドにはJava11以上とMavenが必要です

```shell
# Clone this repository
git clone https://github.com/extact-io/maven-junit5-not-running.git
# Go into the sample
cd maven-junit5-not-running
# start junit test
mvn clean test
```
