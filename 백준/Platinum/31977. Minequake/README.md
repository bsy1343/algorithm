# [Platinum II] Minequake - 31977

[문제 링크](https://www.acmicpc.net/problem/31977)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 10, 맞힌 사람: 9, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬, 트리, 트리에서의 다이나믹 프로그래밍, 트리에서의 전방향 다이나믹 프로그래밍

### 문제 설명

<p>The fully autonomous microbreweries installed in the abandoned Dwarven mines of Moravia are truly a testament to the ingenuinity and craftsmanship of Dwarven engineering! Alas, sometimes earthquakes rattle the mines, leading to misaligned pipes and funnels spilling precious liquid on the floor. As the Exalted Warden of Brewery Safety it is your responsibility to turn off the machines in every hall in case of an earthquake.</p>

<p>Walking through tunnels takes time, so you will inevitably arrive late at many of the machines. This cannot be avoided, but you want to minimise the total amount of spilled liquid.</p>

<p>The Dwarven mines consist of $n$ halls connected by $n-1$ tunnels. The entire system is connected, so it is possible to get from any hall to any of the others. It takes $1$ unit of time to traverse a tunnel. Switching off a machines and traversing a hall takes no time. In each hall, turning off the machines at time $t$ after the earthquake spills $t$ liters of liquid. There is exactly one earthquake, the earthquake affects all halls at the same time, and you may not switch off any machines before the earthquake. You can start in any of the halls.</p>

<p>In sample input $1$, the mines look like this:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31977.%E2%80%85Minequake/51cc6d65.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31977.%E2%80%85Minequake/51cc6d65.png" data-original-src="https://upload.acmicpc.net/609dd33c-d7b1-487a-b045-c8171b76abfd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 176px; height: 50px;" /></p>

<p>If you start in hall $2$ and visit the rest of the halls in the order $2$, $1$, $2$, $3$, then you can switch off their machines at time $0$ (in hall $2$), time $1$ (in hall $1$), and time $3$ (in hall $3$). This wastes $0+1+3=4$ liters of liquid in total. If instead you start in hall $1$ and visit the halls in the order $1$, $2$, $3$, the total amount of liquid wasted is $0+1+2=3$ liters, which is better.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31977.%E2%80%85Minequake/3fe7faa3.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31977.%E2%80%85Minequake/3fe7faa3.png" data-original-src="https://upload.acmicpc.net/fef6d2b1-95ef-4360-8845-a73811e5842e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 240px; height: 150px;" /></p>

### 입력

<p>The first line of input consists of the integer $n$, denoting the number of halls. We assume that the halls are numbered $1$, $\ldots$, $n$. The next $n-1$ lines each contain two space-separated integers $u$ and $v$ with $1\leq u &lt; v \leq n$, meaning that there is a tunnel between hall $u$ and hall $v$.</p>

### 출력

<p>Print a single integer: the minimum amount of spilled liquid, in liters.</p>

### 제한

<p>We always have $1\leq n\leq 10^5$.</p>