# [Platinum II] Redistricting - 17018

[문제 링크](https://www.acmicpc.net/problem/17018)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 323, 정답: 161, 맞힌 사람: 130, 정답 비율: 48.327%

### 분류

다이나믹 프로그래밍, 자료 구조, 덱, 덱을 이용한 구간 최댓값 트릭, 덱을 이용한 다이나믹 프로그래밍

### 문제 설명

<p>The cow mega-city Bovinopolis is redistricting! -- always a contentious political process between the two major cow breeds (Holsteins and Guernseys) living there, since both breeds want to make sure they retain sufficient influence in the Bovinopolis government.</p>

<p>The greater metropolitan area of Bovinopolis consists of a line of $N$ pastures ($1 \leq N \leq 3 \cdot 10^5$), each containing a single cow, which is either a Holstein or a Guernsey.</p>

<p>The government of Bovinopolis wants to divide the greater metropolitan area into some number of contiguous districts, so that each district contains at most $K$ pastures ($1 \leq K \leq N$), and every pasture is contained in exactly one district. Since the government is currently controlled by Holsteins, they want to find a way to redistrict which minimizes the number of Guernsey-majority or tied districts (a district is tied if the number of Guernseys equals the number of Holsteins).</p>

<p>A concerned coalition of Guernseys is trying to figure out how much damage might be done by the government&#39;s redistricting. Help them figure out the worst-case minimum number of districts which are either Guernsey-majority or tied.</p>

### 입력

<p>The first line contains a two space-separated integers $N$ and $K$. The second line contains a string of length $N$. Each character is either &#39;H&#39; or &#39;G&#39;, for Holstein or Guernsey.</p>

### 출력

Please output the minimum possible number of districts that are
Guernsey-majority or tied.