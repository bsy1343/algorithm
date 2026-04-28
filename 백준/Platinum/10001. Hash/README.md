# [Platinum IV] Hash - 10001

[문제 링크](https://www.acmicpc.net/problem/10001)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 332, 정답: 58, 맞힌 사람: 47, 정답 비율: 20.982%

### 분류

비트마스킹, 분할 정복을 이용한 거듭제곱, 확장 유클리드 호제법, 페르마의 소정리, 수학, 중간에서 만나기, 모듈로 곱셈 역원, 정수론

### 문제 설명

<p>창영이는 시스템 프로그래밍 숙제에 사용할 Hash 함수를 만들고 있다. 이 함수는 단어를 숫자로 바꾸는 Hash 함수이고, 아래와 같이 재귀적으로 정의된다.</p>

<ul>
	<li>f(empty word) = 0</li>
	<li>f(word + letter) = ((f(word) * 33) XOR ord(letter)) % MOD</li>
</ul>

<p>단어는 알파벳 소문자로만 이루어져 있어야 한다. XOR은 XOR 연산을 나타내며 (0110 XOR 1010 = 1100), ord(letter)는 알파벳의 순서를 나타낸다. (ord(a) = 1, ord(z) = 26) A % B는 A를 B로 나눈 나머지를 나타내며, MOD는 2<sup>M</sup>이다.</p>

<p>M = 10인 경우에 Hash값은 아래와 같다.</p>

<ul>
	<li>f(a) = 1</li>
	<li>f(aa) = 32</li>
	<li>f(kit) = 438</li>
</ul>

<p>창영이는 길이가 N인 단어 중에서 Hash값이 K인 단어의 개수를 찾으려고 한다. 이러한 단어의 개수를 찾아 출력하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 N, K, M이 주어진다. (1 &le; N &le; 10, 0 &le; K &lt; 2<sup>M</sup>, 6 &le; M &le; 25)</p>

### 출력

<p>길이가 N이면서 Hash값이 K인 단어의 개수를 출력한다.</p>

### 힌트

<p>예제 3의 경우 가능한 단어로는 &ldquo;dxl&rdquo;, &ldquo;hph&rdquo;, &ldquo;lxd&rdquo;, &ldquo;xpx&rdquo; 가 있다.</p>