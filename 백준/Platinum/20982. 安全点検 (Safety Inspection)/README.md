# [Platinum III] 安全点検 (Safety Inspection) - 20982

[문제 링크](https://www.acmicpc.net/problem/20982)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 74, 정답: 37, 맞힌 사람: 34, 정답 비율: 47.887%

### 분류

그리디 알고리즘, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>JOI 市には&nbsp;<var>1</var>&nbsp;本の十分に長い道路がある．この道路は数直線とみなすことができ，各地点は&nbsp;<var>1</var>&nbsp;個の実数による座標で表される．また JOI 市にはこの道路に沿って&nbsp;<var>N</var>&nbsp;個の施設が設置されており，座標の小さい順に&nbsp;<var>1</var>&nbsp;から&nbsp;<var>N</var>&nbsp;までの番号がつけられている．施設&nbsp;<var>i</var>&nbsp;(<var>1 ≦ i ≦ N</var>) の位置は座標&nbsp;<var>A<sub>i</sub></var>&nbsp;である．</p>

<p>JOI 市ではこれから施設の安全点検が行われる．施設&nbsp;<var>i</var>&nbsp;には点検しなければならない項目が&nbsp;<var>B<sub>i</sub></var>&nbsp;個ある．今，点検を行うことができる&nbsp;<var>K</var>&nbsp;人の大工が集められた．安全点検の開始のとき，大工は全員が座標&nbsp;<var>0</var>&nbsp;にいる．点検が始まると，各大工は&nbsp;<var>1</var>&nbsp;分間で，次の&nbsp;<var>2</var>&nbsp;つの行動のどちらかをとることができる．</p>

<ul>
	<li>距離&nbsp;<var>1</var>&nbsp;だけ座標を移動する．</li>
	<li>今いる座標にある施設の点検項目のうち，<var>1</var>&nbsp;個の項目を選んで点検する．</li>
</ul>

<p>安全点検を終えるとき，すべての建物のすべての点検項目が，<var>1</var>&nbsp;人以上の大工によって点検されていなければならない．</p>

<p>大工の人数と施設の情報が与えられるので，安全点検を終えるのに最短で何分かかるかを求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<p><var>N</var>&nbsp;<var>K</var><br />
<var>A<sub>1</sub></var>&nbsp;<var>A<sub>2</sub></var>&nbsp;<var>&hellip;</var>&nbsp;<var>A<sub>N</sub></var><br />
<var>B<sub>1</sub></var>&nbsp;<var>B<sub>2</sub></var>&nbsp;<var>&hellip;</var>&nbsp;<var>B<sub>N</sub></var></p>

### 출력

<p>標準出力に，安全点検を終えるのに最短で何分かかるかを&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 100&nbsp;000</var>．</li>
	<li><var>1 ≦ K ≦ 10<sup>9</sup></var>．</li>
	<li><var>1 ≦ A<sub>i</sub>&nbsp;≦ 10<sup>9</sup></var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>A<sub>i</sub>&nbsp;&lt; A<sub>i+1</sub></var>&nbsp;(<var>1 ≦ i ≦ N-1</var>)．</li>
	<li><var>1 ≦ B<sub>i</sub>&nbsp;≦ 10<sup>9</sup></var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>