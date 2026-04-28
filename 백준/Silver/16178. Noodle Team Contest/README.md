# [Silver III] Noodle Team Contest - 16178

[문제 링크](https://www.acmicpc.net/problem/16178)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 9, 맞힌 사람: 8, 정답 비율: 53.333%

### 분류

그리디 알고리즘

### 문제 설명

<p>There will be a noodle cooking contest! Each team consist of&nbsp;<i>N</i>&nbsp;(1 &lt;=&nbsp;<i>N</i>&nbsp;&lt;= 12) peoples. Each member of the team should cook his/her noodle, but the team will only have one pot/wok to cook the noodle. The first team to finish their noodles is the winner.</p>

<p>To cook a noodle, there are two steps:</p>

<ul>
	<li>step-1: Cook the noodle in a boiled water for 3 minutes, rain, and put into a dish.</li>
	<li>step-2: Put the seasoning, stir, and done!</li>
</ul>

<p>Because there is only one pot, only one person in the team at a time can do step-1.</p>

<p>For example, there are two peoples in the team:</p>

<ol>
	<li>Andoko. step-1 needs 2 minutes, step-2 needs 3 minutes.</li>
	<li>Kurniady. step-1 needs 3 minutes, step-2 needs 4 minutes.</li>
</ol>

<p>If Andoko be the first person to use the pot to do his step-1 (Kurniady wait for 2 minutes), then the team will need 9 minutes to finish their noodles. If Kurniady be the first person to use (Andoko wait for 3 minutes), then the team will need 8 minutes. Hence, letting Kurniady be the first person will lead to a better result (faster finish time).</p>

<p>Given the time for each member to complete his/her step-1 and step-2, find the minimum time needed by the team to finish all their noodles.</p>

### 입력

<p>The first line of input contains an integer&nbsp;<i>T</i>&nbsp;(1 &lt;=&nbsp;<i>T</i>&nbsp;&lt;= 200000), the number of test cases follow.</p>

<p>Each test case starts with an integer&nbsp;<i>N</i>&nbsp;denoting the number of people in one team. The next&nbsp;<i>N</i>&nbsp;lines each contains 2 integers,&nbsp;<i>T</i><sub>1</sub>&nbsp;and&nbsp;<i>T</i><sub>2</sub>&nbsp;(0 &lt;=&nbsp;<i>T</i><sub>1</sub>&nbsp;and&nbsp;<i>T</i><sub>2</sub>&nbsp;&lt;= 1000) the time needed for each member to do step-1 and step-2 respectively.</p>

### 출력

<p>For each test case, output in a line the the minimum time needed to finish all the noodles.</p>