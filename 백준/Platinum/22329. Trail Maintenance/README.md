# [Platinum V] Trail Maintenance - 22329

[문제 링크](https://www.acmicpc.net/problem/22329)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 20, 맞힌 사람: 17, 정답 비율: 36.957%

### 분류

그래프 이론, 브루트포스 알고리즘, 트리, 최소 스패닝 트리

### 문제 설명

<p>Farmer John&#39;s cows wish to travel freely among the N (1 &le; N &le; 200) fields (numbered 1&hellip;N) on the farm, even though the fields are separated by forest. The cows wish to maintain trails between pairs of fields so that they can travel from any field to any other field using the maintained trails. Cows may travel along a maintained trail in either direction.</p>

<p>The cows do not build trails. Instead, they maintain wild animal trails that they have discovered. On any week, they can choose to maintain any or all of the wild animal trails they know about.</p>

<p>Always curious, the cows discover one new wild animal trail at the beginning of each week. They must then decide the set of trails to maintain for that week so that they can travel from any field to any other field. Cows can only use trails which they are currently maintaining.</p>

<p>The cows always want to minimize the total length of trail they must maintain. The cows can choose to maintain any subset of the wild animal trails they know about, regardless of which trails were maintained the previous week.</p>

<p>Wild animal trails (even when maintained) are never straight. Two trails that connect the same two fields might have different lengths. While two trails might cross, cows are so focused, they refuse to switch trails except when they are in a field.</p>

<p>At the beginning of each week, the cows will describe the wild animal trail they discovered. Your program must then output the minimum total length of trail the cows must maintain that week so that they can travel from any field to any other field, if there exists such a set of trails.</p>

### 입력

<ul>
	<li>The first line of input contains two space-separated integers, N and W. W is the number of weeks the program will cover (1 &le; W &le; 6000).</li>
	<li>For each week, read a single line containing the wild animal trail that was discovered. This line contains three space-separated integers: the endpoints (field numbers) and the integer length of that trail (1&hellip;10000). No wild animal trail has the same field as both of its endpoints.</li>
</ul>

### 출력

<p>Immediately after your program learns about the newly discovered wild animal trail, it should output a single line with the minimum total length of trail the cows must maintain so that they can travel from any field to any other field. If no set of trails allows the cows to travel from any field to any other field, output &ldquo;-1&rdquo;.</p>

<p>Your program must exit after outputting the answer for the last week.</p>