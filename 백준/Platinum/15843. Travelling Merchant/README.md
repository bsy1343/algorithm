# [Platinum I] Travelling Merchant - 15843

[문제 링크](https://www.acmicpc.net/problem/15843)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 170, 정답: 49, 맞힌 사람: 34, 정답 비율: 24.460%

### 분류

플로이드–워셜, 그래프 이론, 매개 변수 탐색, 최단 경로

### 문제 설명

<p>After many days&#39; journey through the great Australian outback, you have finally arrived at the great city of Cobar with nothing but a small backpack. Enamoured by the wonder and beauty of its markets, you decide to become a merchant and make Cobar your new home. Cobar has N markets, numbered from 1 to N, connected by M one-way footpaths, each taking a particular number of minutes to walk along.</p>

<p>The markets of Cobar trade in K different items, numbered from 1 to K. Each market has a fixed price for buying or selling each item. Not every market will trade in every item, and it is possible that for any given item, a market may only support buying it, but not selling it, or vice-versa. You may assume that each market that has a given item for sale has an infinite quantity of it available, and similarly, if a market wants to buy a given item, it is willing to buy it repeatedly, forever.</p>

<p>To earn money as quickly as possible, you would like to find the most efficient profit cycle. A profit cycle is a walk through Cobar that starts at some market v with your backpack empty, continues along Cobar&#39;s footpaths and through its markets (possibly buying and selling items along the way), and finally returns to v, again with an empty backpack. It may visit a market and/or walk along a footpath multiple times. Once an item is bought, it must be placed immediately in your backpack and since your backpack is small, it can only hold up to a single item at any point in time. You may assume that you are always able to buy an item if it is available, regardless of the amount of money you possess so far and that you are prohibited from selling an item that you do not possess.</p>

<p>The profit earned from such a cycle is the total amount of money you earned from selling items, minus the total amount of money you spent buying them. The duration of a cycle is the total number of minutes you spend walking along its constituent footpaths. The efficiency of a profit cycle is the profit earned from it, divided by its duration. Note that a profit cycle that does not involve buying or selling any items has an efficiency of 0.</p>

<p>Your task is to find the maximum efficiency among all profit cycles with strictly positive duration. You should report this value rounded down, to the nearest integer. If no such profit cycle exists, you should report 0.</p>

### 입력

<p>Your program should read from standard input.</p>

<p>The first line will contain 3 integers, N, M and K : the number of markets, footpaths and items respectively.</p>

<p>N lines follow. The ith of these lines contains 2K integers B<sub>i,1</sub>, S<sub>i,1</sub>, B<sub>i,2</sub>, S<sub>i,2</sub>, ..., B<sub>i,K</sub>, S<sub>i,K</sub> describing a market. For all 1 &le; j &le; K, the pair of integers B<sub>i,j</sub> and S<sub>i,j</sub> describe the price at which you can buy and sell item j at market i, respectively. If an item cannot be bought or sold, then -1 will be used as a placeholder.</p>

<p>M lines follow. The pth of these contains 3 integers, V<sub>p</sub>, W<sub>p</sub> and T<sub>p</sub>, describing a one-way footpath from market V<sub>p</sub> to another market W<sub>p</sub>, taking T<sub>p</sub> minutes to traverse.</p>

### 출력

<p>Your program should write to standard output.</p>

<p>Print a single integer, the maximum efficiency among all profit cycles, rounded down to the nearest integer.</p>

### 제한

<p>For all subtasks, 1 &le; N &le; 100, 1 &le; M &le; 9,900, 1 &le; K &le; 1,000, and for all items which can be bought/sold, 0 &lt; S<sub>i,j</sub> &le; B<sub>i,j</sub> &le; 1,000,000,000 for all 1 &le; i &le; N and for all 1 &le; j &le; K. Additionally, V<sub>p</sub> &ne; W<sub>p</sub> and 1 &le; T<sub>p</sub> &le; 10,000,000 for all 1 &le; p &le; M, and there does not exist any pair of edges 1 &le; p &lt; q &le; M such that (V<sub>p</sub>, W<sub>p</sub>) = (V<sub>q</sub>, W<sub>q</sub>).</p>

### 힌트

<p>In the sample case there are two cycles we will consider, &quot;1 to 2 to 3 to 1&quot; and &quot;1 to 4 to 3 to 1&quot;.</p>

<p>Considering &quot;1 to 2 to 3 to 1&quot;, we see that this cycle takes 7 minutes to walk over (3 + 3 + 1). The most profitable sequence of trades on this cycle is to purchase item 2 at market 1 (cost of 5), sell it at market 2 (profit of 15), immediately buy item 1 from market 2 (cost of 6), carry item 1 through market 3, and finally sell item 1 at market 1 (profit of 9). Therefore in this cycle we can make -5 + 15 - 6 + 9 = 13 profit in this profit cycle. 13/7 rounded down gives an efficiency of 1 for this cycle.</p>

<p>Considering &quot;1 to 4 to 3 to 1&quot;, we see that this cycle takes 3 minutes to walk over (1 + 1 + 1). The most profitable sequence of trades on this cycle is to purchase item 2 at market 1 (cost of 5), sell it at market 4 (profit of 11), then walk through market 3 and back to market 1. Therefore in this cycle we can make -5 + 11 = 6 profit in this profit cycle. 6/3 rounded down gives an efficiency of 2 for this cycle.</p>

<p>Therefore the best efficiency of any profit cycle in Cobar is 2.</p>