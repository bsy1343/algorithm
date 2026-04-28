# [Platinum II] Vinjete - 25447

[문제 링크](https://www.acmicpc.net/problem/25447)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 13, 맞힌 사람: 10, 정답 비율: 33.333%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 세그먼트 트리, 깊이 우선 탐색, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>After two years of being online, the International Olympiad in Informatics (IOI) is going to be held live. The ISC and ITC are stressed as usual, the competitors are excited, parents proud and nervous, but the person most excited about the event being held on-site is Mr. Malnar. Once more he will taste the early-morning grape juice at the Zagreb airport, once more he will taste the finest Asian recipes, once more he will enjoy the daily excursions.</p>

<p>More experienced among you will ask themselves: &ldquo;What excursions?! Mr. Malnar almost never takes the organized excursions with the rest of the delegations.&rdquo;. You&rsquo;re right, he doesn&rsquo;t, he plans his own excursions months ahead of the event.</p>

<p>First he solves all the car rental logistics, then he makes a short list of $N$ cities he&rsquo;d like to visit. He circles these cities on the map and connects each pair of cities that are directly connected via a highway. Interestingly, this year he drew exactly $(N - 1)$ connections, and realized there exists a path between each pair of cities using these highways.</p>

<p>That&rsquo;s not all, it looks like there are $M$ different types of vignettes that you&rsquo;re able to purchase in Asia. For each highway, it is known what subset of vignette types you need to have. Mr. Malnar immediately indexed all the different vignette types using integers from $1$ to $M$. Interestingly, he managed to index them in such a way that in order to travel via $i$-th highway, you need buy all vignettes with indices greater or equal $l_i$ and smaller or equal $r_i$.</p>

<p>Similarly, he indexed all the cities with integers from $1$ to $N$ such that Yogyakarta, a city in Indonesia hosting the olympiad, is denoted with $1$.</p>

<p>To better plan his routes, he decided to ask you to write a program that will compute, for each city, what is the smallest number of vignettes he has to purchase in order to travel from Yogykarta to that city.</p>

### 입력

<p>The first line contains integers $N$ and $M$ from the task description.</p>

<p>The $i$-th of the next $N - 1$ lines contains $a_i$, $b_i$, $l_i$ and $r_i$ meaning that the $i$-th highway connects cities with indices $a_i$ and $b_i$ ($1 &le; a_i , b_i &le; N$, $a_i &ne; b_i$), and that travelling via that highway entails buying vignettes with indices from an interval $[l_i , r_i ]$ ($1 &le; l_i &le; r_i &le; M$).</p>

<p>The highways are such that they connect each pair of the $N$ cities.</p>

### 출력

<p>The $i$-th of the $N - 1$ lines should contain the smallest number of vignettes Mr. Malnar has to buy in order to travel from Yogykarta (city with index $1$) to city with index $(i + 1)$.</p>