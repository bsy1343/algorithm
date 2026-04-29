# [Silver V] SSHS 문자열 - 34953

[문제 링크](https://www.acmicpc.net/problem/34953)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 470, 정답: 296, 맞힌 사람: 248, 정답 비율: 68.698%

### 분류

그리디 알고리즘, 문자열, 해 구성하기

### 문제 설명

<p>서울과학고에서 SciOI 2025를 기념해 학교의 약자인 SSHS를 활용한 현수막을 만들기로 했다. 그러나 현수막에 사용할 문자 <code><span style="color:#e74c3c;">S</span></code>와 <code><span style="color:#e74c3c;">H</span></code>는 180도 회전해도 같은 모양으로 보여 현수막이 거꾸로 걸릴 수 있다. 이를 방지하기 위해 SciOI 운영진들은 어떤 방향으로 보더라도 SSHS가 많이 보이도록 하는 SSHS 문자열을 사용하기로 했다.</p>

<p>이때 SSHS 문자열은 아래 조건을 만족하는 길이 $N$의 문자열 $A$이다.</p>

<ul>
<li><span style="color:#e74c3c;"><code>S</code></span>와 <span style="color:#e74c3c;"><code>H</code></span>로만 이루어져 있다.</li>
<li>$A$의 부분 문자열 중 <span style="color:#e74c3c;"><code>SSHS</code></span>의 개수와 $A$를 뒤집은 문자열의 부분 문자열 중 <span style="color:#e74c3c;"><code>SSHS</code></span>의 개수의 합이 길이 $N$인 모든 문자열 중 최대이다.</li>
</ul>

<p>SSHS 문자열의 길이 $N$이 주어질 때 가능한 SSHS 문자열 하나를 구하여라.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34953.%E2%80%85SSHS%E2%80%85%EB%AC%B8%EC%9E%90%EC%97%B4/e62e63e3.png" data-original-src="https://boja.mercury.kr/assets/problem/34953-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 220px; width: 600px;"></p>

<p style="text-align: center;"><small>이미지의 예시는 설명을 돕기 위한 것이며, SSHS 문자열이 아니다.</small></p>

### 입력

<p>첫째 줄에 SSHS 문자열의 길이 $N$이 주어진다.</p>

### 출력

<p>첫째 줄에 길이 $N$의 SSHS 문자열을 하나 출력한다. 가능한 답이 여러 개여도 하나만 출력하면 된다.</p>

### 제한

<ul>
<li>$1\le N\le 500\, 000$</li>
</ul>

### 힌트

<p>$A$를 뒤집은 문자열은 $A$의 가장 뒤쪽 문자부터 순서대로 읽은 문자열이고, $A$의 부분 문자열은 $A$에서 연속한 몇 개의 문자를 선택해 같은 순서로 이어 붙여 만든 문자열이다.</p>