# [Platinum III] The sun is a deadly lazer - 34997

[문제 링크](https://www.acmicpc.net/problem/34997)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 16, 맞힌 사람: 16, 정답 비율: 55.172%

### 분류

누적 합

### 문제 설명

<p>hi12bye17은 평범한 집에서 평화로운 삶을 사는 마법사이다. 최근에 중요한 일을 마치고 온 hi12bye17은 $D$일 동안 집에서 평화롭게 휴식을 취하기로 했다. 하지만 매일 아침이 되면 집에 직사광선이 들면서 hi12bye17의 평화로운 잠을 방해하기 때문에 hi12bye17은 마법진을 사용하여 집에 드는 직사광선을 모두 막기로 했다.</p>

<p>hi12bye17이 사는 집은 $N$행 $M$열의 격자 모양이며, 다양한 크기를 가진 직사각형 모양의 방으로 이루어져 있다. hi12bye17은 집의 $r$행 $c$열을 칸 $(r,c)$라고 부른다.</p>

<p>각 방에는 발동 시 하루 동안 직사광선을 막아주는 마법진이 그려져 있다. 칸 $(r,c)$가 속한 방에 그려진 마법진을 발동하기 위해서는 $A_{r,c}$만큼의 마력을 사용해야 한다. 모든 마법진은 발동할 때마다 마력을 사용해야 한다.</p>

<p>다음은 hi12bye17이 사는 집의 방 구조가 될 수 있는 경우이다.</p>

<p style="text-align:center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34997.%E2%80%85The%E2%80%85sun%E2%80%85is%E2%80%85a%E2%80%85deadly%E2%80%85lazer/65efa376.png" data-original-src="https://boja.mercury.kr/assets/problem/34997-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; max-width: 600px"></p>

<p>반면 다음은 hi12bye17이 사는 집의 방 구조가 될 수 없는 경우이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34997.%E2%80%85The%E2%80%85sun%E2%80%85is%E2%80%85a%E2%80%85deadly%E2%80%85lazer/de0cd331.png" data-original-src="https://boja.mercury.kr/assets/problem/34997-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; max-width: 600px"></p>

<p>hi12bye17은 집에 드는 직사광선을 다음과 같이 막기로 했다.</p>

<p>우선 hi12bye17은 매일 저녁 잠을 자기 전에 미래 예지 마법을 사용하여 내일 아침에는 왼쪽 위가 칸 $(r_1,c_1)$이고 오른쪽 아래가 칸 $(r_2,c_2)$인 직사각형 모양의 구역에 직사광선이 든다는 것을 예견한다.</p>

<p>이후 hi12bye17은 내일 아침에 직사광선이 드는 모든 방의 마법진을 마력을 사용하여 발동한다. hi12bye17은 효율을 중시하기 때문에 불필요한 마법진은 발동하지 않는다.</p>

<p>미래 예지 마법은 마력을 사용하지 않으므로 hi12bye17이 직사광선을 막는 데 사용하는 마력은 각 마법진을 발동하는 데 사용한 마력의 합이다.</p>

<p style="text-align:center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34997.%E2%80%85The%E2%80%85sun%E2%80%85is%E2%80%85a%E2%80%85deadly%E2%80%85lazer/84057cb1.png" data-original-src="https://boja.mercury.kr/assets/problem/34997-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 375px; width: 600px; max-width: 600px"></p>

<p>$D$일 동안 hi12bye17이 직사광선을 막는 데 사용할 마력을 구해보자.</p>

### 입력

<p>첫째 줄에 hi12bye17이 사는 집의 행의 수 $N$ $(1 \le N \le 1\,217)$, 열의 수 $M$ $(1 \le M \le 1\,217)$, hi12bye17이 집에 머무른 일수 $D$ $(1 \le D \le 200\,000)$가 공백으로 구분되어 주어진다.</p>

<p>둘째 줄부터 $N$개의 줄에 걸쳐 hi12bye17의 방 구조를 나타내는 $M$개의 정수가 줄마다 공백으로 구분되어 주어진다. $r+1$번째 줄의 $c$번째 정수는 칸 $(r,c)$가 속한 방을 나타내는 값 $T_{r,c}$ $(1\le T_{r,c}\le N\times M)$로, 같은 값으로 표현된 칸은 모두 같은 방이다. 모든 방은 직사각형 모양이다.</p>

<p>$N+2$번째 줄부터 $N$개의 줄에 걸쳐 $M$개의 정수가 줄마다 공백으로 구분되어 주어진다. $N+r+1$번째 줄의 $c$번째 정수는 칸 $(r,c)$가 속한 방에 그려진 마법진을 발동하기 위해 필요한 마력 $A_{r,c}$ $(0\le A_{r,c}\le 10^9)$이다. 같은 방에 속한 마법진을 발동하기 위해 필요한 마력은 같다.</p>

<p>$2N+2$번째 줄부터 $D$개의 줄에 걸쳐 각 날에 직사광선이 드는 구역을 나타내는 $4$개의 정수 $r_1$, $c_1$, $r_2$, $c_2$ $(1\le r_1\le r_2\le N;$ $1\le c_1\le c_2\le M)$가 공백으로 구분되어 주어진다.</p>

### 출력

<p>$D$개의 줄에 걸쳐 $i$번째 줄에는 $i$번째 날의 직사광선을 막기 위해 hi12bye17이 사용해야 하는 마력을 출력한다.</p>

### 힌트

<p>문제를 해결하는 데에는 상관이 없지만 레이저는 Light Amplification by Stimulated Emission of Radiation의 약어이므로 laser라고 써야 한다.</p>