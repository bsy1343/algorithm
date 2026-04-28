# [Gold II] Crisis at the Wedding - 22266

[문제 링크](https://www.acmicpc.net/problem/22266)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 92, 정답: 54, 맞힌 사람: 51, 정답 비율: 60.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>A famous football player just got married and is holding a party for his wedding guests. The guests are seated at tables around a circular pond in the garden of the player&rsquo;s villa. Each table accommodates exactly the same number of guests, and consecutive tables around the pond are at a unit distance.</p>

<p>At the moment of the traditional Best Man toast a crisis erupted: although the total number of champagne glasses in the guests&rsquo; tables is exactly the number of guests, the glasses could have been distributed unevenly over the tables, with some tables having more glasses than guests and some other tables having fewer glasses than guests.</p>

<p>A single waiter is available to fix the glasses distribution, collecting surplus glasses from tables and delivering them to tables needing glasses. The cost of each glass fix is the distance the waiter carries the glass until he delivers it to a table. The total cost for the operation is the sum of the costs for all glasses. The waiter can start at any table, but the player is superstitious and will only allow the waiter to walk in a strict clockwise or counterclockwise direction when fixing the glasses distribution. That is, once the waiter starts in one direction (clockwise or counterclockwise) he cannot change the direction.</p>

<p>Earn an autographed jersey from the football player by helping him to calculate the smallest possible total cost for fixing the glasses distribution.</p>

### 입력

<p>The first line contains an integer $N$ ($1 \le N \le 10^5$) indicating the number of tables around the circular pond. The second line contains $N$ integers $G_1, G_2, \dots ,G_N$ ($0 \le G_i \le 1000$ for $i = 1, 2, \dots , N$), representing the number of glasses in the different tables. These numbers are given in clockwise order. It is guaranteed that $N$ divides $\sum_{i=1}^{N}{G_i}$.</p>

### 출력

<p>Output a single line with an integer indicating the smallest possible total cost for fixing the glasses distribution.</p>