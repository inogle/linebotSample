# Heroku設定で詰まった点のメモ

## 目次
- [課題：herokuサーバで日付を取得しようとすると日本時間にならない](#page1)
- [課題：SpringBootの@EnabledSchedulerで設定したJobが、HerokuのSleepが原因で動かない。](#page2)
- [LineのPush通知動確用CURL](#page3)

### <div id="page1">課題：herokuサーバで日付を取得しようとすると日本時間にならない</id>
・DefaultTimeZoneを日本時間にする必要あり。
<code>heroku config:add TZ=Asia/Tokyo</code>

<a href='http://blog.ruedap.com/2011/02/10/heroku-timezone-japan-jst'>参考：Herokuのタイムゾーンを日本時間に設定する</a>

### <div id="page2">課題：SpringBootの@EnabledSchedulerで設定したJobが、<br>HerokuのSleepが原因で動かない。</div>
眠らせないようHerokuのSchedulerを適用し、定期的に自分のアプリにCurlを投げて眠らせないようにする。
・addon コマンド
<code>heroku addons:create scheduler:standard</code>
・スケジューラで適用したコマンド
<code>curl https://desolate-crag-70985.herokuapp.com/</code>
DYNO SIZEはFree、FREQUENCYはEvery 10 minutesと設定。

<code>Please verify your account to install this add-on plan 
(please enter a credit card) For more information, 
see https://devcenter.heroku.com/categories/billing 
Verify now at https://heroku.com/verify</code>
がでた場合は、無料だけどhttps://heroku.com/verifyにアクセスしてクレカ情報とかを登録しなきゃいけない。

<a href='https://www.shookuro.com/entry/2018/05/05/112133'>参考：【Heroku】無料プランの Sleep を回避する</a>


### <div id="page3">LineのPush通知動確用CURL</div>
<code>curl -X POST \
-H 'Content-Type:application/json' \
-H 'Authorization: Bearer YOUR_ACCOUNTS_SECRET_KEY' \
-d '{
 "to": "YOUR_ACCOUNTS_USER_ID",
 "messages":[
     {
     "type": "text",
     "text": "こんにちは"
 }
 ]
}' https://api.line.me/v2/bot/message/push</code>