# [Silver V] 레몬 게임 - 34248

[문제 링크](https://www.acmicpc.net/problem/34248)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1117, 정답: 443, 맞힌 사람: 398, 정답 비율: 43.355%

### 분류

그리디 알고리즘

### 문제 설명

<p>우현이는 <strong>레몬 게임</strong>을 즐겨 한다. 이 게임의 규칙은 다음과 같다.</p>

<ol>
<li>처음에 $N$개의 레몬이 일렬로 놓여 있다. $i$번째 레몬에는 $A_i$가 적혀 있다. $A_i$는 $1$ 또는 $2$이다.</li>
<li>연속된 한 개 이상의 레몬 중, 레몬에 적힌 수의 합이 $3$이 되는 구간을 하나 골라 구간에 포함된 모든 레몬을 모두 제거한다.</li>
<li>더 이상 제거할 수 있는 레몬이 없을 때까지 $2$번 과정을 반복한다.</li>
</ol>

<p>아래 그림은 한 예시 과정을 보여준다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34248.%E2%80%85%EB%A0%88%EB%AA%AC%E2%80%85%EA%B2%8C%EC%9E%84/6296cfec.png" data-original-src="https://boja.mercury.kr/assets/problem/34248-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 435px; width: 600px;"></p>

<p>주어진 모든 레몬을 제거할 수 있는지 판별하라.</p>

### 입력

<p>입력은 다음과 같은 형식으로 주어진다.</p>

<blockquote>
<p>$N$</p>

<p>$A_1 \ A_2 \ \cdots \ A_N$</p>
</blockquote>

### 출력

<p>첫째 줄에 모든 레몬을 제거할 수 있으면 <span style="color:#e74c3c;"><code>Yes</code></span>, 그렇지 않으면 <span style="color:#e74c3c;"><code>No</code></span>를 출력한다.</p>

### 제한

<ul>
<li>$1 \le N \le 200\ 000$.</li>
<li>$1 \le A_i \le 2$ ($1 \le i \le N$).</li>
</ul>