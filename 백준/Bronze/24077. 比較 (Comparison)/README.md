# [Bronze II] 比較 (Comparison) - 24077

[문제 링크](https://www.acmicpc.net/problem/24077)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 234, 정답: 219, 맞힌 사람: 199, 정답 비율: 93.868%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>長さ&nbsp;<var>N</var>&nbsp;の整数列&nbsp;<var>A = (A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>)</var>&nbsp;と長さ&nbsp;<var>M</var>&nbsp;の整数列&nbsp;<var>B = (B<sub>1</sub>, B<sub>2</sub>, ..., B<sub>M</sub>)</var>&nbsp;が与えられる．</p>

<p>次の条件をすべて満たす&nbsp;<var>2</var>&nbsp;つの整数の組&nbsp;<var>(i,j)</var>&nbsp;の個数を求めよ．</p>

<ul>
	<li><var>1 ≦ i ≦ N</var>．</li>
	<li><var>1 ≦ j ≦ M</var>．</li>
	<li><var>A<sub>i</sub>&nbsp;≦ B<sub>j</sub></var>．</li>
</ul>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var> <var>M</var>
<var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>...</var> <var>A<sub>N</sub></var>
<var>B<sub>1</sub></var> <var>B<sub>2</sub></var> <var>...</var> <var>B<sub>M</sub></var></pre>

### 출력

<p><var>A<sub>i</sub>&nbsp;≦ B<sub>j</sub></var>&nbsp;を満たす&nbsp;<var>(i,j)</var>&nbsp;の個数を出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 100</var>．</li>
	<li><var>1 ≦ M ≦ 100</var>．</li>
	<li><var>1 ≦ A<sub>i</sub>&nbsp;≦ 2000</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>1 ≦ B<sub>j</sub>&nbsp;≦ 2000</var>&nbsp;(<var>1 ≦ j ≦ M</var>)．</li>
</ul>