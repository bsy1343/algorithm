# [Bronze III] 差 (Difference) - 31617

[문제 링크](https://www.acmicpc.net/problem/31617)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 377, 정답: 327, 맞힌 사람: 294, 정답 비율: 88.822%

### 분류

수학, 구현, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>整数 <var>K</var> と，長さ <var>N</var> の整数列 <var>A=(A<sub>1</sub>,A<sub>2</sub>,&hellip;,A<sub>N</sub>)</var> および長さ <var>M</var> の整数列 <var>B=(B<sub>1</sub>,B<sub>2</sub>,&hellip;,B<sub>M</sub>)</var> が与えられる．</p>

<p>次の条件をすべて満たす <var>2</var> つの整数の組 <var>(p,q)</var> の個数を求めよ．</p>

<ul>
	<li><var>1 ≦ p ≦ N</var>．</li>
	<li><var>1 ≦ q ≦ M</var>．</li>
	<li><var>A<sub>p</sub> + K = B<sub>q</sub></var>．</li>
</ul>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var>K</var>
<var>N</var>
<var>A<sub>1</sub></var>   <var>A<sub>2</sub></var>   <var>&hellip;</var>   <var>A<sub>N</sub></var>
<var>M</var>
<var>B<sub>1</sub></var>   <var>B<sub>2</sub></var> <var>&hellip;</var>   <var>B<sub>M</sub></var></pre>

### 출력

<p>条件をすべて満たす <var>2</var> つの整数の組 <var>(p,q)</var> の個数を出力せよ．</p>

<p>答え以外は何も出力しないこと．(入力を促す文章なども出力しないこと．)</p>

### 제한

<ul>
	<li><var>1 ≦ K ≦ 100</var>．</li>
	<li><var>1 ≦ N ≦ 100</var>．</li>
	<li><var>1 ≦ M ≦ 100</var>．</li>
	<li><var>1 ≦ A<sub>i</sub> ≦ 100</var> (<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>1 ≦ B<sub>j</sub> ≦ 100</var> (<var>1 ≦ j ≦ M</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>