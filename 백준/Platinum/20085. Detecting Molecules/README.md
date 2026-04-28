# [Platinum IV] Detecting Molecules - 20085

[문제 링크](https://www.acmicpc.net/problem/20085)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 261, 정답: 94, 맞힌 사람: 89, 정답 비율: 39.207%

### 분류

그리디 알고리즘, 정렬, 누적 합, 두 포인터

### 문제 설명

<p>Petr is working for a company that has built a machine for detecting molecules. Each molecule has a positive integer weight. The machine has a <strong>detection range</strong>&nbsp;[<em>l</em>, <em>u</em>], where <em>l</em> and <em>u</em> are positive integers. The machine can detect a set of molecules if and only if this set contains a subset of the molecules with total weight belonging to the machine&#39;s detection range.</p>

<p>Formally, consider <em>n</em> molecules with weights <em>w</em><sub>0</sub> ..., <em>w</em><sub><em>n</em>-1</sub>. The detection is successful if there is a set of distinct indices <em>I</em> = {<em>i</em><sub>1</sub>, ..., <em>i<sub>m</sub></em>}&nbsp;such that <em>l</em> &le; <em>w<sub>i<sub>1</sub></sub></em> + ... +<em>w<sub>i<sub>m</sub></sub></em> &le; <em>u</em>.</p>

<p>Due to specifics of the machine, the gap between <em>l</em> and <em>u</em> is guaranteed to be greater than or equal to the weight gap between the heaviest and the lightest molecule. Formally, <em>u</em> - <em>l</em> &ge; <em>w<sub>max</sub></em> - <em>w<sub>min</sub></em>, where <em>w<sub>max</sub></em> = max(<em>w</em><sub>0</sub>, ..., <em>w</em><sub><em>n</em>-1</sub>) and <em>w<sub>min</sub></em> = min(<em>w</em><sub>0</sub>, ..., <em>w</em><sub><em>n</em>-1</sub>).</p>

<p>Your task is to write a program which either finds any one subset of molecules with total weight within the detection range, or determines that there is no such subset.</p>

### 입력



### 출력

