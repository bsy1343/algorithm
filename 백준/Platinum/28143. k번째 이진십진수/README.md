# [Platinum I] k번째 이진십진수 - 28143

[문제 링크](https://www.acmicpc.net/problem/28143)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 10, 맞힌 사람: 10, 정답 비율: 27.027%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 자릿수를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>십진법으로 표현했을 때 0과 1로만 이뤄진 양의 정수를 이진십진수라고 합시다. 예를 들어 101001은 이진십진수이고, 102002는 이진십진수가 아닙니다.</p>

<p>집합 <em>A<sub>n</sub></em>은 양의 정수 <em>n</em>에 대해 이진십진수인 <em>n</em>의 배수 중 자릿수가 가장 작은 것들의 집합으로 정의됩니다. 만약 이진십진수이면서 <em>n</em>의 배수인 수가 존재하지 않는다면, <em>A<sub>n</sub></em>은 공집합입니다.</p>

<p>양의 정수 <em>n</em>과, 양의 정수 <em>m</em>개로 이루어진 수열 {<em>k</em><sub>1</sub>, <em>k</em><sub>2</sub>, ⋯, <em>k<sub>m</sub></em>}이 주어지면, 수열의 각 값 <em>k<sub>i</sub></em> (1 &le; <em>i</em> &le; <em>m</em>)에 대해 <em>A<sub>n</sub></em>의 원소 중에서 <em>k<sub>i</sub></em>번째로 작은 수를 계산하는 프로그램을 작성하세요.</p>

### 입력

<p>첫 번째 줄에 두 양의 정수 <em>n</em>과 <em>m</em>이 공백을 사이에 두고 주어집니다. (1 &le; <em>n</em> &le; 10<sup>6</sup>, 1 &le; <em>m</em> &le; 10<sup>4</sup>)</p>

<p>두 번째 줄부터 <em>m</em>개의 줄에 걸쳐, <em>i</em>+1번째 줄에 <em>k<sub>i</sub></em>의 값이 주어집니다. (1 &le; <em>i</em> &le; <em>m</em>, 1 &le; <em>k<sub>i</sub></em> &le; 10<sup>18</sup>)</p>

### 출력

<p><em>m</em>개의 줄에 걸쳐 <em>i</em>번째 줄에, <em>A<sub>n</sub></em>의 원소가 <em>k<sub>i</sub></em>개 이상이라면 <em>A<sub>n</sub></em>에서 <em>k</em>번째로 작은 수를 출력하고 그렇지 않다면 <span style="color:#e74c3c;"><code>X</code></span>를 출력합니다.</p>