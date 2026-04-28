# [Gold IV] Playing the Slots - 32022

[문제 링크](https://www.acmicpc.net/problem/32022)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 14, 맞힌 사람: 14, 정답 비율: 70.000%

### 분류

브루트포스 알고리즘, 기하학

### 문제 설명

<p>The small nation of Erratica prides itself on defying conventions established by the more &quot;boring&quot; countries around the world. One of their more obvious distinctions lies in the design of their coinage. Believing that a person should be easily able to identify the value a coin in a pocket or change purse by touch alone, Erratica designs its coins as polygons. For stability, the coins are convex -- there are no notches cut into the coins. But the overall shapes themselves can be quite irregular.</p>

<p>Erratica Vending, the only manufacturer of vending machines in the nation, has been sent the design for a new coin to be issued. Their machines are designed so that coins enter through a slot into channel shaped as a rectangular prism with the slot being an open face of the prism. The channel is narrow because the coins are thin, but long enough to contain the entire coin. From the outside of the machine, the slot appears as a rectangular hole.</p>

<p>The company wants to know what would be the smallest slot size they will need so that the new coin can be slipped, after some rotation, into the slot.</p>

### 입력

<p>Input begins with a line containing $N$, the number of sides to the polygonal coin. $3 \leq N \leq 20$.</p>

<p>This is followed by $N$ lines, each containing two real numbers $x$ and $y$, the coordinates of a vertex of the polygon. $0.0 \leq x, y \leq 100.0$</p>

<p>All $N$ vertices will be distinct, and the vertices will be presented in an order proceeding clockwise around the perimeter of the coin.</p>

### 출력

<p>Print a single line with a real number, to two decimal places precision, denoting the minimum slot size allowing the coin to pass through.  Outputs will be accepted that are within $\pm 0.01$ of the judges&#39; answer.</p>