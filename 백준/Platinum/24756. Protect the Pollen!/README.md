# [Platinum V] Protect the Pollen! - 24756

[문제 링크](https://www.acmicpc.net/problem/24756)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 121, 정답: 75, 맞힌 사람: 42, 정답 비율: 64.615%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 배낭 문제, 재귀, 트리

### 문제 설명

<p>The Flariana flowers and the bumblebees form one of the nicest partnerships in the rainforest. In spring, several flowers bloom and start producing pollen. Special vines form a network of bridges between the flowers. Using the vines, there is exactly one way to get from each flower to any other flower.</p>

<p>Every flower has a family of bees on it. This family protects all of the vines that touch that flower. This means that every vine is protected by two families. The family on flower $k$ consists of $s_k$ bees and has a pollination power of $p_k$.</p>

<p>One day, a bee scout announced that there is a new flower patch over the hill and they need a group of bees to help pollinate it.</p>

<p>As the bee queen, you must select a set of families to send on the mission. For every vine, at least one of the two families currently protecting it must stay behind so the vine remains protected. All bees in the selected families must go. You are willing to send at most $S$ bees on the mission in total.</p>

<p>Determine the largest total pollination power that you can send on the mission.</p>

### 입력

<p>The first line contains the integer $N$ ($1 \leq N \leq 300$), which is the number of flowers, and $S$ ($1 \leq S \leq 300$), which is the maximum number of bees you can send on the mission. The flowers are numbered $1$ to $N$.</p>

<p>The next $N$ lines describe the families. Each of these lines contains two integers $s_k$ ($1 \leq s_k \leq 300$), which is the number of bees in this family, and $p_k$ ($1 \leq p_k \leq 100$), which is the pollination power of this family.</p>

<p>The last $N-1$ lines describe the vines. &nbsp;Each of these lines contains two distinct integers $u$ ($1 \leq u \leq N$) and $v$ ($1 \leq v \leq N$), indicating that there is a vine between flowers $u$ and $v$.</p>

### 출력

<p>Display the largest total pollination power that you can send on the mission.</p>