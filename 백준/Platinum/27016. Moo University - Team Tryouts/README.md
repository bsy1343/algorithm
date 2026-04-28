# [Platinum V] Moo University - Team Tryouts - 27016

[문제 링크](https://www.acmicpc.net/problem/27016)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 14, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

수학, 브루트포스 알고리즘, 스위핑, 차분 배열 트릭

### 문제 설명

<p>N (1 &le; N &le; 1,000) calves try out for the Moo U gymnastics team this year, each with a positive integer height and a weight less than 100,000. Your goal is to select a team of as many calves as possible from this group. There is only one constraint the team must satisfy: the height H and weight W of each calf on the team must obey the following inequality:</p>

<p style="text-align: center;">A*(H-h) + B*(W-w) &le; C</p>

<p>where h and w are the minimum height and weight values over all calves on the team, and A, B and C are supplied positive integral constants less than 10,000. Compute the maximum number of calves on the team.</p>

### 입력

<ul>
	<li>Line 1: A single integer, N</li>
	<li>Line 2: Three space-separated integers, A, B and C</li>
	<li>Lines 3..N+2: Two space-separated integers: respectively the height and weight of a calf</li>
</ul>

### 출력

<ul>
	<li>Line 1: One integer, the maximum number of calves on the team.</li>
</ul>

### 힌트

<p>Calves 1, 2, 3, 4 and 7, for example, form a legal team. A larger team is impossible.</p>