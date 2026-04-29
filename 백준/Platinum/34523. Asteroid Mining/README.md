# [Platinum V] Asteroid Mining - 34523

[문제 링크](https://www.acmicpc.net/problem/34523)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

그리디 알고리즘, 배낭 문제, 수학, 우선순위 큐, 자료 구조, 정렬, 정수론

### 문제 설명

<p>It is the year 2217 and Ryan is an asteroid miner. He makes a living by mining asteroids and selling them at the CCO (Celestial Cargo Outpost).</p>

<p>On his latest mining expedition, he has mined $N$ mineral chunks where the $i$-th chunk has a value $v_i$ and a mass $m_i$. Ryan plans to transport a set of chunks to the CCO with his rocket, but he only has enough fuel to last one more trip. He calculated that the maximum total mass he can safely carry on his rocket is $M$. Due to Ryan’s mining technique, the chunks exhibit a special property: for any two mineral chunks, one’s mass is divisible by the other chunk’s mass.</p>

<p>Help Ryan find the maximum total value he can ship to CCO while adhering to his rocket’s constraints.</p>

### 입력

<p>The first line will contain two space-separated integers $N$ ($1 ≤ N ≤ 500\, 000$) and $M$ ($1 ≤ M ≤ 10^{12}$).</p>

<p>The next $N$ lines will each contain two space-separated integers $v_i$ ($1 ≤ v_i ≤ 10^{12}$) and $m_i$ ($1 ≤ m_i ≤ 10^{12}$), representing the value and mass of the $i$-th mineral chunk respectively. Additionally, for any two mineral chunks $i$, $j$ ($1 ≤ i, j ≤ N$), either $m_i | m_j$ or $m_j | m_i$, where $a | b$ means that $a$ is a divisor of $b$ (i.e., $b/a$ is an integer).</p>

### 출력

<p>On one line, output one integer, the maximum total value Ryan can ship to CCO.</p>