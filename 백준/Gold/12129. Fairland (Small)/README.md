# [Gold III] Fairland (Small) - 12129

[문제 링크](https://www.acmicpc.net/problem/12129)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 11, 맞힌 사람: 10, 정답 비율: 90.909%

### 분류

그래프 이론, 그리디 알고리즘, 브루트포스 알고리즘, 그래프 탐색, 트리

### 문제 설명

<p>The country of Fairland has very strict laws governing how companies organize and pay their employees:</p>

<ol>
	<li>Each company must have exactly one CEO, who has no manager.</li>
	<li>Every employee except for the CEO must have exactly one manager. (This means that the org chart showing all of the employees in a company is a tree, without cycles.)</li>
	<li>As long as an employee is working for the company, their manager must never change. This means that if a manager leaves, then all of the employees reporting to that manager must also leave.</li>
	<li>The CEO must never leave the company.</li>
	<li>Every employee receives a salary -- some amount of Fairland dollars per year. An employee&#39;s salary must never change.</li>
	<li>Different employees may have different salaries, and an employee&#39;s salary is not necessarily correlated with where in the org chart that employee is.</li>
</ol>

<p>The government of Fairland has just passed one additional law:</p>

<ol start="7">
	<li>The difference between the largest salary and the smallest salary in the whole company must be at most&nbsp;<strong>D</strong>&nbsp;Fairland dollars.</li>
</ol>

<p>&nbsp;</p>

<p>Marie is the CEO of the Fairland General Stuff Corporation, and she has to ensure that her company complies with the new law. This may require laying off some employees. She has the list of the company&#39;s employees, their managers, and their salaries. What is the largest number of employees she can keep, including herself?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each case begins with one line containing two space-separated integers&nbsp;<strong>N</strong>&nbsp;(the number of employees) and&nbsp;<strong>D</strong>&nbsp;(the maximum allowed salary difference). This is followed by one line with four space-separated integers (<strong>S<sub>0</sub></strong>,&nbsp;<strong>A<sub>s</sub></strong>,&nbsp;<strong>C<sub>s</sub></strong>,&nbsp;<strong>R<sub>s</sub></strong>) and then another line with four more space-separated integers (<strong>M<sub>0</sub></strong>,&nbsp;<strong>A<sub>m</sub></strong>,&nbsp;<strong>C<sub>m</sub></strong>&nbsp;and&nbsp;<strong>R<sub>m</sub></strong>). These last eight integers define the following sequences:</p>

<ul>
	<li><strong>S<sub>i+1</sub></strong>&nbsp;= (<strong>S<sub>i</sub></strong>&nbsp;*&nbsp;<strong>A<sub>s</sub></strong>&nbsp;+&nbsp;<strong>C<sub>s</sub></strong>)&nbsp;<em>mod</em>&nbsp;<strong>R<sub>s</sub></strong></li>
	<li><strong>M<sub>i+1</sub></strong>&nbsp;= (<strong>M<sub>i</sub></strong>&nbsp;*&nbsp;<strong>A<sub>m</sub></strong>&nbsp;+&nbsp;<strong>C<sub>m</sub></strong>)&nbsp;<em>mod</em>&nbsp;<strong>R<sub>m</sub></strong></li>
</ul>

<p>&nbsp;</p>

<p>Marie&#39;s employee ID is 0, and all other employees have IDs from 1 to&nbsp;<strong>N</strong>&nbsp;- 1,&nbsp;inclusive. The salary of employee&nbsp;<strong>i</strong>&nbsp;is&nbsp;<strong>S<sub>i</sub></strong>. For every employee&nbsp;<strong>i</strong>&nbsp;other than Marie, the manager is&nbsp;<strong>M<sub>i</sub></strong>&nbsp;<em>mod</em>&nbsp;<strong>i</strong>. (Note that this means that&nbsp;<strong>M<sub>0</sub></strong>&nbsp;does not affect Marie&#39;s manager -- she has none!)</p>

<div>
<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>S<sub>0</sub></strong>&nbsp;&lt;&nbsp;<strong>R<sub>s</sub></strong>.</li>
	<li>0 &le;&nbsp;<strong>M<sub>0</sub></strong>&nbsp;&lt;&nbsp;<strong>R<sub>m</sub></strong>.</li>
	<li>0 &le;&nbsp;<strong>A<sub>s</sub></strong>,&nbsp;<strong>A<sub>m</sub></strong>&nbsp;&le; 1000.</li>
	<li>0 &le;&nbsp;<strong>C<sub>s</sub></strong>,&nbsp;<strong>C<sub>m</sub></strong>&nbsp;&le; 10<sup>9</sup>.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 1000.</li>
	<li>1 &le;&nbsp;<strong>D</strong>&nbsp;&le; 1000.</li>
	<li>1 &le;&nbsp;<strong>R<sub>s</sub></strong>,&nbsp;<strong>R<sub>m</sub></strong>&nbsp;&le; 1000.</li>
</ul>

<div>&nbsp;</div>
</div>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the largest number of employees Marie can keep at the company, including herself, such that all of laws 1-7 are obeyed.</p>

### 힌트

<p>In Case #1, the company has only a CEO and no other employees, but it does not violate any of the laws, so no changes need to be made.<br />
<br />
Here is the org chart for Case #2:<br />
<br />
<img src="https://code.google.com/codejam/contest/images/?image=fairland_sample_2.png&amp;p=5709131113562112&amp;c=4254486"/>&nbsp;<br />
The optimal strategy is to save employees 0, 1, and 5 (who have salaries of 10, 13, and 8, respectively). It is not possible to save employee 2, for example, because her salary is more than 5 away from employee 0&#39;s salary of 10; since employee 0 cannot be laid off, employee 2 must be laid off (along with all employees who report to her).<br />
<br />
If you want to check your sequences for employees 1 through 5, they are:<br />
<br />
<strong>S</strong>: 13, 16, 2, 5, 8<br />
<strong>M</strong>: 17, 3, 13, 14, 16<br />
Manager numbers: 17 % 1 = 0, 3 % 2 = 1, 13 % 3 = 1, 14 % 4 = 2, 16 % 5 = 1</p>