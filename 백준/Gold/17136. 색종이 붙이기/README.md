# [Gold II] 색종이 붙이기 - 17136

[문제 링크](https://www.acmicpc.net/problem/17136)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 32985, 정답: 13594, 맞힌 사람: 7903, 정답 비율: 37.904%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>&lt;그림 1&gt;과 같이 정사각형 모양을 한 다섯 종류의 색종이가 있다. 색종이의 크기는&nbsp;1&times;1, 2&times;2, 3&times;3, 4&times;4, 5&times;5로 총 다섯 종류가 있으며, 각 종류의 색종이는 5개씩 가지고 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17136.%E2%80%85%EC%83%89%EC%A2%85%EC%9D%B4%E2%80%85%EB%B6%99%EC%9D%B4%EA%B8%B0/ec3c5ce9.png" data-original-src="https://upload.acmicpc.net/496452ae-ce36-4d77-93f7-19d7f3f9ce28/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 972px; height: 302px;" /></p>

<p style="text-align: center;">&lt;그림 1&gt;</p>

<p>색종이를 크기가 10&times;10인 종이 위에 붙이려고 한다. 종이는 1&times;1 크기의 칸으로 나누어져 있으며, 각각의 칸에는 0 또는 1이 적혀 있다. 1이 적힌 칸은 모두 색종이로 덮여져야 한다. 색종이를 붙일 때는 종이의 경계 밖으로 나가서는 안되고, 겹쳐도 안 된다. 또, 칸의 경계와 일치하게 붙여야 한다. 0이 적힌 칸에는 색종이가 있으면 안 된다.</p>

<p>종이가&nbsp;주어졌을 때, 1이 적힌 모든 칸을 붙이는데 필요한 색종이의 최소 개수를 구해보자.</p>

### 입력

<p>총 10개의 줄에 종이의 각 칸에 적힌 수가 주어진다.</p>

### 출력

<p>모든 1을 덮는데 필요한 색종이의 최소 개수를 출력한다. 1을 모두 덮는 것이 불가능한 경우에는 -1을 출력한다.</p>