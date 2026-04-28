# [Bronze I] 双六 (Sugoroku) - 15475

[문제 링크](https://www.acmicpc.net/problem/15475)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 184, 정답: 156, 맞힌 사람: 143, 정답 비율: 85.119%

### 분류

구현

### 문제 설명

<p>JOI 君はおじさんの家で双六を見つけた．双六は直線状に並んだ&nbsp;<var>N+2</var>&nbsp;個のマスからなり，<var>1</var>&nbsp;番目のマスはスタート，<var>N+2</var>&nbsp;番目のマスはゴールである．その他の各マスには&nbsp;<var>0</var>&nbsp;または&nbsp;<var>1</var>&nbsp;が書かれていて，各&nbsp;<var>i</var>&nbsp;(<var>1≦i≦N</var>) について，<var>i+1</var>&nbsp;番目のマスに書かれた数字は&nbsp;<var>A_i</var>&nbsp;である．</p>

<p>双六では，最初にスタートのマスにコマを置き，サイコロを振って，出た目の数だけコマを進めることを繰り返す．ただし，<var>1</var>&nbsp;の書かれたマスに止まった場合は，ゲームオーバーである．ゲームオーバーにならずにゴールのマスに止まるか，ゴールのマスを通り過ぎたら，ゲームクリアである．</p>

<p>JOI 君は双六を遊ぶためのサイコロをおもちゃ屋さんに買いに行くことにした．おもちゃ屋さんには&nbsp;<var>N+1</var>&nbsp;個のサイコロが売っている．<var>j</var>&nbsp;番目 (<var>1≦j≦N+1</var>) のサイコロは&nbsp;<var>j</var>&nbsp;個の面を持ち，<var>1,2,...,j</var>&nbsp;が&nbsp;<var>1</var>&nbsp;つずつ書かれている．</p>

<p>JOI 君はゲームクリアできるようなサイコロのうち，最も面の数が少ないサイコロを&nbsp;<var>1</var>&nbsp;個買うことにした．JOI 君はどのサイコロを買えばよいだろうか．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var>
<var>A_1</var> <var>A_2</var> ... <var>A_N</var>
</pre>

### 출력

<p>JOI 君が購入すべきサイコロの面の数を答えよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 100</var></li>
	<li><var>0 ≦ A_i ≦ 1</var>&nbsp;(<var>1 ≦&nbsp;i ≦ N</var>)</li>
</ul>