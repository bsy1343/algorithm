# [Platinum IV] Auction Market - 21016

[문제 링크](https://www.acmicpc.net/problem/21016)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 20, 맞힌 사람: 18, 정답 비율: 60.000%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색

### 문제 설명

<p>There are N items numbered from 1 to N to be sold at an auction market on a particular day, and the i<sup>th</sup> item has a starting price of S<sub>i</sub>. There are M potential buyers numbered from 1 to M who want to participate in the auction, and the j<sup>th</sup> potential buyer has a budget of B<sub>j</sub>.</p>

<p>Each potential buyer, one by one from the 1<sup>st</sup> to the M<sup>th</sup> potential buyer consecutively, inspects each item, one by one from the 1<sup>st</sup> to the N<sup>th</sup> item consecutively, and decides whether he is able to bid on that item. The j<sup>th</sup> potential buyer is able to bid on the i<sup>th</sup> item if and only if at least one of the following conditions is satisfied.</p>

<ul>
	<li>No one has bid the i<sup>th</sup> item yet and B<sub>j</sub> &ge; S<sub>i</sub>.</li>
	<li>Someone has bid the i<sup>th</sup> item and B<sub>j</sub> is strictly larger than the largest existing bid for that i<sup>th</sup> item.</li>
</ul>

<p>If the j<sup>th</sup> potential buyer is able to bid on the i<sup>th</sup> item, then he will bid that i<sup>th</sup> item at B<sub>j</sub> and stop inspecting the remaining items, i.e. he will ignore the (i + 1)<sup>th</sup> to N<sup>th</sup> items. With this behavior, each potential buyer will only bid at most 1 item. Note that it is also possible for a potential buyer to fail to bid on any item at all, i.e. when his budget is too low.</p>

<p>At the end of the day, after all the potential buyers have either placed their bid or inspected all items, the highest bid for each item is determined and the items are sold to the respective highest bidder. Items that do not have any bidder are not sold.</p>

<p>Your task is to find out how many items are successfully sold at the end of the day.</p>

### 입력

<p>Input begins with a line containing an integer: N (1 &le; N &le; 100 000) representing the number of items to be sold at the auction market. The second line contains N integers: S<sub>i</sub> (1 &le; S<sub>i</sub> &le; 10<sup>9</sup>) representing the starting price of each item. The third line contains an integer M (1 &le; M &le; 100 000) representing the number of potential buyers. The fourth line contains M integers: B<sub>j</sub> (1 &le; B<sub>j</sub> &le; 10<sup>9</sup>) representing the budget of each potential buyer.</p>

### 출력

<p>Output in a line an integer representing the number of items that are successfully sold at the end of the day.</p>