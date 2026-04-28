# [Silver V] Binary Counting - 15876

[문제 링크](https://www.acmicpc.net/problem/15876)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 610, 정답: 430, 맞힌 사람: 380, 정답 비율: 70.370%

### 분류

수학, 구현

### 문제 설명

<p>&rsquo;이진수&rsquo;라는 술 게임이 있다. 이 게임은 참가자들이 돌아가면서 0부터 시작하여 1씩 숫자를 세는데, 각 숫자를 이진법으로 표현하여 앞자리부터 한 자리씩 말해야 한다는 규칙이다.</p>

<p>예를 들어, 0 부터 7 까지의 정수를 이진법으로 표현하면 0&rarr;1&rarr;10&rarr;11&rarr;100&rarr;101&rarr;110&rarr;111 이므로, 참가자들은 돌아가면서 0&rarr;1&rarr;1&rarr;0&rarr;1&rarr;1&rarr;1&rarr;0&rarr;0&rarr;1&rarr;0&rarr;1&rarr;1&rarr;1&rarr;0&rarr;1&rarr;1&rarr;1 를 말하게 된다.</p>

<p>숫자를 잘 못 세는 진수는 술 게임으로 이진수 게임을 하게 될 때가 가장 무섭다고 한다. 이진수 게임을 하는 진수가 자신의 차례가 되었을 때 말해야 하는 숫자를 계산해주는 프로그램을 작성해보자.</p>

### 입력

<p>첫 번째 줄에 이진수 게임의 참가자 수 n과 진수의 차례 k가 주어진다. (1 &le; k &le; n &le; 100)</p>

### 출력

<p>진수의 차례가 돌아올 때 말해야 하는 숫자 다섯 개를 띄어쓰기로 구분하여 한 줄에 출력한다.</p>

### 힌트

<ul>
	<li>1번 입력의 경우: 0&rarr;1&rarr;1&rarr;0&rarr;1&rarr;1&rarr;1&rarr;0&rarr;0&rarr;1&rarr;0&rarr;1&rarr;1&rarr;1&rarr;0&rarr;1&rarr;1&rarr;1&rarr;1&rarr;0&rarr;0&rarr;0</li>
	<li>2번 입력의 경우: 0&rarr;1&rarr;1&rarr;0&rarr;1&rarr;1&rarr;1&rarr;0&rarr;0&rarr;1&rarr;0&rarr;1&rarr;1&rarr;1&rarr;0&rarr;1&rarr;1&rarr;1&rarr;1&rarr;0&rarr;0&rarr;0&rarr;1</li>
</ul>