# [Gold I] 문자열 조작의 달인 2 - 35310

[문제 링크](https://www.acmicpc.net/problem/35310)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 126, 정답: 58, 맞힌 사람: 41, 정답 비율: 40.196%

### 분류

누적 합, 다이나믹 프로그래밍, 수학, 슬라이딩 윈도우, 조합론

### 문제 설명

<p>알파벳 소문자로 이루어진 길이 $N$의 문자열 $S$가 있다. 문자열을 자유자재로 다루는 달인 Taro는 다음 행동을 통해 문자열을 최대 $M$번 조작할 수 있다.</p>

<ul>
<li>위치 $1 \leq i \leq N$을 하나 골라 $S_i$를 알파벳 순서로 다음에 오는 문자로 바꾼다.
<ul>
<li>예를 들어, <span style="color:#e74c3c;"><code>a</code></span>는 <span style="color:#e74c3c;"><code>b</code></span>로 바꾸고, <span style="color:#e74c3c;"><code>b</code></span>는 <span style="color:#e74c3c;"><code>c</code></span>로 바꾼다. 단, <span style="color:#e74c3c;"><code>z</code></span>는 <span style="color:#e74c3c;"><code>a</code></span>로 바꾼다.</li>
</ul>
</li>
</ul>

<p>$0$번 이상 $M$번 이하의 조작을 통해 나올 수 있는 서로 다른 문자열의 개수를 구해보자.</p>

### 입력

<p>첫째 줄에 문자열의 길이 $N$과 문자열을 조작할 수 있는 최대 횟수 $M$이 공백으로 구분되어 주어진다. $(1\le N\le 3\,000$; $0\le M\le 10^{9})$</p>

<p>둘째 줄에 알파벳 소문자로 이루어진 문자열 $S$가 주어진다.</p>

### 출력

<p>주어진 문자열을 최대 $M$번 조작했을 때 나올 수 있는 서로 다른 문자열의 개수를 $998\,244\,353$으로 나눈 나머지를 출력한다.</p>