# [Gold III] 연강은 힘들어(Easy) - 32220

[문제 링크](https://www.acmicpc.net/problem/32220)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 269, 정답: 126, 맞힌 사람: 84, 정답 비율: 50.602%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p><strong>이 문제는 연강은 힘들어(Hard)의 하위 문제이고, 연강은 힘들어(Hard)의 정답 코드를 제출하여 맞힐 수 있다.</strong></p>

<p>도훈이는 저번 학기 수강신청에 실패했다.</p>

<p>하루 일과는 $1,2,\ldots ,n$교시로 구성되고, $n$개의 서로 다른 수업이 각각 하나의 서로 다른 교시를 차지한다. 이번 수강신청에서는 수강할 수업을 잘 골라서 가장 많이 연속된 수업들이 <strong>정확히 $k$교시</strong>를 이루도록 시간표를 짜고 싶다. 이때, $k$교시의 연속된 수업들이 여러 번 등장하더라도 상관없다.</p>

<div style="display: flex; flex-direction: column; align-items: center; justify-content: center;"><img alt="" src="https://upload.acmicpc.net/640bccf3-6df7-4b85-9953-d665e19c2f1e/-/preview/" style="width: 100%; max-width: 530px;" />
<p style="text-align: center;"><small>예제 1에서 가능한 경우들 중 일부.</small></p>

<p style="text-align: center;"><small>두 경우 모두 가장 많이 연속된 수업들이 정확히 $2$교시를 이룬다.</small></p>
</div>

<p>하지만 반드시 수강해야 하는 필수 수업이 존재한다. 필수 수업들을 고려하여, 도훈이의 수강신청을 도와주자!</p>

### 입력

<p>첫 번째 줄에 두 정수 $n,k$가 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄에 각 교시의 필수 수업 여부를 나타내는 $n$개의 정수 $a_1,a_2,\ldots ,a_n$이 공백으로 구분되어 주어진다. $a_i$는 $i$교시의 수업이 필수 수업이면 $1$, 아니면 $0$을 가리킨다.</p>

### 출력

<p>하루 $1,2,\ldots ,n$교시 중 가장 많이 연속된 수업들이 정확히 $k$교시를 이루는 시간표의 가짓수를 $10^9+7$로 나눈 나머지를 출력한다.</p>

### 제한

<ul>
	<li>$1\le k\le n\le 3\, 000$.</li>
	<li>$a_i=0$.</li>
</ul>