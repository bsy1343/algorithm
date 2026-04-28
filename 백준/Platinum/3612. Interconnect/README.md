# [Platinum II] Interconnect - 3612

[문제 링크](https://www.acmicpc.net/problem/3612)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 16, 맞힌 사람: 12, 정답 비율: 54.545%

### 분류

다이나믹 프로그래밍, 기댓값의 선형성, 수학, 확률론

### 문제 설명

<p>There are two serious problems in the Kingdom of Lipshire: the roads and the fools who build them. Once upon a time, the King of Lipshire has decided to improve the road system because some roads became completely impassable &mdash; it was easier to travel cross-country instead of using those roads.</p>

<p>By King&rsquo;s decree, new roads are to be built in Lipshire. Of course, the new road system must interconnect all towns, i. e. there must be a path connecting any two towns of Lipshire.</p>

<p>The road administration of Lipshire has resources to build exactly one road per year. Unfortunately, the fools who build these roads are completely out of control. So, regardless of the orders given, the fools randomly select two different towns a and b and build a road between them, even when those towns are already connected by a road. All possible choices are equiprobable. The road is build in such a manner that the only points where a traveler can leave it are the towns connected by this road. The only good thing is that all roads are bidirectional.</p>

<p>The King knows about the problem, but he cannot do anything about it. The only thing King needs to know is the expected number of years to wait before the road system of Lipshire becomes interconnected. He asked you to provide this information.</p>

### 입력

<p>The first line of the input contains two integers n and m (2 &le; n &le; 30, 0 &le; m &le; 1 000) &mdash; the number of towns in Lipshire, and the number of roads which are still good. The following m lines describe roads, one per line. Each road is described with two endpoints &mdash; two integer numbers ui and vi (1 &le; ui, vi &le; n, ui &ne; vi). There can be multiple roads between two towns, but the road from a town to itself is not allowed.</p>

### 출력

<p>Output the expected number of years to wait for the interconnected road system. If the system is already interconnected, output zero as an answer. Output the number with at least six precise digits after the decimal point.</p>