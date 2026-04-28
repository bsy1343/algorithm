# [Gold III] Knapsack Packing - 17552

[문제 링크](https://www.acmicpc.net/problem/17552)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 240, 정답: 60, 맞힌 사람: 37, 정답 비율: 20.109%

### 분류

자료 구조, 정렬, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>One of the most difficult things about going on a holiday is making sure your luggage does not exceed the maximum weight. You, chairman of the Backpacker&rsquo;s Association for Packing Carry-ons, are faced with exactly this problem. You are going on a lovely holiday with one of your friends, but now most of your time is spent in frustration while trying to pack your backpack. In order to optimize this process, you and your friend have independently set upon trying to find better ways to pack.</p>

<p>After some time you have a serious breakthrough! Somehow you managed to solve the Knapsack problem in polynomial time, defying expectations everywhere. You are not interested in any theoretical applications, so you immediately return to your friend&rsquo;s apartment in order to now quickly pack your backpack optimally.</p>

<p>When you arrive there, you find that your friend has set upon her own solution, namely to enumerate all possible packings. This means that all items you possibly wanted to bring are scattered across the entire apartment, and it would take a really long time to get all the items back together.</p>

<p>Luckily you can use the work your friend has done. For every possible subset of items that you can possibly bring, she has written down the total weight of these items. Alas, she did not write down what items were part of this total, so you do not know what items contributed to each total weight. If the original weights of the items formed a collection (a<sub>1</sub>, ..., a<sub>n</sub>) of non-negative integers, then your friend has written down the multiset,</p>

<p style="text-align: center;">\[S\left(\left(a_1, \dots, a_n\right)\right)&nbsp;:= \left\{ \sum_{i \in I}{a_i}&nbsp;&nbsp;\mid I \subseteq \left\{ 1, \dots , n \right\} \right\}\text{ .}&nbsp;\]</p>

<p>For example, if your friend had two items, and the weights of those two items are 2, 3, then your friend has written down</p>

<ul>
	<li>0, corresponding to the empty set {};</li>
	<li>2, corresponding to the subset {2};</li>
	<li>3, corresponding to the subset {3};</li>
	<li>5, corresponding to the subset {2, 3}.</li>
</ul>

<p>You want to reconstruct the weights of all the individual items so you can start using your Knapsack algorithm. It might have happened that your friend made a mistake in adding all these weights, so it might happen that her list is not consistent.</p>

### 입력

<ul>
	<li>One line containing a single integer 1 &le; n &le; 18 the number of items.</li>
	<li>2<sup>n</sup> lines each containing a single integer 0 &le; w &le; 2<sup>28</sup>, the combined weight of a subset of the items. Every subset occurs exactly once.</li>
</ul>

### 출력

<p>Output non-negative integers a<sub>1</sub>, ... , a<sub>n</sub> on n lines in non-decreasing order such that S((a<sub>1</sub>, ... , a<sub>n</sub>)) = {b<sub>1</sub>, ... , b<sub>2<sup>n</sup></sub>}, provided that such integers exist. Otherwise, output a single line containing impossible.</p>