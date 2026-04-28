# [Gold V] 빗물 - 14719

[문제 링크](https://www.acmicpc.net/problem/14719)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 29655, 정답: 17286, 맞힌 사람: 13358, 정답 비율: 57.844%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>2차원 세계에 블록이 쌓여있다. 비가 오면 블록 사이에 빗물이 고인다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14719.%E2%80%85%EB%B9%97%EB%AC%BC/3f498352.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14719/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:79px; width:146px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14719.%E2%80%85%EB%B9%97%EB%AC%BC/a0932729.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14719/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:79px; width:143px" /></p>

<p>비는 충분히 많이 온다. 고이는 빗물의 총량은 얼마일까?</p>

### 입력

<p>첫 번째 줄에는 2차원 세계의 세로 길이 H과 2차원 세계의 가로 길이 W가 주어진다. (1 &le; H, W &le; 500)</p>

<p>두 번째 줄에는 블록이 쌓인 높이를 의미하는 0이상 H이하의 정수가 2차원 세계의 맨 왼쪽 위치부터 차례대로 W개 주어진다.</p>

<p>따라서 블록 내부의 빈 공간이 생길 수 없다. 또 2차원 세계의 바닥은 항상 막혀있다고 가정하여도 좋다.</p>

### 출력

<p>2차원 세계에서는 한 칸의 용량은 1이다. 고이는 빗물의 총량을 출력하여라.</p>

<p>빗물이 전혀 고이지 않을 경우 0을 출력하여라.</p>

### 힌트

<p>힌트 1:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14719.%E2%80%85%EB%B9%97%EB%AC%BC/eecef66c.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14719/ex1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:111px; width:104px" /></p>

<p>힌트 2:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14719.%E2%80%85%EB%B9%97%EB%AC%BC/32b028b6.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14719/ex2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:101px; width:183px" /></p>

<p>힌트 3:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14719.%E2%80%85%EB%B9%97%EB%AC%BC/d9434be7.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14719/ex3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:94px; width:146px" /></p>