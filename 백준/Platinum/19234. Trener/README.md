# [Platinum V] Trener - 19234

[문제 링크](https://www.acmicpc.net/problem/19234)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 59, 정답: 25, 맞힌 사람: 22, 정답 비율: 46.809%

### 분류

다이나믹 프로그래밍, 자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵, 해싱

### 문제 설명

<p>At this point we already know that students love to sleep. Patrik is a record holder in this category. He wakes up only when he needs to eat or if he wishes to play FIFA 20. Therefore, his dreams usually revolve around football. In his last dream, he found himself in the role of a football manager of his favourite team &ndash; GNK Dinamo Zagreb.</p>

<p>His job is to select N players that will defend the blue colors in the next season, but the board has some peculiar requests. They are:</p>

<ul>
	<li>All players must have surnames of distinct lengths.</li>
	<li>Surname of a player must appear as a continuous subsequence of surnames of all players whose surnames are longer.</li>
</ul>

<p>To make his job easier, Patrik divided the potential players in N buckets such that players in i-th bucket have exactly i letters in their surname. In each of these buckets there are exactly K players. Patrik wants to know in how many distinct ways (modulo 10<sup>9</sup> + 7) can he choose the players for his squad while also conforming to the given requests.</p>

### 입력

<p>The first line contains two integers N (1 &le; N &le; 50) and K (1 &le; K &le; 1 500).</p>

<p>Each of the next N lines contains K not necessarily distinct surnames of players. The surnames of players in i-th of those lines consist of exactly i lowercase letters from the English alphabet.</p>

### 출력

<p>In the only line you should output the answer from the task description.</p>