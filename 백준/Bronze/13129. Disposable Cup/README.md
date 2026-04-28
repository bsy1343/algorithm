# [Bronze III] Disposable Cup - 13129

[문제 링크](https://www.acmicpc.net/problem/13129)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 933, 정답: 714, 맞힌 사람: 651, 정답 비율: 78.623%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>찬우는 N개의 종이컵을 쌓아서 건축물을 만들려고 한다. 찬우는 삼각형 모양으로 종이컵을 쌓는 것은 너무 어렵다고 생각해서 위아래로 퍼진 일직선 형태로 만들려고 한다. 종이컵 1개는 아래 그림과 같은 형태이다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/13129.%E2%80%85Disposable%E2%80%85Cup/646ddba1.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13129/DC_onecup.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:98px; width:158px" /></p>

<p>찬우가 만약 이런 형태의 종이컵 6개를 &lsquo;)(()))&rsquo;모양으로 쌓는다면 아래 그림과 같은 형태가 될 것이다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/13129.%E2%80%85Disposable%E2%80%85Cup/6f61b660.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13129/DC_sixcup.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:294px; width:108px" /></p>

<p>종이컵의 크기가 A=8, B=36으로 주어졌다면 위 건축물의 높이<span style="line-height:1.6em">는 156mm이다.</span></p>

<p>찬우는 N개의 종이컵으로 만들 수 있는 건축물의 높이로 가능한 경우를 전부 알아보려고 한다. 찬우를 도와 만들 수 있는 건축물의 높이를 구하는 프로그램을 작성하여라.</p>

### 입력

<p>첫 번째 줄에 A, B, N이 주어진다. (1 &le; A, B, N &le; 1,000, 2A &le; B)</p>

### 출력

<p>만들 수 있는 건축물의 높이로 가능한 값을 오름차순으로 출력한다.</p>