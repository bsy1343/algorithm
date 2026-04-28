# [Bronze I] FizzBuzz - 28702

[문제 링크](https://www.acmicpc.net/problem/28702)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 23105, 정답: 14094, 맞힌 사람: 12737, 정답 비율: 61.036%

### 분류

수학, 문자열

### 문제 설명

<p>FizzBuzz 문제는 $i = 1, 2, \cdots$ 에 대해 다음 규칙에 따라 문자열을 한 줄에 하나씩 출력하는 문제입니다.</p>

<ul>
	<li>$i$가 $3$의 배수이면서 $5$의 배수이면 &ldquo;<span style="color:#e74c3c;"><code>FizzBuzz</code></span>&rdquo;를 출력합니다.</li>
	<li>$i$가 $3$의 배수이지만 $5$의 배수가 아니면 &ldquo;<span style="color:#e74c3c;"><code>Fizz</code></span>&rdquo;를 출력합니다.</li>
	<li>$i$가 $3$의 배수가 아니지만 $5$의 배수이면 &ldquo;<span style="color:#e74c3c;"><code>Buzz</code></span>&rdquo;를 출력합니다.</li>
	<li>$i$가 $3$의 배수도 아니고 $5$의 배수도 아닌 경우 $i$를 그대로 출력합니다.</li>
</ul>

<p>FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열이 주어집니다. 이때, 이 세 문자열 다음에 올 문자열은 무엇일까요?</p>

### 입력

<p>FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열이 한 줄에 하나씩 주어집니다. 각 문자열의 길이는 $8$ 이하입니다. 입력이 항상 FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열에 대응됨이 보장됩니다.</p>

### 출력

<p>연속으로 출력된 세 개의 문자열 다음에 올 문자열을 출력하세요. 여러 문자열이 올 수 있는 경우, 아무거나 하나 출력하세요.</p>

### 힌트

<p>FizzBuzz 문제의 $i=1, \cdots, 20$에 대한 출력은 다음과 같습니다.</p>

<pre>
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz</pre>