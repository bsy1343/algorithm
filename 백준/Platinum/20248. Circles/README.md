# [Platinum V] Circles - 20248

[문제 링크](https://www.acmicpc.net/problem/20248)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 1024 MB

### 통계

제출: 108, 정답: 39, 맞힌 사람: 32, 정답 비율: 41.026%

### 분류

자료 구조, 기하학, 우선순위 큐

### 문제 설명

<p>There are n magical circles on a plane. They are centered at (x<sub>1</sub>, y<sub>1</sub>),(x<sub>2</sub>, y<sub>2</sub>), . . . ,(x<sub>n</sub>, y<sub>n</sub>), respectively. In the beginning, the radius of each circle is 0, and the radii of all magical circles will grow at the same rate. When a magical circle touches another, then it stops growing. Write a program to calculate the total area of all magical circles at the end of growing.</p>

### 입력

<p>The first line contains an integer n to indicate the number of magical circles. The i-th of the following n lines contains two space-separated integers x<sub>i</sub> and y<sub>i</sub> indicating that the i-th magical circle is centered at (x<sub>i</sub>, y<sub>i</sub>).</p>

<p>A relative error of 10<sup>&minus;6</sup> is acceptable.</p>

### 출력

<p>Output the total area of the circles.</p>

### 제한

<ul>
	<li>2 &le; n &le; 2000</li>
	<li>x<sub>i</sub>, y<sub>i</sub> &isin; [&minus;10<sup>9</sup>, 10<sup>9</sup>] for i &isin; {1, 2, . . . , n}.</li>
	<li>All (x<sub>i</sub>, y<sub>i</sub>)&rsquo;s are disinct points.</li>
</ul>