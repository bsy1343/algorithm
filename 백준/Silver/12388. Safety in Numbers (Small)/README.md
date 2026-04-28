# [Silver I] Safety in Numbers (Small) - 12388

[문제 링크](https://www.acmicpc.net/problem/12388)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 26, 맞힌 사람: 24, 정답 비율: 66.667%

### 분류

이분 탐색, 매개 변수 탐색

### 문제 설명

<p>There are&nbsp;<strong>N</strong>&nbsp;contestants in a reality TV show. Each contestant is assigned a point value by the judges and receives votes from the audience. The point value given by the judges and the audience&#39;s votes are combined to form a&nbsp;<em>final score</em>&nbsp;for the contestant, in the following way:</p>

<p>Let&nbsp;<code>X</code>&nbsp;be the sum of the judge-assigned point values of all contestants. Now suppose a contestant got&nbsp;<code>J</code>&nbsp;points from the judges, and that she received a fraction&nbsp;<code>Y</code>&nbsp;(between 0 and 1, inclusive) of the audience&#39;s votes (<code>Y</code>&nbsp;might be, for example, 0.3). Then that contestant&#39;s final score is&nbsp;<code>J+X*Y</code>. Note that the sum of all contestants&#39; audience vote fractions must be 1.</p>

<p>The contestant with the lowest score is eliminated.&nbsp;</p>

<p>Given the points contestants got from judges, your job is to find out, for each contestant, the minimum percentage of audience votes he/she must receive in order for him/her to be guaranteed&nbsp;<strong>not to be eliminated</strong>, no matter how the rest of the audience&#39;s votes are distributed.</p>

<p>If the lowest score is shared by multiple contestants, no contestants will be eliminated.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow, one per line. Each line starts with an integer&nbsp;<strong>N</strong>, the number of contestants, followed by a space, followed by&nbsp;<strong>N</strong>&nbsp;integers&nbsp;<strong>s</strong><sub>0</sub>,&nbsp;<strong>s</strong><sub>1</sub>, ...,&nbsp;<strong>s</strong><sub>N-1</sub>, separated by single spaces. The integer&nbsp;<strong>s</strong><sub>i</sub>&nbsp;is the point value assigned to contestant&nbsp;<code>i</code>&nbsp;by the judges.</p>

<h3>Limits</h3>

<ul>
	<li>0 &le;&nbsp;<strong>s</strong><sub>i</sub>&nbsp;&le; 100.</li>
	<li><strong>s</strong><sub>i</sub>&nbsp;&gt; 0 for some i. This means at least one contestant will have a point value greater than 0.</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 20.</li>
	<li>2 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: &quot; followed by&nbsp;<strong>N</strong>&nbsp;real numbers:&nbsp;<strong>m</strong><sub>i</sub>s. The value x is the case number (starting from 1). The value&nbsp;<strong>m</strong><sub>i</sub>&nbsp;is the smallest percentage of audience votes required for contestant&nbsp;<code>i</code>&nbsp;to definitely avoid elimination.</p>

<p>Answers within an absolute or relative error of 10<sup>-5</sup>&nbsp;of the correct answer will be accepted.</p>