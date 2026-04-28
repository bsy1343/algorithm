# [Platinum IV] 순열복원 - 1777

[문제 링크](https://www.acmicpc.net/problem/1777)

### 성능 요약

시간 제한: 0.55 초, 메모리 제한: 128 MB

### 통계

제출: 1981, 정답: 1184, 맞힌 사람: 928, 정답 비율: 67.688%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색

### 문제 설명

<p>1부터 N번까지로 수로 이루어진 순열이 있다.</p>

<p>그리고 이 순열과 연관된 &quot;Inversion sequence&quot;라고 부르는 수열이 있다. 이 수열의 i번째 원소에는 순열에서 i보다 뒤에 나오면서 i보다 작은 수의 개수가 들어간다.</p>

<p>2&nbsp; 4&nbsp; 5&nbsp; 1&nbsp; 7&nbsp; 6&nbsp; 3&nbsp; 8</p>

<p>위의 순열이 있다면 이것의 Inversion sequence는</p>

<p>0&nbsp; 1&nbsp; 0&nbsp; 2&nbsp; 2&nbsp; 1&nbsp; 2&nbsp; 0 이 된다.</p>

<p>문제는 역으로 어떤 Inversion sequence가 주어지면 이것에 해당하는 순열을 찾는 프로그램을 작성하는 것이다.</p>

### 입력

<p>순열의 크기 N(1 &le; N &le; 100,000)이 주어진다. 두 번째 줄에는 순열 1, 2, &hellip;, N에 해당하는 Inversion sequence가 공백으로 구분되어 들어온다.</p>

### 출력

<p>입력으로 주어진 Inversion sequence에 대응하는 순열을 공백으로 구분하여 한 줄에 출력한다.</p>