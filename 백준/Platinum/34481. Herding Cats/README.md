# [Platinum IV] Herding Cats - 34481

[문제 링크](https://www.acmicpc.net/problem/34481)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 55, 정답: 34, 맞힌 사람: 19, 정답 비율: 55.882%

### 분류

그리디 알고리즘

### 문제 설명

<p>You are opening a cat cafe in Baku and would like to take a promotional photograph of all the cats sitting in the front window. Unfortunately, getting cats to do what you want is a famously hard problem. But you have a plan: you have bought a collection of $m$ catnip plants, each of a different variety, knowing that each cat likes some of these varieties. There is a row of $m$ pots in the window, numbered $1$ to $m$ in order, and you will place one plant in each pot. Each cat will then be persuaded (by means of a toy on a string) to walk along the row of pots from $1$ to $m$. As soon as a cat reaches a pot with a catnip plant that it likes, it will stop there, even if there already are other cats at that plant.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34481.%E2%80%85Herding%E2%80%85Cats/0a821be1.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34481-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 560px; height: 275px;"></p>

<p style="text-align: center;">Figure F.1: One possible plant ordering for the first sample test case.</p>

<p>You know which pot you would like each cat to stop beside. Can you find a way in which to place the plants in the pots to achieve this?</p>

### 입력

<p>The first line of input contains an integer $t$ ($1 ≤ t ≤ 10\, 000$), which is the number of test cases. The descriptions of $t$ test cases follow.</p>

<p>The first line of each test case contains two integers $n$ and $m$, where $n$ ($1 ≤ n ≤ 2 \cdot 10^5$) is the number of cats, and $m$ ($1 ≤ m ≤ 2 \cdot 10^5$) is the number of catnip plants (and also the number of pots). Catnip plants are numbered from $1$ to $m$.</p>

<p>The following $n$ lines each describe one cat. The line starts with two integers $p$ and $k$, where $p$ ($1 ≤ p ≤ m$) is the pot at which the cat should stop, and $k$ ($1 ≤ k ≤ m$) is the number of catnip plants the cat likes. The remainder of the line contains $k$ distinct integers, which are the numbers of the plants that the cat likes.</p>

<p>Over all test cases, the sum of $n$ is at most $2 \cdot 10^5$, the sum of $m$ is at most $2 \cdot 10^5$, and the sum of all $k$ is at most $5 \cdot 10^5$.</p>

### 출력

<p>For each test case, output either <code>yes</code> if it is possible to arrange the catnip plants as described above, or <code>no</code> if not.</p>