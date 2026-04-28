# [Bronze II] #include <Google I/O.h> - 12174

[문제 링크](https://www.acmicpc.net/problem/12174)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 1198, 정답: 855, 맞힌 사람: 763, 정답 비율: 72.391%

### 분류

구현, 문자열

### 문제 설명

<p>우리가 사용하는 컴퓨터가 곧 출시될 구글 I/O를 너무 기대한 나머지 1과 0을 영어 대문자 I와 O로 저장하기 시작해버렸다!!</p>

<p>예를 들자면, 대문자 A는 아스키 코드로 65이므로, 바이트로는&nbsp;<code>01000001</code>처럼 출력되어야 하지만, 우리의 컴퓨터는 이를&nbsp;<code>OIOOOOOI</code>의 형태로 저장한다.&nbsp;<code>I</code>와&nbsp;<code>O</code>로만 입력된 &quot;바이트&quot;를 아스키를 이용해 번역할 수 있겠는가?</p>

<p>모든 &quot;바이트&quot;는 출력이 가능한 형태로만 주어진다(32&nbsp;&le;<strong>&nbsp;바이트</strong>&nbsp;&le; 126). 주의할 점은 번역된 문자열의 처음과 끝에는 공백이 없으나, 문자열 사이에는 공백이 있을 수도 있다.</p>

### 입력

<p>입력의 첫 번째&nbsp;줄에는 테스트 케이스의 개수 T가 주어진다. 그 뒤의 T개의 테스트 케이스가 입력되는데, 각 테스트 케이스의 첫째 줄에는 문자열의 크기(byte 단위)를 의미하는 B가 입력되고, 둘째 줄에는 8*B개의 문자로 이루어진 문자열이 주어진다. 모든 문자는&nbsp;<code>I</code>&nbsp;가 아니면&nbsp;<code>O</code> 이다.</p>

<p><strong>제한</strong></p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>B</strong>&nbsp;&le; 1000.</li>
</ul>

### 출력

<p>각각의 테스트 케이스에 따라,&nbsp;&quot;Case #x: y&quot;라는 형식에 맞추어 출력한다. 이때 &nbsp;x는 테스트 케이스의 번호, y는 번역된 메시지를 출력한다.(테스트 케이스는 1부터 시작한다.)</p>