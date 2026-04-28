# [Bronze II] 最頻値 (Mode) - 18413

[문제 링크](https://www.acmicpc.net/problem/18413)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 263, 정답: 198, 맞힌 사람: 184, 정답 비율: 76.349%

### 분류

구현

### 문제 설명

<p>長さ&nbsp;<var>N</var>&nbsp;の数列&nbsp;<var>A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub></var>&nbsp;が与えられる． この数列の各項は&nbsp;<var>1</var>&nbsp;以上&nbsp;<var>M</var>&nbsp;以下の整数である．</p>

<p>長さ&nbsp;<var>M</var>&nbsp;の新たな数列&nbsp;<var>B<sub>1</sub>, B<sub>2</sub>, ..., B<sub>M</sub></var>&nbsp;を以下のように定義する．</p>

<ul>
	<li>各&nbsp;<var>j</var>&nbsp;(<var>1 ≦ j ≦ M</var>) に対して，<var>B<sub>j</sub></var>&nbsp;の値は&nbsp;<var>A<sub>i</sub>&nbsp;= j</var>&nbsp;を満たす整数&nbsp;<var>i</var>&nbsp;(<var>1 ≦ i ≦ N</var>) の個数に等しい．</li>
</ul>

<p><var>B<sub>1</sub>, B<sub>2</sub>, ..., B<sub>M</sub></var>&nbsp;の最大値を求めよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var> <var>M</var>
<var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>&hellip;</var> <var>A<sub>N</sub></var></pre>

### 출력

<p><var>B<sub>1</sub>, B<sub>2</sub>, ..., B<sub>M</sub></var>&nbsp;の最大値を&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 100</var>．</li>
	<li><var>1 ≦ M ≦ 100</var>．</li>
	<li><var>1 ≦ A<sub>i</sub>&nbsp;≦ M</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
</ul>