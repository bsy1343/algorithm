# [Bronze I] Dance Around The Clock (Small) - 12035

[문제 링크](https://www.acmicpc.net/problem/12035)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 118, 정답: 91, 맞힌 사람: 73, 정답 비율: 76.042%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>The owner of a prestigious ballroom has painted a beautiful circular clock on the dance floor, and a group of&nbsp;<strong>D</strong>&nbsp;dancers numbered 1 through&nbsp;<strong>D</strong>&nbsp;are about to literally &quot;dance around the clock&quot;. They are standing in a circle, with dancer 1 at the 12:00 position of the circle and the other dancers going clockwise around the circle in increasing numerical order. The number of dancers is even.</p>

<p>The dance will go on for&nbsp;<strong>N</strong>&nbsp;turns. On the i-th turn (counting starting from 1), the following will happen:</p>

<ul>
	<li>If i is odd, then the dancer currently at the 12:00 position will swap positions with the next dancer in clockwise order. Then, going past those two, the next pair of dancers in clockwise order will swap positions, and so on, all the way around the ring clockwise, until all dancers have participated in exactly one swap.</li>
	<li>If i is even, then the dancer currently at the 12:00 position will swap positions with the next dancer in counterclockwise order. Then, going past those two, the next pair of dancers in counterclockwise order will swap positions, and so on, all the way around the ring counterclockwise, until all dancers have participated in a swap.</li>
</ul>

<p>For example, this diagram shows the initial state and two turns of a dance with eight people.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/12035.%E2%80%85Dance%E2%80%85Around%E2%80%85The%E2%80%85Clock%E2%80%85(Small)/badd8bb7.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/12035.%E2%80%85Dance%E2%80%85Around%E2%80%85The%E2%80%85Clock%E2%80%85(Small)/badd8bb7.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12035/12035.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:157px; width:589px" /></p>

<p>Which two dancers will be next to dancer number&nbsp;<strong>K</strong>&nbsp;when the dance is over?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each consists of one line with three integers&nbsp;<strong>D</strong>,&nbsp;<strong>K</strong>, and&nbsp;<strong>N</strong>: the total number of dancers, the number of one of the dancers, and the number of turns the dance will go on for.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li><strong>D</strong>&nbsp;is even.</li>
	<li>1 &le;&nbsp;<strong>K</strong>&nbsp;&le;&nbsp;<strong>D</strong>.</li>
	<li>4 &le;&nbsp;<strong>D</strong>&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y z</code>, where:</p>

<ul>
	<li><code>x</code>&nbsp;is the test case number (starting from 1).</li>
	<li><code>y</code>&nbsp;is the number of the dancer who will be standing to dancer number&nbsp;<strong>K</strong>&#39;s left (that is, one step away in clockwise order) when the dance is over.</li>
	<li><code>z</code>&nbsp;is the number of the dancer who will be standing to dancer number&nbsp;<strong>K</strong>&#39;s right (that is, one step away in counterclockwise order) when the dance is over.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>For Cases #1 and #2, refer to the illustration above. In Case #1, after 1 turn, dancer 6 is to dancer 3&#39;s left, and dancer 4 is to dancer 3&#39;s right. In Case #2, after 2 turns, dancer 1 is to dancer 4&#39;s left, and dancer 7 is to dancer 4&#39;s right. Remember that you&#39;re looking from the dancer&#39;s perspective; it may help to think in terms of clockwise and counterclockwise instead of left and right.</p>

<p>In Case #3, after eight turns, the arrangement looks the same as the initial arrangement, with dancer 2 to dancer 1&#39;s left, and dancer 4 to dancer 1&#39;s right.</p>