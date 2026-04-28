# [Platinum II] K-value - 19516

[문제 링크](https://www.acmicpc.net/problem/19516)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 256 MB

### 통계

제출: 15, 정답: 3, 맞힌 사람: 3, 정답 비율: 33.333%

### 분류

(분류 없음)

### 문제 설명

<p>There is a country with $N$ cities. All these cities are connected by weighted roads such that there is one simple route between any two cities.</p>

<p>Consider all simple paths which contain between $L$ and $R$ roads (both inclusive). Your task is to find the path among them which has the minimum possible $k$-value.</p>

<p>The $k$-value of a simple path is calculated as follows. Let the number of roads in the path be $r$. Take the list of weights of all $r$ roads in the path and sort it in non-descending order. The $k$-value is then the element number ($\lfloor r / k \rfloor + 1$) of this list.</p>

### 입력

<p>The first line of input contains a single integer $N$ ($1 \le N \le 10^5$). Each of the following $(N - 1)$ lines contains three integers $a$, $b$ and $w$ which represent two cities connected by a road and the weight of the road ($1 \le a, b \le N$, $a \ne b$, $1 \le w \le 10^9$).</p>

<p>The next line contains three integers $k$, $L$ and $R$ ($1 &lt; k &lt; 50$, $1 \le L \le R \le 50$).</p>

### 출력

<p>Print the minimum possible $k$-value of a path which contains between $L$ and $R$ roads, inclusive. If no such path exists, print $-1$.</p>