# [Platinum II] Mafia - 8161

[문제 링크](https://www.acmicpc.net/problem/8161)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 99, 정답: 25, 맞힌 사람: 22, 정답 비율: 30.137%

### 분류

너비 우선 탐색, 다이나믹 프로그래밍, 함수형 그래프, 그래프 이론, 그래프 탐색, 그리디 알고리즘

### 문제 설명

<p>Mob feud rages in Equatorial Byteotia. The mob bosses have come to the country&#39;s capital, Byteburg, to settle the dispute. Negotiations were very tense, and at one point the trigger-happy participants drew their guns. Each participant aims at another with a pistol. Should they go on a killing spree, the shooting will go in accordance with the following code of honour:</p>

<ul>
	<li>the participants shoot in a certain order, and at any moment at most one of them is shooting,</li>
	<li>no shooter misses, his target dies instantly, hence he may not shoot afterwards,</li>
	<li>everyone shoots once, provided he had not been shot before he has a chance to shoot,</li>
	<li>no participant may change his first target of choice, even if the target is already dead (then the shot causes no further casualties).</li>
</ul>

<p>An undertaker watches from afar, as he usually does. After all, the mobsters have never failed to stimulate his business. He sees potential profit in the shooting, but he would like to know tight estimations. Precisely he would like to know the minimum and maximum possible death rate. The undertaker sees who aims at whom, but does not know the order of shooting. You are to write a programme that determines the numbers he is so keen to know.</p>

<p>
Write a programme that:</p>

<ul>
	<li>reads from the standard input what target each mobster has chosen,</li>
	<li>determines the minimum and maximum number of casualties,</li>
	<li>writes out the result to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains the number of participants n (1 &le; n &le; 1,000,000). They are numbered from 1 to n. The second line contains n integers s<sub>1</sub>,s<sub>2</sub>,&hellip;,s<sub>n</sub>, separated by single spaces, 1 &le; s<sub>i</sub> &le; n. s<sub>i</sub> denotes the number of i<sup>th</sup> participant&#39;s target. Note that it is possible that s<sub>i</sub>=i for some i (the nerves, you know).</p>

### 출력

<p>Your programme should write out two integers separated by a single space in the first and only line of the standard output. These numbers should be, respectively, the minimum and maximum number of casualties resulting from the shooting.</p>

<p>&nbsp;</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8161.%E2%80%85Mafia/dfac7b30.gif" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/8161/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:144px; width:314px" /></p>