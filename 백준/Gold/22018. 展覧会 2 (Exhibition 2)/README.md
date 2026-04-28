# [Gold IV] 展覧会 2 (Exhibition 2) - 22018

[문제 링크](https://www.acmicpc.net/problem/22018)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 86, 정답: 55, 맞힌 사람: 47, 정답 비율: 62.667%

### 분류

그리디 알고리즘, 정렬, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>JOI 美術館には，東西方向にまっすぐに伸びる廊下に&nbsp;<var>N</var>&nbsp;枚の絵が飾られており，<var>1</var>&nbsp;から&nbsp;<var>N</var>&nbsp;までの番号が付けられている．絵&nbsp;<var>i</var>&nbsp;(<var>1 ≦ i ≦ N</var>) は廊下の西端から&nbsp;<var>X<sub>i</sub></var>&nbsp;メートルの位置に飾られており，その価値は&nbsp;<var>V<sub>i</sub></var>&nbsp;である．</p>

<p>この美術館では明日から「エゴイ展」が開催される予定であり，非常に多くの来客が見込まれている．「エゴイ展」では&nbsp;<var>M</var>&nbsp;枚の絵を展示する予定である．</p>

<p><var>2</var>&nbsp;つの絵が近い位置に展示されていると見づらいので，以下の条件を満たすように&nbsp;<var>N-M</var>&nbsp;枚の絵を取り外し，廊下に&nbsp;<var>M</var>&nbsp;枚の絵だけを残すことにした．</p>

<ul>
	<li>どの&nbsp;<var>2</var>&nbsp;つの絵についても，位置が&nbsp;<var>D</var>&nbsp;メートル以上離れているようにする．</li>
</ul>

<p>展示されている&nbsp;<var>M</var>&nbsp;枚の絵の価値の最小値を，「エゴイ展」の<strong>華やかさ</strong>とする．あなたは，廊下に残す&nbsp;<var>M</var>&nbsp;枚の絵をうまく選ぶことで，「エゴイ展」の華やかさをできるだけ大きくしたい．</p>

<p><var>N</var>&nbsp;枚の絵の情報と廊下に残す絵の枚数が与えられたとき，条件を満たすような絵の残し方が存在するか判定し，もし存在する場合は，「エゴイ展」の華やかさの最大値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var> <var>M</var> <var>D</var>
<var>X<sub>1</sub></var> <var>V<sub>1</sub></var>
<var>X<sub>2</sub></var> <var>V<sub>2</sub></var>
<var>:</var>
<var>X<sub>N</sub></var> <var>V<sub>N</sub></var></pre>

### 출력

<p>条件を満たすような絵の残し方が存在しない場合，標準出力に&nbsp;<code>-1</code>&nbsp;を&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

<p>条件を満たすような絵の残し方が存在する場合，標準出力に，「エゴイ展」の華やかさの最大値を&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 100&nbsp;000</var>．</li>
	<li><var>1 ≦ M ≦ N</var>．</li>
	<li><var>1 ≦ D ≦ 1&nbsp;000&nbsp;000&nbsp;000</var>．</li>
	<li><var>1 ≦ X<sub>i</sub>&nbsp;≦ 1&nbsp;000&nbsp;000&nbsp;000</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>X<sub>i</sub>&nbsp;&ne; X<sub>j</sub></var>&nbsp;(<var>1 ≦ i &lt; j ≦ N</var>)．</li>
	<li><var>1 ≦ V<sub>i</sub>&nbsp;≦ 1&nbsp;000&nbsp;000&nbsp;000</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>