# [Gold II] The Great Revegetation (Silver) - 17038

[문제 링크](https://www.acmicpc.net/problem/17038)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 893, 정답: 271, 맞힌 사람: 232, 정답 비율: 31.737%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 분리 집합

### 문제 설명

<p>A lengthy drought has left Farmer John&#39;s $N$ pastures devoid of grass. However, with the rainy season arriving soon, the time has come to &quot;revegetate&quot;. In Farmer John&#39;s shed, he has two buckets, each with a different type of grass seed. He wants to plant grass in each of his $N$ pastures, choosing exactly one type of grass to plant in each.</p>

<p>Being a dairy farmer, Farmer John wants to make sure he manages the somewhat particular dietary needs of his $M$ cows. Each of his $M$ cows has two favorite pastures. Some of his cows have a dietary restriction that they should only eat one type of grass consistently --- Farmer John therefore wants to make sure the same type of grass is planted in the two favorite fields of any such cow. Other cows have a very different dietary restriction, requiring them to eat different types of grass. For those cows, Farmer John of course wants to make sure their two favorite fields contain different grass types.</p>

<p>Please help Farmer John determine the number of different ways he can plant grass in his $N$ pastures.</p>

### 입력

<p>The first line of input contains $N$ ($2 \leq N \leq 10^5$) and $M$ ($1 \leq M \leq 10^5$). Each of the next $M$ lines contains a character that is either &#39;S&#39; or &#39;D&#39;, followed by two integers in the range $1 \ldots N$, describing the pair of pastures that are the two favorites for one of Farmer John&#39;s cows. If the character is &#39;S&#39;, this line represents a cow that needs the same type of grass in its two favorite pastures. If the character is &#39;D&#39;, the line represents a cow that needs different grass types.</p>

### 출력

<p>Output the number of ways Farmer John can plant grass in his $N$ pastures. Please write your answer in binary.</p>