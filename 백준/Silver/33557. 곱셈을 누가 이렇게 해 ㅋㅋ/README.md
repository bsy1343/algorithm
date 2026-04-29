# [Silver V] 곱셈을 누가 이렇게 해 ㅋㅋ - 33557

[문제 링크](https://www.acmicpc.net/problem/33557)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1037, 정답: 717, 맞힌 사람: 647, 정답 비율: 69.946%

### 분류

구현, 문자열, 사칙연산, 수학

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/33557.%E2%80%85%EA%B3%B1%EC%85%88%EC%9D%84%E2%80%85%EB%88%84%EA%B0%80%E2%80%85%EC%9D%B4%EB%A0%87%EA%B2%8C%E2%80%85%ED%95%B4%E2%80%85%E3%85%8B%E3%85%8B/d51eeec4.png" data-original-src="https://boja.mercury.kr/assets/problem/33557-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 226px; width: 600px;"></p>

<p style="text-align: center;">어?</p>

<p>$A \times B$를 세로식 곱셈에서 받아올림을 하지 않고 바로 결과에 적는 잘못된 곱셈 결과가 일반 곱셈 결과와 같은지 판별해 보자. 만약 두 수의 자릿수가 달라 잘못된 곱셈에서 자릿수가 짧은 수의 자리가 비어 있는 경우, 자릿수가 긴 수의 숫자만을 결과에 기록한다.</p>

### 입력

<p>총 $T$개의 테스트 케이스가 입력으로 주어지며, 첫째 줄에 $T$가 주어진다. $(1 \le T \le 1\,000)$ </p>

<p>테스트 케이스의 첫째 줄에 정수 $A$와 $B$가 공백으로 구분되어 주어진다. $(1 \le A, B \le 10^6)$ </p>

### 출력

<p>각 테스트 케이스마다 한 줄에 잘못된 곱셈 결과가 일반 곱셈 결과와 같다면 <span style="color:#e74c3c;"><code>1</code></span>을, 같지 않다면 <span style="color:#e74c3c;"><code>0</code></span>을 출력한다.</p>