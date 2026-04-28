# [Platinum V] Mountains - 19663

[문제 링크](https://www.acmicpc.net/problem/19663)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 159, 정답: 80, 맞힌 사람: 68, 정답 비율: 53.125%

### 분류

자료 구조, 정렬, 세그먼트 트리

### 문제 설명

<p>Pengu the Penguin lives in Antartica with his penguin friends. Despite being flightless birds, they wish to experience the joy of soaring through the air. Pengu decides to fulfill their wishes through the power of technology - with gliders.</p>

<p>Luckily for Pengu, there are n mountains in the Transantartic Mountain Range. The mountains are labelled 1 to n and are arranged in a row from left to right. The i<sup>th</sup> mountain has height H<sub>i</sub>.</p>

<p>Pengu decides to pick 3 mountains x, y and z. He plans to build a base station on mountain y and receiving stations on mountains x and z. Penguins will glide from mountain y to either mountain x or z. To acommodate more penguins while avoiding midair collisions, mountains x and z are to the left and right of mountain y respectively. Furthermore, mountains x and z must be strictly shorter than mountain y. Pengu is very meticulous and wants to consider all possible choices. Find the number of possible choices for (x, y, z) such that 1 &le; x &lt; y &lt; z &le; n, H<sub>x</sub> &lt; H<sub>y</sub> and H<sub>y</sub> &gt; H<sub>z</sub>.</p>

### 입력

<p>Your program must read from standard input. The first line contains an integer n, the number of mountains. The second line contains n integers, where the i<sup>th</sup> integer represents the height of the i<sup>th</sup> mountain H<sub>i</sub>.</p>

### 출력

<p>Your program must print to standard output.</p>

<p>The output should contain a single integer on a single line, the total number of possible choices for (x, y, z).</p>

### 제한

<ul>
	<li>3 &le; n &le; 3 &times; 10<sup>5</sup></li>
	<li>0 &le; H<sub>i</sub> &le; 10<sup>18</sup></li>
</ul>