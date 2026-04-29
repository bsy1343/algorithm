# [Platinum V] To Be Discontinued - 35101

[문제 링크](https://www.acmicpc.net/problem/35101)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 16, 정답: 10, 맞힌 사람: 10, 정답 비율: 62.500%

### 분류

그리디 알고리즘, 트리

### 문제 설명

<p>The year is AD 3000. Humanity enjoys traveling among the stars via the network of interstellar spaceship routes. Due to recent advances in warp drive technology, however, the traditional spaceship routes are being gradually discontinued. You, a nostalgic voyager, have decided to take all the remaining routes before the planned discontinuation.</p>

<p>Currently, the interstellar routes form a tree-structured network among $n$ planets. That is, there are $n − 1$ bidirectional routes each connecting two planets, and by taking such routes several times, you can travel between any pair of planets. However, each route has now been assigned its final boarding time. If you are on a planet at time $t$, and $t$ does not exceed the final boarding time $e$ of a certain route starting there (i.e., $t ≤ e$), you can reach the other end of the route at time $t + 1$. You cannot use the route after the final boarding time.</p>

<p>In addition to the traditional spaceship routes, you can also use the new warp drive technology. Using the warp drive, you can instantly travel from any planet to a destination planet without spending any time, provided that you have already visited that destination at least once! You are currently on one of the n planets. Because you have not visited any other planets prior to this journey, you must first travel to a planet via the spaceship routes before you can warp to it.</p>

<p>Starting your journey at time $0$, can you traverse all the spaceship routes before their respective final boarding times? Since the network forms a tree, the question is equivalent to asking whether you can visit all the planets. If such a journey is possible, find the order in which you should visit the planets.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35101.%E2%80%85To%E2%80%85Be%E2%80%85Discontinued/6e32cbc1.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35101-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 485px; height: 136px;"></p>

<p style="text-align: center;">Figure E.1. The first test case of Sample Input 1</p>

<p>Figure E.1 illustrates the first test case of Sample Input 1. The left part shows the network of interstellar spaceship routes. Each line segment is labeled with an integer representing the final boarding time of the route. The right part shows one way to traverse all the routes. Dotted lines in the right part represent warps, and the notation “$t \dots t + 1$” represents taking the route that departs at time $t$ and arrives at time $t + 1$.</p>

### 입력

<p>The input consists of at most $50$ test cases, each in the following format.</p>

<blockquote>
<p>$n$</p>

<p>$p_2$ $e_2$</p>

<p>$\vdots$</p>

<p>$p_n$ $e_n$</p>
</blockquote>

<p>The integer $n$ ($2 ≤ n ≤ 1000$) on the first line is the number of planets connected by the network of interstellar spaceship routes. The planets are numbered $1$ through $n$ and you are initially on planet $1$. The $2$-nd to the $n$-th lines describe the interstellar spaceship routes, where integers $p_i$ ($1 ≤ p_i &lt; i$) and $e_i$ ($0 ≤ e_i ≤ 1000$) mean that there exists a route between planets $i$ and $p_i$ with the final boarding time $e_i$, for $i = 2, \dots , n$.</p>

<p>The end of the input is indicated by a line consisting only of a zero.</p>

### 출력

<p>For each test case, if it is possible to traverse all the routes meeting their respective final boarding times, output <code>yes</code> in the first line; otherwise, output <code>no</code>.</p>

<p>If that is possible, output in the next line a list of the planet numbers from $2$ to $n$ in the order of your first visits, separated by a space. If there are multiple ways, output any one of them.</p>