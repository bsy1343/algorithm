# [Gold IV] バクテリアの増殖 (Small) - 12445

[문제 링크](https://www.acmicpc.net/problem/12445)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 278, 정답: 100, 맞힌 사람: 74, 정답 비율: 34.742%

### 분류

수학, 정수론, 분할 정복을 이용한 거듭제곱, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>微生物の研究者であるパスカルは、特殊な増殖の傾向を示すバクテリアを発見した。どうやらそのバクテリアは、ある時点で x 個存在したとすると、理想的な環境下では1時間後に x<sup>x</sup>&nbsp;個に増えるようなのである。</p>

<p>そこであなたは、この興味深い性質をより深く調べるために、入力として 3 つの整数&nbsp;<strong>A</strong>,&nbsp;<strong>B</strong>,&nbsp;<strong>C</strong>&nbsp;が与えられたときに、<strong>A</strong>&nbsp;個のバクテリアが&nbsp;<strong>B</strong>&nbsp;時間後には何個になっているかを出力するプログラムを書くことにした。答えの値は非常に大きくなるので、その値を&nbsp;<strong>C</strong>&nbsp;で割った余りを出力してほしい。</p>

### 입력

<p>最初の行はテストケースの個数&nbsp;<strong>T</strong>&nbsp;を表す正の整数である。それ以降の行に、<strong>T</strong>&nbsp;個のケースを表すデータが続く。</p>

<p>それぞれのテストケースは、スペースで区切られた3つの整数からなる1行の文字列で表現される。これらの整数は、順番に&nbsp;<strong>A</strong>,&nbsp;<strong>B</strong>,&nbsp;<strong>C</strong>&nbsp;を表す。</p>

<h3>制約</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 500</li>
	<li>1 &le;&nbsp;<strong>A</strong>&nbsp;&le; 1000</li>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 1000</li>
	<li>1 &le;&nbsp;<strong>B</strong>&nbsp;&le; 2</li>
</ul>

### 출력

<p>それぞれのテストケースについて、</p>

<pre>
Case #X: N
</pre>

<p>という1行の文字列を出力せよ。ここで、<strong>X</strong>&nbsp;は 1 から始まるテストケースの番号であり、<strong>N</strong>&nbsp;は求めるべきバクテリアの数を&nbsp;<strong>C</strong>&nbsp;で割った余りである。</p>