# [Silver II] Exploration Teams - 27023

[문제 링크](https://www.acmicpc.net/problem/27023)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 20, 맞힌 사람: 15, 정답 비율: 83.333%

### 분류

브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>The cows want to form an expeditionary team to explore the wooded area at the edge of Farmer John&#39;s territory.  Exploring turns out to be an activity that requires more skill than just standing in the pasture and grazing.</p>

<p>The team of C (1 &le; C &le; 20) cows numbered 1..C must include cows that are able to navigate through the woods without getting lost, fend off big nasty creatures, tell jokes to keep the morale high, etc.  At least one cow on the team must possess each of these A (1 &le; A &le; 20) special abilities numbered 1..A.  Some cows have only one ability, but many have multiple abilities; some cows are just freeloaders who are completely useless.</p>

<p>Given a list of all the cows and the abilities of each cow, compute the number of different exploration teams that the cows can form, such that the team as a whole has all the given abilities.</p>

### 입력

<ul>
	<li>Line 1: Two integers, C and A</li>
	<li>Lines 2..A+1: Each line contains a set of space-separated integers describing an ability.  Line 2 describes ability 1; line 3 describes ability 2; etc.  The first integer on each line, K (1 &le; K &le; C), is the number of cows with this ability. The following K integers represent the cows who have the ability.</li>
</ul>

### 출력

<ul>
	<li>Line 1: An integer representing the number of different exploration teams that the cows can form.</li>
</ul>

### 힌트

<p>The possible exploration teams are: {1, 2}, {2, 3}, {1, 2, 3}, {1, 2, 4}, {2, 3, 4}, and {1, 2, 3, 4}.</p>