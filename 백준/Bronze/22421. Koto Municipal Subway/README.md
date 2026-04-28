# [Bronze III] Koto Municipal Subway - 22421

[문제 링크](https://www.acmicpc.net/problem/22421)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 307, 정답: 253, 맞힌 사람: 235, 정답 비율: 82.168%

### 분류

수학, 브루트포스 알고리즘, 기하학, 피타고라스 정리

### 문제 설명

<p>Koto市は，下図のように，道路が碁盤の目状である有名な街である． 南北に伸びる道と東西に伸びる道は，それぞれ1kmの間隔で並んでいる． Koto市の最も南西の交差点にあるKoto駅を (0, 0) として，そこから東に&nbsp;<var>x</var>&nbsp;km，北に&nbsp;<var>y</var>&nbsp;km 進んだ位置を (<var>x</var>,&nbsp;<var>y</var>) と記すこととする (0 &le;&nbsp;<var>x</var>,&nbsp;<var>y</var>&nbsp;である)．</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/22421.%E2%80%85Koto%E2%80%85Municipal%E2%80%85Subway/a24579de.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/22421.%E2%80%85Koto%E2%80%85Municipal%E2%80%85Subway/a24579de.png" data-original-src="https://upload.acmicpc.net/16549930-761e-42c3-8d71-57a149674c20/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 431px;" /></p>

<p>5年後に開かれるオリンピックにより観光客が増大することを見越して，市はKoto駅を始発駅とする新しい地下鉄の路線を建設することを決めた． 現在，Koto駅の次の駅として新しく建設されるShin-Koto駅までのレールを敷く計画を立てている． レールは，Koto駅からShin-Koto駅に向かってまっすぐ敷く． 従って，Shin-Koto駅の場所を (<var>x</var>,&nbsp;<var>y</var>) としたとき，レールの長さは， &radic;(<var>x</var><sup>2</sup>&nbsp;+&nbsp;<var>y</var><sup>2</sup>) である． レールを敷くための費用は，敷いたレールの長さ分だけ必要になる． レールの長さが1.5kmのように小数であっても，費用も同じように1.5必要となる．</p>

<p>Shin-Koto駅の場所 (<var>x</var>,&nbsp;<var>y</var>) はまだ決定しておらず，以下の条件を満たす場所にする予定である．</p>

<ul>
	<li>交差点である．つまり，&nbsp;<var>x</var>&nbsp;と&nbsp;<var>y</var>&nbsp;がそれぞれ整数である．</li>
	<li>Koto駅から道路に沿って歩いた最短距離が，ちょうど&nbsp;<var>D</var>&nbsp;である．つまり，&nbsp;<var>x</var>&nbsp;+&nbsp;<var>y</var>&nbsp;=&nbsp;<var>D</var>&nbsp;を満たす．</li>
</ul>

<p>上の2つの条件を満たす中で，市が定めるレールの予算&nbsp;<var>E</var>&nbsp;とレールの費用とのずれ | &radic;(<var>x</var><sup>2</sup>&nbsp;+&nbsp;<var>y</var><sup>2</sup>) -&nbsp;<var>E</var>&nbsp;| が最小となるようにShin-Koto駅の場所を選ぶ． ここで |<var>A</var>| は，&nbsp;<var>A</var>&nbsp;の絶対値を表す． あなたの仕事は，上記のようにShin-Koto駅を建設したときの，レールを敷くための費用と予算とのずれを出力するプログラムを作成することである．</p>

### 입력

<p>入力は，複数のデータセットから構成され，1つの入力に含まれるデータセットの数は100以下である． 各データセットの形式は次の通りである．</p>

<pre>
<var>D</var>&nbsp;<var>E</var></pre>

<p><var>D</var>&nbsp;(1 &le;&nbsp;<var>D</var>&nbsp;&le; 100)は，Koto駅からShin-Koto駅まで道路に沿って歩いたときの最短距離を表す整数である．&nbsp;<var>E</var>&nbsp;(1 &le;&nbsp;<var>E</var>&nbsp;&le; 100)は，レール建設のための予算を表す整数である．</p>

<p>入力の終わりは，空白で区切られた2つのゼロからなる行によって示される．</p>

### 출력

<p>各データセットに対して，問題の条件を満たすようにレールを敷いたときの費用と予算とのずれを1行で出力せよ． 答えには 10<sup>-3</sup>&nbsp;を越える絶対誤差があってはならない． 各行の終わりに改行を出力しなかった場合や，不必要な文字を出力した場合，誤答と判断されてしまうため，注意すること．</p>

### 힌트

<p>1つ目のデータセットでは，下図のように，Koto駅から道路に沿って2km進んだ交差点がShin-Koto駅を建設する場所の候補となる．</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/22421.%E2%80%85Koto%E2%80%85Municipal%E2%80%85Subway/2fb2532e.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/22421.%E2%80%85Koto%E2%80%85Municipal%E2%80%85Subway/2fb2532e.png" data-original-src="https://upload.acmicpc.net/fb599981-022e-4c70-856a-474b3e446af2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 450px; height: 146px;" /></p>

<p>各交差点にShin-Koto駅を建設した場合の，レールを敷くための費用と予算1とのずれは次のようになる．</p>

<ul>
	<li>(2, 0) ： | &radic;(2<sup>2</sup>&nbsp;+ 0<sup>2</sup>) - 1 | = 1.0</li>
	<li>(1, 1) ： | &radic;(1<sup>2</sup>&nbsp;+ 1<sup>2</sup>) - 1 | = 0.4142135623...</li>
	<li>(0, 2) ： | &radic;(0<sup>2</sup>&nbsp;+ 2<sup>2</sup>) - 1 | = 1.0</li>
</ul>

<p>よって，費用と予算とのずれが最小になるのは， (1, 1) に建設した場合となる．</p>