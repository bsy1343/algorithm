# [Bronze III] Teleportation - 15751

[문제 링크](https://www.acmicpc.net/problem/15751)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 2359, 정답: 1406, 맞힌 사람: 1301, 정답 비율: 59.816%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>One of the farming chores Farmer John dislikes the most is hauling around lots of cow manure. In order to streamline this process, he comes up with a brilliant invention: the manure teleporter! Instead of hauling manure between two points in a cart behind his tractor, he can use the manure teleporter to instantly transport manure from one location to another.</p>

<p>Farmer John&#39;s farm is built along a single long straight road, so any location on his farm can be described simply using its position along this road (effectively a point on the number line). A teleporter is described by two numbers $x$ and $y$, where manure brought to location $x$ can be instantly transported to location $y$, or vice versa.</p>

<p>Farmer John wants to transport manure from location $a$ to location $b$, and he has built a teleporter that might be helpful during this process (of course, he doesn&#39;t need to use the teleporter if it doesn&#39;t help). Please help him determine the minimum amount of total distance he needs to haul the manure using his tractor.</p>

### 입력

<p>The first and only line of input contains four space-separated integers: $a$ and $b$, describing the start and end locations, followed by $x$ and $y$, describing the teleporter. All positions are integers in the range $0 \ldots 100$, and they are not necessarily distinct from each-other.</p>

### 출력

<p>Print a single integer giving the minimum distance Farmer John needs to haul manure in his tractor.</p>

### 힌트

<p>In this example, the best strategy is to haul the manure from position 3 to position 2, teleport it to position 8, then haul it to position 10. The total distance requiring the tractor is therefore 1 + 2 = 3.</p>