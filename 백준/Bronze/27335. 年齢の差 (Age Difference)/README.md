# [Bronze II] 年齢の差 (Age Difference) - 27335

[문제 링크](https://www.acmicpc.net/problem/27335)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 365, 정답: 215, 맞힌 사람: 172, 정답 비율: 60.140%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>JOI 市には <var>1</var> から <var>N</var> までの番号が付けられた <var>N</var> 人の住民がおり，住民 <var>i</var> (<var>1 ≦ i ≦ N</var>) の年齢は <var>A<sub>i</sub></var> 歳である．</p>

<p>JOI 市の住民の年齢 <var>A<sub>1</sub>, A<sub>2</sub>, &hellip;, A<sub>N</sub></var> が与えられる．<var>i = 1, 2, &hellip;, N</var> に対して，住民 <var>i</var> と他の住民との年齢の差の最大値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var>N</var>
<var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>&hellip;</var> <var>A<sub>N</sub></var></pre>

### 출력

<p><var>N</var> 行出力せよ．<var>i</var> 行目 (<var>1 ≦ i ≦ N</var>) には，住民 <var>i</var> と他の住民との年齢の差の最大値を出力せよ．</p>

### 제한

<ul>
	<li><var>2 ≦ N ≦ 250 000</var>．</li>
	<li><var>0 ≦ A<sub>i</sub> ≦ 10<sup>9</sup></var> (<var>1 ≦ i ≦ N</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>