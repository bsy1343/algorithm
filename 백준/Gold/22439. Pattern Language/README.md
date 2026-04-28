# [Gold I] Pattern Language - 22439

[문제 링크](https://www.acmicpc.net/problem/22439)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

자료 구조, 분리 집합

### 문제 설명

<p>$M$ 個の相異なるアルファベット $var_1, &thinsp;var_2, &thinsp; &hellip;&thinsp;, &thinsp;var_M$ がある． $0, &thinsp; 1, &thinsp; &hellip;&thinsp;, &thinsp; 9, &thinsp; var_1, &thinsp; var_2, &thinsp; &hellip;&thinsp;, &thinsp; var_M$ の $10+M$ 種類の文字からなる，長さ $N$ の文字列 $s_1s_2s_3&hellip;s_N$ が与えられる． この文字列における各アルファベットを数字で置き換えて回文になるようにしたい．(回文とは，前から読んでも後ろから読んでも同じ文字列をあらわす．) ここで，同じアルファベットは同じ数字で置き換えなければならない．また与えられたすべてのアルファベット$var_i$は少なくとも，一度は文字列$s_1s_2s_3&hellip;s_N$にあらわれる．</p>

<p>アルファベット $var_i$ は $0$ 以上 $u_i$ 以下の，leading zero を含まない整数に置き換える事ができる． 置き換えた後の文字列が回文になるような置き換え方が何通り存在するかを，mod $10^9+7$ で求めよ． なお，アルファベットの置き換え方が異なれば，得られる文字列が同じでも異なるものとして数える．</p>

### 입력

<p>入力は以下の形式で与えられる</p>

<blockquote>
<p>$N$ $M$</p>

<p>$s_1s_2s_3&hellip;s_N$</p>

<p>$var_1$ $u_1$</p>

<p>$...$</p>

<p>$var_M$ $u_M$</p>
</blockquote>

### 출력

<p>置き換え方の場合の数を $10^9 + 7$ で割った剰余を一行で出力せよ．</p>

### 제한

<ul>
	<li>$1 &le; N &le; 500$</li>
	<li>$1 &le; M &le; 10$</li>
	<li>$0 &le; u_i &le; 99$</li>
	<li>$s_i$ &isin; $\{&#39;0&#39;, &thinsp; &#39;1&#39;, &thinsp; &hellip;&thinsp;, &thinsp; &#39;9&#39;, &thinsp; var_1, &thinsp; var_2, &thinsp; &hellip;&thinsp;, &thinsp; var_M\}$</li>
	<li>$var_i &isin; \{&#39;a&#39;, &thinsp; &#39;b&#39;, &thinsp; &hellip;&thinsp;, &thinsp; &#39;j&#39;\}$</li>
	<li>各アルファベット $var_i$ は $s_1s_2s_3&thinsp;&hellip;s_N$ に少なくとも一度は現れる．</li>
	<li>$var_1,&thinsp; var_2,&thinsp; &hellip;&thinsp;, &thinsp;var_M$ はすべて異なる</li>
</ul>