# [Gold I] 제3회 IUPC - 14617

[문제 링크](https://www.acmicpc.net/problem/14617)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 350, 정답: 18, 맞힌 사람: 14, 정답 비율: 10.526%

### 분류

브루트포스 알고리즘, 해싱, 수학, 정수론, 소수 판정

### 문제 설명

<p dir="ltr">세계적으로 권위 있는 대회 중 하나인 IUPC(International University student Product Contest, 세계 대학생 곱셈 대회)는 3인이 한 팀을 이뤄 다른 팀들과 큰 수의 곱셈을 얼마나 빠르고 정확하게 계산하는지 경쟁하는 대회다. 제1회 대회 대상은 인하대학교의 &ldquo;I inha U&rdquo; 팀이, 제2회 대회의 대상 또한 인하대학교의 &ldquo;URF&rdquo; 팀이 차지했다. 그리고 오늘, 제3회 IUPC가 개최된다.</p>

<p dir="ltr">이렇게 즐거운 날이지만 대회에 참가한 팀들은 마냥 즐겁지만은 않다. IUPC를 주관하는 CTP에서 매번 인하대학교에서 대상을 타는 것이 타 대학 팀들의 사기를 저하시킨다 생각하고 대회의 룰을 바꿔버렸기 때문이다.</p>

<p>기존의 대회는 큰 수 두 개를 주고 빠르게 곱하는 단순한 대회였다. 하지만 제3회 IUPC는 아래 방식과 같이 대회가 진행된다.</p>

<ol>
	<li>N개의 줄에 걸쳐 A, B, C가 차례대로 주어진다.</li>
	<li>i번째 줄에 주어진 A, B, C를 A<sub>i</sub> ,B<sub>i</sub> ,C<sub>i</sub> 라고 한다. 이때 모든 i에 대해 A<sub>i</sub>XB<sub>i</sub><sup>0</sup>,A<sub>i</sub>XB<sub>i</sub><sup>1</sup>,A<sub>i</sub>XB<sub>i</sub><sup>2</sup>,A<sub>i</sub>XB<sub>i</sub><sup>3</sup>, &hellip;. , A<sub>i</sub>XB<sub>i</sub><sup>C<sub>i</sub></sup>,을 계산하고 각각의 계산 결과를 대회 본부에서 나눠준 카드에 기록한다.</li>
	<li>
	<p dir="ltr">모든 계산을 마치면 $\sum_{i=1}^{n}{(C_i+1)}$개의 카드가 생긴다. 이렇게 만들어진 카드에 적힌 숫자가 같은 것들끼리 묶음을 만든다.</p>
	</li>
	<li>
	<p dir="ltr">3번 규칙에 의해 카드를 정리하고 나면 K개의 카드 묶음들이 생긴다. K는 N과 같을 수도 있고 N보다 작을 수도 있다. K를 가장 빠르게 계산하는 팀이 우승한다.</p>
	</li>
</ol>

### 입력

<p>첫 번째 줄에 N(1 &le; N &le; 100)이 주어진다. 두 번째 줄부터 N개의 줄에 걸쳐 차례대로 A<sub>i</sub>, B<sub>i</sub>, C<sub>i</sub>가 공백을 구분으로 주어진다.(2 &le; A<sub>i</sub>, B<sub>i</sub>&nbsp;&le; 100,000, 1 &le; C<sub>i</sub>&nbsp;&le; 100,000)</p>

### 출력

<p>첫 번째 줄에 주어진 규칙대로 카드를 정리했을 때 생기는 묶음의 수 K를 출력한다.</p>