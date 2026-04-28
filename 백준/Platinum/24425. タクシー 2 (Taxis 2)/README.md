# [Platinum IV] タクシー 2 (Taxis 2) - 24425

[문제 링크](https://www.acmicpc.net/problem/24425)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 52, 정답: 27, 맞힌 사람: 23, 정답 비율: 52.273%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>IOI 国には，<var>1</var>&nbsp;から&nbsp;<var>N</var>&nbsp;までの番号が付けられた&nbsp;<var>N</var>&nbsp;個の町と，<var>1</var>&nbsp;から&nbsp;<var>M</var>&nbsp;までの番号が付けられた&nbsp;<var>M</var>&nbsp;本の道がある．</p>

<p>それぞれの道は，タクシーでのみ通行可能である．道&nbsp;<var>i</var>&nbsp;(<var>1 ≦ i ≦ M</var>) のタクシーは町&nbsp;<var>A<sub>i</sub></var>&nbsp;と町&nbsp;<var>B<sub>i</sub></var>&nbsp;を<strong>双方向に</strong>移動でき，そのタクシーの色は，<var>C<sub>i</sub>&nbsp;= 1</var>&nbsp;のとき赤色，<var>C<sub>i</sub>&nbsp;= 2</var>&nbsp;のとき青色である．タクシーには料金がかかり，乗車すると以下のように所持金が変化する．</p>

<ul>
	<li>乗車前の所持金を&nbsp;<var>a</var>&nbsp;円とする．</li>
	<li>タクシーが赤色の場合，乗車後の所持金が&nbsp;<var>a - 1</var>&nbsp;円になる．</li>
	<li>タクシーが青色の場合，乗車後の所持金が「<var>a &divide; 2</var>&nbsp;を整数に切り捨てた値」円になる．</li>
</ul>

<p>あなたは IOI 国の町&nbsp;<var>1</var>&nbsp;に住んでおり，以下の&nbsp;<var>Q</var>&nbsp;個の質問の答えを知っておきたい．<var>j</var>&nbsp;番目 (<var>1 ≦ j ≦ Q</var>) の質問は以下の通りである．</p>

<ul>
	<li>町&nbsp;<var>1</var>&nbsp;から出発し，<strong><var>1</var>&nbsp;円以上の所持金を残した状態で</strong>町&nbsp;<var>T<sub>j</sub></var>&nbsp;に到着するために，最初に少なくとも何円の所持金を持っている必要があるか．ただし，答えが&nbsp;<var>L</var>&nbsp;円よりも大きい場合は，代わりに&nbsp;<code>Large</code>&nbsp;と答えよ．</li>
</ul>

<p>町とタクシーの情報，そして質問の内容が与えられたとき，すべての質問に答えるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var> <var>M</var> <var>Q</var> <var>L</var>
<var>A<sub>1</sub></var> <var>B<sub>1</sub></var> <var>C<sub>1</sub></var>
<var>A<sub>2</sub></var> <var>B<sub>2</sub></var> <var>C<sub>2</sub></var>
:
<var>A<sub>M</sub></var> <var>B<sub>M</sub></var> <var>C<sub>M</sub></var>
<var>T<sub>1</sub></var>
<var>T<sub>2</sub></var>
:
<var>T<sub>Q</sub></var></pre>

### 출력

<p>標準出力に&nbsp;<var>Q</var>&nbsp;行で出力せよ．<var>j</var>&nbsp;行目 (<var>1 ≦ j ≦ Q</var>) には，<var>j</var>&nbsp;番目の質問の答えを出力せよ．</p>

### 제한

<ul>
	<li><var>2 ≦ N ≦ 200&nbsp;000</var>．</li>
	<li><var>N - 1 ≦ M ≦ 200&nbsp;000</var>．</li>
	<li><var>1 ≦ Q ≦ 200&nbsp;000</var>．</li>
	<li><var>1 ≦ L ≦ 1&nbsp;000&nbsp;000&nbsp;000</var>．</li>
	<li><var>1 ≦ A<sub>i</sub>&nbsp;＜ B<sub>i</sub>&nbsp;≦ N</var>&nbsp;(<var>1 ≦ i ≦ M</var>)．</li>
	<li><var>(A<sub>i</sub>, B<sub>i</sub>) &ne; (A<sub>j</sub>, B<sub>j</sub>)</var>&nbsp;(<var>1 ≦ i ＜ j ≦ M</var>)．</li>
	<li><var>1 ≦ C<sub>i</sub>&nbsp;≦ 2</var>&nbsp;(<var>1 ≦ i ≦ M</var>)．</li>
	<li><var>2 ≦ T<sub>j</sub>&nbsp;≦ N</var>&nbsp;(<var>1 ≦ j ≦ Q</var>)．</li>
	<li>どの町の間も，いくつかの道を通って行き来できる．</li>
	<li>入力される値はすべて整数である．</li>
</ul>