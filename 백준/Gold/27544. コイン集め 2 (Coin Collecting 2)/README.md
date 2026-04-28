# [Gold III] コイン集め 2 (Coin Collecting 2) - 27544

[문제 링크](https://www.acmicpc.net/problem/27544)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 31, 맞힌 사람: 30, 정답 비율: 88.235%

### 분류

브루트포스 알고리즘, 게임 이론

### 문제 설명

<p>机の上に，縦 <var>H</var> 行，横 <var>W</var> 列の長方形状にコインが並べられている． 最初，上から <var>i</var> 行目 (<var>1 ≦ i ≦ H</var>)，左から <var>j</var> 列目 (<var>1 ≦ j ≦ W</var>) のコインは， <var>S<sub>i,j</sub>=</var> <code>#</code> のとき表面，<var>S<sub>i,j</sub>=</var> <code>.</code> のとき裏面が見えている状態である．</p>

<p>葵と凛は，これらのコインを用いてゲームを行うことにした．ゲームは以下のような流れで行われる．</p>

<ol>
	<li>葵がどれか <var>1</var> つの行を選び，その行のコインをすべてひっくり返す．</li>
	<li>凛がどれか <var>1</var> つの列を選び，その列のコインをすべてひっくり返す．</li>
	<li>葵が，表面が見えるコインをすべて獲得する．また凛が，裏面が見えるコインをすべて獲得する．</li>
</ol>

<p>葵と凛はそれぞれ，できるだけ多くのコインを獲得したい．</p>

<p>ゲーム開始時のコインの状態が与えられたとき， 両者が最善を尽くした場合にそれぞれが獲得できるコインの枚数を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var>H</var> <var>W</var>
<var>S<sub>1,1</sub></var> <var>S<sub>1,2</sub></var> <var>&hellip;</var> <var>S<sub>1,W</sub></var>
<var>S<sub>2,1</sub></var> <var>S<sub>2,2</sub></var> <var>&hellip;</var> <var>S<sub>2,W</sub></var>
<var>︙</var>
<var>S<sub>H,1</sub></var> <var>S<sub>H,2</sub></var> <var>&hellip;</var> <var>S<sub>H,W</sub></var></pre>

### 출력

<p>葵と凛の得点をこの順に空白区切りで出力せよ．</p>

### 제한

<ul>
	<li><var>H ≧ 1</var>．</li>
	<li><var>W ≧ 1</var>．</li>
	<li><var>H &times; W ≦ 500 000</var>．</li>
	<li><var>S<sub>i, j</sub></var> は <code>#</code>，<code>.</code> のいずれかである (<var>1 ≦ i ≦ H</var>，<var>1 ≦ j ≦ W</var>)．</li>
	<li><var>H, W</var> は整数である．</li>
</ul>