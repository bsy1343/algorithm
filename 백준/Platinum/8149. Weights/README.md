# [Platinum III] Weights - 8149

[문제 링크](https://www.acmicpc.net/problem/8149)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 266, 정답: 98, 맞힌 사람: 79, 정답 비율: 40.722%

### 분류

이분 탐색, 자료 구조, 그리디 알고리즘, 매개 변수 탐색, 우선순위 큐

### 문제 설명

<p>While moving to a new compound the Byteotian Institute of Experimental Physics has encountered a logistical problem - the transfer of its vast collection of precision weights turned out to be non-trivial.</p>

<p>The Institute has a certain number of containers of limited strength at its disposal. As many weights as possible are to be put into the containers, the remaining ones will be discarded. There is no limit on the number of weights to be put in a container apart from the requirement of not exceeding its strength. A container may also be empty.</p>

<p>Any two weights in the Institute have a peculiar property: the mass of one of them is an integer multiple of the mass of the other. Particularly, they may have the same mass.</p>

<p>Write a programme which:</p>

<ul>
	<li>reads the durabilities of the containers and masses of the weights from the standard input,</li>
	<li>determines the maximal number of weights that can be put in the containers,</li>
	<li>writes the outcome to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains two integers n and m (1 &le; n,m &le; 100,000), separated by a single space, denoting respectively: the number of containers and the number of weights. The second line of the standard input consists of n integers w<sub>i</sub> (1 &le; w<sub>i</sub> &le; 100,000,000 for 1 &le; i &le; n), separated by single spaces, denoting the strengths of containers in milligrammes. In the third line there are m integers m<sub>j</sub> (1 &le; m<sub>j</sub> &le; 1,000,000,000 for 1 &le; j &le; m), separated by single spaces, denoting masses of the weights in milligrammes.</p>

### 출력

<p>The first and only line of the standard output should contain a single integer - the maximal number of weights that can be placed in the containers without exceeding their durability.</p>