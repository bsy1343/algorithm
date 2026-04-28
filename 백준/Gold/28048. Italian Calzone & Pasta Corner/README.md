# [Gold III] Italian Calzone & Pasta Corner - 28048

[문제 링크](https://www.acmicpc.net/problem/28048)

### 성능 요약

시간 제한: 3.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 164, 정답: 80, 맞힌 사람: 66, 정답 비율: 52.381%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 너비 우선 탐색, 우선순위 큐

### 문제 설명

<p>The Italian Calzone &amp; Pasta Corner restaurant designed its menu having its dishes in a $R \times C$ two-dimensional grid, keeping dishes that go well together nearby each other. To eat, you choose a starting cell, and then repeatedly move up, down, left, or right to any of the four adjacent cells, getting any dishes you move through. Moving into already visited cells is allowed, but you don&rsquo;t get the same dish again.</p>

<p>One day, Pierre, a foreign customer, showed up really hungry, and with a very strict etiquette background. He has a very specific order in which the dishes must be eaten. For example an appetizer, then an entree, then a main dish, then a salad, etc. So he assigned a distinct integer from $1$ to $R \times C$ to each dish in the menu grid, indicating the order in which he would eat the whole menu. Now he wants to choose and eat dishes following his order. Since the restaurant&rsquo;s rules might prevent him from choosing the whole menu, he is fine with skipping some of the steps given by his order. Can you help him choose a meal with as many dishes as possible?</p>

### 입력

<p>The first line contains two integers $R$ and $C$ ($1 &le; R, C &le; 100$), indicating that the menu grid has $R$ rows and $C$ columns. The next $R$ lines contain $C$ integers each, representing the menu grid. Each of these numbers is a distinct integer from $1$ to $R \times C$ assigned by Pierre to the corresponding dish in the menu grid.</p>

### 출력

<p>Output a single line with an integer indicating the maximum amount of dishes that Pierre can eat.</p>