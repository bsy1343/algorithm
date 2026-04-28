# [Platinum III] Cycles of Lanes - 3737

[문제 링크](https://www.acmicpc.net/problem/3737)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 125, 정답: 56, 맞힌 사람: 42, 정답 비율: 47.727%

### 분류

이중 연결 요소, 선인장, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3737.%E2%80%85Cycles%E2%80%85of%E2%80%85Lanes/3e5d1352.png" data-original-src="https://upload.acmicpc.net/064a3a8a-f0e0-4606-b7bb-37c1127d899f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 227px; height: 306px; float: right;" />Each of the M lanes of the Park of Polytechnic University of Bucharest connects two of the N crossroads of the park (labeled from 1 to N). There is no pair of crossroads connected by more than one lane and it is possible to pass from each crossroad to each other crossroad by a path composed of one or more lanes. A cycle of lanes is simple when passes through each of its crossroads exactly once.</p>

<p>The administration of the University would like to put on the lanes pictures of the winners of Regional Collegiate Programming Contest in such way that the pictures of winners from the same university to be on the lanes of a same simple cycle. That is why the administration would like to assign the longest simple cycles of lanes to most successful universities. The problem is to find the longest cycles? Fortunately, it happens that each lane of the park is participating in no more than one simple cycle (see the Figure).</p>

### 입력

<p>On the first line of the input file the number T of the test cases will be given. Each test case starts with a line with the positive integers N and M, separated by interval (4 &le; N &le; 4444). Each of the next M lines of the test case contains the labels of one of the pairs of crossroads connected by a lane.</p>

### 출력

<p>For each of the test cases, on a single line of the output, print the length of a maximal simple cycle.</p>