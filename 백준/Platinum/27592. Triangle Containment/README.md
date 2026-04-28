# [Platinum III] Triangle Containment - 27592

[문제 링크](https://www.acmicpc.net/problem/27592)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 27, 맞힌 사람: 27, 정답 비율: 75.000%

### 분류

자료 구조, 기하학, 세그먼트 트리, 정렬

### 문제 설명

<p>You recently discovered there is treasure buried on your farm land. A <strong>lot</strong> of treasure! You quickly decide to put a fence around the land.</p>

<p>Alas, you have but a single fence post! You will have to drive to town to get more fencing material. But you can&#39;t just leave the land as open as it is, so you decide to create a makeshift fence to protect some of the treasure while you are gone. You will place the post in the ground and run some wire in a straight line between two sides of your barn wall and the fence post to section off a triangular area. Also, the ground is very hard: only places that were dug up to bury a treasure are soft enough for you to quickly place the fence post.</p>

<p>To figure out the best option, you first calculate the following. For each of the treasures in your field, if you were to place the fence post at that treasure and complete the fence as described, then what is the total value of all treasures that would be enclosed by the fence? Note that the treasure under the post you place is not considered enclosed by the fence (it might not be safe since someone could dig around the post).</p>

<p>Sample Input 1 is illustrated below. The triangle that includes the point $(-1,10)$ encloses exactly two other treasure points which have total value $4+8=12$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27592.%E2%80%85Triangle%E2%80%85Containment/d01a2145.png" data-original-src="https://upload.acmicpc.net/05721e9e-9c7a-4805-b22f-9275bb97d99e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 331px;" /></p>

### 입력

<p>The first line of input contains two integers $n$ ($1 \leq n \leq 10^5$) and $x$ ($1 \leq x \leq 10^9$), where $n$ is the number of treasure points and $x$ fixes the two corners of the barn wall at locations $(0,0)$ and $(x,0)$.</p>

<p>Each of the next $n$ lines contains three integers $x$, $y$, and $v$ ($-10^9 \leq x \leq 10^9$, $1 \leq y \leq 10^9$, and $1 \leq v \leq 10^9$) giving the location $(x,y)$ and value $v$ of one of the treasure points. All of these points are distinct. It is also guaranteed that for each point, the triangle formed with the barn wall will not contain any other treasure point on its boundary.</p>

### 출력

<p>Output $n$ lines, one for each treasure point in the order of the input. For each point output a single integer, which is the total value of all points in the interior of the triangle that point forms with the barn wall. Note that the value of the point itself should be excluded from this sum.</p>