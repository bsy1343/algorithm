# [Platinum II] Linearville - 15063

[문제 링크](https://www.acmicpc.net/problem/15063)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 10, 맞힌 사람: 9, 정답 비율: 52.941%

### 분류

많은 조건 분기, 수학

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15063.%E2%80%85Linearville/232875b4.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15063.%E2%80%85Linearville/232875b4.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15063/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:261px; width:259px" />The city of Linearville has N parallel two-way streets going in the West-East direction and N parallel two-way streets going in the South-North direction, making up a grid with (N &minus; 1) &times; (N &minus; 1) blocks. The distance between two consecutive parallel streets is either 1 or 5. The Linearville Transit Authority is conducting an experiment and now requires all cars to always follow a path that alternates direction between W-E and S-N at every crossing, meaning they must turn either left or right when reaching a crossing. The LTA is developing a new navigation app and needs your help to write a program to compute the lengths of shortest alternating paths between many pairs of start and target crossings. The alternating path in the figure, as an example for N = 10, is clearly not a shortest alternating path. But beware! Linearville may be huge.</p>

### 입력

<p>The first line contains an integer N (2 &le; N &le; 10<sup>5</sup>) representing the number of streets in each direction. For each direction, the streets are identified by distinct integers from 1 to N starting at the S-W corner of the city. The second line contains N &minus; 1 integers D<sub>1</sub>, D<sub>2</sub>, . . . , D<sub>N&minus;1</sub> (D<sub>i</sub> &isin; {1, 5} for i = 1, 2, . . . , N &minus; 1) indicating the distances between consecutive streets going S-N (that is, D<sub>i</sub> is the distance between street i and street i + 1). The third line contains N &minus; 1 integers E<sub>1</sub>, E<sub>2</sub>, . . . , E<sub>N&minus;1</sub> (E<sub>i</sub> &isin; {1, 5} for i = 1, 2, . . . , N &minus; 1) indicating the distances between consecutive streets going W-E (that is, E<sub>i</sub> is the distance between street i and street i + 1). The fourth line contains an integer Q (1 &le; Q &le; 10<sup>5</sup>) representing the number of shortest path queries. Each of the next Q lines describes a query with four integers A<sub>X</sub>, A<sub>Y</sub> , B<sub>X</sub> and B<sub>Y</sub> (1 &le; A<sub>X</sub>, A<sub>Y</sub>, B<sub>X</sub>, B<sub>Y</sub> &le; N), indicating that the start crossing is (A<sub>X</sub>, A<sub>Y</sub>) and the target crossing is (B<sub>X</sub>, B<sub>Y</sub>); the values A<sub>X</sub> and B<sub>X</sub> are streets going S-N while the values A<sub>Y</sub> and B<sub>Y</sub> are streets going W-E. There are no repeated queries.</p>

### 출력

<p>Output Q lines, each line with an integer indicating the length of a shortest alternating path for the corresponding query of the input.</p>