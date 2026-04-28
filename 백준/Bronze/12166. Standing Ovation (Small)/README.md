# [Bronze II] Standing Ovation (Small) - 12166

[문제 링크](https://www.acmicpc.net/problem/12166)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 272, 정답: 204, 맞힌 사람: 181, 정답 비율: 75.732%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>It&#39;s opening night at the opera, and your friend is the prima donna (the lead female singer). You will not be in the audience, but you want to make sure she receives a standing ovation -- with every audience member standing up and clapping their hands for her.<br />
<br />
Initially, the entire audience is seated. Everyone in the audience has a&nbsp;<em>shyness level</em>. An audience member with shyness level&nbsp;<strong>S<sub>i</sub></strong>&nbsp;will wait until at least&nbsp;<strong>S<sub>i</sub></strong>&nbsp;other audience members have already stood up to clap, and if so, she will immediately stand up and clap. If&nbsp;<strong>S<sub>i</sub></strong>&nbsp;= 0, then the audience member will always stand up and clap immediately, regardless of what anyone else does. For example, an audience member with&nbsp;<strong>S<sub>i</sub></strong>&nbsp;= 2 will be seated at the beginning, but will stand up to clap later after she sees at least two other people standing and clapping.<br />
<br />
You know the shyness level of everyone in the audience, and you are prepared to invite additional friends of the prima donna to be in the audience to ensure that everyone in the crowd stands up and claps in the end. Each of these friends may have any shyness value that you wish, not necessarily the same. What is the minimum number of friends that you need to invite to guarantee a standing ovation?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each consists of one line with&nbsp;<strong>S<sub>max</sub></strong>, the maximum shyness level of the shyest person in the audience, followed by a string of&nbsp;<strong>S<sub>max</sub>&nbsp;+ 1</strong>&nbsp;single digits. The&nbsp;<strong>k</strong>th digit of this string (counting starting from 0) represents how many people in the audience have shyness level&nbsp;<strong>k</strong>. For example, the string &quot;409&quot; would mean that there were four audience members with&nbsp;<strong>S<sub>i</sub></strong>&nbsp;= 0&nbsp;and nine audience members with&nbsp;<strong>S<sub>i</sub></strong>&nbsp;= 2&nbsp;(and none with&nbsp;<strong>S<sub>i</sub></strong>&nbsp;= 1&nbsp;or any other value). Note that there will initially always be between 0 and 9 people with each shyness level.<br />
<br />
The string will never end in a 0. Note that this implies that there will always be at least one person in the audience.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>S<sub>max</sub></strong>&nbsp;&le; 6.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the minimum number of friends you must invite.</p>

### 힌트

<p>In Case #1, the audience will eventually produce a standing ovation on its own, without you needing to add anyone -- first the audience member with&nbsp;<strong>S<sub>i</sub></strong>&nbsp;= 0&nbsp;will stand up, then the audience member with&nbsp;<strong>S<sub>i</sub></strong>&nbsp;= 1&nbsp;will stand up, etc.<br />
<br />
In Case #2, a friend with&nbsp;<strong>S<sub>i</sub></strong>&nbsp;= 0&nbsp;must be invited, but that is enough to get the entire audience to stand up.<br />
<br />
In Case #3, one optimal solution is to add two audience members with&nbsp;<strong>S<sub>i</sub></strong>&nbsp;= 2.<br />
<br />
In Case #4, there is only one audience member and he will stand up immediately. No friends need to be invited.</p>