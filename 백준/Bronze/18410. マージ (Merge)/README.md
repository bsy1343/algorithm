# [Bronze I] マージ (Merge) - 18410

[문제 링크](https://www.acmicpc.net/problem/18410)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 254, 정답: 209, 맞힌 사람: 188, 정답 비율: 82.819%

### 분류

구현, 정렬

### 문제 설명

<p>長さ&nbsp;<var>N</var>&nbsp;の正整数列&nbsp;<var>A=(A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>)</var>&nbsp;と，長さ&nbsp;<var>M</var>&nbsp;の正整数列&nbsp;<var>B=(B<sub>1</sub>, B<sub>2</sub>, ..., B<sub>M</sub>)</var>&nbsp;が与えられる． これらの数列は，共に広義単調増加数列である．つまり，<var>A<sub>1</sub>&nbsp;≦ A<sub>2</sub>&nbsp;≦ &hellip; ≦ A<sub>N</sub></var>,&nbsp;<var>B<sub>1</sub>&nbsp;≦ B<sub>2</sub>&nbsp;≦ &hellip; ≦ B<sub>M</sub></var>&nbsp;を満たす．</p>

<p>以下のアルゴリズムを用いて，これらの数列から，長さ&nbsp;<var>N+M</var>&nbsp;の正整数列&nbsp;<var>C=(C<sub>1</sub>, C<sub>2</sub>, ..., C<sub>N+M</sub>)</var>&nbsp;を生成する．</p>

<ol>
	<li>はじめ&nbsp;<var>C</var>&nbsp;は空とする．</li>
	<li><var>A</var>&nbsp;と&nbsp;<var>B</var>&nbsp;がどちらも空の場合，終了する．</li>
	<li><var>A</var>&nbsp;と&nbsp;<var>B</var>&nbsp;のどちらかが空の場合，そうでない数列を&nbsp;<var>t</var>&nbsp;とおく．どちらも空でない場合，先頭の要素が小さい数列を&nbsp;<var>t</var>&nbsp;とおく．ただし，<var>A</var>&nbsp;と&nbsp;<var>B</var>&nbsp;の先頭の要素が同じ値のときは&nbsp;<var>A</var>&nbsp;を&nbsp;<var>t</var>&nbsp;とおく．</li>
	<li><var>t</var>&nbsp;の先頭の要素を&nbsp;<var>C</var>&nbsp;の末尾に追加する．</li>
	<li><var>t</var>&nbsp;の先頭の要素を削除する．</li>
	<li>2. に戻る．</li>
</ol>

<p>広義単調増加な正整数列&nbsp;<var>A</var>,&nbsp;<var>B</var>&nbsp;が与えられたとき，このアルゴリズムにより生成される正整数列&nbsp;<var>C</var>&nbsp;を出力するプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var> <var>M</var>
<var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>&hellip;</var> <var>A<sub>N</sub></var>
<var>B<sub>1</sub></var> <var>B<sub>2</sub></var> <var>&hellip;</var> <var>B<sub>M</sub></var></pre>

### 출력

<p>標準出力に&nbsp;<var>N + M</var>&nbsp;行出力せよ．</p>

<p><var>k</var>&nbsp;行目 (<var>1 ≦ k ≦ N + M</var>) には，<var>C<sub>k</sub></var>&nbsp;を出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 500</var>．</li>
	<li><var>1 ≦ M ≦ 500</var>．</li>
	<li><var>1 ≦ A<sub>1</sub>&nbsp;≦ A<sub>2</sub>&nbsp;≦ &hellip; ≦ A<sub>N</sub>&nbsp;≦ 2000</var>．</li>
	<li><var>1 ≦ B<sub>1</sub>&nbsp;≦ B<sub>2</sub>&nbsp;≦ &hellip; ≦ B<sub>M</sub>&nbsp;≦ 2000</var>．</li>
</ul>