# [Gold II] Milano C.le - 31271

[문제 링크](https://www.acmicpc.net/problem/31271)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 48, 정답: 34, 맞힌 사람: 28, 정답 비율: 70.000%

### 분류

자료 구조, 그리디 알고리즘, 이분 탐색, 트리를 사용한 집합과 맵, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>Silvia is at the Milano Centrale railway station and she noticed that the station has a lot of platforms. She thought that there are too many of them, so she decided to check how many of them are actually needed.</p>

<p>Silvia also noticed an interesting fact that holds at this station: the schedule of arrivals and departures repeats every two days, and additionally, the schedule is such that all $n$ trains arrive at the station on one day, and leave the station on the other day. Note that in this way no train will leave before all trains have arrived.</p>

<p>The platforms at the station are long enough so that all $n$ trains can be lined up one after another on the same platform. However, if train $x$ enters the platform first, and then train $y$, then train $x$ cannot leave the platform before train $y$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31271.%E2%80%85Milano%E2%80%85C.le/ad346430.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/31271.%E2%80%85Milano%E2%80%85C.le/ad346430.png" data-original-src="https://upload.acmicpc.net/c6c4415b-3f02-48ff-bcde-98601a54ed73/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 165px;" /></p>

<p style="text-align: center;">The illustration shows a possible train schedule on the platforms in the second sample test.</p>

<p style="text-align: center;">The labels on the train &#39;$i$ : $a_i$/$b_i$&#39; denote that the $i$-th train will arrive $a_i$-th at the station on the first day, and leave the station $b_i$-th on the second day.</p>

<p style="text-align: center;">The train ($2$ : $1$/$2$) cannot leave the platform before the train ($4$ : $5$/$1$).</p>

<p>Silvia is interested in what is the minimum number of platforms needed so that all trains can be lined up on the platforms, without the possibility that a train cannot leave the platform because there is a train in front of it that has not yet left.</p>

### 입력

<p>The first line contains an integer $n$ ($1 &le; n &le; 2 \cdot 10^5$), the number of trains.</p>

<p>The second line contains $n$ integers $a_i$, ($1 &le; a_i &le; n$, $a_i \ne a_j$ for all $i \ne j$), which denote that the $i$-th train arrives at the station as the $a_i$-th train on the first day. The sequence $(a_i)$ is a permutation.</p>

<p>The third line contains $n$ integers $b_i$, ($1 &le; b_i &le; n$, $b_i \ne b_j$ for all $i \ne j$), which denote that the $i$-th train leaves the station as the $b_i$-th train on the second day. The sequence $(b_i)$ is a permutation.</p>

### 출력

<p>In the first and only line you should output the minimum number of platforms needed.</p>

### 힌트

<p>Clarification of the second example: Take a look at the illustration in the statement.</p>

<p>Clarification of the third example: All the trains can be lined up on the same platform without any problems.</p>