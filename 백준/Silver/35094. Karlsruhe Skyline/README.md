# [Silver III] Karlsruhe Skyline - 35094

[문제 링크](https://www.acmicpc.net/problem/35094)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 25, 정답: 20, 맞힌 사람: 20, 정답 비율: 80.000%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p><em>Skyscrapers</em> is a grid logic puzzle in which numbers from $1$ to $n$ have to be placed into an $n\times n$ grid. Each number needs to appear exactly once in each row and column. These numbers are to be thought of as skyscrapers which are the respective number of units tall. The rows and columns may have clue numbers on either end which describe the number of visible skyscrapers when looking down that row or column from that position, where taller buildings block the view of any shorter buildings behind them.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/35094.%E2%80%85Karlsruhe%E2%80%85Skyline/eacd999d.png" data-original-src="https://boja.mercury.kr/assets/problem/35094-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 188px;"></p>

<p style="text-align: center;">Figure K.1: Illustration of Sample Output 1. Two buildings (1 and 5) are visible from the left and two buildings (4 and 5) are visible from the right.</p>

<p>In this problem we consider only a single row of a Skyscrapers grid which has clue numbers on both ends. Find out whether it is possible to place the skyscrapers from $1$ to $n$ in this row to satisfy both clues, and if so, find a valid placement.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with three integers $n$, $a$ and $b$ ($2 \le n \le 1000$, $1 \le a,b \le n$), the length of the row and the clues on the left and right.</li>
</ul>

### 출력

<p>If a valid placement exists, output "<code>yes</code>", followed by $n$ distinct integers $h_1,\dots,h_n$ ($1 \le h_i \le n$ for each $i$), the building heights from left to right.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>

<p>If no valid placement exists, output "<code>no</code>".</p>