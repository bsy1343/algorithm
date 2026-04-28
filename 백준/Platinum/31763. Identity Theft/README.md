# [Platinum I] Identity Theft - 31763

[문제 링크](https://www.acmicpc.net/problem/31763)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 24, 맞힌 사람: 22, 정답 비율: 59.459%

### 분류

자료 구조, 그리디 알고리즘, 문자열, 트리, 집합과 맵, 작은 집합에서 큰 집합으로 합치는 테크닉, 트라이

### 문제 설명

<p>Farmer John&#39;s $N$ ($1 \leq N \leq 10^5$) cows each have a Farm ID number in the form of a bitstring (a string consisting of the characters &#39;0&#39; and &#39;1&#39;). Bessie, the eldest cow, has the Farm ID numbers of all the cows memorized, and likes to go around and ask cows their ID numbers.</p>

<p>When a cow is asked their Farm ID number, they will start to say the correct bitstring, but may get confused and stop before finishing it. When Bessie hears the bitstring, if it is not the Farm ID number of any cow on the farm, then she will shrug and walk off. However, if it is the ID number of a different cow than the one she asked, then she will assume that identity theft has occurred and place the farm into lockdown. Note that this can happen even when the cow says their full Farm ID number.</p>

<p>Farmer John would like to prevent this from happening, and is willing to change the cows&#39; Farm ID numbers by adding some more bits to them. In one second, he can add one bit to the end of the Farm ID number of any cow. Figure out the minimum amount of time it will take for him to prevent a lockdown from ever occurring.</p>

### 입력

<p>The first line contains $N$, the number of cows on Farmer John&#39;s farm.</p>

<p>Then $N$ lines follow. The $k$th line contains a bitstring equal to the Farm ID number of the $k$th cow on Farmer John&#39;s farm.</p>

<p>No cow&#39;s Farm ID number is empty, and the total length of all Farm ID numbers is at most $10^6$.</p>

### 출력

Output the minimum number of seconds Farmer John needs to spend to ensure that a
lockdown will never occur.