# [Bronze III] 点数 (Score) - 27330

[문제 링크](https://www.acmicpc.net/problem/27330)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 446, 정답: 340, 맞힌 사람: 310, 정답 비율: 77.500%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>長さ <var>N</var> の整数列 <var>A = (A<sub>1</sub>, A<sub>2</sub>, &hellip;, A<sub>N</sub>)</var> と長さ <var>M</var> の整数列 <var>B = (B<sub>1</sub>, B<sub>2</sub>, &hellip;, B<sub>M</sub>)</var> が与えられる．</p>

<p>あなたはこれらの数列を用いてゲームを行う．最初，このゲームの点数は <var>0</var> である．</p>

<p>このゲームでは <var>N</var> 回のラウンドを行う．<var>i</var> 回目 (<var>1 ≦ i ≦ N</var>) のラウンドは以下のように進行する．</p>

<ol>
	<li>現在の点数に <var>A<sub>i</sub></var> を加算する．</li>
	<li>もし加算後の点数が <var>B<sub>1</sub>, B<sub>2</sub>, &hellip;, B<sub>M</sub></var> のいずれかと等しい場合，点数を <var>0</var> にする．</li>
</ol>

<p>最後のラウンドが終了した時点でのこのゲームの点数を出力せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var>
<var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>&hellip;</var> <var>A<sub>N</sub></var>
<var>M</var>
<var>B<sub>1</sub></var> <var>B<sub>2</sub></var> <var>&hellip;</var> <var>B<sub>M</sub></var></pre>

### 출력

<p>最後のラウンドが終了した時点でのこのゲームの点数を出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 100</var>．</li>
	<li><var>1 ≦ M ≦ 100</var>．</li>
	<li><var>1 ≦ A<sub>i</sub> ≦ 10</var> (<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>1 ≦ B<sub>j</sub> ≦ 1000</var> (<var>1 ≦ j ≦ M</var>)．</li>
	<li><var>B<sub>j</sub> &ne; B<sub>k</sub></var> (<var>1 ≦ j ＜ k ≦ M</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>