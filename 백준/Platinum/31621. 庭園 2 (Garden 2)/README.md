# [Platinum III] 庭園 2 (Garden 2) - 31621

[문제 링크](https://www.acmicpc.net/problem/31621)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 21, 맞힌 사람: 17, 정답 비율: 77.273%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>JOI 庭園は縦 <var>N</var> 行，横 <var>N</var> 列のマス目状に区切られた正方形の形をしている． 上から <var>i</var> 行目 (<var>1 ≦ i ≦ N</var>)，左から <var>j</var> 列目 (<var>1 ≦ j ≦ N</var>) のマスは区画 <var>(i, j)</var> と呼ばれている．</p>

<p>JOI 庭園は土壌にあまり恵まれていないため，各区画には特定の <var>1</var> 種類の色の花を，<strong>最大</strong> <var>1</var> 本しか植えることができない． 具体的には，区画 <var>(i, j)</var> には <var>A<sub>i, j</sub> =</var> <code>R</code> のとき赤，<var>A<sub>i, j</sub> =</var> <code>Y</code> のとき黄，<var>A<sub>i, j</sub> =</var> <code>B</code> のとき青の色の花を最大 <var>1</var> 本しか植えることができない．</p>

<p>ここで，この庭園の管理者である K 理事長は，航空写真を撮った時の見栄えを良くするため，次の手順で花を植えようと思っている．</p>

<ol>
	<li><strong>大きさ</strong>を表す整数 <var>r</var> を決める．ただし <var>0 ≦ r ≦ (N-1) &divide; 2</var> を満たさなければならない．</li>
	<li><strong>中心</strong>を表す区画 <var>(x, y)</var> を決める．ただし <var>r+1 ≦ x ≦ N-r</var>，<var>r+1 ≦ y ≦ N-r</var> を満たさなければならない．</li>
	<li>色 <var>c<sub>0</sub>, c<sub>1</sub>, c<sub>2</sub>, &hellip;, c<sub>r</sub></var> をそれぞれ赤・黄・青の中から選んで決める．</li>
	<li>それぞれの区画 <var>(x&#39;, y&#39;)</var> について，<var>d = |x&#39;-x| + |y&#39;-y|</var> に応じて以下の規則で花を植える．ただし，<var>|t|</var> は <var>t</var> の絶対値を表す．
	<ul>
		<li><var>d ≦ r</var> であるならば，区画 <var>(x&#39;, y&#39;)</var> には色 <var>c<sub>d</sub></var> の花を植える．</li>
		<li><var>d &gt; r</var> であるならば，区画 <var>(x&#39;, y&#39;)</var> には花を植えない．</li>
	</ul>
	</li>
</ol>

<p>庭園の大きさ，各区画に植えることができる花の色の情報が与えられたとき，K 理事長が植えることができる花の数の最大値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var>N</var>
<var>A<sub>1,1</sub></var>   <var>A<sub>1,2</sub></var>   <var>&hellip;</var>   <var>A<sub>1,N</sub></var>
<var>A<sub>2,1</sub></var>   <var>A<sub>2,2</sub></var>   <var>&hellip;</var>   <var>A<sub>2,N</sub></var>
<var>︙</var>
<var>A<sub>N,1</sub></var>   <var>A<sub>N,2</sub></var>   <var>&hellip;</var>   <var>A<sub>N,N</sub></var></pre>

### 출력

<p>K 理事長が植えることができる花の数の最大値を <var>1</var> 行で出力せよ．</p>

### 제한

<ul>
	<li><var>3 ≦ N ≦ 3 500</var>．</li>
	<li><var>A<sub>i, j</sub></var> は <code>R</code>，<code>Y</code>，<code>B</code> のいずれかである (<var>1 ≦ i ≦ N, 1 ≦ j ≦ N</var>)．</li>
	<li><var>N</var> は整数である．</li>
</ul>