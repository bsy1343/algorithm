# [Platinum II] Fuel Station - 19667

[문제 링크](https://www.acmicpc.net/problem/19667)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 35, 정답: 7, 맞힌 사람: 7, 정답 비율: 43.750%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색, 매개 변수 탐색, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>As oil prices plummet, Pengu the Penguin has decided to visit Squeaky the Mouse who lives D kilometres away.</p>

<p>Pengu&rsquo;s spheniscidae-mobile starts its journey with F litres of fuel, consumes 1 litre of fuel per kilometre, and is able to hold any amount of fuel at any point in time.</p>

<p>Furthermore, there are N fuel stations between Pengu and his destination, with the i<sup>th</sup> fuel station being X<sub>i</sub> kilometres away from Pengu&rsquo;s house. At each fuel station, Pengu is only able to top up A<sub>i</sub> litres of fuel (a limit imposed to prevent drivers from hoarding cheap fuel), and only if F &le; B<sub>i</sub> (to ensure that the fuel goes to drivers who most need it), Here, F refers to the amount of fuel (in litres) that Pengu <strong>started</strong> with.</p>

<p>Being an efficient penguin, Pengu would like to minimise the value of F while still being able to reach his destination.</p>

### 입력

<p>Your program must read from standard input. The first line contains two integers N and D. N lines will follow. The i<sup>th</sup> line contains three integers X<sub>i</sub>, A<sub>i</sub> and B<sub>i</sub>, which represent the i<sup>th</sup> fuel station.</p>

### 출력

<p>Your program must print to standard output. The output should contain a single integer on a single line, the minimum value of F needed to reach the destination.</p>

### 제한

<ul>
	<li>1 &le; N &le; 3 &times; 10<sup>5</sup></li>
	<li>1 &le; A<sub>i</sub>, B<sub>i</sub>, D &le; 10<sup>9</sup></li>
	<li>0 &lt; X<sub>i</sub> &lt; D</li>
</ul>