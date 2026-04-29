# [Bronze III] 문자열을 만들어요 - 32297

[문제 링크](https://www.acmicpc.net/problem/32297)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1349, 정답: 1033, 맞힌 사람: 961, 정답 비율: 76.635%

### 분류

문자열

### 문제 설명

<p>호반우는 어떤 문자열이 <code><span style="color:#e74c3c;">gori</span></code>를 연속 부분 문자열로 가질 때 <code><span style="color:#e74c3c;">gori</span></code>가 해당 문자열에서 유래되었다고 생각한다.</p>

<p>길이가 $N$인 문자열이 하나 주어질 때 호반우가 보기에 <code><span style="color:#e74c3c;">gori</span></code>가 주어진 문자열에서 유래되었는지 알아보자.</p>

### 입력

<p>첫째 줄에 문자열의 길이 $N$이 주어진다. $(4 \leq N \leq 10)$</p>

<p>둘째 줄에 길이 $N$의 문자열 $S$가 주어진다. 문자열은 알파벳 소문자만으로 이루어져 있다.</p>

### 출력

<p><code><span style="color:#e74c3c;">gori</span></code>가 주어진 문자열에서 유래되었다면 <span style="color:#e74c3c;"><code>YES</code></span>를 아니면 <code><span style="color:#e74c3c;">NO</span></code>를 출력한다.</p>

### 힌트

<p>연속 부분 문자열이란 원래 문자열의 시작과 끝에서 임의의 개수만큼 문자를 지웠을 때 나오는 문자열을 의미한다. 시작과 끝에서 하나도 안 지우는 것도 가능하다.</p>