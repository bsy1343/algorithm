# [Silver III] ビット数 (Small) - 12457

[문제 링크](https://www.acmicpc.net/problem/12457)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 91, 정답: 67, 맞힌 사람: 57, 정답 비율: 78.082%

### 분류

비트마스킹, 브루트포스 알고리즘, 수학

### 문제 설명

<p>f(x) を 「x を 2進数表記した時の &quot;1&quot; の個数を返す関数」と定義します。 例えば、5 は 101<sub>2</sub>&nbsp;と 2 進数表記されるので、f(5) = 2 です。</p>

<p>正の整数&nbsp;<strong>N</strong>&nbsp;が与えられるので、 a + b =&nbsp;<strong>N</strong>&nbsp;を満たす 0 以上の整数 a, b の組の中で f(a) + f(b) が最大になるものを求め、その時の f(a) + f(b) の値を出力してください。</p>

### 입력

<p>最初の行はテストケースの個数&nbsp;<strong>T</strong>&nbsp;を表す正の整数です。 各テストケースは1行の文字列で表現され、それぞれの行には&nbsp;<strong>N</strong>&nbsp;を表す正の整数が1つだけ含まれています。</p>

<h3>制約</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 1000</li>
	<li><strong>N</strong>&nbsp;&le; 10000</li>
</ul>

### 출력

<p>各テストケースごとに、</p>

<pre>
Case #X: P
</pre>

<p>という内容を1行出力してください。ここで&nbsp;<strong>X</strong>&nbsp;は 1 から始まるテストケース番号、<strong>P</strong>&nbsp;は f(a) + f(b) の最大値です。</p>