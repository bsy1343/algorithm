# [Platinum V] Power Generation - 5748

[문제 링크](https://www.acmicpc.net/problem/5748)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 6, 맞힌 사람: 3, 정답 비율: 25.000%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색, 그리디 알고리즘

### 문제 설명

<p>Demand for electricity grew rapidly in the country over recent years, and is projected to grow even faster in the next twenty years. To cope with this increase in demand, the government is planning to privatize the country&rsquo;s electricity power-generation sector, ending the monopoly of the state-owned company, ICPC (Independent Circuit Power Corporation).</p>

<p>ICPC owns a set of power-generation plants (hydroelectric and nuclear). ICPC&rsquo;s plants are connected by power lines that cross the country. Each power line connects two distinct power plants and is constructed in a straight line. A power path is a sequence of power lines l<sub>1</sub>, l<sub>2</sub>, . . . , l<sub>m</sub>, with each power line l<sub>i</sub> connecting directly plants p<sub>i&minus;1</sub> and p<sub>i</sub>, such that any two consecutive power lines l<sub>i</sub> and l<sub>i+1</sub> are linked to a common power plant p<sub>i</sub>.</p>

<p>Power plants were built over several years, one at a time, due to budget restrictions. Also due to budget restrictions, every time a new power plant was built, only one new power line was constructed to integrate the new plant to the existing ICPC system. The new power line always linked the newly built power plant to the nearest power plant already in the system. If more than one such plant existed (that is, if more than one plant was located at a minimum distance from the new plant), the oldest plant was chosen.</p>

<p>In the privatization project, the aim is to break up the ICPC power-generation system into smaller companies, each company owning a set of power plants (each power plant will be owned by only one company). After the privatization, ICPC will cease to exist; only the new companies will own the power plants. The division of power plants among new companies must obey the following restrictions:</p>

<ul>
	<li>the total capacity of every new company must be at least C, where C is a value in MW (Mega Watts) decided by the government. The total capacity of a set of power plants is the sum of capacities of those plants;</li>
	<li>power paths between any two plants owned by a new company must include only plants owned by that company.</li>
</ul>

<p>You have been hired by ICPC to determine which is the largest number of new companies that can be created in the privatization process.</p>

### 입력

<p>The input contains several test cases. The first line of a test case contains two integers N and C indicating respectively the total number of power plants owned by ICPC (1 &le; N &le; 10000) and the minimum total capacity, in MW, that every new company must have (1 &le; C &le; 10000). Power plants are identified by integers from 1 to N; plant 1 was the first to be built, plant 2 the second to be built, and so on. Each of the next N lines describes a power plant; the first line describes power plant 1, the second line describes power plant 2, and so on. Each description consists of three integers X, Y and P, where (X, Y) is the plant location (0 &le; X &le; 1000 and 0 &le; Y &le; 1000) and P is the plant capacity (1 &le; P &le; 1000). Plants were built at different locations (that is, no two plants have the same location). The end of input is indicated by N = C = 0.</p>

### 출력

<p>For each test case in the input your program must produce one line of output, containing only one integer: the largest number of new companies that can be created in the privatization process.</p>