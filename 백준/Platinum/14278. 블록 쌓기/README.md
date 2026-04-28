# [Platinum IV] 블록 쌓기 - 14278

[문제 링크](https://www.acmicpc.net/problem/14278)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 39, 맞힌 사람: 31, 정답 비율: 91.176%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>영선이는 크기가 1&times;1&times;1, 1&times;1&times;2, 1&times;1&times;3인 블록을 가지고 있다. 또, 크기가 1&times;1&times;w인 블록을 가지고 있는데, 이 블록은 기초 블록이라고 한다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14278.%E2%80%85%EB%B8%94%EB%A1%9D%E2%80%85%EC%8C%93%EA%B8%B0/5f964064.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14277/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:172px; width:317px" /></p>

<p>영선이는 블록과 기초 블록을 이용해서 구조를 만들려고 한다. 모든 블록은 기초 블록과 연결되어 있어야 한다. 정수가 아닌 위치에는 블록을 놓을 수 없다. 긴 블록 (1&times;1&times;2, 1&times;1&times;3)의 경우에는 블록의 양 끝이 다른 블록의 위에 있어야 한다. 1&times;1&times;3 블록의 경우에 가운데 칸의 아래는 비어 있어도 된다.</p>

<p>왼쪽 그림은 올바른 구조이고, 오른쪽 그림은 만들 수 없는 구조이다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14278.%E2%80%85%EB%B8%94%EB%A1%9D%E2%80%85%EC%8C%93%EA%B8%B0/15614370.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14277/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:172px; width:317px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14278.%E2%80%85%EB%B8%94%EB%A1%9D%E2%80%85%EC%8C%93%EA%B8%B0/052f6641.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14277/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:172px; width:317px" /></p>

<p>구조의 높이는 블록을 쌓은 층의 개수이다. 기초 블록의 높이 w와 h가 주어졌을 대, 블록(개수는 무한대)과 기초 블록 하나를 가지고 만들 수 있는 구조 중, 높이가 h를 넘지 않는 것의 개수를 구하는 프로그램을 작성하시오.</p>

<p>아래 그림은 w = 3, h = 2인 경우 모든 84가지 구조이다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14278.%E2%80%85%EB%B8%94%EB%A1%9D%E2%80%85%EC%8C%93%EA%B8%B0/adbd6b40.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14277/4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:532px; width:536px" /></p>

### 입력

<p>첫째 줄에 w와 h (1 &le; w, h &le; 10)가 주어진다.</p>

### 출력

<p>첫째 줄에 문제의 정답을 1000000007로 나눈 나머지를 출력한다.</p>