# [Platinum III] Kayaking Trip - 15026

[문제 링크](https://www.acmicpc.net/problem/15026)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 143, 정답: 56, 맞힌 사람: 40, 정답 비율: 51.282%

### 분류

그리디 알고리즘, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>You are leading a kayaking trip with a mixed group of participants in the Stockholm archipelago, but as you are about to begin your final stretch back to the mainland you notice a storm on the horizon. You had better paddle as fast as you can to make sure you do not get trapped on one of the islands. Of course, you cannot leave anyone behind, so your speed will be determined by the slowest kayak. Time to start thinking; How should you distribute the participants among the kayaks to maximize your chance of reaching the mainland safely?</p>

<p>The kayaks are of different types and have different amounts of packing, so some are more easily paddled than others. This is captured by a speed factor c that you have already figured out for each kayak. The final speed v of a kayak, however, is also determined by the strengths s<sub>1</sub> and s<sub>2</sub> of the two people in the kayak, by the relation v = c(s<sub>1</sub> + s<sub>2</sub>). In your group you have some beginners with a kayaking strength of s<sub>b</sub>, a number of normal participants with strength s<sub>n</sub> and some quite experienced strong kayakers with strength s<sub>e</sub>.</p>

### 입력

<p>The first line of input contains three non-negative integers b, n, and e, denoting the number of beginners, normal participants, and experienced kayakers, respectively. The total number of participants, b + n + e, will be even, at least 2, and no more than 100 000. This is followed by a line with three integers s<sub>b</sub>, s<sub>n</sub>, and s<sub>e</sub>, giving the strengths of the corresponding participants (1 &le; s<sub>b</sub> &lt; s<sub>n</sub> &lt; s<sub>e</sub> &le; 1 000). The third and final line contains m = (b+n+e)/2 integers c<sub>1</sub>, . . . , c<sub>m</sub> (1 &le; c<sub>i</sub> &le; 100 000 for each i), each giving the speed factor of one kayak.</p>

### 출력

<p>Output a single integer, the maximum speed that the slowest kayak can get by distributing the participants two in each kayak.</p>