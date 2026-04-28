# [Gold I] 부분 달리기 시합 - 31445

[문제 링크](https://www.acmicpc.net/problem/31445)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 144, 정답: 78, 맞힌 사람: 71, 정답 비율: 59.664%

### 분류

다이나믹 프로그래밍, 그래프 이론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p style="display: flex; flex-direction: row; justify-content: center;"><img alt="부분 달리기 시합" src="%EB%B0%B1%EC%A4%80/Gold/31445.%E2%80%85%EB%B6%80%EB%B6%84%E2%80%85%EB%8B%AC%EB%A6%AC%EA%B8%B0%E2%80%85%EC%8B%9C%ED%95%A9/00efb6d0.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/31445.%E2%80%85%EB%B6%80%EB%B6%84%E2%80%85%EB%8B%AC%EB%A6%AC%EA%B8%B0%E2%80%85%EC%8B%9C%ED%95%A9/00efb6d0.png" data-original-src="https://upload.acmicpc.net/e4f5f453-c672-4077-9ab8-ec73a5f7c825/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-height: 150px; max-width: 100%;" /></p>

<p>월간 향유회에서 $N$명의 사람들이 달리기 시합을 하려고 한다. 각 사람에게는 $1$부터 $N$까지의 서로 다른 번호가 부여되어 있다. 각 사람의 달리기 실력은 모두 다르며, 모든 시합에서 순위는 <strong>항상</strong> 실력순으로 결정된다.</p>

<p>두 사람의 상대적인 실력을 나타내는 정보 $M$개가 주어진다. 모든 정보는 모순되지 않게 주어지며, A가 B보다 빠르고 B가 C보다 빠르다면 A 또한 C보다 빠르다. 이때, 한 명 이상의 사람들을 뽑아서 달리기 시합을 시키려고 한다. 주어진 정보만으로 모든 사람의 순위를 정확하게 예상할 수 있도록 뽑는 경우의 수를 구해보자.</p>

### 입력

<p>첫째 줄에 사람의 수 $N$과 정보의 수 $M$이 공백으로 구분되어 주어진다. $(2 \le N \le 2\,000;$ $1 \le M \le 3\,000)$</p>

<p>둘째 줄부터 $M$개의 줄에 정보를 구성하는 두 사람의 번호 $x_i$, $y_i$가 공백으로 구분되어 주어진다. 이는 $x_i$번 사람이 $y_i$번 사람보다 빠르다는 뜻이다. $(1 \le x_i, y_i \le N;$ $x_i \neq y_i)$</p>

<p>모든 정보는 중복되지 않고 모순되지도 않는다.</p>

### 출력

<p>조건을 만족하도록 한 명 이상의 사람을 뽑는 경우의 수를 $10^9 + 7$로 나눈 나머지를 출력한다.</p>