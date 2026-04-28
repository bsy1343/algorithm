# [Gold I] 개미의 이동 - 6612

[문제 링크](https://www.acmicpc.net/problem/6612)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 269, 정답: 136, 맞힌 사람: 97, 정답 비율: 51.053%

### 분류

정렬, 애드 혹

### 문제 설명

<p>개미 N마리가 나무 판자 위에서 행진을 하고 있다. 개미는 1초에 1cm씩 앞으로 전진한다. 두 개미가 같은 곳에서 만나게 되면, 즉시 방향을 바꾸고 반대 방향으로 전진하게 된다. 개미가 나무의 끝에 도착하게 되면, 개미는 땅으로 떨어지고, 다른 개미에게 영향을 끼칠 수 없게 된다. (개미의 크기는 무시할 수 있다)</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6612.%E2%80%85%EA%B0%9C%EB%AF%B8%EC%9D%98%E2%80%85%EC%9D%B4%EB%8F%99/8d17a939.png" data-original-src="https://www.acmicpc.net/upload/images/ants.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>위의 그림은 시간이 0인 순간이다. 1초가 지난 후에 E와 A는 2에서 만나고, 두 개미는 방향을 바꾸게 된다. 1.5초가 지난 후에는 A와 B가 만나게 되고 동시에 C와 D도 만나게 된다. 네 개미는 모두 방향을 바꾼다. 0.5초가 지난 후 (3초)에는 E가 땅으로 떨어지게 된다.</p>

<p>개미의 움직임을 시뮬레이트하는 프로그램을 작성하시오.</p>

### 입력

<p>입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스의 첫째 줄에는 나무의 길이 L (단위: cm, 1 &le; L &le; 99,999)과 개미의 수 A (1 &le; A &le; L+1)가 주어진다.</p>

<p>다음 A개 줄에는 개미의 위치 X<sub>i</sub> (0 &le; X<sub>i</sub> &le; L)와 개미가 바라보고 있는 방향 (L: 왼쪽, R: 오른쪽)이 주어진다. 두 개미가 같은 위치에 있는 경우는 없다.</p>

### 출력

<p>각 테스트 케이스 마다, &quot;The last ant&nbsp;will fall down in T seconds - started at P.&quot;를 출력한다.</p>

<p>T는 마지막 개미가 떨어진 시간, P는 그 개미가 시간 0 때 있었던 위치이다. 두 개미가 동시에 떨어지는 경우에는 &quot;started at P and Q&quot;를 출력한다. (P &lt; Q)</p>