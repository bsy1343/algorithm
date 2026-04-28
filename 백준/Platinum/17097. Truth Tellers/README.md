# [Platinum II] Truth Tellers - 17097

[문제 링크](https://www.acmicpc.net/problem/17097)

### 성능 요약

시간 제한: 3.5 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 253, 정답: 109, 맞힌 사람: 83, 정답 비율: 44.865%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>도시에&nbsp;N명의 사람들이 살고 있다. 이 중 일부는 참말쟁이이고, 나머지는 거짓말쟁이이다. 더욱 구체적으로, 참말쟁이들은 항상 옳은 말만을 하지만, 거짓말쟁이들은 옳은 말이든 거짓말이든 아무 말이나 한다.</p>

<p>모든 사람들에게, 참말쟁이들이 이 도시에 몇 명이 존재하는지 물었다. 그 결과,&nbsp;i번째 사람은 참말쟁이가&nbsp;A<sub>i</sub>명 이상&nbsp;B<sub>i</sub>명 이하라고 대답하였다. 당신이 할 일은 이 증언들을 바탕으로 가능한 참말쟁이의 최대 명수를 구하는 것이다.</p>

<p>그런데, 문제가 발생했다. 사람들의 기억력이 그리 좋지는 못하다는 것이다.&nbsp;Q번 한 사람의 증언이 바뀌며, i번째 증언 바뀜에서는&nbsp;P<sub>i</sub>번 사람의 증언이 &quot;참말쟁이가&nbsp;L<sub>i</sub>명 이상, R<sub>i</sub>명 이하이다.&quot; 로 바뀐다.</p>

<p>초기 상태를 포함해서&nbsp;Q+1번의 상황에 대해 각각 참말쟁이의 최대 명수를 구하여라.</p>

### 입력

<p>첫 줄에&nbsp;N이 주어진다.&nbsp;(1 &le; N &le; 5&times;10<sup>5</sup>)</p>

<p>N개의 줄에 걸쳐,&nbsp;A<sub>i</sub>와&nbsp;B<sub>i</sub>가 순서대로 주어진다.&nbsp;(0 &le; A<sub>i</sub> &le; B<sub>i</sub> &le;&nbsp;N)</p>

<p>다음 줄에&nbsp;Q가 주어진다.&nbsp;(1 &le; Q &le; 5&times;10<sup>5</sup>)</p>

<p>Q개의 줄에 걸쳐,&nbsp;P<sub>i</sub>,&nbsp;L<sub>i</sub>,&nbsp;R<sub>i</sub>가 순서대로 주어진다.&nbsp;(1 &le; P<sub>i</sub> &le; N, 0 &le; L<sub>i</sub> &le; R<sub>i</sub> &le; N)</p>

### 출력

<p>Q+1개의 경우의 참말쟁이의 최대 명수를 공백으로 구분하여 순서대로 한 줄에 출력한다.</p>