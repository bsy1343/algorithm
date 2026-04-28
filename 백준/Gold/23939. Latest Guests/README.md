# [Gold I] Latest Guests - 23939

[문제 링크](https://www.acmicpc.net/problem/23939)

### 성능 요약

시간 제한: 15 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

구현

### 문제 설명

<p>The city of Circleburg has a large circular street with&nbsp;<b>N</b>&nbsp;consulates along it. The consulates are numbered 1, 2, ...,&nbsp;<b>N</b>&nbsp;in clockwise order.</p>

<p>Today&nbsp;<b>G</b>&nbsp;guests, numbered 1, 2, ...,&nbsp;<b>G</b>&nbsp;will drive along the circular street for&nbsp;<b>M</b>&nbsp;minutes. Each guest is either a&nbsp;<i>clockwise</i>&nbsp;guest (denoted by the character&nbsp;<code>C</code>) or an&nbsp;<i>anti-clockwise</i>&nbsp;guest (denoted by the character&nbsp;<code>A</code>).</p>

<p>The i-th guest starts at the consulate numbered&nbsp;<b>H<sub>i</sub></b>&nbsp;and at the end of each minute will drive to an adjacent consulate. The i-th guest starts at the j-th consulate. If that guest is:</p>

<ul>
	<li>a clockwise guest, they will drive to the (j+1)-th consulate (unless they are at the&nbsp;<b>N</b>-th consulate, then they will drive to the 1st consulate).</li>
	<li>an anti-clockwise guest, they will drive to the (j-1)-th consulate (unless they are at the 1st consulate, then they will drive to the&nbsp;<b>N</b>-th consulate).</li>
</ul>

<p>Each consulate will only remember the guest that visited them last. If there are multiple guests who visited last, then the consulate will remember all of those guests.</p>

<p>For each guest, determine how many consulates will remember them.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each testcase begins with a line containing the three integers&nbsp;<b>N</b>,&nbsp;<b>G</b>&nbsp;and&nbsp;<b>M</b>, which are the number of consulates, the number of guests and the number of minutes respectively. Then,&nbsp;<b>G</b>&nbsp;lines follow. The i-th line contains the integer&nbsp;<b>H<sub>i</sub></b>&nbsp;followed by a single character;&nbsp;<code>C</code>&nbsp;if the i-th guest is a clockwise guest or&nbsp;<code>A</code>&nbsp;if the i-th guest is an anti-clockwise guest.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y<sub>1</sub>&nbsp;y<sub>2</sub>&nbsp;... y<sub>G</sub></code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y<sub>i</sub></code>&nbsp;is the number of consulates that remember the i-th guest.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>H<sub>i</sub></b>&nbsp;&le;&nbsp;<b>N</b>, for all i.</li>
</ul>

### 힌트

<p>In the first sample case, there are&nbsp;<b>N</b>&nbsp;= 5 consulates,&nbsp;<b>G</b>&nbsp;= 3 guests, who will drive for&nbsp;<b>M</b>&nbsp;= 2 minutes.</p>

<ul>
	<li>For the 1st consulate, it is last visited by guests 1 and 2 (at the end of the 1st minute).</li>
	<li>For the 2nd consulate, it is last visited by guest 1 (at the end of the 2nd minute).</li>
	<li>The 3rd consulate, is never visited.</li>
	<li>For the 4th consulate, it is last visited by guest 3 (at the end of the 2nd minute).</li>
	<li>For the 5th consulate, it is last visited by guest 2 (at the end of the 2nd minute).</li>
</ul>

<p>Thus the answer should be 2, 2, 1 for the 1st, 2nd and 3rd guests respectively.</p>

<p>In the second sample case, there are&nbsp;<b>N</b>&nbsp;= 2 consulates,&nbsp;<b>G</b>&nbsp;= 4 guests, who will drive for&nbsp;<b>M</b>&nbsp;= 0 minutes.</p>

<ul>
	<li>For the 1st consulate, it is last visited by guests 1, 2, 3 and 4 (all the guests start at this consulate).</li>
	<li>The 2nd consulate, is never visited.</li>
</ul>

<p>Thus the answer should be 1, 1, 1, 1 for the 1st, 2nd, 3rd and 4th guests respectively.</p>

<p>In the third sample case, there are&nbsp;<b>N</b>&nbsp;= 3 consulates,&nbsp;<b>G</b>&nbsp;= 2 guests, who will drive for&nbsp;<b>M</b>&nbsp;= 10 minutes.</p>

<ul>
	<li>For the 1st consulate, it is last visited by guests 1, and 2 (at the end of the 10th minute).</li>
	<li>For the 2nd consulate, it is last visited by guest 2 (at the end of the 9th minute).</li>
	<li>For the 3rd consulate, it is last visited by guest 1 (at the end of the 9th minute).</li>
</ul>

<p>Thus the answer should be 2, 2 for the 1st and 2nd guests respectively.</p>

<p>In the fourth sample case, there is only one guest. This guest visits all the consulates eventually, so is remembered by all of them. Thus the answer is 6.</p>