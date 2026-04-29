# [Platinum I] Stacking Cups - 34485

[문제 링크](https://www.acmicpc.net/problem/34485)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 40, 정답: 18, 맞힌 사람: 17, 정답 비율: 48.571%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>You have a collection of $n$ cylindrical cups, where the $i$<sup>th</sup> cup is $2i−1$ cm tall. The cups have increasing diameters, such that cup $i$ fits inside cup $j$ if and only if $i &lt; j$. The base of each cup is $1$ cm thick (which makes the smallest cup rather useless as it is only $1$ cm tall, but you keep it for sentimental reasons).</p>

<p>After washing all the cups, you stack them in a tower. Each cup is placed upright (in other words, with the opening at the top) and with the centers of all the cups aligned vertically. The height of the tower is defined as the vertical distance from the lowest point on any of the cups to the highest. You would like to know in what order to place the cups such that the final height (in cm) is your favorite number. Note that all $n$ cups must be used.</p>

<p>For example, suppose $n = 4$ and your favorite number is $9$. If you place the cups of heights $7$, $3$, $5$, $1$, in that order, the tower will have a total height of $9$, as shown in Figure J.1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34485.%E2%80%85Stacking%E2%80%85Cups/0765b79c.png" data-original-src="https://boja.mercury.kr/assets/problem/34485-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 230px; height: 280px;"></p>

<p style="text-align: center;">Figure J.1: Illustration of Sample Output 1.</p>

### 입력

<p>The input consists of a single line containing two integers $n$ and $h$, where $n$ ($1 ≤ n ≤ 2 \cdot 10^5$) is the number of cups and $h$ ($1 ≤ h ≤ 4 \cdot 10^{10}$) is your favorite number.</p>

### 출력

<p>If it is possible to build a tower with height $h$, output the heights of all the cups in the order they should be placed to achieve this. Otherwise, output <code>impossible</code>. If there is more than one valid ordering of cups, any one will be accepted.</p>