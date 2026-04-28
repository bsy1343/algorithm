# [Gold III] たくさんの数字 (Many Digits) - 31639

[문제 링크](https://www.acmicpc.net/problem/31639)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 62, 정답: 43, 맞힌 사람: 37, 정답 비율: 66.071%

### 분류

정렬, 이분 탐색

### 문제 설명

<p>JOI 高校の葵さんは，<var>N</var> 行 <var>N</var> 列のマス目の各マスに整数を十進数表記で書くことにした．具体的には上から <var>i</var> 行目 (<var>1 ≦ i ≦ N</var>)，左から <var>j</var> 列目 (<var>1 ≦ j ≦ N</var>) のマスには <var>A<sub>i</sub> + B<sub>j</sub></var> を十進数表記で書く．</p>

<p>葵さんは数字を何文字書くことになるかを知りたい．つまり，葵さんが書く <var>N<sup>2</sup></var> 個の整数の桁数の合計を求めたい．</p>

<p><var>A<sub>i</sub></var> (<var>1 ≦ i ≦ N</var>) と <var>B<sub>j</sub></var> (<var>1 ≦ j ≦ N</var>) が与えられたとき，葵さんが書く <var>N<sup>2</sup></var> 個の整数の桁数の合計を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var>N</var>
<var>A<sub>1</sub></var>   <var>A<sub>2</sub></var>   <var>&hellip;</var>   <var>A<sub>N</sub></var>
<var>B<sub>1</sub></var>   <var>B<sub>2</sub></var>   <var>&hellip;</var>   <var>B<sub>N</sub></var></pre>

### 출력

<p>葵さんが書く <var>N<sup>2</sup></var> 個の整数の桁数の合計を <var>1</var> 行で出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 150 000</var>．</li>
	<li><var>1 ≦ A<sub>i</sub> ≦ 999 999 999</var> (<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>1 ≦ B<sub>j</sub> ≦ 999 999 999</var> (<var>1 ≦ j ≦ N</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>