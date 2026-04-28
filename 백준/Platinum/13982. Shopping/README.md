# [Platinum II] Shopping - 13982

[문제 링크](https://www.acmicpc.net/problem/13982)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 131, 정답: 65, 맞힌 사람: 49, 정답 비율: 52.688%

### 분류

수학, 자료 구조, 이분 탐색, 오프라인 쿼리, 희소 배열, 불변량 찾기

### 문제 설명

<p>The sale bin of Big Box Bargains contains n products in a row. The ith item has price a<sub>i</sub> per unit. There is no limit to the quantity of any item.</p>

<p>There are q customers who will enter the store to buy items. The ith customer has v<sub>i</sub> dollars, starts at item l<sub>i</sub> and walks to the right to item r<sub>i</sub> (inclusive), one item at a time.</p>

<p>Each time they encounter an item, they will buy as many units of the item as they can afford.</p>

<p>You are now wondering, for each customer, how much money they will have left after buying items.</p>

### 입력

<p>The first line of input contains two space-separated integers n and q (1 &le; n, q &le; 200,000).</p>

<p>The next line of input contains n space-separated integers a<sub>i</sub> (1 &le; a<sub>i</sub> &le; 10<sup>18</sup>).</p>

<p>Each of the next q lines contains three space-separated integers v<sub>i</sub> (1 &le; v<sub>i</sub> &le; 10<sup>18</sup>), l<sub>i</sub> , and r<sub>i</sub> (1 &le; l<sub>i</sub> &le; r<sub>i</sub> &le; n).</p>

### 출력

<p>For each of the q customers, print, on a single line, a single integer indicating the remaining amount of money after shopping.</p>