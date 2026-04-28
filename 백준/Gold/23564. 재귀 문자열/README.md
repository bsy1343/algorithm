# [Gold II] 재귀 문자열 - 23564

[문제 링크](https://www.acmicpc.net/problem/23564)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 358, 정답: 121, 맞힌 사람: 95, 정답 비율: 43.981%

### 분류

문자열, 애드 혹, 해 구성하기

### 문제 설명

<p>길이가 $n$인 문자열 $S=s_1s_2\cdots s_n$와 길이가 $n$인 양의 정수 수열 $A=(a_1, a_2, \cdots a_n)$를 이용하여 다음과 같이 새로운 문자열 $T$를 만들 수 있다.</p>

<ul>
	<li>$X_0$는 빈 문자열이다.</li>
	<li>$X_i = X_{i-1} s_i X_{i-1} s_i \cdots s_i X_{i-1}$, $s_i$는 $a_i$번, $X_{i-1}$은 $a_i + 1$번 등장한다.</li>
	<li>$T&nbsp;= X_n$이다.</li>
</ul>

<p>예를 들어 $S=abc$고, $A=(1,2,1)$이면 $X_1=a, X_2=ababa, X_3=T=ababacababa$가 된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23564.%E2%80%85%EC%9E%AC%EA%B7%80%E2%80%85%EB%AC%B8%EC%9E%90%EC%97%B4/aebeced2.png" data-original-src="https://upload.acmicpc.net/d8d86461-33fe-4f10-bc40-0e925993e692/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 214px; width: 400px;" /></p>

<p>$S$와 $A$를 이용하여 $T$를 만드는 것은 쉬우니, 반대로 $T$가 주어졌을 때 $T$를 만들어내는 $S$와 $A$를 찾아보자.</p>

### 입력

<p>문자열 $T$가 주어진다.</p>

### 출력

<p>첫 번째 줄에 $S$를 출력한다.</p>

<p>두 번째 줄에 $A$를 공백으로 구분하여 출력한다.</p>

<p>정답이 여러 개인 경우 아무 거나 한 가지만 출력한다.</p>

### 제한

<ul>
	<li>$T$의 길이는 1 이상 $2^{20} = 1\,048\,576$ <strong>미만</strong>이고, 알파벳 소문자로만 구성되어 있다.</li>
	<li>조건을 만족하는 $S$와 $A$가 존재하는 입력만이 주어진다.</li>
</ul>