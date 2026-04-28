# [Platinum III] Joys of Trading - 31760

[문제 링크](https://www.acmicpc.net/problem/31760)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 32, 정답: 23, 맞힌 사람: 23, 정답 비율: 74.194%

### 분류

그리디 알고리즘

### 문제 설명

<p>Apolyanka and B&uuml;delsdorf are two small neolithic villages that have recently come into contact. There are $N$ resources, numbered from $1$ to $N$, and each village is capable of independently producing any of them, albeit with different efficiencies. In order to produce one unit of resource $i$, Apolyanka needs $A_i$ person-hours, while B&uuml;delsdorf needs $B_i$ person-hours. Currently Apolyanka is producing $U_i$ units of resource $i$ in each given time period, while B&uuml;delsdorf is producing $W_i$ units.</p>

<p>Each village is currently working at maximum capacity, that is, there is no way they can put more person-hours to work than they are employing now. However, through the recently discovered benefits of trade, it is possible for both villages to produce all the resources they need while reducing the total person-hours worked, and thus becoming able to spend those freed person-hours resting and playing some games. All that is needed is that the villages cooperate, coordinate work and exchange resources among them.</p>

<p>For example, suppose $N = 2$, resource $1$ is wood, resource $2$ is food, $A_1 = 1$, $U_1 = 2$, $B_1 = 4$, $W_1 = 1$, $A_2 = 2$, $U_2 = 1$, $B_2 = 3$, and $W_2 = 4$. Then Apolyanka is doing $4$ person-hours of work: $A_1 \cdot U_1 = 2$ for producing $U_1 = 2$ units of wood, and $A_2 \cdot U_2 = 2$ for producing $U_2 = 1$ unit of food. Similarly, B&uuml;delsdorf is doing $16$ person-hours of work: $B_1 \cdot W_1 = 4$ for producing $W_1 = 1$ unit of wood, and $B_2 \cdot W_2 = 12$ for producing $W_2 = 4$ units of food. Thus, the total production is $U_1 + W_1 = 3$ units of wood and $U_2 + W_2 = 5$ units of food, requiring $4 + 16 = 20$ person-hours.</p>

<p>However, a better organization is possible: Apolyanka could produce $3$ units of wood and $0.5$ units of food, while B&uuml;delsdorf could produce no wood and $4.5$ units of food. The total production of each resource would be the same, but requiring only $3A_1+0.5A_2+0B_1+4.5B_2 = 3 + 1 + 13.5 = 17.5$ person-hours.</p>

<p>Another example with $N = 3$ is $A_1 = 1$, $B_1 = 2$, $A_2 = 2$, $B_2 = 1$, $A_3 = 1$, $B_3 = 1$, and $U_i = W_i = 1$ for $i = 1, 2, 3$. In this case, each village is currently working $4$ person-hours. With a slight reorganization however, they can each work $3$ person-hours while producing the exact same total resources! All that is required is for Apolyanka to produce one less unit of resource $2$ and one more of resource $1$, while B&uuml;delsdorf does the opposite.</p>

<p>Given all of these values, can you compute what is the minimum total number of person-hours that the villages have to work, in order to produce exactly the same total resources? Note that the number of person-hours invested in producing a resource is not required to be integer.</p>

### 입력

<p>The first line contains an integer $N$ ($1 &le; N &le; 10^5$) indicating the number of resources. Each resource is identified by a distinct integer from $1$ to $N$.</p>

<p>The $i$-th of the next $N$ lines describes resource $i$ with four integers $A_i$, $U_i$, $B_i$ and $W_i$ ($1 &le; A_i , U_i , B_i , W_i &le; 1000$ for $i = 1, 2, \dots , N$), as explained in the statement.</p>

### 출력

<p>Output a single line with the minimum total number of person-hours required to produce the resources. The output must have an absolute or relative error of at most $10^{-9 }$.</p>