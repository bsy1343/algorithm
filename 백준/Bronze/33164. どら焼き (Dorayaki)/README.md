# [Bronze III] どら焼き (Dorayaki) - 33164

[문제 링크](https://www.acmicpc.net/problem/33164)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 271, 정답: 233, 맞힌 사람: 217, 정답 비율: 86.800%

### 분류

구현, 브루트포스 알고리즘, 사칙연산, 수학

### 문제 설명

<p>JOI 君はどら焼きを作ろうとしている．</p>

<p>どら焼きはちょうど <var>1</var> つずつの餡と皮から作ることができ，すべての餡と皮には正の整数で表される「美味しさ」が定義されている．<var>1</var> から <var>N</var> までの番号が付けられた <var>N</var> 種類の餡があり，餡 <var>i</var> (<var>1 ≦ i ≦ N</var>) の美味しさは <var>A<sub>i</sub></var> である．また，<var>1</var> から <var>M</var> までの番号が付けられた <var>M</var> 種類の皮があり，皮 <var>j</var> (<var>1 ≦ j ≦ M</var>) の美味しさは <var>B<sub>j</sub></var> である．</p>

<p>JOI 君はこれらの餡と皮の組み合わせをすべて試し，<var>N × M</var> 個のどら焼きを作る．各どら焼きの美味しさは，餡と皮の美味しさの和に，餡と皮の美味しさのうち大きい方の値を掛けたものである．</p>

<p><var>N × M</var> 個のどら焼きの美味しさの総和を求めよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre><var>N</var> <var>M</var>
<var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>…</var> <var>A<sub>N</sub></var>
<var>B<sub>1</sub></var> <var>B<sub>2</sub></var> <var>…</var> <var>B<sub>M</sub></var></pre>

### 출력

<p><var>N × M</var> 個のどら焼きの美味しさの総和を出力せよ．</p>

<p>答え以外は何も出力しないこと．(入力を促す文章なども出力しないこと．)</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 100</var>．</li>
	<li><var>1 ≦ M ≦ 100</var>．</li>
	<li><var>1≦ A<sub>i</sub> ≦ 100</var> (<var>1≦ i ≦ N</var>)．</li>
	<li><var>1≦ B<sub>j</sub> ≦ 100</var> (<var>1≦ j ≦ M</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>