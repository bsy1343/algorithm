# [Silver III] You be The Judge, Again - 22934

[문제 링크](https://www.acmicpc.net/problem/22934)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB (추가 메모리 없음)

### 통계

제출: 140, 정답: 88, 맞힌 사람: 55, 정답 비율: 58.511%

### 분류

구현

### 문제 설명

<p>You are a judge, again! The contest you&#39;re judging includes the following problem:</p>

<blockquote>
<p>You have one L-shaped triomino of each of $\frac{4^n-1}{3}$ different colors. Tile a $2^n$ by $2^n$ grid using each of these triominos such that there is exactly one blank square and all other squares are covered by exactly one square of such a triomino. All triominos must be used.&quot;</p>
</blockquote>

<p>Your team is to write a checker for this problem. &nbsp;Validation of the input values and format has already taken place. &nbsp;You will be given a purported tiling of a $2^n$ by $2^n$ grid, where each square in the grid is either 0 or a positive integer from $1$ to $\frac{4^n-1}{3}$ representing one of the colors. Determine if it is, indeed, a covering of the grid with $\frac{4^n-1}{3}$ unique triominos and a single empty space.</p>

<p>L-shaped triominos look like this:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/22934.%E2%80%85You%E2%80%85be%E2%80%85The%E2%80%85Judge%2C%E2%80%85Again/dcc02d91.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/22934.%E2%80%85You%E2%80%85be%E2%80%85The%E2%80%85Judge%2C%E2%80%85Again/dcc02d91.png" data-original-src="https://upload.acmicpc.net/6b7a04c0-bd7d-4957-a211-27e0c3bca9cb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 228px; height: 34px;" /></p>

### 입력

<p>The first line of input contains a single integer $n$ ($1 \le n \le 10$), which is the $n$ of the description.</p>

<p>Each of the next $2^n$ lines contains $2^n$ integers $x$ ($0 \le x \le \frac{4^n-1}{3}$), where 0 represents an empty space, and any positive number is a unique identifier of a triomino.</p>

### 출력

<p>Output a single integer, which is $1$ if the given grid is covered with $\frac{4^n-1}{3}$ unique triominos and a single empty space. Otherwise, output $0$.</p>