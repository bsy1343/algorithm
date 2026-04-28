# [Platinum III] Cars - 7741

[문제 링크](https://www.acmicpc.net/problem/7741)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 8, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 구현, 시뮬레이션

### 문제 설명

<p>Traffic jam is a real nightmare of all drivers. Nobody likes to be stuck in the overfilled streets, when the cars move very slowly, if they even move at all. Professional drivers face traffic jams quite often. Can you help them to find the way out of the traffic jam?</p>

<p>We can model a small (but complicated) traffic jam on a 6 x 6 grid of squares. Vehicles (cars and trucks) are scattered over the grid at integer locations, as shown below. Both types of vehicles are 1 square wide. Cars are 2 squares long, and trucks are 3 squares long. Vehicles may be oriented either horizontally (East-West) or vertically (North-South) relative to the grid.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7741.%E2%80%85Cars/d773b7c9.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/7741.%E2%80%85Cars/d773b7c9.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7741/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:167px; width:218px" /></p>

<p>Vehicles cannot cannot move through each other, cannot turn, and cannot move over the edge of the grid. They can move in their direction (horizontally-oriented vehicles cannot move vertically and vice versa), as long as they are not blocked by another vehicle or by the edge of the grid. Only one vehicle may move in a single step, but it may move by as many squares at a time as possible, providing there is enough empty space.</p>

<p>Our goal is to move vehicles back and forth until a particular horizontally-oriented vehicle (your own car &mdash; the black one on the picture above) leaves the rightmost (eastern-most) edge of the grid, where it is considered to have escaped the traffic jam. You are to write a program that will find a solution requiring the minimum possible number of moves.</p>

<p style="text-align: center;">&nbsp;</p>

<p>&nbsp;</p>

### 입력

<p>The input&nbsp;contains the description of one traffic jam. On the first line there is a single integer n (1 &le; n &le;&nbsp;10) giving the number of vehicles in the traffic jam. The input continues with n lines, each of them containing a description of one vehicle. The first character of the vehicle description is either h (meaning that the vehicle is oriented horizontally) or v (the vehicle is oriented vertically). It is followed by a space and two integers r, c (1 &le; r, c &le; 6) separated by a space. The integers specify the upper-left square occupied by the vehicle. Finally there is a space and either the character c or t determining whether the vehicle is a car or a truck. The first vehicle in the description is the one that should leave the grid and you can assume that it is a car and that it is oriented horizontally.</p>

### 출력

<p>The output should contain the minimal number of moves needed to move the first car out of grid over its right end, or the string &#39;The car is trapped.&#39; in case it is not possible to move the first car out.</p>