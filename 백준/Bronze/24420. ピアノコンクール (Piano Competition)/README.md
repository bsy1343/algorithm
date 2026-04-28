# [Bronze II] ピアノコンクール (Piano Competition) - 24420

[문제 링크](https://www.acmicpc.net/problem/24420)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 304, 정답: 278, 맞힌 사람: 248, 정답 비율: 93.233%

### 분류

구현

### 문제 설명

<p>音楽が好きな初夏は，ピアノの演奏能力を競うコンクールに出場した．</p>

<p>コンクールでは，初夏の演奏に対して&nbsp;<var>N</var>&nbsp;人の審査員が採点した．<var>i</var>&nbsp;人目の審査員 (<var>1 ≦ i ≦ N</var>) は&nbsp;<var>A<sub>i</sub></var>&nbsp;点を付けた．ただし，<var>A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub></var>&nbsp;はすべて相異なる．このコンクールにおける初夏の<strong>総合得点</strong>は，審査員のうち最高点と最低点を付けた人を除く&nbsp;<var>N-2</var>&nbsp;人の審査員の点数の合計である．</p>

<p><var>N</var>&nbsp;人の審査員が付けた点数が与えられたとき，初夏の総合得点を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var>
<var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>&hellip;</var> <var>A<sub>N</sub></var></pre>

### 출력

<p>標準出力に，初夏の総合得点を&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>3 ≦ N ≦ 50</var>．</li>
	<li><var>0 ≦ A<sub>i</sub>&nbsp;≦ 100</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>A<sub>i</sub>&nbsp;&ne; A<sub>j</sub></var>&nbsp;(<var>1 ≦ i ＜ j ≦ N</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>