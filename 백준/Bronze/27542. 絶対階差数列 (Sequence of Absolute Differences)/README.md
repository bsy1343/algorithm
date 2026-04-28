# [Bronze II] 絶対階差数列 (Sequence of Absolute Differences) - 27542

[문제 링크](https://www.acmicpc.net/problem/27542)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 211, 정답: 184, 맞힌 사람: 168, 정답 비율: 87.047%

### 분류

구현

### 문제 설명

<p>JOI 高校の葵さんは，数列に対して，隣り合う各項の差の絶対値を順に並べた数列を考えるのが好きである．</p>

<p>はじめ，黒板には長さ <var>N</var> の数列 <var>A<sub>1</sub>, A<sub>2</sub>, &hellip;, A<sub>N</sub></var> が書かれている．</p>

<p>葵さんは以下の操作を <var>N - 1</var> 回繰り返す．</p>

<ul>
	<li>黒板に書かれている数列の長さが <var>m</var> であり，その数列が <var>b<sub>1</sub>, b<sub>2</sub>, &hellip;, b<sub>m</sub></var> であるとする． 黒板に書かれている数列 <var>b<sub>1</sub>, b<sub>2</sub>, &hellip;, b<sub>m</sub></var> を消し，長さ <var>m-1</var> の数列 <var>|b<sub>1</sub> - b<sub>2</sub>|, |b<sub>2</sub> - b<sub>3</sub>|, &hellip;, |b<sub>m-1</sub> - b<sub>m</sub>|</var> を新たに黒板に書く．ただし，<var>|x|</var> は <var>x</var> の絶対値を表す．</li>
</ul>

<p><var>N - 1</var> 回の操作が終了した後，黒板には <var>1</var> つの値（長さ <var>1</var> の数列）が書かれている．</p>

<p>はじめ黒板に書かれていた数列の情報が与えられるので，<var>N - 1</var> 回の操作が終了した後黒板に書かれている値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var>N</var>
<var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>&hellip;</var> <var>A<sub>N</sub></var></pre>

### 출력

<p><var>N - 1</var> 回の操作が終了した後黒板に書かれている値を出力せよ．</p>

### 제한

<ul>
	<li><var>2 ≦ N ≦ 2 000</var>．</li>
	<li><var>0 ≦ A<sub>i</sub> ≦ 10<sup>9</sup></var>．</li>
	<li>入力される値はすべて整数である．</li>
</ul>