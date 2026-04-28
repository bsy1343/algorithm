# [Gold IV] Dance Battle - 24007

[문제 링크](https://www.acmicpc.net/problem/24007)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 13, 맞힌 사람: 11, 정답 비율: 64.706%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Your team is about to prove itself in a dance battle! Initially, your team has&nbsp;<b>E</b>&nbsp;points of energy, and zero points of honor. There are&nbsp;<b>N</b>&nbsp;rival teams who you must face; the i-th of these teams is the i-th in a lineup, and has a dancing skill of&nbsp;<b>S<sub>i</sub></b>.</p>

<p>In each round of battle, you will face the next rival team in the lineup, and you can take one of the following actions:</p>

<ol>
	<li><i>Dance</i>: Your team loses energy equal to the dancing skill of the rival team, and that team does not return to the lineup. You gain one point of honor. You cannot take this action if it would make your energy drop to 0 or less.</li>
	<li><i>Delay</i>: You make excuses (&quot;our shoes aren&#39;t tied!&quot;) and the rival team returns to the back of the lineup. Your energy and honor do not change.</li>
	<li><i>Truce</i>: You declare a truce with the rival team, and that team does not return to the lineup. Your energy and honor do not change.</li>
	<li><i>Recruit</i>: You recruit the rival team onto your team, and that team does not return to the lineup. Your team gains energy equal to the dancing skill of the rival team, but you lose one point of honor. You cannot take this action if it would make your honor drop below 0.</li>
</ol>

<p>The battle is over when there are no more rival teams in the lineup. If you make optimal decisions, what is the maximum amount of honor you can have when the battle is over?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow; each consists of two lines. The first line consists of two integers&nbsp;<b>E</b>&nbsp;and&nbsp;<b>N</b>: your team&#39;s energy, and the number of rival teams. The second line consists of&nbsp;<b>N</b>&nbsp;integers&nbsp;<b>S<sub>i</sub></b>; the i-th of these represents the dancing skill of the rival team that is i-th in line at the start of the battle.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum amount of honor you can have when the battle is over.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>E</b>&nbsp;&le; 10<sup>6</sup>.</li>
	<li>1 &le;&nbsp;<b>S<sub>i</sub></b>&nbsp;&le; 10<sup>6</sup>, for all i.</li>
</ul>

### 힌트

<p>In Sample Case #1, there is only one rival team. You cannot dance against them because it would make your energy fall to 0, and you cannot recruit them because it would make your honor fall below 0. Delaying does not help, so the only option is to declare a truce. You finish with 0 honor.</p>

<p>In Sample Case #2, one optimal strategy is:</p>

<ol>
	<li>Delay against the first rival team. They go to the back of the lineup.</li>
	<li>Dance against the second rival team. Your energy drops to 7, and your honor increases to 1.</li>
	<li>Recruit the third rival team. Your energy increases to 22, and your honor decreases to 0.</li>
	<li>Dance against the first rival team (which is now at the head of the lineup again). Your energy drops to 2, and your honor increases to 1.</li>
</ol>

<p>You finish with 1 point of honor.</p>