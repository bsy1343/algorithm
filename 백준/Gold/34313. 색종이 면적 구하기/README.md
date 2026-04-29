# [Gold IV] 색종이 면적 구하기 - 34313

[문제 링크](https://www.acmicpc.net/problem/34313)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 512 MB

### 통계

제출: 10, 정답: 9, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

구현, 기하학

### 문제 설명

<p>Bert 는 직각 이등변 삼각형 모양의 색종이를 $N$ 장 가지고 있다 - 편의상 색종이는 $1$번 부터 $N$번 까지 번호가 붙어있고, $i$ 번째 색종이의 이등변의 길이는 $D_i$ 이며 이등변이 만나는 꼭짓점의 좌표는 $(X_i, Y_i)$ 이다. 또한, 각 색종이는 이등변이 $x$, $y$ 축에 평행하게 놓여있는데, 놓여지는 방향이 4가지 있으므로 아래 구분법에 따라 $O_i \in \{1, 2, 3, 4\}$ 값을 통해 구분한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34313.%E2%80%85%EC%83%89%EC%A2%85%EC%9D%B4%E2%80%85%EB%A9%B4%EC%A0%81%E2%80%85%EA%B5%AC%ED%95%98%EA%B8%B0/a1f2ef53.png" data-original-src="https://boja.mercury.kr/assets/problem/34313-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 200px; width: 200px;"></p>

<p>Bert는 $N$ 장의 색종이를 주어진 좌표 위에 놓았는데, 이 때 색종이들의 총 면적의 합을 구하고 싶다 - 겹쳐진 부분이 있는 경우는 중복해서 계산하지 않도록 해야한다.</p>

<p>예를 들어 아래 그림의 경우 $N = 5$ 장의 색종이가 평면에 놓여있는 경우를 나타낸다. 가령 2번 상각형의 경우 $O_2 = 3$ 이며 $D_2 = 2$ 이고 $(X_2, Y_2) = (5, 5)$ 이다. 마찬가지로 3번 삼각형의 경우 $O_3 = 1$, $D_3 = 1$, $(X_3, Y_3) = (5, 2)$ 임을 알 수 있다. 이 경우는 삼각형끼리 서로 겹치는 부분이 없으므로 총 면적의 합은 8.5가 된다 (큰 삼각형 각각이 2, 작은 삼각형인 3번이 0.5).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34313.%E2%80%85%EC%83%89%EC%A2%85%EC%9D%B4%E2%80%85%EB%A9%B4%EC%A0%81%E2%80%85%EA%B5%AC%ED%95%98%EA%B8%B0/4d48d6f0.png" data-original-src="https://boja.mercury.kr/assets/problem/34313-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 264px; width: 300px;"></p>

<p>입력으로 $N, O, D, X, Y$가 주어졌을 때 Bert를 도와 색종이들의 총 면적을 구해보자.</p>

### 입력

<p>입력 첫 줄에 테스트 케이스의 수 $T$ 가 주어진다.</p>

<p>각 테스트 케이스의 첫 줄에는 색종이의 수 $N$ 이 주어진다. 다음 각 줄에 4개의 정수가 공백으로 구분되어 주어지는데, 순서대로 각 색종이가 놓인 방향, 이등변의 길이, 그리고 꼭지점의 좌표를 나타낸다.</p>

### 출력

<p>각 테스트 케이스의 정답을 반올림하여 소숫점 둘째자리까지 출력한다 - 반드시 소숫점 이하 두 자리를 출력해야한다 (예제 참고).</p>

### 제한

<ul>
<li>$1 \le T \le 10$</li>
<li>$1 \le N \le 50$</li>
<li>$1 \le i \le N$ 인 각 $i$ 에 대하여
<ul>
<li>$O_i \in \{1, 2, 3, 4\}$</li>
<li>$1 \le D_i \le 100$</li>
<li>$0 \le X_i, Y_i \le 100$</li>
<li>각 삼각형의 꼭짓점을 이루는 좌표 $(x, y)$에 대해서 $0 \le x, y \le 100$</li>
</ul>
</li>
</ul>