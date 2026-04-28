# [Bronze II] ビ太郎と IOI (Bitaro and IOI) - 24073

[문제 링크](https://www.acmicpc.net/problem/24073)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 247, 정답: 176, 맞힌 사람: 162, 정답 비율: 70.435%

### 분류

문자열, 브루트포스 알고리즘

### 문제 설명

<p>長さ&nbsp;<var>N</var>&nbsp;の文字列&nbsp;<var>S</var>&nbsp;が与えられる．<var>S</var>&nbsp;の各文字は&nbsp;<code>B</code>，<code>I</code>，<code>T</code>，<code>A</code>，<code>R</code>，<code>O</code>&nbsp;のいずれかである．</p>

<p>文字列&nbsp;<var>S</var>&nbsp;の (連続しているとは限らない) 部分列に&nbsp;<code>IOI</code>&nbsp;が存在するか判定せよ．つまり，次の条件を満たす&nbsp;<var>3</var>&nbsp;つの整数の組&nbsp;<var>(i,j,k)</var>&nbsp;が存在するか判定せよ．</p>

<ul>
	<li><var>1 ≦ i ＜ j ＜ k ≦ N</var>．</li>
	<li><var>S</var>&nbsp;の&nbsp;<var>i</var>&nbsp;文字目は&nbsp;<code>I</code>&nbsp;である．</li>
	<li><var>S</var>&nbsp;の&nbsp;<var>j</var>&nbsp;文字目は&nbsp;<code>O</code>&nbsp;である．</li>
	<li><var>S</var>&nbsp;の&nbsp;<var>k</var>&nbsp;文字目は&nbsp;<code>I</code>&nbsp;である．</li>
</ul>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var>
<var>S</var></pre>

### 출력

<p>文字列&nbsp;<var>S</var>&nbsp;の部分列に&nbsp;<code>IOI</code>&nbsp;が存在する場合は&nbsp;<code>Yes</code>&nbsp;を，そうでない場合は&nbsp;<code>No</code>&nbsp;を出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 100</var>．</li>
	<li><var>S</var>&nbsp;は長さ&nbsp;<var>N</var>&nbsp;の文字列である．</li>
	<li><var>S</var>&nbsp;の各文字は&nbsp;<code>B</code>，<code>I</code>，<code>T</code>，<code>A</code>，<code>R</code>，<code>O</code>&nbsp;のいずれかである．</li>
</ul>