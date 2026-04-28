# [Gold V] Gas and Minerals - 31103

[문제 링크](https://www.acmicpc.net/problem/31103)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 24, 맞힌 사람: 17, 정답 비율: 94.444%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>An Artifact that could turn the tide of the war was discovered in one of the distant Terran colonies. Meanwhile, the intelligence service reports that a Zerg swarm is moving towards the colony. It is necessary to protect the Artifact at all costs before the arrival of reinforcements.</p>

<p>You have $m$ units of minerals and $g$ units of Vespen gas. In addition, there are $n$ types of defensive buildings available for construction. A building of type $i$ requires $a_i$ units of minerals and $b_i$ units of gas to construct, and increases the defenses of the base by $c_i$ units. You can construct any number of buildings (including zero) of any type, provided that the total costs of minerals and gas for all buildings will not exceed $m$ and $g$, respectively.</p>

<p>Determine what the maximum total building defense capability can be achieved under the given constraints.</p>

### 입력

<p>The first line contains three integers $m$, $g$ and $n$ --- the number of available units of minerals and gas, respectively, and the number of building types ($0 \le m \le 1000$, $0 \le g \le 1000$, $1 \le n \le 10$).</p>

<p>The $i$ th of the following $n$ lines contains three integers $a_i$, $b_i$ and $c_i$ --- the amount of units of mineral and gas are needed to construct a building of the $i$-th type and its defenses ($1 \le a_i \le 100$, $0 \le b_i \le 100$, $0 \le c_i \le 100$).</p>

### 출력

<p>Print a single integer --- the maximum total building defense capability that can be achieved.</p>

### 힌트

<p>In the first example, the optimum is provided by the construction of one building of type $2$ and one building of type $3$.</p>

<p>In the second example, it is most profitable to construct one building of type $1$ and two buildings of type $3$.</p>