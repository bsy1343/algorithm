# [Gold IV] Carpets - 7190

[문제 링크](https://www.acmicpc.net/problem/7190)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 52, 정답: 20, 맞힌 사람: 16, 정답 비율: 64.000%

### 분류

기하학, 스위핑, 값 / 좌표 압축

### 문제 설명

<p>The fanciest hall of Prince Ville&rsquo;s new castle has a rectangular floor. The walls of the hall run from North to South and from East to West. Ville&rsquo;s advisors have proposed to cover some parts of the floor with carpets and even suggested a specific arrangement of them.</p>

<p>Ville, caring mostly only about the quantitative aspect of the deal, would like to know the total area covered by the carpets in the proposed arrangement.</p>

### 입력

<p>The first line of input contains three space-separated integers: the number of carpets $K$ ($1 &le; K &le; 3$), the distance $L$ from the East wall to the West wall ($1 &le; L &le; 10^6$), and the distance $P$ from the North wall to the South wall ($1 &le; P &le; 10^6$) of the hall. Each of the following $K$ lines contains four space-separated integers $N$, $S$, $E$, and $W$ describing one carpet. The edges of the carpet are parallel to the walls and the numbers $N$, $S$, $E$, and $W$ show, respectively, the distance of the North, South, East, and West edge of the carpet from the corresponding wall. The carpets may overlap partially or fully. All distances are given in metres.</p>

### 출력

<p>The only line of output should contain a single integer $S$, the total area of the floor covered by carpets, in square metres.</p>