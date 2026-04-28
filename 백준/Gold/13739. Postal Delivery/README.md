# [Gold III] Postal Delivery - 13739

[문제 링크](https://www.acmicpc.net/problem/13739)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 30, 맞힌 사람: 30, 정답 비율: 81.081%

### 분류

그리디 알고리즘, 구현, 시뮬레이션, 정렬

### 문제 설명

<p>The postal service is interested in cutting costs as an alternative to raising the postage rates. One way to do this is by minimizing the distance traveled when delivering mail from the post office to all the required locations and returning to the post office. It may be that all the mail to be delivered does not fit on the mail truck at once, in which case the distance traveled by the truck must include travel back to the post office to reload. For simplicity, we assume a one dimensional world with the post office at the origin, and delivery locations each identified by a single coordinate. As an example, suppose a postal truck can carry up to 100 letters and that 50 letters need to be delivered to location &minus;10, that 175 need to be delivered to location 10, and 20 delivered to location 25. A maximally efficient plan would be:</p>

<p>Deliver the 50 letters to location &minus;10 (travel 2 &middot; 10), the first 100 letters to location 10 (travel 2 &middot; 10), the remaining 75 letters to location 10 while on the way to delivering the 20 to location 25 (travel 2 &middot; 25). The total round-trip distance traveled is 90.</p>

### 입력

<p>The first line contains two integers, N and K, where 3 &le; N &le; 1000 is the number of delivery addresses on the route, and 1 &le; K &le; 10 000 is the carrying capacity of the postal truck. Each of the following N lines will contain two integers x<sub>j</sub> and t<sub>j</sub> , the location of a delivery and the number of letters to deliver there, where &minus;1500 &le; x<sub>1</sub> &lt; x<sub>2</sub> &lt; &middot; &middot; &middot; &lt; x<sub>N</sub> &le; 1500 and 1 &le; t<sub>j </sub>&le; 800 for all j. All delivery locations are nonzero (that is, none are at the post office).</p>

### 출력

<p>Output the minimum total travel distance needed to deliver all the letters and return to the post office.</p>