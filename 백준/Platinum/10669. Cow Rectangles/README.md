# [Platinum III] Cow Rectangles - 10669

[문제 링크](https://www.acmicpc.net/problem/10669)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 272, 정답: 92, 맞힌 사람: 69, 정답 비율: 31.222%

### 분류

자료 구조, 세그먼트 트리, 스위핑

### 문제 설명

<p>The locations of Farmer John&#39;s N cows (1 &lt;= N &lt;= 500) are described by distinct points in the 2D plane. &nbsp;The cows belong to two different breeds: Holsteins and Guernseys. &nbsp;Farmer John wants to build a rectangular fence with sides parallel to the coordinate axes enclosing only Holsteins, with no Guernseys (a cow counts as enclosed even if it is on the boundary of the fence). &nbsp;Among all such fences, Farmer John wants to build a fence enclosing the maximum number of Holsteins. &nbsp;And among all these fences, Farmer John wants to build a fence of minimum possible area. &nbsp;Please determine this area. &nbsp;A fence of zero width or height is allowable.</p>

### 입력

<p>The first line of input contains N. &nbsp;Each of the next N lines describes a cow, and contains two integers and a character. The integers indicate a point (x,y) (0 &lt;= x, y &lt;= 1000) at which the cow is located. The character is H or G, indicating the cow&#39;s breed. &nbsp;No two cows are located at the same point, and there is always at least one Holstein.&nbsp;</p>

### 출력

<p>Print two integers. The first line should contain the maximum number of Holsteins that can be enclosed by a fence containing no Guernseys, and second line should contain the minimum area enclosed by such a fence.&nbsp;</p>