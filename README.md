# springBoot_SimpleRestControlller

### SpringBoot最初の一歩 REST編①

最もシンプルなRestfullなサンプルコードです。

これからSpringBootの学習を始める方、一緒に頑張りませんか？

メインのコントローラークラスはMainController.javaです。
ユーザからのリクエスト処理をアドレスごとに記述します。

![image](https://user-images.githubusercontent.com/65064787/161438299-605f4801-3775-407c-9c12-dda6e648b86f.png)


@RESTControllerは、Rest専用のコントローラーを示します。
このコントローラーが出力するページは、HTMLではなく、ただのテキストデータで非常にシンプルです。

@RequestMappingは、サーバが受け付けるURLと処理を紐づけるマッピングの仕組みです。
indexメソッドは、localhost:8080/にアクセスがあると処理がされます。

@PathVariableは、サーバが受け付ける値のことで、この値を使って処理をすることが出来ます・
showParameterメソッドは、localhost:8080/100 など整数値を付けてアクセスをすると、100を使って処理がされます。

フィードバックいただけると嬉しいです_(=.=)_
