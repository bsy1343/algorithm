# [Platinum IV] Canal Crossing - 35074

[문제 링크](https://www.acmicpc.net/problem/35074)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 26, 정답: 24, 맞힌 사람: 24, 정답 비율: 92.308%

### 분류

그래프 이론, 다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>To escape from the Christmas market hassle, you are planning a trip to Venice to see its beautiful canals and its many bridges. Unfortunately, you do not seem to be the only person with that plan, and Venice recently decided to charge for that pleasure. Therefore, you decide that crossing each bridge once is enough for you. Fortunately, every place can be reached from any other using only streets, without crossing any bridges. Interestingly, there is exactly one way to reach any other place using only streets.</p>

<p>After you gathered all this knowledge, now all that is left is to plan a trip that crosses each bridge exactly once. To keep things interesting, you also want to use each street at most once. What is the length of the shortest possible trip? Note that your tour can start at any place you choose, but it has to end where it starts.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35074.%E2%80%85Canal%E2%80%85Crossing/c9ed24b9.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35074-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 178px;"></p>

<p style="text-align: center;">Figure C.1: Illustration of Sample Input 1 with a tour of length $45$.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($3\leq n\leq 10^5$), the number of places in Venice.</li>
<li>$n-1$ lines, each with three integers $a$, $b$, and $w$ ($1\leq a,b\leq n$, $a \neq b$, $1\leq w\leq10^6$), the starting and ending place of each street and its length.</li>
<li>One line with an integer $m$ ($1\leq m\leq5\cdot10^5$), the number of bridges in Venice.</li>
<li>$m$ lines, each with two integers $a$ and $b$ ($1\leq a,b\leq n$, $a \neq b$), the places where each bridge starts and ends.</li>
</ul>

<p>Bridges are short, and thus have length zero.</p>

<p>It is guaranteed that every place can be reached from any other place without using any bridges. Further, no bridge connects two places which are directly connected by a street, and all bridges are between distinct pairs of places. Lastly, it is guaranteed that at least one tour exists that crosses each bridge exactly once and uses every street at most once.</p>

### 출력

<p>Output the length of the shortest tour that crosses all bridges and uses each street at most once.</p>