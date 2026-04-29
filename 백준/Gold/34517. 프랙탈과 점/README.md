# [Gold III] 프랙탈과 점 - 34517

[문제 링크](https://www.acmicpc.net/problem/34517)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 183, 정답: 71, 맞힌 사람: 53, 정답 비율: 39.259%

### 분류

구현, 수학, 재귀

### 문제 설명

<p>$n$단계 시에르핀스키 카펫의 정의는 다음과 같다.</p>

<ul>
<li>$0$단계: 빈 공간이 없는 정사각형이다.</li>
<li>$1$단계: $0$단계 카펫을 가로와 세로로 각각 $3$등분하여 $9$개의 합동인 작은 정사각형으로 나눈다. 그중 가운데 정사각형을 지우고, 나머지 $8$개를 남긴다.</li>
<li>$n$단계 $(n \ge 2)$: 이전 단계 카펫을 이루는 모든 정사각형에 대해 위와 동일한 과정을 진행한다. 즉, $n-1$단계 카펫을 이루는 모든 정사각형을 가로, 세로로 $3$등분하고 가운데 정사각형을 지운다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34517.%E2%80%85%ED%94%84%EB%9E%99%ED%83%88%EA%B3%BC%E2%80%85%EC%A0%90/65786dff.png" data-original-src="https://boja.mercury.kr/assets/problem/34517-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 75%; margin-left: auto; margin-right: auto; display: block;"></p>

<p>$2$차원 평면 위에 주어지는 $L$단계 시에르핀스키 카펫은 다음 조건을 만족한다.</p>

<ul>
<li>왼쪽 아래 꼭짓점의 좌표는 $(a, b)$이다.</li>
<li>가장 바깥 한 변의 길이는 $3^k$이다.</li>
<li>카펫의 변은 $x$축과 $y$축에 평행하다.</li>
</ul>

<p>점 $(p, q)$가 주어진 시에르핀스키 카펫 위에 있는지 구해보자. 점이 카펫의 채워진 영역 안 또는 그 경계선 위에 있으면 카펫 위에 있다고 간주한다.</p>

### 입력

<p>총 $T$개의 테스트 케이스가 입력으로 주어지며, 첫 번째 줄에 $T$가 주어진다.</p>

<p>그다음 줄부터 각 테스트 케이스마다 하나의 줄에 $a$, $b$, $L$, $k$, $p$, $q$가 공백으로 구분되어 주어진다.</p>

### 출력

<p>각 테스트 케이스마다 주어진 순서대로 한 개의 줄에 점이 카펫 위에 있다면 <span style="color:#e74c3c;"><code>1</code></span>을, 없다면 <span style="color:#e74c3c;"><code>0</code></span>을 출력한다.</p>

### 제한

<ul>
<li>$1 \le T \le 33333$</li>
<li>$0 \le L \le k \le 33$</li>
<li>$-3^{33} \le a, b, p, q \le 3^{33}$</li>
<li>$a$, $b$는 정수이다.</li>
<li>$p$, $q$는 소수점 셋째 자리까지 표시된 실수이다.</li>
</ul>