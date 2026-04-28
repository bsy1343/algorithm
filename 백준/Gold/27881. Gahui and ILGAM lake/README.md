# [Gold IV] Gahui and ILGAM lake - 27881

[문제 링크](https://www.acmicpc.net/problem/27881)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 99, 정답: 39, 맞힌 사람: 37, 정답 비율: 51.389%

### 분류

누적 합

### 문제 설명

<p>Gahui often visited Konkuk University. Every time Gahui visited Konkuk University, she was surprised to see the huge <code>ILGAM</code> lake. It is bigger than several universities, such as Seokyung university and Hanseong university.</p>

<p>The lake has <code>4n</code> points arranged like a ring, each numbered from <code>1</code> to <code>4n</code> in <code>counter-clockwise</code> order. Each pair of adjacent points are connected in both directions. In other words:</p>

<ul>
	<li>If <code>1</code> &le; <code>a</code> &lt; <code>4n</code>, point <code>a</code> is connected to point <code>a+1</code> in <strong>both directions.</strong></li>
	<li>Point <code>1</code> is connected to point <code>4n</code> in <strong>both directions.</strong></li>
</ul>

<p>Points <code>n</code>, <code>2n</code>, <code>3n</code>, and <code>4n</code> are connected to 3 subway stations (<code>Konkuk_Univ</code>, <code>Guui</code>, <code>Sejong_Univ</code>) via roads. <code>ILGAM</code> lake is so big, the nearest station is different depending on the point. Gahui wants to know which subway station is the nearest to her current point. Please help Gahui.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/27881.%E2%80%85Gahui%E2%80%85and%E2%80%85ILGAM%E2%80%85lake/d8ea390f.png" data-original-src="https://upload.acmicpc.net/0dc503eb-a928-4071-b690-b0f7fd2606f7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 299px; height: 300px;" /></p>

<p style="text-align: center;"><strong>[Picture 1] Roads and points when n = 2</strong></p>

### 입력

<p><code>n</code> is given in the first line.</p>

<p>In the next line, <code>4n</code> numbers are given in the following format:</p>

<p style="text-align: center;"><code>d<sub>1</sub></code> <code>d<sub>2</sub></code> ... <code>d<sub>4n</sub></code></p>

<ul>
	<li><code>d<sub>i</sub></code> is distance from point <code>i</code> to point <code>i+1 </code>when <code>1</code>&le;<code>i</code>&lt;<code>4n</code></li>
	<li><code>d<sub>4n</sub></code> is distance from point <code>4n</code> to point <code>1</code></li>
</ul>

<p>And the information below is given on four lines.</p>

<p style="text-align: center;"><code>d<sub>n,Konkuk_Univ</sub></code> <code>d<sub>n,Guui</sub></code> <code>d<sub>n,Sejong_Univ</sub></code></p>

<p style="text-align: center;"><code>d<sub>2n,Konkuk_Univ</sub></code> <code>d<sub>2n,Guui</sub></code> <code>d<sub>2n,Sejong_Univ</sub></code></p>

<p style="text-align: center;"><code>d<sub>3n,Konkuk_Univ</sub></code> <code>d<sub>3n,Guui</sub></code> <code>d<sub>3n,Sejong_Univ</sub></code></p>

<p style="text-align: center;"><code>d<sub>4n,Konkuk_Univ</sub></code> <code>d<sub>4n,Guui</sub></code> <code>d<sub>4n,Sejong_Univ</sub></code></p>

<p><code>d<sub>a,b</sub></code> is the <code data-stringify-type="code"><b data-stringify-type="bold">distance between point a and station b.</b></code></p>

<p>In the next line, <code>Q</code> (number of questions) is given.</p>

<p>In the next <code>Q</code> lines, <code>Q</code> questions are given in the following format, one per line.</p>

<ul>
	<li><code>k</code>

	<ul>
		<li>What is <strong>the distance to the nearest station</strong> from point <code>k</code>?</li>
	</ul>
	</li>
</ul>

### 출력

<p>Print the answers to the questions, <strong>one per line.</strong></p>

### 제한

<ul>
	<li><code>1</code> &le; <code><strong>all distances</strong> in the problem</code> &le; <code>10<sup>5</sup></code></li>
	<li><code>1</code> &le; <code>n</code> &le; <code>10<sup>5</sup></code></li>
	<li><code>1</code> &le; <code>Q</code> &le; <code>10<sup>5</sup></code></li>
</ul>