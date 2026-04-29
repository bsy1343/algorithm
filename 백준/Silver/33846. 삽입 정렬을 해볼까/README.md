# [Silver V] 삽입 정렬을 해볼까 - 33846

[문제 링크](https://www.acmicpc.net/problem/33846)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1380, 정답: 535, 맞힌 사람: 418, 정답 비율: 40.270%

### 분류

정렬

### 문제 설명

<p>삽입 정렬은 배열의 요소를 앞에서부터 차례대로 이미 정렬된 배열과 비교하여 자신의 위치를 찾아 삽입해 정렬하는 알고리즘이다. 아래 그림은 배열 $[3\,1\,4\,1\,5\,9\,2\,6\, 5\, 3\, 5]$를 삽입 정렬하는 과정을 나타낸 것이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/33846.%E2%80%85%EC%82%BD%EC%9E%85%E2%80%85%EC%A0%95%EB%A0%AC%EC%9D%84%E2%80%85%ED%95%B4%EB%B3%BC%EA%B9%8C/8d1ba039.png" data-original-src="https://boja.mercury.kr/assets/problem/33846-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 557px; width: 800px;"></p>

<p>길이 $n$의 배열 $a$가 주어질 때 $t$번째 원소까지 올바른 위치에 삽입한 배열을 구해보자.</p>

### 입력

<p>첫 번째 줄에 배열 $a$의 길이 $n$과 $t$가 주어진다. ($1 \leq n \leq 10^6; 1 \leq t \leq n$) </p>

<p>두 번째 줄에 $a$의 원소 $n$개가 공백으로 구분되어 주어진다. ($1\leq a_i \leq 10^{9}$) </p>

<p>주어지는 모든 수는 정수이다.</p>

### 출력

<p>$t$번째 원소까지 올바른 위치에 삽입한 배열을 공백으로 구분하여 출력한다.</p>

### 힌트

<p>충분히 빠른 입출력 방식을 사용하지 않으면 시간 초과를 받을 수 있다.</p>

<p>예를 들어 C++의 <code>cin/cout</code>을 사용할 때에는 입력받기 전에 <code>cin.tie(NULL);</code>을 사용하고, Python에서는 <code>input()</code> 대신 <code>sys.stdin.readline()</code>을 사용하는 것을 권장한다.</p>