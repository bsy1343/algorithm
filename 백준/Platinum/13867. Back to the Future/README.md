# [Platinum III] Back to the Future - 13867

[문제 링크](https://www.acmicpc.net/problem/13867)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 143, 정답: 72, 맞힌 사람: 58, 정답 비율: 52.252%

### 분류

그래프 이론, 자료 구조, 그리디 알고리즘, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Doctor Emmet is working on a safer device to travel in time. He gathered N different and rare pieces of metal. Each piece may be compatible with some other different pieces. He has a complete list with M distinct pairs of compatible metals. Any pair of metals that is not on the list is incompatible.</p>

<p>In order for the device to work, he must choose a set of metals such that each of them is compatible with at least A others in that set. However, in order to preserve some balance, they must also be incompatible with at least B others in that set.</p>

<p>More metals mean more energy and a safer device. This is why Doctor Emmet needs your help, he wants to know the size of the largest set he can choose that meets these criteria.</p>

### 입력

<p>The first line contains four integers N, M, A and B, representing respectively how many different pieces of metal exist (1 &le; N &le; 10<sup>5</sup> ), how many compatibilities there are (1 &le; M &le; 10<sup>5</sup> ) and the variables A and B described in the problem statement (0 &le; A, B &lt; N). The different metals are conveniently numbered from 1 to N. Each of the following M lines contains two integers X and Y corresponding to a pair of compatible metals (1 &le; X, Y &le; N with X &ne; Y ). There are no repeated pairs in the input.</p>

### 출력

<p>Output a line with one integer representing the size of the largest set of metals satisfying the requirements specified in the problem statement.</p>