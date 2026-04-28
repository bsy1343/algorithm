# [Platinum I] Goose, Goose, DUCK? - 28170

[문제 링크](https://www.acmicpc.net/problem/28170)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 51, 정답: 27, 맞힌 사람: 26, 정답 비율: 66.667%

### 분류

자료 구조, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리, 스위핑

### 문제 설명

<p>In the game &#39;Goose Goose Duck&#39;, the geese&#39;s target is to complete the tasks and stay alive. However the saboteurs, ducks, will try to stop the geese from completing the tasks by killing them.</p>

<p>Now consider a game consisting of $n$ geese and $k$ ducks. The geese are numbered from $1$ to $n$, and the $i$-th goose can complete the task numbered $a_i$. The geese decided to dispatch an interval of geese to complete the task, which means they will choose two integers $\ell$ and $r$, satisfying $1\leq \ell\leq r\leq n$, and all geese numbered $i$ which satisfy that $\ell\leq i\leq r$ will go to complete their task. Such a decision is called a plan, two plans are considered different if and only if the interval is different.</p>

<p>Different tasks have different locations. The ducks will crouch at a task location, and kill all the geese trying to complete the task at this location. They can not choose a task location where more than $k$ geese will come, because they can&#39;t kill them all and there will be witnesses, they also can not choose a task location where less than $k$ geese will come, because they will kill their teammates by mistake. In other words, they can only choose a task location where exactly $k$ geese will come. </p>

<p>A plan is said to be dangerous if and only if there exists a task location that the ducks can ambush. Please help the geese to count how many plans are <strong>not dangerous</strong> for the geese. Please notice that the geese do not have to complete all the tasks with the plan.</p>

### 입력

<p>The first line contains two integers $n$ and $k$ ($1\leq n,k\leq 10^6$).</p>

<p>The second line contains $n$ integers, the $i$-th integer $a_i$ ($1\leq a_i\leq 10^6$) denotes the task number of the goose numbered $i$.</p>

### 출력

<p>Output one line containing one integer, denoting the answer.</p>