# [Gold V] Double Rainbow - 23567

[문제 링크](https://www.acmicpc.net/problem/23567)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 1226, 정답: 539, 맞힌 사람: 375, 정답 비율: 43.153%

### 분류

두 포인터

### 문제 설명

<p>Let $P$ be a set of $n$ points on the $x$-axis and each of the points is colored with one of the colors $1, 2, \dots , k$. For each color 𝑖 of the 𝑘 colors, there is at least one point in $P$ which is colored with $i$. For a set $P&#39;$ of consecutive points from $P$, if both $P&#39;$ and $P \backslash P&#39;$ contain at least one point of each color, then we say that $P&#39;$ makes a <em>double rainbow</em>. See the below figure as an example. The set 𝑃 consists of ten points and each of the points is colored by one of the colors $1$, $2$, $3$, and $4$. The set $P&#39;$ of the five consecutive points contained in the rectangle makes a double rainbow.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23567.%E2%80%85Double%E2%80%85Rainbow/6bd8ee83.png" data-original-src="https://upload.acmicpc.net/ad65a8d3-b1e3-4d23-986c-ffb0dfc22e78/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 336px; height: 76px;" /></p>

<p>Given a set $P$ of points and the number $k$ of colors as input, write a program that computes and prints out the minimum size of $P&#39;$ that makes a double rainbow.</p>

### 입력

<p>Your program is to read from standard input. The input starts with a line containing two integers $n$ and $k$ ($1 &le; k &le; n &le; 10,000$), where $n$ is the number of the points in $P$ and $k$ is the number of the colors. Each of the following $n$ lines consists of an integer from $1$ to $k$, inclusively, and the $i$-th line corresponds to the color of the $i$-th point of $P$&nbsp;from the left.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line. The line should contain the minimum size of $P&#39;$ that makes a double rainbow. If there is no such $P&#39;$, print <code>0</code>.</p>