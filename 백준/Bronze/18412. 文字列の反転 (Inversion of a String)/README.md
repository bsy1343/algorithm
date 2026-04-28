# [Bronze III] 文字列の反転 (Inversion of a String) - 18412

[문제 링크](https://www.acmicpc.net/problem/18412)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 788, 정답: 502, 맞힌 사람: 470, 정답 비율: 65.369%

### 분류

구현, 문자열

### 문제 설명

<p>長さ&nbsp;<var>N</var>&nbsp;の文字列&nbsp;<var>S</var>&nbsp;が与えられる．</p>

<p><var>S</var>&nbsp;の&nbsp;<var>A</var>&nbsp;文字目から&nbsp;<var>B</var>&nbsp;文字目までの文字の並びを逆にし，それ以外の文字はそのままにしたとき，どのような文字列ができるだろうか．ただし，<var>S</var>&nbsp;の先頭の文字が&nbsp;<var>1</var>&nbsp;文字目，末尾の文字が&nbsp;<var>N</var>&nbsp;文字目である．</p>

<p>文字列&nbsp;<var>S</var>&nbsp;と，<var>2</var>&nbsp;つの整数&nbsp;<var>A, B</var>&nbsp;が与えられたとき，<var>S</var>&nbsp;のうち&nbsp;<var>A</var>&nbsp;文字目から&nbsp;<var>B</var>&nbsp;文字目までの文字の並びを逆にしてできる文字列を出力するプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var> <var>A</var> <var>B</var>
<var>S</var></pre>

### 출력

<p><var>S</var>&nbsp;のうち&nbsp;<var>A</var>&nbsp;文字目から&nbsp;<var>B</var>&nbsp;文字目までの文字の並びを逆にしてできる文字列を&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ A ≦ B ≦ N ≦ 200</var>．</li>
	<li><var>S</var>&nbsp;は長さ&nbsp;<var>N</var>&nbsp;の文字列である．</li>
	<li><var>S</var>&nbsp;の各文字は英大文字または英小文字である．</li>
</ul>