# [Silver II] 블록 - 23252

[문제 링크](https://www.acmicpc.net/problem/23252)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1451, 정답: 321, 맞힌 사람: 269, 정답 비율: 25.353%

### 분류

많은 조건 분기

### 문제 설명

<p dir="ltr">아래 그림에 주어진 세 종류의 타일이 각각 $A$개, $B$개, $C$개 주어졌을 때 세로 길이가 2인 직사각형을 만들 수 있다면 Yes를, 없다면 No를 출력하는 프로그램을 작성하시오.</p>

<p dir="ltr">완성한 직사각형에는 당연히 빈 공간이 없어야 하며, 주어진 타일은 모두 사용해야 한다. 또한 타일은 회전시킬 수 없다.</p>

<p dir="ltr" style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/cfa223c6-22fa-480a-820f-0eb26573e241/-/preview/" /></p>

<p dir="ltr">예를 들어&nbsp;$1\times 1$ 타일이 1개, $2\times 1$ 타일이 3개, &#39;ㄴ&#39;자 모양&nbsp;타일이 1개라면 아래 그림처럼 세로 길이가 2인 직사각형을 만들 수 있다.</p>

<p dir="ltr" style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/4d6baa2d-31b8-4b89-962a-05e95c359a2a/-/preview/" /><br />
하지만&nbsp;$1\times 1$ 타일이 1개, $2\times 1$ 타일이 2개 있고 &#39;ㄴ&#39;자 모양&nbsp;타일은 없다면 아래 그림처럼 세로 길이가 2인 직사각형을 절대 만들 수 없다.</p>

<p dir="ltr" style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/fcf1b32b-a4d2-482d-8623-4f2da9b3cc5a/-/preview/" /></p>

### 입력

<p>첫째 줄에 테스트 케이스의 수를 나타내는 정수 $T$가 주어진다.</p>

<p>둘째 줄부터 $T$줄에 걸쳐 세 정수 $A$, $B$, $C$가 주어진다. $A$,&nbsp;$B$, $C$는 각각 $1\times 1$ 타일, $2\times 1$ 타일, &#39;ㄴ&#39;자 모양&nbsp;타일의 개수를 의미한다.</p>

### 출력

<p>$T$줄에 걸쳐 각 테스트 케이스의 정답을 출력한다.</p>

### 제한

<ul>
	<li>$1 \leq T \leq 1000$</li>
	<li>$0 \leq A, B, C \leq 1\,000\,000\,000$</li>
	<li>$0 &lt; A + B + C$</li>
</ul>