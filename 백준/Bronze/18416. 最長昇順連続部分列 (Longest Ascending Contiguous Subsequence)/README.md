# [Bronze II] 最長昇順連続部分列 (Longest Ascending Contiguous Subsequence) - 18416

[문제 링크](https://www.acmicpc.net/problem/18416)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 338, 정답: 219, 맞힌 사람: 199, 정답 비율: 65.461%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>長さ&nbsp;<var>N</var>&nbsp;の正整数列&nbsp;<var>A=(A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>)</var>&nbsp;が与えられる．正整数列&nbsp;<var>A</var>&nbsp;の連続部分列の中で昇順に並んでいるもののうち，最長のものの長さを求めよ．</p>

<p>すなわち，<var>A<sub>l</sub>&nbsp;≦ A<sub>l+1</sub>&nbsp;≦ ... ≦ A<sub>r</sub></var>&nbsp;を満たすような&nbsp;<var>2</var>&nbsp;つの整数&nbsp;<var>l, r</var>&nbsp;(&nbsp;<var>1 ≦ l ≦ r ≦ N</var>&nbsp;) について，<var>r-l+1</var>&nbsp;の最大値を求めよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var>
<var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>...</var> <var>A<sub>N</sub></var></pre>

### 출력

<p>正整数列&nbsp;<var>A</var>&nbsp;の連続部分列の中で昇順に並んでいるもののうち，最長のものの長さを&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 100</var>．</li>
	<li><var>1 ≦ A<sub>i</sub>&nbsp;≦ 2020</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
</ul>