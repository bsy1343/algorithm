# [Gold III] Infinite Slides - 17935

[문제 링크](https://www.acmicpc.net/problem/17935)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 17, 정답: 8, 맞힌 사람: 8, 정답 비율: 47.059%

### 분류

기하학

### 문제 설명

<p>Agneta and Beata are visiting the famous Swedish Amusement Park of Infinite Fun and Games. Their favourite attraction is the Infinitely Long Slides. Each slide can be viewed as an infinitely long, completely vertical spiral of radius $1$.</p>

<p>When projected into the (flat) ground, the first slide has $(0, 0)$ as its centre point, and the second one has $(1, 0)$ as its centre point. Furthermore, the start of the slides are at $(1, 0)$ and $(2, 0)$ respectively, and then proceeds counter-clockwise around their respective centres. When Agneta rides her slide (the first one), she does so with vertical speed $1\text{ m/s}$, while Beatas slide has a bit higher gradient, so she goes with vertical speed $2\text{ m/s}$. However, their angular speeds around the centre is both equal to $1 \text{ rad/s}$. Since Beata is a little afraid of the slides, she always waits for Agneta to go first. $W$ seconds after Agneta went, Beata starts her descent.</p>

<p>To make the infinite ride a bit more fun, the amusement park gives a price if the two riders on the slides manage to pass a ball between them at some point. This price consists of a lot of chocolate, which is Beata&#39;s favourite treat. To maximize their chances of passing the ball successfully, they want to wait until their Euclidean distance is the smallest possible during the ride. How small will this distance be?</p>

### 입력

<p>The first and only line of the input contains the decimal number $0 \le W \le 1000$. The number contains at most $6$ digits after the decimal point.</p>

### 출력

<p>Output a single number -- the minimal Euclidean distance between Agneta and Beata during their trip. Your answer will be accepted if it is within a relative or absolute error of $10^{-4}$ of the judges&#39; answer.</p>