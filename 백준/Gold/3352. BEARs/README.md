# [Gold II] BEARs - 3352

[문제 링크](https://www.acmicpc.net/problem/3352)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 3, 맞힌 사람: 3, 정답 비율: 37.500%

### 분류

애드 혹, 이분 탐색, 기하학, 그리디 알고리즘, 선분 교차 판정, 정렬

### 문제 설명

<p>The Infinite city is divided into unitary square blocks by an infinite number of south-north and west-east two-way streets. One of the south-north streets is labeled 0, and the street numbers increase to the east and decrease to west. Similarly, one of the west-east streets is labeled 0, and the numbers increase to the north and decrease to the south.</p>

<p>Every intersection is labeled by an ordered pair of numbers of the streets that intersect (the first being the number of south-north street). Some street sections are more important and are called main streets.</p>

<p>One day sheriff Wolf (the fiercest caretaker of the Infinite city) is patrolling the streets and at intersection (A, B) he notices a car with a few members of the well-known BEAR gang. Wolf has heard of the BEARs&rsquo; plans to break into the city&rsquo;s Honey Warehouse, which is located near the intersection (0, 0), and decides to stop them.</p>

<p>However, they haven&rsquo;t commited any crime so far and Wolf can&rsquo;t arrest them. But he has the authority to stop his car at any intersection and block exactly one of the four unit segments that meet at this intersection. However he can&rsquo;t block a unit segment that belongs to a main street.</p>

<p>So Wolf decides to pursue the BEARs and just before they reach an intersection, he may overtake their car and block one of the four unit segments at the intersection. The BEARs will be able to drive into the intersection, but they won&rsquo;t be able to exit the intersection to a segment blocked by the sheriff&rsquo;s car.</p>

<p>The sheriff wants to keep the BEARs as far away from the Honey Warehouse as possible. Find the maximum distance D, such that any intersection (x, y) the BEARs may reach satisfies the condition max(|x|, |y|) &ge; D.</p>

### 입력

<p>The first line of the input contains two integers: A and B (|A| &le; 10<sup>6</sup>, |B| &le; 10<sup>6</sup>), the starting point of the BEARs. The second line contains one integer N (0 &le; N &le; 500), the number of main streets. Each of the following N lines contains four integers: X<sub>1</sub>, Y<sub>1</sub>, X<sub>2</sub>, Y<sub>2</sub> (|X<sub>i</sub>| &le; 10<sup>6</sup>, |Y<sub>i</sub>| &le; 10<sup>6</sup>), meaning that the street section between intersections (X<sub>1</sub>, Y<sub>1</sub>) and (X<sub>2</sub>, Y<sub>2</sub>) is a main street. Either X<sub>1</sub> = X<sub>2</sub> or Y<sub>1</sub> = Y<sub>2</sub> holds.</p>

### 출력

<p>The only line of the output&nbsp;must contain the maximum value of D.</p>

### 힌트

<p>The following figure illustrates how the BEARs can get to within distance 1 of the warehouse:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3352.%E2%80%85BEARs/195082ca.png" data-original-src="https://upload.acmicpc.net/63e42334-de52-4bb4-8a88-5e8008dc49b0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 309px; height: 233px;" /></p>

<p>Even though the BEARs may continue trying forever, the sheriff can prevent them from ever getting closer to the warehouse.</p>