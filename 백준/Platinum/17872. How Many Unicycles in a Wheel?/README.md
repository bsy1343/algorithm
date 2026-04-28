# [Platinum IV] How Many Unicycles in a Wheel? - 17872

[문제 링크](https://www.acmicpc.net/problem/17872)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 21, 맞힌 사람: 18, 정답 비율: 90.000%

### 분류

수학, 다이나믹 프로그래밍, 그래프 이론

### 문제 설명

<p>A Wheel Graph of size n is a cycle of n vertices each of which is connected to a center vertex. Examples of wheel graphs of size 4,5,6 and 8 are shown below:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17872.%E2%80%85How%E2%80%85Many%E2%80%85Unicycles%E2%80%85in%E2%80%85a%E2%80%85Wheel%3F/f3790087.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17872.%E2%80%85How%E2%80%85Many%E2%80%85Unicycles%E2%80%85in%E2%80%85a%E2%80%85Wheel%3F/f3790087.png" data-original-src="https://upload.acmicpc.net/2af40d26-8cc9-4c54-9676-0b8cc7aa4aef/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 446px; height: 139px;" /></p>

<p>A spanning unicycle in a graph, G, is a spanning tree in G with one additional edge added to form a single cycle. Each of the examples below is a spanning unicycle in a wheel graph of size 5:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17872.%E2%80%85How%E2%80%85Many%E2%80%85Unicycles%E2%80%85in%E2%80%85a%E2%80%85Wheel%3F/9d624687.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17872.%E2%80%85How%E2%80%85Many%E2%80%85Unicycles%E2%80%85in%E2%80%85a%E2%80%85Wheel%3F/9d624687.png" data-original-src="https://upload.acmicpc.net/86959321-5825-45da-a8b8-70e7a6c25dbc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 539px; height: 118px;" /></p>

<p>Write a program to compute the number of different unicycles in a wheel graph of size n. Recall that two subgraphs, S1 and S2, of a graph G are different if there is at least one edge of G that is in S1 and not in S2 OR an edge in S2 which is not in S1.</p>

### 입력

<p>Input consists of a single line that contains a decimal integer, m (3 &lt;= m &lt;= 4000), which is the size of the wheel graph to find the number of unicycles of.</p>

### 출력

<p>The single output line consists of the count of unicycles modulo 100007 for the input size m.</p>