# [Gold II] Mr. Plow King - 22287

[문제 링크](https://www.acmicpc.net/problem/22287)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 14, 맞힌 사람: 13, 정답 비율: 61.905%

### 분류

그래프 이론, 그리디 알고리즘, 최소 스패닝 트리

### 문제 설명

<p>In the kingdom of Winterfield, there are several cities and each pair of cities is connected by exactly one old dirt road. The king of Winterfield has decided that he will upgrade some of those roads. The set of roads that he upgrades must be such that it is possible to get from any city in the kingdom to any other city via some sequence of upgraded roads.</p>

<p>Because there is so much snow in Winterfield, the king has also decided to plow some of those upgraded roads. The local plow company, <em>Mr. Plow</em>, and the king have agreed on the following: the king labels each of the upgraded roads $1, 2, \dots, m$ (the label of each road is the number of gold pieces it costs to plow that road) and each road must receive a distinct label. Mr. Plow will plow a set of upgraded roads so that it is possible to get from any city to any other city via some sequence of plowed roads. Mr. Plow will select the cheapest possible set of roads that satisfies the above condition.</p>

<p>For example, if the kingdom has six cities and the king decides to upgrade and label the 8 bolded dirt roads as follows, then Mr. Plow will then plow the roads with labels 1, 2, 3, 4 and 6 (costing a total of 16 gold pieces).</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ca841fa7-1fc6-44cc-98ca-8cd379420422/-/preview/" style="width: 569px; height: 180px;" /></p>

<p>The king has decided on the number of roads to upgrade, but he is not sure how to label them, so he has turned to Barney (the kingdom&#39;s mathematician) to help decide. However, the king is unaware that Barney is actually invested in Mr. Plow, so Barney will choose the set of roads to upgrade and how to label them so that the total cost is as large as possible. What is the maximum cost of plowing the roads?</p>

### 입력

<p>The input consists of a single line containing two integers $n$ ($2 \leq n \leq 1\,000\,000$), which is the number of cities, and $m$ ($n-1 \leq m \leq \frac{n(n-1)}{2}$), which is the number of roads to be upgraded.</p>

### 출력

<p>Display the maximum possible cost of plowing the roads following the rules above.</p>