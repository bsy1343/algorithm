# [Platinum I] Keep Calm and Sell Balloons - 17539

[문제 링크](https://www.acmicpc.net/problem/17539)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 46, 정답: 37, 맞힌 사람: 31, 정답 비율: 81.579%

### 분류

수학, 다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱, 벌리캠프–매시

### 문제 설명

<p>Walter sells balloons from door to door. Every day he chooses a street in his city and visits every house there, offering his colorful balloons.</p>

<p>Each street in the city of Walter has the same number of houses on both sides, and all the houses in the city are the same size. That way, each street can be viewed as a 2 &times; N matrix, where each cell is a house, and N is the amount of houses along each side of the street.</p>

<p>After choosing the street of the day, Walter visits each house on that street exactly once. He can start his way in any house, but can only move between adjacent houses horizontally, vertically or diagonally.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17539.%E2%80%85Keep%E2%80%85Calm%E2%80%85and%E2%80%85Sell%E2%80%85Balloons/27ae4901.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17539.%E2%80%85Keep%E2%80%85Calm%E2%80%85and%E2%80%85Sell%E2%80%85Balloons/27ae4901.png" data-original-src="https://upload.acmicpc.net/07d19934-e564-4bcc-86c2-2df6a081b069/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 179px; height: 53px;" /></p>

<p>The table above illustrates an example where N = 6. After visiting house number 1, Walter could only proceed immediately to houses number 2, 7, and 8 (that is, if he has not visited them before). And after visiting house number 11, the next house on the way could only be one of 4, 5, 6, 10, or 12.</p>

<p>Today, before leaving home, Walter looked at the city map to count the number of houses on either side of the chosen street. Now he wants to know how many different ways he can visit all the 2N houses on the street, following the rules outlined. Two ways to visit the houses are different if and only if the order of the houses varies: that is, if there are two houses A and B such that A is visited before B in one order and B is visited before A in the other.</p>

### 입력

<p>The input consists of a single line, which contains an integer N (1 &le; N &le; 10<sup>9</sup>).</p>

### 출력

<p>Your program must output a single line, containing an integer, representing the number of different&nbsp;ways to visit all houses in the street. Since this number can be very big, print the remainder of dividing it by 10<sup>9</sup> + 7.</p>