# [Platinum V] Grazing Google Goats (Small) - 12569

[문제 링크](https://www.acmicpc.net/problem/12569)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 7, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

기하학

### 문제 설명

<p>Farmer John has recently acquired a nice herd of&nbsp;<strong>N</strong>&nbsp;goats for his field. Each goat&nbsp;<code>i</code>&nbsp;will be tied to a pole at some position&nbsp;<strong>P</strong><sub>i</sub>&nbsp;using a rope of length&nbsp;<strong>L</strong><sub>i</sub>. This means that the goat will be able to travel anywhere in the field that is within distance&nbsp;<strong>L</strong><sub>i</sub>&nbsp;of the point&nbsp;<strong>P</strong><sub>i</sub>, but nowhere else. (The field is large and flat, so you can think of it as an infinite two-dimensional plane.)</p>

<p>Farmer John already has the pole positions picked out from his last herd of goats, but he has to choose the rope lengths. There are two factors that make this decision tricky:</p>

<ul>
	<li>The goats all need to be able to reach a single water bucket. Farmer John has not yet decided where to place this bucket. He has reduced the choice to a set of positions {<strong>Q</strong><sub>1</sub>,&nbsp;<strong>Q</strong><sub>2</sub>, ...,&nbsp;<strong>Q</strong><sub>M</sub>}, but he is not sure which one to use.</li>
	<li>The goats are ill-tempered, and when they get together, they sometimes get in noisy fights. For everyone&#39;s peace of mind, Farmer John wants to minimize the area&nbsp;<strong>A</strong>&nbsp;that can be reached by all the goats.</li>
</ul>

<p>Unfortunately, Farmer John is not very good at geometry, and he needs your help for this part!</p>

<p>For each bucket position&nbsp;<strong>Q</strong><sub>j</sub>, you should choose rope lengths so as to minimize the area&nbsp;<strong>A</strong><sub>j</sub>that can be reached by every goat when the bucket is located at position&nbsp;<strong>Q</strong><sub>j</sub>. You should then calculate each of these areas&nbsp;<strong>A</strong><sub>j</sub>.</p>

<h3>Example</h3>

<p>In the picture below, there are four blue points, corresponding to the pole positions:&nbsp;<strong>P</strong><sub>1</sub>,&nbsp;<strong>P</strong><sub>2</sub>,&nbsp;<strong>P</strong><sub>3</sub>, and&nbsp;<strong>P</strong><sub>4</sub>. There are also two red points, corresponding to the potential bucket positions:&nbsp;<strong>Q</strong><sub>1</sub>&nbsp;and&nbsp;<strong>Q</strong><sub>2</sub>. You need to calculate&nbsp;<strong>A</strong><sub>1</sub>&nbsp;and&nbsp;<strong>A</strong><sub>2</sub>, the areas of the two shaded regions.</p>

<p><br />
&nbsp;&nbsp;&nbsp;<img src="%EB%B0%B1%EC%A4%80/Platinum/12569.%E2%80%85Grazing%E2%80%85Google%E2%80%85Goats%E2%80%85(Small)/16e76433.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/12569.%E2%80%85Grazing%E2%80%85Google%E2%80%85Goats%E2%80%85(Small)/16e76433.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12569/images-30.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="border:0px; vertical-align:middle" /></p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case begins with a line containing the integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>M</strong>.</p>

<p>The next&nbsp;<strong>N</strong>&nbsp;lines contain the positions&nbsp;<strong>P</strong><sub>1</sub>,&nbsp;<strong>P</strong><sub>2</sub>, ...,&nbsp;<strong>P</strong><sub>N</sub>, one per line. This is followed by&nbsp;<strong>M</strong>lines, containing the positions&nbsp;<strong>Q</strong><sub>1</sub>,&nbsp;<strong>Q</strong><sub>2</sub>, ...,&nbsp;<strong>Q</strong><sub>M</sub>, one per line.</p>

<p>Each of these&nbsp;<strong>N</strong>&nbsp;+&nbsp;<strong>M</strong>&nbsp;lines contains the corresponding position&#39;s&nbsp;<strong>x</strong>&nbsp;and&nbsp;<strong>y</strong>&nbsp;coordinates, separated by a single space.</p>

<h3>Limits</h3>

<ul>
	<li>All coordinates are integers between -10,000 and 10,000.</li>
	<li>The positions&nbsp;<strong>P</strong><sub>1</sub>,&nbsp;<strong>P</strong><sub>2</sub>, ...,&nbsp;<strong>P</strong><sub>N</sub>,&nbsp;<strong>Q</strong><sub>1</sub>,&nbsp;<strong>Q</strong><sub>2</sub>, ...,&nbsp;<strong>Q</strong><sub>M</sub>&nbsp;are all distinct and no three are collinear.</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li><strong>N</strong>&nbsp;= 2.</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 10.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x:&nbsp;<strong>A</strong><sub>1</sub>&nbsp;<strong>A</strong><sub>2</sub>&nbsp;...&nbsp;<strong>A</strong><sub>M</sub>&quot;, where x is the case number (starting from 1), and&nbsp;<strong>A</strong><sub>1</sub>&nbsp;<strong>A</strong><sub>2</sub>&nbsp;...&nbsp;<strong>A</strong><sub>M</sub>&nbsp;are the values defined above. Answers with a relative or absolute error of at most 10<sup>-6</sup>&nbsp;will be considered correct.</p>