# [Platinum I] Emergency Rations - 35401

[문제 링크](https://www.acmicpc.net/problem/35401)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

값 / 좌표 압축, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리, 자료 구조

### 문제 설명

<p>A village stores emergency ration boxes. Each box contains a certain number of rations, and the village leader keeps track of how many rations are in each box. Initially, there are no boxes in the supply. Sometimes a new box is added to the supply, or an existing box is removed.</p>

<p>In an emergency, the villagers must choose exactly one of the following actions each day that the emergency lasts:</p>

<ol>
<li>pick one non-empty box and use up all rations in that box, or</li>
<li>use one ration from every non-empty box.</li>
</ol>

<p>The leader is worried about the possibility of rapid consumption. Therefore, after each change to the supply, the leader wants to know how many days it would take before all boxes become empty, assuming that an emergency occurs and the villagers choose actions that empty all boxes in the fewest possible days.</p>

<p>Note that the rations are not actually used; the leader only wants to know the minimum number of days needed to empty all boxes. As running these simulations is not something the leader can do alone, you have been asked to help.</p>

### 입력

<p>The first line contains an integer $Q$ ($1 ≤ Q ≤ 3 \cdot 10^5$) indicating the number of changes to the supply.</p>

<p>The next line contains $Q$ signed integers $X_1, X_2, \dots , X_Q$ ($1 ≤ |X_i | ≤ 10^9$ for$ i = 1, 2, \dots , Q$) indicating, in chronological order, the addition and removal of boxes in the supply. A positive value $X_i = +c$ means that a box containing $c$ rations is added, while a negative value $X_i = −c$ means that a box containing exactly $c$ rations is removed.</p>

<p>It is guaranteed that every removal is valid, that is, whenever a removal $X_i = −c$ occurs, there is at least one box in the supply that contains exactly $c$ rations.</p>

### 출력

<p>Output a single line with $Q$ integers, such that the $i$-th integer indicates the minimum number of days needed to use up all rations right after the $i$-th change in the supply.</p>