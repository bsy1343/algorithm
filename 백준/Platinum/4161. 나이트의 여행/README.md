# [Platinum V] 나이트의 여행 - 4161

[문제 링크](https://www.acmicpc.net/problem/4161)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 656, 정답: 103, 맞힌 사람: 69, 정답 비율: 18.852%

### 분류

수학, 애드 혹, 많은 조건 분기

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4161.%E2%80%85%EB%82%98%EC%9D%B4%ED%8A%B8%EC%9D%98%E2%80%85%EC%97%AC%ED%96%89/57fee400.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4161.%E2%80%85%EB%82%98%EC%9D%B4%ED%8A%B8%EC%9D%98%E2%80%85%EC%97%AC%ED%96%89/57fee400.png" data-original-src="https://www.acmicpc.net/upload/images/chess(1).png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:281px; width:283px" />체스에서 나이트는 가로로 두 칸, 세로로 한 칸 이동하고, 가로로 한 칸, 세로로 두 칸 이동할 수 있다.</p>

<p>크기가 무한대인 체스판 (0, 0) 위에 나이트가 하나 놓여져 있다면, 나이트는 (1,2), (-1,2), (1,-2), (-1,-2), (2,1), (-2,1), (2,-1), (-2,-1)로 이동할 수 있다.</p>

<p>두 정수 x와 y가 주어졌을 때, 크기가 무한대인 체스판의 (0, 0)에서 (x, y)까지 최소 몇 번 만에 이동할 수 있는지 구하는 프로그램을 작성하시오.</p>

### 입력

<p>입력은 테스트 케이스 여러 개로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 두 정수 x와 y가 주어진다. 두 값의 절댓값은 십억을 넘지 않는다.</p>

<p>입력의 마지막 줄에는 END가 주어진다.</p>

### 출력

<p>각 테스트 케이스마다, 나이트가 (0, 0)에서 (x, y)로 이동하려면 최소 몇 번이 필요한지 출력한다.</p>