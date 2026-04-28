# [Platinum IV] TATCK - 18383

[문제 링크](https://www.acmicpc.net/problem/18383)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 6, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

기하학, 휴리스틱, 삼분 탐색

### 문제 설명

<p>Last night Taliban attacked a police station. Afghan National Police fought them and repelled the attack by killing all of them. However, after the attack, Police forces noticed a strange pattern of tiny holes in the station&rsquo;s wall. They decide to cover these holes by a kind of bulletproof sheet metal temporarily. These sheets are only in square shape in different sizes, so they should use them to cover near to each other holes. Therefore, they first disjoint the holes to N parts based on their distance from each other. Then calculate and select appropriate sheet metal to cover each part.</p>

<p>Write a program to find the area of the smallest square that will cover all the holes in a part.</p>

### 입력

<p>The first line contains a single integer N expressed in decimal without leading zeros, denoting the number of parts (Test Cases).</p>

<p>The subsequent lines describe the number of holes in each part and their location.</p>

<p>To better understand, each test case begins with a single line, containing a single integer N expressed in decimal without leading zeros, the number of holes to follow; each of the following N lines contains two integers x and y, both expressed in decimal without leading zeros, giving the coordinates of one of points:</p>

<ul>
	<li>N &lt;= 30</li>
	<li>-500 &lt; x, y &lt; 500</li>
</ul>

### 출력

<p>Print, on a single line with two decimal places of precision, the area of the smallest square containing all your points.</p>

<p>An answer will be accepted if it lies within 0.1 of the correct answer.</p>