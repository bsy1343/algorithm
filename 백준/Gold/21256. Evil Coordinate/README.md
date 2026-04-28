# [Gold I] Evil Coordinate - 21256

[문제 링크](https://www.acmicpc.net/problem/21256)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 10, 정답: 7, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

구현, 애드 혹, 많은 조건 분기

### 문제 설명

<p>A robot is standing on an infinite 2-dimensional plane. Programmed with a string $s_1s_2\cdots s_n$ of length $n$, where $s_i \in \{\text{&#39;U&#39;}, \text{&#39;D&#39;}, \text{&#39;L&#39;}, \text{&#39;R&#39;}\}$, the robot will start moving from $(0, 0)$ and will follow the instructions represented by the characters in the string.</p>

<p>More formally, let $(x, y)$ be the current coordinate of the robot. Starting from $(0, 0)$, the robot repeats the following procedure $n$ times. During the $i$-th time:</p>

<ul>
	<li>If $s_i = \text{&#39;U&#39;}$ the robot moves from $(x, y)$ to $(x, y+1)$;</li>
	<li>If $s_i = \text{&#39;D&#39;}$ the robot moves from $(x, y)$ to $(x, y-1)$;</li>
	<li>If $s_i = \text{&#39;L&#39;}$ the robot moves from $(x, y)$ to $(x-1, y)$;</li>
	<li>If $s_i = \text{&#39;R&#39;}$ the robot moves from $(x, y)$ to $(x+1, y)$.</li>
</ul>

<p>However, there is a mine buried under the coordinate $(m_x, m_y)$. If the robot steps onto $(m_x, m_y)$ during its movement, it will be blown up into pieces. Poor robot!</p>

<p>Your task is to rearrange the characters in the string in any order, so that the robot will not step onto $(m_x, m_y)$.</p>

### 입력

<p>There are multiple test cases. The first line of the input contains an integer $T$ indicating the number of test cases. For each test case:</p>

<p>The first line contains two integers $m_x$ and $m_y$ ($-10^9 \le m_x, m_y \le 10^9$) indicating the coordinate of the mine.</p>

<p>The second line contains a string $s_1s_2\cdots s_n$ of length $n$ ($1 \le n \le 10^5$, $s_i \in \{\text{&#39;U&#39;}, \text{&#39;D&#39;}, \text{&#39;L&#39;}, \text{&#39;R&#39;}\}$) indicating the string programmed into the robot.</p>

<p>It&#39;s guaranteed that the sum of $n$ of all test cases will not exceed $10^6$.</p>

### 출력

<p>For each test case output one line. If a valid answer exists print the rearranged string, otherwise print &quot;Impossible&quot; (without quotes) instead. If there are multiple valid answers you can print any of them.</p>