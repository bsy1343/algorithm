# [Gold IV] 트리와 뽀미 - 33580

[문제 링크](https://www.acmicpc.net/problem/33580)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 165, 정답: 94, 맞힌 사람: 80, 정답 비율: 58.824%

### 분류

다이나믹 프로그래밍, 트리

### 문제 설명

<p style="text-align: center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33580.%E2%80%85%ED%8A%B8%EB%A6%AC%EC%99%80%E2%80%85%EB%BD%80%EB%AF%B8/6cc895dd.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33580-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 260px; height: 260px;"></p>

<p>디미고 주변에는 뽀미라는 고양이가 산다. 뽀미는 종종 디미고에 출몰해 학교 곳곳을 돌아다니며 많은 학생들에게 관심과 사랑을 받는다. 승찬이는 뽀미를 정말 좋아하기 때문에 학교를 돌아다니며 최대한 많이 뽀미를 만나려고 한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33580.%E2%80%85%ED%8A%B8%EB%A6%AC%EC%99%80%E2%80%85%EB%BD%80%EB%AF%B8/a0ec885d.png" data-original-src="https://boja.mercury.kr/assets/problem/33580-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 260px; width: 239px;"></p>

<p>디미고는 $1$번부터 $N$번까지 번호가 매겨진 $N$개의 장소가 $N-1$개의 길로 연결되어 있는 트리 구조로, 승찬이는 길을 통해 장소 사이를 이동할 수 있다. 뽀미는 시각 $1$부터 시각 $T$까지 디미고에 출몰한다. 뽀미는 매우 민첩하기 때문에 아무리 멀리 떨어진 장소라도 이동할 수 있다. 뽀미는 시각 $t$에 $C_t$번 장소에 나타나며, 승찬이는 뽀미를 만나기 위해 매 시각 길을 따라 인접한 장소로 이동하거나 현재 위치에 머무를 수 있다. 처음 시작하는 위치는 임의로 정할 수 있다.</p>

<p>승찬이가 뽀미를 최대 몇 번 만날 수 있을지 출력하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 번째 줄에 정수 $N$과 $T$가 공백으로 구분하여 주어진다. $(3 \le N \le 5\,000; 1 \le T \le 1\,000)$</p>

<p>두 번째 줄부터 $N-1$개의 줄에 걸쳐 길을 통해 연결된 두 장소의 번호 $u$, $v$가 공백으로 구분하여 주어진다. $(1 \le u, v \le N; u \ne v)$</p>

<p>$N+1$ 번째 줄에 $T$개의 정수 $C_1, C_2, \cdots, C_T$가 공백으로 구분하여 주어진다. $(1 \le C_1, C_2, \cdots, C_T \le N)$</p>

<p>입력으로 주어진 디미고는 올바른 트리 구조이다.</p>

### 출력

<p>승찬이가 뽀미를 만날 수 있는 횟수의 최댓값을 출력한다.</p>