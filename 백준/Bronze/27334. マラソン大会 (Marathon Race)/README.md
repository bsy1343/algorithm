# [Bronze III] マラソン大会 (Marathon Race) - 27334

[문제 링크](https://www.acmicpc.net/problem/27334)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 375, 정답: 308, 맞힌 사람: 282, 정답 비율: 82.456%

### 분류

구현

### 문제 설명

<p>JOI 高校には <var>N</var> 人の生徒がおり，<var>1</var> から <var>N</var> までの番号が付けられている．</p>

<p>先月 JOI 高校ではマラソン大会が開催され，生徒全員がこれに参加した．生徒 <var>i</var> (<var>1 ≦ i ≦ N</var>) の記録は <var>A<sub>i</sub></var> 分であった．</p>

<p>マラソン大会における各生徒の順位を求めよ．ただし，生徒 <var>i</var> (<var>1 ≦ i ≦ N</var>) の順位は，(記録が <var>A<sub>i</sub></var> 分未満の生徒の人数)<var> + 1</var> で計算される．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var>N</var>
<var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>&hellip;</var> <var>A<sub>N</sub></var></pre>

### 출력

<p><var>N</var> 行出力せよ．<var>i</var> 行目 (<var>1 ≦ i ≦ N</var>) には，生徒 <var>i</var> の順位を出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 100</var>．</li>
	<li><var>1 ≦ A<sub>i</sub> ≦ 1 000</var> (<var>1 ≦ i ≦ N</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>