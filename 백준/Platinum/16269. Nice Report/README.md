# [Platinum I] Nice Report - 16269

[문제 링크](https://www.acmicpc.net/problem/16269)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 226, 정답: 62, 맞힌 사람: 11, 정답 비율: 10.891%

### 분류

다이나믹 프로그래밍, 그래프 이론, 방향 비순환 그래프, 무작위화, 강한 연결 요소

### 문제 설명

<p>Andrew is analyzing subscription graph in one social network. This graph is directed: if the user a is subscribed to the user b, it is not always the case that the user b is in turn subscribed to the user a.</p>

<p>Andrew&#39;s boss has asked him to find for each user x the number of users y such that it is possible to reach user y from user x in the subscription graph.</p>

<p>There is no reason to find the exact values, they look ugly and are non-relevant almost immediately, so Andrew wants to find approximate values. Find values that differ from the correct ones at most by a factor of two.</p>

### 입력

<p>The first line of input contains two integers n and m (1&thinsp;&le;&thinsp;n,&thinsp;m&thinsp;&le;&thinsp;200&thinsp;000) &mdash; the number of users of the social network and the number of direct subscriptions.</p>

<p>The following m lines describe subscription graph, the i-th of these lines contains two integers a<sub>i</sub> and b<sub>i</sub> (1&thinsp;&le;&thinsp;a<sub>i</sub>,&thinsp;b<sub>i</sub>&thinsp;&le;&thinsp;n, a<sub>i</sub>&thinsp;&ne;&thinsp;b<sub>i</sub>), it means that the user a<sub>i</sub> is subscribed to the user b<sub>i</sub>. Each ordered pair (ai,&thinsp;bi) occurs at most once in the input data.</p>

### 출력

<p>Output n integers q<sub>i</sub> &mdash; for each user print approximate number of users y such that it is possible to reach user y from user i in the subscription graph. If the correct number of such users is z<sub>i</sub>, the following inequalities must be satisfied to have the answer accepted: q<sub>i</sub>&thinsp;&le;&thinsp;2z<sub>i</sub> and z<sub>i</sub>&thinsp;&le;&thinsp;2q<sub>i</sub>. Moreover, you are allowed to bypass this restriction and output any q<sub>i</sub> for no more than 10 users.</p>

<p>Note: judges use exact values to check your answers. However, judges don&#39;t promise that it is possible to find exact values in each test case given time and memory constraints of this problem. They recommend to try to find approximate value.</p>

<p>In the given example it is possible to reach all five users from the user 1. But the given answer 7 is acceptable, it differs from 5 less than by a factor of two. Similarly, the answer 2 is acceptable for the user 4.</p>