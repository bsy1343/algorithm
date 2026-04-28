# [Gold III] 2×2×2 큐브 - 16939

[문제 링크](https://www.acmicpc.net/problem/16939)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 2317, 정답: 1002, 맞힌 사람: 749, 정답 비율: 41.727%

### 분류

구현

### 문제 설명

<p>오늘은 2&times;2&times;2 <a href="https://en.wikipedia.org/wiki/Rubik's_Cube">루빅스 큐브</a>를 풀어보려고 한다. 큐브의 각 면은 양방향으로 90도 돌릴 수 있게 만들어져 있다. 큐브의 각 면에 있는 색상이 모두 같으면 큐브를 풀었다고 한다.</p>

<p>2&times;2&times;2 루빅스 큐브가 주어졌을 때, 정확히 한 번 돌려서 큐브를 풀 수 있는지 아닌지 구해보자.</p>

### 입력

<p>첫째 줄에 2&times;2&times;2 루빅스 큐브 각 면의 각 칸 색상이 주어진다. 색상은 1부터 6까지의 자연수로 나타내며, 각 자연수는 총 4번 등장한다. i번째 수가 의미하는 칸은 아래와 같다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16939.%E2%80%852%C3%972%C3%972%E2%80%85%ED%81%90%EB%B8%8C/e7bce42e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/16939.%E2%80%852%C3%972%C3%972%E2%80%85%ED%81%90%EB%B8%8C/e7bce42e.png" data-original-src="https://upload.acmicpc.net/8742b71d-e834-4901-b71b-aa4a47fc04a3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 281px; height: 210px;" /></p>

### 출력

<p>루빅스 큐브를 정확히 한 번 돌려서 풀 수 있으면 1, 없으면 0을 출력한다.</p>