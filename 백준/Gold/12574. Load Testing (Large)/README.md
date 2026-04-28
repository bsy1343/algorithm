# [Gold I] Load Testing (Large) - 12574

[문제 링크](https://www.acmicpc.net/problem/12574)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 40, 맞힌 사람: 38, 정답 비율: 79.167%

### 분류

애드 혹, 이분 탐색, 수학

### 문제 설명

<p>Now that you have won Code Jam and been hired by Google as a software engineer, you have been assigned to work on their wildly popular programming contest website.&nbsp;</p>

<p>Google is expecting a lot of participants (<strong>P</strong>) in Code Jam next year, and they want to make sure that the site can support that many people at the same time. During Code Jam 2010 you learned that the site could support at least&nbsp;<strong>L</strong>&nbsp;people at a time without any errors, but you also know that the site can&#39;t yet support&nbsp;<strong>P</strong>&nbsp;people.</p>

<p>To determine how many more machines you&#39;ll need, you want to know within a factor of&nbsp;<strong>C</strong>how many people the site can support. This means that there is an integer&nbsp;<strong>a</strong>&nbsp;such that you know the site can support&nbsp;<strong>a</strong>&nbsp;people, but you know the site can&#39;t support&nbsp;<strong>a</strong>&nbsp;*&nbsp;<strong>C</strong>&nbsp;people.</p>

<p>You can run a series of&nbsp;<em>load tests</em>, each of which will determine whether the site can support at least&nbsp;<strong>X</strong>&nbsp;people for some integer value of&nbsp;<strong>X</strong>&nbsp;that you choose. If you pick an optimal strategy, choosing what tests to run based on the results of previous tests, how many load tests do you need in the worst case?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;lines follow, each of which contains space-separated integers&nbsp;<strong>L</strong>,&nbsp;<strong>P</strong>&nbsp;and&nbsp;<strong>C</strong>&nbsp;in that order.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 1000.</li>
	<li>2 &le;&nbsp;<strong>C</strong>&nbsp;&le; 10.</li>
	<li><strong>L</strong>,&nbsp;<strong>P</strong>&nbsp;and&nbsp;<strong>C</strong>&nbsp;are all integers.</li>
	<li>1 &le;&nbsp;<strong>L</strong>&nbsp;&lt;&nbsp;<strong>P</strong>&nbsp;&le; 10<sup>9</sup>.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the number of load tests you need to run in the worst case before knowing within a factor of&nbsp;<strong>C</strong>&nbsp;how many people the site can support.</p>

### 힌트

<p>In Case #2, we already know that the site can support between 19 and 57 people. Since those are a factor of 3 apart, we don&#39;t need to do any testing.</p>

<p>In Case #4, we can test 48; but if the site can support 48 people, we need more testing, because 48*2 &lt; 97. We could test 49; but if the site can&#39;t support 49 people, we need more testing, because 24 * 2 &lt; 49. So we need two tests.</p>