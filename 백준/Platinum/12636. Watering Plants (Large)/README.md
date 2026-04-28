# [Platinum I] Watering Plants (Large) - 12636

[문제 링크](https://www.acmicpc.net/problem/12636)

### 성능 요약

시간 제한: 60 초, 메모리 제한: 512 MB

### 통계

제출: 130, 정답: 58, 맞힌 사람: 14, 정답 비율: 37.838%

### 분류

기하학, 이분 탐색

### 문제 설명

<p>In your greenhouse you have a number of plants which you need to water.</p>

<p>Each of the plants takes up an area which is a circle. No two of the plants overlap or touch each other.</p>

<p>You are going to buy two sprinklers. Each of the sprinklers will spray everything within a circle of radius&nbsp;<strong>R</strong>&nbsp;with water.</p>

<p>One of the sprinklers will run in the morning, and one will run at night. For you to be satisfied that a plant will get enough water, either the whole area of the plant must be watered in the morning, or the the whole area of the plant must be watered at night. So each of the circles representing a plant must be completely in one or both of the two circles representing the area the sprinklers can water.&nbsp;</p>

<p>Given the location and radius of each of the plants, find the minimum radius&nbsp;<strong>R</strong>&nbsp;so that it is possible to place the two sprinklers to water all the plants. The sprinklers will be installed on the ceiling, so a sprinkler&#39;s position can be inside the area of a plant.</p>

### 입력

<ul>
	<li>One line containing an integer&nbsp;<strong>C</strong>, the number of test cases in the input file.</li>
</ul>

<p>For each test case, there will be:</p>

<ul>
	<li>One line containing&nbsp;<strong>N</strong>, where&nbsp;<strong>N</strong>&nbsp;is the number of plants you have.</li>
	<li><strong>N</strong>&nbsp;lines, one for each plant, containing three integers &quot;<strong>X</strong>&nbsp;<strong>Y</strong>&nbsp;<strong>R</strong>&quot;, where (<strong>X</strong>,&nbsp;<strong>Y</strong>) are the coordinates of the center of the plant, and&nbsp;<strong>R</strong>&nbsp;is the radius of the plant.</li>
</ul>

<p>Limits</p>

<ul>
	<li>All numbers in the input file are integers.</li>
	<li>1 &le;&nbsp;<strong>X</strong>&nbsp;&le; 1000</li>
	<li>1 &le;&nbsp;<strong>Y</strong>&nbsp;&le; 1000</li>
	<li>1 &le;&nbsp;<strong>R</strong>&nbsp;&le; 100</li>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 30</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 40</li>
</ul>

### 출력

<p>For each test case:</p>

<ul>
	<li>One line containing the string &quot;Case #x: R&quot; where&nbsp;<em>x</em>&nbsp;is the number of the test case, starting from 1, and&nbsp;<strong>R</strong>&nbsp;is the minimum radius of the sprinklers.</li>
</ul>

<p>Any answer with absolute or relative error of at most 10<sup>-5</sup>&nbsp;will be accepted.</p>

### 힌트

<p>In the first case, a sprinkler of radius at least 7 centered at (20,15) will water the first two plants. A sprinkler of radius at least 3 will water the plant at (40,10).</p>

<p>In the second case, one of the two sprinklers will need a radius of at least 8. Note that the plant at (30,10) must be covered entirely by one of the two sprinklers.</p>