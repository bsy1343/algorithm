# [Bronze II] 게임말 올려놓기 - 31995

[문제 링크](https://www.acmicpc.net/problem/31995)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1025, 정답: 856, 맞힌 사람: 776, 정답 비율: 84.902%

### 분류

수학, 조합론

### 문제 설명

<p>가로 $N$칸, 세로 $M$칸으로 이루어진 직사각형 모양의 게임판이 있다. 똑같은 게임말 두 개를 서로 대각선으로 이웃하게 올려두는 방법의 수를 출력하시오.</p>

<p>아래 그림은 $N = 3$, $M = 2$인 경우의 예시이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/31995.%E2%80%85%EA%B2%8C%EC%9E%84%EB%A7%90%E2%80%85%EC%98%AC%EB%A0%A4%EB%86%93%EA%B8%B0/ed68baf9.png" data-original-src="https://upload.acmicpc.net/58045734-0d48-4fd6-96bf-88de9c8fe9ef/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 577px; height: 100px;" /></p>

### 입력

<p>첫 번째 줄에 바둑판의 가로 길이 $N$이 주어진다. $(1 \le N \le 40)$</p>

<p>두 번째 줄에 바둑판의 세로 길이 $M$이 주어진다. $(1 \le M \le 40)$</p>

### 출력

<p>위 조건을 만족하도록 게임말을 두는 경우의 수를 출력한다.</p>

### 힌트

<p>첫 번째 예시의 모든 경우의 수는 위의 그림과 같다.</p>

<p>두 번째 예시에서는 두 게임말을 대각선으로 이웃하게 올려둘 수 없으므로, 정답은 $0$이다.</p>